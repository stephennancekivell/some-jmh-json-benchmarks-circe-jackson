package benchmark

import org.scalatest.{FunSpec, Matchers}

class TestTest extends FunSpec with Matchers {
  describe("TestTest") {
    val answer = SprayJsonTest.decode()

    it("should parse spray") {
      SprayJsonTest.decode() should be (answer)
    }

    it("should parse argonaut") {
      ArgonautTest.decode().toOption.get should be (answer)
    }

    it("should parse argonaut shapie") {
      ArgonautShapelessTest.decode().toOption.get should be (answer)
    }

    it("should parse with jackson") {
      JacksonTest.decode() should be (answer)
    }

    it("should parse with CirceJackson") {
      CirceJacksonTest.decode().right.get should be (answer)
    }

    it("should parse with CirceJawn") {
      CirceJawnTest.decode().right.get should be (answer)
    }
  }
}
