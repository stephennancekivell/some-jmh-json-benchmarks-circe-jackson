package benchmark

import benchmark.Data.Type
import io.circe._
import io.circe.generic.auto._
import io.circe.jawn
import io.circe.syntax._

object CirceJawnTest {

  def parse(): Unit = {
    val doc = jawn.parse(Data.json)
  }

  private val decoder = implicitly[Decoder[Data.Type]]
  def decode(): Either[Error, Type] = {
    jawn.decode[Data.Type](Data.json)(decoder)
  }

}
