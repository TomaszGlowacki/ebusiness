// @GENERATOR:play-routes-compiler
// @SOURCE:D:/work/ebusines/proj3/conf/routes
// @DATE:Mon Sep 23 01:01:00 CEST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ProductController_1: controllers.ProductController,
  // @LINE:12
  CategoryController_3: controllers.CategoryController,
  // @LINE:17
  UserController_2: controllers.UserController,
  // @LINE:22
  ContactController_0: controllers.ContactController,
  // @LINE:27
  OrderController_5: controllers.OrderController,
  // @LINE:35
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ProductController_1: controllers.ProductController,
    // @LINE:12
    CategoryController_3: controllers.CategoryController,
    // @LINE:17
    UserController_2: controllers.UserController,
    // @LINE:22
    ContactController_0: controllers.ContactController,
    // @LINE:27
    OrderController_5: controllers.OrderController,
    // @LINE:35
    Assets_4: controllers.Assets
  ) = this(errorHandler, ProductController_1, CategoryController_3, UserController_2, ContactController_0, OrderController_5, Assets_4, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProductController_1, CategoryController_3, UserController_2, ContactController_0, OrderController_5, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ProductController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productslist""", """controllers.ProductController.getProducts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productform""", """controllers.ProductController.showProductForm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addproduct""", """controllers.ProductController.addProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categorylist""", """controllers.CategoryController.getCategory"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categoryform""", """controllers.CategoryController.showCategoryForm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcategory""", """controllers.CategoryController.addCategory"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categoryadded""", """controllers.CategoryController.CategoryAdded(categoryAdded:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userlist""", """controllers.UserController.getUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userform""", """controllers.UserController.showUserForm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduser""", """controllers.UserController.addUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """useradded""", """controllers.UserController.userAdded(userAdded:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contactlist""", """controllers.ContactController.getContact"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contactform""", """controllers.ContactController.showContactForm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcontact""", """controllers.ContactController.addContact"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contactadded""", """controllers.ContactController.contactAdded(contactAdded:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orderlist""", """controllers.OrderController.getOrder"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orderform""", """controllers.OrderController.showOrderForm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addorder""", """controllers.OrderController.addOrder"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orderadded""", """controllers.OrderController.orderAdded(orderAdded:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ProductController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ProductController_index0_invoker = createInvoker(
    ProductController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ProductController_getProducts1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productslist")))
  )
  private[this] lazy val controllers_ProductController_getProducts1_invoker = createInvoker(
    ProductController_1.getProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProducts",
      Nil,
      "GET",
      this.prefix + """productslist""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ProductController_showProductForm2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productform")))
  )
  private[this] lazy val controllers_ProductController_showProductForm2_invoker = createInvoker(
    ProductController_1.showProductForm,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "showProductForm",
      Nil,
      "GET",
      this.prefix + """productform""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ProductController_addProduct3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproduct")))
  )
  private[this] lazy val controllers_ProductController_addProduct3_invoker = createInvoker(
    ProductController_1.addProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "addProduct",
      Nil,
      "POST",
      this.prefix + """addproduct""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_CategoryController_getCategory4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categorylist")))
  )
  private[this] lazy val controllers_CategoryController_getCategory4_invoker = createInvoker(
    CategoryController_3.getCategory,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "getCategory",
      Nil,
      "GET",
      this.prefix + """categorylist""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_CategoryController_showCategoryForm5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categoryform")))
  )
  private[this] lazy val controllers_CategoryController_showCategoryForm5_invoker = createInvoker(
    CategoryController_3.showCategoryForm,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "showCategoryForm",
      Nil,
      "GET",
      this.prefix + """categoryform""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_CategoryController_addCategory6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcategory")))
  )
  private[this] lazy val controllers_CategoryController_addCategory6_invoker = createInvoker(
    CategoryController_3.addCategory,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "addCategory",
      Nil,
      "POST",
      this.prefix + """addcategory""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_CategoryController_CategoryAdded7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categoryadded")))
  )
  private[this] lazy val controllers_CategoryController_CategoryAdded7_invoker = createInvoker(
    CategoryController_3.CategoryAdded(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "CategoryAdded",
      Seq(classOf[String]),
      "GET",
      this.prefix + """categoryadded""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_UserController_getUser8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userlist")))
  )
  private[this] lazy val controllers_UserController_getUser8_invoker = createInvoker(
    UserController_2.getUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUser",
      Nil,
      "GET",
      this.prefix + """userlist""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UserController_showUserForm9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userform")))
  )
  private[this] lazy val controllers_UserController_showUserForm9_invoker = createInvoker(
    UserController_2.showUserForm,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "showUserForm",
      Nil,
      "GET",
      this.prefix + """userform""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_UserController_addUser10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduser")))
  )
  private[this] lazy val controllers_UserController_addUser10_invoker = createInvoker(
    UserController_2.addUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "addUser",
      Nil,
      "POST",
      this.prefix + """adduser""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_UserController_userAdded11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("useradded")))
  )
  private[this] lazy val controllers_UserController_userAdded11_invoker = createInvoker(
    UserController_2.userAdded(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userAdded",
      Seq(classOf[String]),
      "GET",
      this.prefix + """useradded""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_ContactController_getContact12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contactlist")))
  )
  private[this] lazy val controllers_ContactController_getContact12_invoker = createInvoker(
    ContactController_0.getContact,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContactController",
      "getContact",
      Nil,
      "GET",
      this.prefix + """contactlist""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ContactController_showContactForm13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contactform")))
  )
  private[this] lazy val controllers_ContactController_showContactForm13_invoker = createInvoker(
    ContactController_0.showContactForm,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContactController",
      "showContactForm",
      Nil,
      "GET",
      this.prefix + """contactform""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ContactController_addContact14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcontact")))
  )
  private[this] lazy val controllers_ContactController_addContact14_invoker = createInvoker(
    ContactController_0.addContact,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContactController",
      "addContact",
      Nil,
      "POST",
      this.prefix + """addcontact""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ContactController_contactAdded15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contactadded")))
  )
  private[this] lazy val controllers_ContactController_contactAdded15_invoker = createInvoker(
    ContactController_0.contactAdded(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContactController",
      "contactAdded",
      Seq(classOf[String]),
      "GET",
      this.prefix + """contactadded""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_OrderController_getOrder16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orderlist")))
  )
  private[this] lazy val controllers_OrderController_getOrder16_invoker = createInvoker(
    OrderController_5.getOrder,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getOrder",
      Nil,
      "GET",
      this.prefix + """orderlist""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_OrderController_showOrderForm17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orderform")))
  )
  private[this] lazy val controllers_OrderController_showOrderForm17_invoker = createInvoker(
    OrderController_5.showOrderForm,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "showOrderForm",
      Nil,
      "GET",
      this.prefix + """orderform""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_OrderController_addOrder18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addorder")))
  )
  private[this] lazy val controllers_OrderController_addOrder18_invoker = createInvoker(
    OrderController_5.addOrder,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "addOrder",
      Nil,
      "POST",
      this.prefix + """addorder""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_OrderController_orderAdded19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orderadded")))
  )
  private[this] lazy val controllers_OrderController_orderAdded19_invoker = createInvoker(
    OrderController_5.orderAdded(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "orderAdded",
      Seq(classOf[String]),
      "GET",
      this.prefix + """orderadded""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Assets_versioned20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned20_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ProductController_index0_route(params@_) =>
      call { 
        controllers_ProductController_index0_invoker.call(ProductController_1.index)
      }
  
    // @LINE:8
    case controllers_ProductController_getProducts1_route(params@_) =>
      call { 
        controllers_ProductController_getProducts1_invoker.call(ProductController_1.getProducts)
      }
  
    // @LINE:9
    case controllers_ProductController_showProductForm2_route(params@_) =>
      call { 
        controllers_ProductController_showProductForm2_invoker.call(ProductController_1.showProductForm)
      }
  
    // @LINE:10
    case controllers_ProductController_addProduct3_route(params@_) =>
      call { 
        controllers_ProductController_addProduct3_invoker.call(ProductController_1.addProduct)
      }
  
    // @LINE:12
    case controllers_CategoryController_getCategory4_route(params@_) =>
      call { 
        controllers_CategoryController_getCategory4_invoker.call(CategoryController_3.getCategory)
      }
  
    // @LINE:13
    case controllers_CategoryController_showCategoryForm5_route(params@_) =>
      call { 
        controllers_CategoryController_showCategoryForm5_invoker.call(CategoryController_3.showCategoryForm)
      }
  
    // @LINE:14
    case controllers_CategoryController_addCategory6_route(params@_) =>
      call { 
        controllers_CategoryController_addCategory6_invoker.call(CategoryController_3.addCategory)
      }
  
    // @LINE:15
    case controllers_CategoryController_CategoryAdded7_route(params@_) =>
      call(params.fromQuery[String]("categoryAdded", None)) { (categoryAdded) =>
        controllers_CategoryController_CategoryAdded7_invoker.call(CategoryController_3.CategoryAdded(categoryAdded))
      }
  
    // @LINE:17
    case controllers_UserController_getUser8_route(params@_) =>
      call { 
        controllers_UserController_getUser8_invoker.call(UserController_2.getUser)
      }
  
    // @LINE:18
    case controllers_UserController_showUserForm9_route(params@_) =>
      call { 
        controllers_UserController_showUserForm9_invoker.call(UserController_2.showUserForm)
      }
  
    // @LINE:19
    case controllers_UserController_addUser10_route(params@_) =>
      call { 
        controllers_UserController_addUser10_invoker.call(UserController_2.addUser)
      }
  
    // @LINE:20
    case controllers_UserController_userAdded11_route(params@_) =>
      call(params.fromQuery[String]("userAdded", None)) { (userAdded) =>
        controllers_UserController_userAdded11_invoker.call(UserController_2.userAdded(userAdded))
      }
  
    // @LINE:22
    case controllers_ContactController_getContact12_route(params@_) =>
      call { 
        controllers_ContactController_getContact12_invoker.call(ContactController_0.getContact)
      }
  
    // @LINE:23
    case controllers_ContactController_showContactForm13_route(params@_) =>
      call { 
        controllers_ContactController_showContactForm13_invoker.call(ContactController_0.showContactForm)
      }
  
    // @LINE:24
    case controllers_ContactController_addContact14_route(params@_) =>
      call { 
        controllers_ContactController_addContact14_invoker.call(ContactController_0.addContact)
      }
  
    // @LINE:25
    case controllers_ContactController_contactAdded15_route(params@_) =>
      call(params.fromQuery[String]("contactAdded", None)) { (contactAdded) =>
        controllers_ContactController_contactAdded15_invoker.call(ContactController_0.contactAdded(contactAdded))
      }
  
    // @LINE:27
    case controllers_OrderController_getOrder16_route(params@_) =>
      call { 
        controllers_OrderController_getOrder16_invoker.call(OrderController_5.getOrder)
      }
  
    // @LINE:28
    case controllers_OrderController_showOrderForm17_route(params@_) =>
      call { 
        controllers_OrderController_showOrderForm17_invoker.call(OrderController_5.showOrderForm)
      }
  
    // @LINE:29
    case controllers_OrderController_addOrder18_route(params@_) =>
      call { 
        controllers_OrderController_addOrder18_invoker.call(OrderController_5.addOrder)
      }
  
    // @LINE:30
    case controllers_OrderController_orderAdded19_route(params@_) =>
      call(params.fromQuery[String]("orderAdded", None)) { (orderAdded) =>
        controllers_OrderController_orderAdded19_invoker.call(OrderController_5.orderAdded(orderAdded))
      }
  
    // @LINE:35
    case controllers_Assets_versioned20_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned20_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
