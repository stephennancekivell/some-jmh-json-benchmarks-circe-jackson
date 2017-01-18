package benchmark

import benchmark.Data.Type
import io.circe._
import io.circe.generic.auto._
import io.circe.jackson
import io.circe.syntax._

object CirceJacksonTest {

  def parse(): Unit = {
    val doc = jackson.parse(Data.json)
  }

  private val decoder = implicitly[Decoder[Data.Type]]
  def decode(): Either[Error, Type] = {
    jackson.decode[Data.Type](Data.json)(decoder)
  }

  def decodeAuto(): Either[Error, Type] = {
    jackson.decode[Data.Type](Data.json)
  }

}
