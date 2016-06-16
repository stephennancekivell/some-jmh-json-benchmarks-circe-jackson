package benchmark

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.fasterxml.jackson.module.scala.experimental.ScalaObjectMapper
import benchmark.Data.Friend

object JacksonTest {
  val mapper = new ObjectMapper() with ScalaObjectMapper
  mapper.registerModule(DefaultScalaModule)

  def parseSharedMapper(): Unit = {
    val parsed = mapper.readValue[Seq[Any]](Data.json)
  }

  def parseNewMapper(): Unit = {
    val newMapper = new ObjectMapper() with ScalaObjectMapper
    newMapper.registerModule(DefaultScalaModule)
    val parsed = newMapper.readValue[Seq[Any]](Data.json)
  }

  def read():Unit = {
    val parsed = mapper.readValue[Seq[Map[String,Any]]](Data.json)
    parsed.map(readItem)
  }

  def decode():Unit = {
    val parsed = mapper.readValue[Seq[Data.Type]](Data.json)
  }

  def readItem(map: Map[String,Any]): Data.Type = {
    Data.Type(
      `_id` = map.get("_id").get.asInstanceOf[String],
      `index` = map.get("index").get.asInstanceOf[Int],
      `guid` = map.get("guid").get.asInstanceOf[String],
      `isActive` = map.get("isActive").get.asInstanceOf[Boolean],
      `balance` = map.get("balance").get.asInstanceOf[String],
      `picture` = map.get("picture").get.asInstanceOf[String],
      `age` = map.get("age").get.asInstanceOf[Int],
      `eyeColor` = map.get("eyeColor").get.asInstanceOf[String],
      `name` = map.get("name").get.asInstanceOf[String],
      `gender` = map.get("gender").get.asInstanceOf[String],
      `company` = map.get("company").get.asInstanceOf[String],
      `email` = map.get("email").get.asInstanceOf[String],
      `phone` = map.get("phone").get.asInstanceOf[String],
      `address` = map.get("address").get.asInstanceOf[String],
      `about` = map.get("about").get.asInstanceOf[String],
      `registered` = map.get("registered").get.asInstanceOf[String],
      `latitude` = map.get("latitude").get.asInstanceOf[Double],
      `longitude` = map.get("longitude").get.asInstanceOf[Double],
      `tags` = map.get("tags").get.asInstanceOf[Seq[String]],
      `friends` = map.get("friends").get.asInstanceOf[Seq[Map[String,Any]]].map(readFriend),
      `greeting` = map.get("greeting").get.asInstanceOf[String],
      `favoriteFruit` = map.get("favoriteFruit").get.asInstanceOf[String])
  }

  def readFriend(map: Map[String,Any]): Friend =
    Friend(
      id = map.get("id").get.asInstanceOf[Int],
      name = map.get("name").get.asInstanceOf[String]
    )
}
