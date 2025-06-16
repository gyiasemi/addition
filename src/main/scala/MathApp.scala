object MathOpsInput {
  def parse(operationString: String): (Int, Int) => Int = 
    if (operationString == "+")
        MathOps.addTwoNumbers
    else if (operationString == "*")
        MathOps.multiplyTwoNumbers
    else
        throw new RuntimeException("Only multiplication (*) and addition (+) operations are supported!")
}

@main def mathOps(a: Int, operation: String, b: Int) =
    val operationFunction = MathOpsInput.parse(operation)
    val result = operationFunction(a, b)
    println(s"${a} ${operation} ${b} = $result")

    
