package benchmark

import io.circe._, io.circe.generic.auto._, io.circe.jackson, io.circe.syntax._
import cats.data.Xor

object CirceJacksonTest {

  def parse(): Unit = {
    val doc = jackson.parse(Data.json)
  }

  def decode(): Unit = {
    jackson.decode[Data.Type](Data.json)
  }

}
