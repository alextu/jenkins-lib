def call() {
    try {
        println 'Will try to find build scans'
        findBuildScans()
    } catch (NoSuchMethodError e) {
        println 'Method findBuildScans() is not present'
    }
}