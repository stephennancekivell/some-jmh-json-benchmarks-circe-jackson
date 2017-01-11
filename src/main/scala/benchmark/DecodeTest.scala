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

  @Benchmark
  def sprayDecode(): Unit = {
    SprayJsonTest.decode()
  }

  @Benchmark
  def sprayInvalidDecode(): Unit = {
    SprayJsonTest.invalidDecode()
  }

  @Benchmark
  def argonautDecode(): Unit = {
    ArgonautTest.decode()
  }

  @Benchmark
  def argonautInvalidDecode(): Unit = {
    ArgonautTest.decodeInvalid()
  }

  @Benchmark
  def argonautValDecode(): Unit = {
    ArgonautTest.decodeVal()
  }
}
