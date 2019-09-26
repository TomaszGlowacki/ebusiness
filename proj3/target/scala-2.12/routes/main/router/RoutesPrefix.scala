// @GENERATOR:play-routes-compiler
// @SOURCE:D:/work/ebusines/proj3/conf/routes
// @DATE:Mon Sep 23 01:01:00 CEST 2019


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
