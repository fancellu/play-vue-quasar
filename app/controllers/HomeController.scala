package controllers

import java.time.LocalDateTime

import javax.inject._
import play.api.mvc._
import java.util.UUID

import play.api.libs.json.Json

case class Audit(id: String, created: LocalDateTime, identity_id: String, action: String)
object Audit {
  implicit val format = Json.format[Audit]
}

@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  var auditTable: List[Audit]=Nil

  def quasar = Action {
    Ok(views.html.ui())
  }

  def a(id:String) = Action {
    val uuid=UUID.randomUUID().toString
    auditTable::= Audit(uuid, LocalDateTime.now, id, "READ")
    Ok(s"READ $id").withHeaders("audit_rowid"->uuid)
  }

  def delete_a(id:String) = Action {
    val uuid=UUID.randomUUID().toString
    auditTable::= Audit(uuid, LocalDateTime.now, id, "DELETE")
    Ok(s"DELETE $id").withHeaders("audit_rowid"->uuid)
  }

  def audit= Action {
    Ok(Json.toJson(auditTable))
  }

  def audit_by_id(id:String)= Action {
    Ok(Json.toJson(auditTable.filter(_.identity_id==id)))
  }

  def logout= Action {
    Ok("Logged out")
  }

}
