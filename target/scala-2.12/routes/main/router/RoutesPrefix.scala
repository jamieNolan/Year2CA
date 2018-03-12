
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/New folder/Ca1/conf/routes
// @DATE:Mon Mar 12 08:38:52 GMT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
