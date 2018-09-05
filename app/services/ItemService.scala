package services

import scala.concurrent.Future
import scala.util.Try

import scalikejdbc.{AutoSession, DBSession}

import models.Item

trait ItemService {

  def searchItems(keywordOpt: Option[String]): Future[Seq[Item]]

  def getItemByCode(itemCode: String)(implicit dbSession: DBSession = AutoSession): Future[Option[Item]]

  def getItemById(itemId: Long)(implicit dbSession: DBSession = AutoSession): Future[Option[Item]]

  def getItemAndCreateByCode(itemCode: String)(implicit dbSession: DBSession = AutoSession): Future[Item]

  // ユーザがWantもしくはHaveしたItemの集合を返す
  def getItemsByUserId(userId: Long)(implicit dbSession: DBSession = AutoSession): Try[Seq[Item]]

  def getLatestItems(limit: Int = 20): Try[Seq[Item]]

}
