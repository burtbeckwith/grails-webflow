import org.codehaus.groovy.grails.webflow.WebFlowPluginSupport

class WebflowGrailsPlugin {
    def version = "2.1.0.BUILD-SNAPSHOT"
    def dependsOn = [core:"2.1 > *",i18n:"2.1 > *", controllers:"2.1 > *"]
    def observe = ['controllers']
    def loadAfter = ['hibernate']

    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.1 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    def author = "Graeme Rocher"
    def authorEmail = "graeme.rocher@springsource.com"
    def title = "Spring Web Flow Plugin"
    def description = '''\
Integrates Spring Web Flow with Grails
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/webflow"

    def doWithSpring = WebFlowPluginSupport.doWithSpring

    def doWithDynamicMethods = WebFlowPluginSupport.doWithDynamicMethods

    def doWithApplicationContext = WebFlowPluginSupport.doWithApplicationContext

    def onChange = WebFlowPluginSupport.onChange

}
