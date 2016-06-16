package benchmark

import org.openjdk.jmh.annotations._

class ParseTest {

  @Benchmark
  def circleJawn(): Unit = {
    CirceJacksonTest.parse()
  }

  @Benchmark
  def circleJackson(): Unit = {
    CirceJacksonTest.parse()
  }

  @Benchmark
  def jackson(): Unit = {
    JacksonTest.parseSharedMapper()
  }

  @Benchmark
  def jacksonMapper(): Unit = {
    JacksonTest.parseNewMapper()
  }
}