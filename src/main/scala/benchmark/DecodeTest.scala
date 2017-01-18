package benchmark

import org.openjdk.jmh.annotations._

class DecodeTest {

  @Benchmark
  def circeJawn(): Unit = {
   CirceJacksonTest.decode()
  }

  @Benchmark
  def circeJackson(): Unit = {
   CirceJacksonTest.decode()
  }

  @Benchmark
  def circeJacksonAuto(): Unit = {
    CirceJacksonTest.decodeAuto()
  }

  @Benchmark
  def jacksonDecode(): Unit = {
   JacksonTest.decode()
  }

  @Benchmark
  def sprayDecode(): Unit = {
   SprayJsonTest.decode()
  }

  @Benchmark
  def argonautDecode(): Unit = {
    ArgonautTest.decode()
  }

  @Benchmark
  def argonautShapelessDecode(): Unit = {
    ArgonautShapelessTest.decode()
  }
}
