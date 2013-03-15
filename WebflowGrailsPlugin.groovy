import org.codehaus.groovy.grails.webflow.WebFlowPluginSupport

class WebflowGrailsPlugin {
    def version = "2.0.8.BUILD-SNAPSHOT"
    def observe = ['controllers']
    def loadAfter = ['hibernate']

    def grailsVersion = "2.2 > *"
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
