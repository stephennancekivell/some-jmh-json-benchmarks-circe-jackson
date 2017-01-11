package benchmark

import argonaut._, Argonaut._

import DecodeJson._

object ArgonautTest {
  def parse(): Unit = {
    Data.json.parse
  }

  def decode(): Unit = {
    import ArgonautCodecs.DataCodecJson
    Data.json.decode[Data.Type]
  }

  def decodeVal(): Unit = {
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
