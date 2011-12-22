import org.codehaus.groovy.grails.webflow.WebFlowPluginSupport

class WebflowGrailsPlugin {
    def version = "2.1.0.BUILD-SNAPSHOT"
    def dependsOn = [core:"2.1 > *",
                     i18n:"2.1 > *",
                     controllers:"2.1 > *"]
    def observe = ['controllers']
    def loadAfter = ['hibernate']

    def grailsVersion = "2.1 > *"
    def author = "Graeme Rocher"
    def authorEmail = "graeme.rocher@springsource.com"
    def title = "Spring Web Flow Plugin"
    def description = 'Integrates Spring Web Flow with Grails'
    def documentation = "http://grails.org/plugin/webflow"

    def doWithSpring = WebFlowPluginSupport.doWithSpring

    def doWithDynamicMethods = WebFlowPluginSupport.doWithDynamicMethods

    def doWithApplicationContext = WebFlowPluginSupport.doWithApplicationContext

    def onChange = WebFlowPluginSupport.onChange
}
