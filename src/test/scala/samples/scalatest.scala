package samples


import scala.collection._
import org.scalatest.Assertions
import org.junit.Test
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import org.specs2.runner.JUnitRunner


class StackSuite extends Assertions {

  @Test def stackShouldPopValuesIinLastInFirstOutOrder() {
    val stack = new mutable.ArrayStack[Int]
    stack.push(1)
    stack.push(2)
    assert(stack.pop() === 2)
    assert(stack.pop() === 1)
  }

  @Test def stackShouldThrowRuntimeExceptionIfAnEmptyArrayStackIsPopped() {
    val emptyStack = new mutable.ArrayStack[String]
    intercept[RuntimeException] {
      emptyStack.pop()
    }
  }
}



import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class ListSuite extends AnyFunSuite with Matchers {

  test("An empty list should be empty") {
    List() should be ('empty)
    Nil should be ('empty)
  }

  test("A non-empty list should not be empty") {
    List(1, 2, 3) should not be ('empty)
    List("fee", "fie", "foe", "fum") should not be ('empty)
  }

  test("A list's length should equal the number of elements it contains") {
    List() should have length (0)
    List(1, 2) should have length (2)
    List("fee", "fie", "foe", "fum") should have length (4)
  }
}


class ExampleSpec extends AnyFunSpec {

  describe("An ArrayStack") {

    it("should pop values in last-in-first-out order") {
      val stack = new mutable.ArrayStack[Int]
      stack.push(1)
      stack.push(2)
      assert(stack.pop() === 2)
      assert(stack.pop() === 1)
    }

    it("should throw RuntimeException if an empty array stack is popped") {
      val emptyStack = new mutable.ArrayStack[Int]
      intercept[RuntimeException] {
        emptyStack.pop()
      }
    }
  }
}
