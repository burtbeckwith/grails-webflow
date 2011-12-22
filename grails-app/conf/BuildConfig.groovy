grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

    inherits "global"
    log "warn"

    repositories {
        grailsHome()
        grailsCentral()
    }

    dependencies {
        compile("org.grails:grails-webflow:${grailsVersion}",
                'org.springframework.webflow:spring-webflow:2.0.8.RELEASE',
                'org.springframework.webflow:spring-binding:2.0.8.RELEASE',
                'org.springframework.webflow:spring-js:2.0.8.RELEASE') {
            exclude group:"org.springframework", name:"spring-beans"
            exclude group:"org.springframework", name:"spring-context"
            exclude group:"org.springframework", name:"spring-core"
            exclude group:"org.springframework", name:"spring-web"
            exclude group:"org.springframework", name:"spring-webmvc"
            exclude group:"commons-logging", name:"commons-logging"
            transitive = false
        }
        runtime 'ognl:ognl:2.7.3'
    }

    plugins {
        build( ":release:1.0.0" ) {
            export = false
        }
    }
}
