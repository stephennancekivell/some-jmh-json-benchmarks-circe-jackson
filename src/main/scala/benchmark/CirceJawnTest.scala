package benchmark

import io.circe._
import io.circe.generic.auto._
import io.circe.jawn
import io.circe.syntax._

object CirceJawnTest {

  def parse(): Unit = {
    val doc = jawn.parse(Data.json)
  }

  def decode():Unit = {
    jawn.decode[Data.Type](Data.json)
  }

}
