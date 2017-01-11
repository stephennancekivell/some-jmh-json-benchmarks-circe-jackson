package benchmark

import spray.json._

object SprayJsonTest {

  def parse(): Unit = {
    Data.json.parseJson
  }

  object MyJsonProtocol extends DefaultJsonProtocol {
    implicit val DataTypeFriend = jsonFormat2(Data.Friend)
    implicit val DataType = jsonFormat22(Data.Type)
  }

  import MyJsonProtocol._

  def decode(): Unit = {
    Data.json.parseJson.convertTo[Data.Type]
  }

  def invalidDecode(): Unit = {
    Data.invalidJson.parseJson.convertTo[Data.Type]
  }
}
