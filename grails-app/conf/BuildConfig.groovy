grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir	= "target/test-reports"
grails.project.dependency.resolution = {
    inherits "global" // inherit Grails' default dependencies
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
	repositories {
		grailsHome()
		grailsCentral()
	}
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.
        compile( "org.grails:grails-webflow:${grailsVersion}",
 				'org.springframework.webflow:spring-webflow:2.0.8.RELEASE',
 				'org.springframework.webflow:spring-binding:2.0.8.RELEASE',
 				'org.springframework.webflow:spring-js:2.0.8.RELEASE' ) {
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
		build( ":release:1.0.0.RC3" ) {
			export = false
		}
	}

}
