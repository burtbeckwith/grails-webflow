import org.codehaus.groovy.grails.webflow.WebFlowPluginSupport

class WebflowGrailsPlugin {
    def version = "1.3.0.RC2"
    def dependsOn = [core:"1.3 > *",i18n:"1.3 > *", controllers:"1.3 > *"]
    def observe = ['controllers']
    def loadAfter = ['hibernate']

    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.2 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    def author = "Graeme Rocher"
    def authorEmail = "graeme.rocher@springsource.com"
    def title = "Spring Web Flow Plugin"
    def description = '''\\
Integrates Spring Web Flow with Grails
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/webflow"

    def doWithSpring = WebFlowPluginSupport.doWithSpring

    def doWithDynamicMethods = WebFlowPluginSupport.doWithDynamicMethods

    def doWithApplicationContext = WebFlowPluginSupport.doWithApplicationContext

    def onChange = WebFlowPluginSupport.onChange

}
