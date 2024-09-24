import org.jenkinsci.plugins.workflow.cps.CpsScript

def call(CpsScript script = this) {
    if (script.getBinding().hasVariable('findBuildScans')) {
        println 'Will try to find build scans'
        findBuildScans()
    } else {
        println 'Method findBuildScans() is not present'
    }
}