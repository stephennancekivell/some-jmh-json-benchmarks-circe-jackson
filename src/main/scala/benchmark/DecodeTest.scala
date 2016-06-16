package benchmark

import org.openjdk.jmh.annotations._

class DecodeTest {

  @Benchmark
  def circleJawn(): Unit = {
    CirceJacksonTest.decode()
  }

  @Benchmark
  def circleJackson(): Unit = {
    CirceJacksonTest.decode()
  }

  @Benchmark
  def jacksonRead(): Unit = {
    JacksonTest.read()
  }

  @Benchmark
  def jacksonDecode(): Unit = {
    JacksonTest.read()
  }
}
