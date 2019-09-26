// @GENERATOR:play-routes-compiler
// @SOURCE:D:/work/ebusines/proj3/conf/routes
// @DATE:Mon Sep 23 01:01:00 CEST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {

  // @LINE:22
  class ReverseContactController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def contactAdded: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContactController.contactAdded",
      """
        function(contactAdded0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contactadded" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("contactAdded", contactAdded0)])})
        }
      """
    )
  
    // @LINE:23
    def showContactForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContactController.showContactForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contactform"})
        }
      """
    )
  
    // @LINE:22
    def getContact: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContactController.getContact",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contactlist"})
        }
      """
    )
  
    // @LINE:24
    def addContact: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContactController.addContact",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addcontact"})
        }
      """
    )
  
  }

  // @LINE:35
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseCategoryController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def addCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.addCategory",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addcategory"})
        }
      """
    )
  
    // @LINE:15
    def CategoryAdded: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.CategoryAdded",
      """
        function(categoryAdded0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categoryadded" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("categoryAdded", categoryAdded0)])})
        }
      """
    )
  
    // @LINE:13
    def showCategoryForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.showCategoryForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categoryform"})
        }
      """
    )
  
    // @LINE:12
    def getCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.getCategory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categorylist"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseProductController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def addProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.addProduct",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addproduct"})
        }
      """
    )
  
    // @LINE:9
    def showProductForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.showProductForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "productform"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:8
    def getProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.getProducts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "productslist"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.addUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adduser"})
        }
      """
    )
  
    // @LINE:17
    def getUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userlist"})
        }
      """
    )
  
    // @LINE:18
    def showUserForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.showUserForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userform"})
        }
      """
    )
  
    // @LINE:20
    def userAdded: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userAdded",
      """
        function(userAdded0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "useradded" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userAdded", userAdded0)])})
        }
      """
    )
  
  }

  // @LINE:27
  class ReverseOrderController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def orderAdded: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.orderAdded",
      """
        function(orderAdded0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orderadded" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("orderAdded", orderAdded0)])})
        }
      """
    )
  
    // @LINE:28
    def showOrderForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.showOrderForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orderform"})
        }
      """
    )
  
    // @LINE:29
    def addOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.addOrder",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addorder"})
        }
      """
    )
  
    // @LINE:27
    def getOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getOrder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orderlist"})
        }
      """
    )
  
  }


}
