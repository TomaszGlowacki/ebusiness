// @GENERATOR:play-routes-compiler
// @SOURCE:D:/work/ebusines/proj3/conf/routes
// @DATE:Mon Sep 23 01:01:00 CEST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:22
  class ReverseContactController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def contactAdded(contactAdded:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contactadded" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("contactAdded", contactAdded)))))
    }
  
    // @LINE:23
    def showContactForm(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contactform")
    }
  
    // @LINE:22
    def getContact(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contactlist")
    }
  
    // @LINE:24
    def addContact(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcontact")
    }
  
  }

  // @LINE:35
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:12
  class ReverseCategoryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def addCategory(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcategory")
    }
  
    // @LINE:15
    def CategoryAdded(categoryAdded:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categoryadded" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("categoryAdded", categoryAdded)))))
    }
  
    // @LINE:13
    def showCategoryForm(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categoryform")
    }
  
    // @LINE:12
    def getCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categorylist")
    }
  
  }

  // @LINE:6
  class ReverseProductController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def addProduct(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addproduct")
    }
  
    // @LINE:9
    def showProductForm(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productform")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def getProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productslist")
    }
  
  }

  // @LINE:17
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def addUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adduser")
    }
  
    // @LINE:17
    def getUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userlist")
    }
  
    // @LINE:18
    def showUserForm(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userform")
    }
  
    // @LINE:20
    def userAdded(userAdded:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "useradded" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userAdded", userAdded)))))
    }
  
  }

  // @LINE:27
  class ReverseOrderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def orderAdded(orderAdded:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "orderadded" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("orderAdded", orderAdded)))))
    }
  
    // @LINE:28
    def showOrderForm(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "orderform")
    }
  
    // @LINE:29
    def addOrder(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addorder")
    }
  
    // @LINE:27
    def getOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "orderlist")
    }
  
  }


}
