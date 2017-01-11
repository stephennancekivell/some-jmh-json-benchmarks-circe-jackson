package benchmark

import org.scalatest.FunSpec

class TestTest extends FunSpec {
  describe("TestTest") {
    it("should parse spray") {
      SprayJsonTest.decode()
    }

    it("should parse argonaut") {
      ArgonautTest.decode()
    }
  }
}
