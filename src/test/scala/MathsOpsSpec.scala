import org.scalatest._
import flatspec._
import matchers._

class MathOpsSpec extends AnyFlatSpec with must.Matchers {
  "Adding 5 and 8" must "give 13" in {
    MathOps.addTwoNumbers(5, 8) mustEqual 13
  }
  "Multiplying 5 and 8" must "give 40" in{
    MathOps.multiplyTwoNumbers(5, 8) mustEqual 40
  }
  "Multiplying 7 and 9" must "give 63" in{
    MathOps.multiplyTwoNumbers(7, 9) mustEqual 63
  }
  "the * character" must "result to an addition of 2 numbers" in {
    val operation = MathOpsInput.parse("*")
    operation(5, 11) mustEqual 55
  }
  "any character other than + or *" must "result in an error" in {
    assertThrows[RuntimeException] {
        MathOpsInput.parse("o")
    }
  }
}

