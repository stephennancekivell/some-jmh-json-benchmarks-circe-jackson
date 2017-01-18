package benchmark

import argonaut._
import Argonaut._
import DecodeJson._

import scalaz.\/

object ArgonautTest {
  def parse(): Unit = {
    Data.json.parse
  }

  def decode(): \/[\/[String, (String, CursorHistory)], Data.Type] = {
    Data.json.decode[Data.Type](ArgonautCodecs.DataCodecJsonVal)
  }

  def decodeInvalid(): Unit = {
    Data.invalidJson.decode[Data.Type](ArgonautCodecs.DataCodecJsonVal)
  }
}

object ArgonautCodecs {
  implicit def FriendCodecJson: CodecJson[Data.Friend] =
    casecodec2(Data.Friend.apply, Data.Friend.unapply)("id", "name")

  implicit def DataCodecJson: CodecJson[Data.Type] =
    casecodec22(Data.Type.apply, Data.Type.unapply)(
      "_id",
      "index",
      "guid",
      "isActive",
      "balance",
      "picture",
      "age",
      "eyeColor",
      "name",
      "gender",
      "company",
      "email",
      "phone",
      "address",
      "about",
      "registered",
      "latitude",
      "longitude",
      "tags",
      "friends",
      "greeting",
      "favoriteFruit"
    )

  val DataCodecJsonVal: CodecJson[Data.Type] =
    DataCodecJson
}

object ArgonautShapelessTest {
  import ArgonautShapeless._
  val enc = DecodeJson.of[Data.Type]
  def decode(): \/[\/[String, (String, CursorHistory)], Data.Type] = {
    Data.json.decode[Data.Type](enc)
  }
}