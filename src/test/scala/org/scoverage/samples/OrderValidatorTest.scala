package org.scoverage.samples

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.OneInstancePerTest
import subpackage1.exceptions.OrderException
import subpackage2.validators.OrderValidator

class OrderValidatorTest extends AnyFlatSpec with OneInstancePerTest {

  "an order validator" should "throw exception" in {
    val e: Throwable | Null = intercept[OrderException] {
      new OrderValidator("CreditSuisse").validate
    }
    assert(e != null)
  }
}
