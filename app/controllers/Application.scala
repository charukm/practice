package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("framework project, thn, with commented by prateek changes in master"))
  }
  
}