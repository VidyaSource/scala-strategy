package com.vidyasource.strategy.scala

object StrategyExample extends App {
  val addStrategy: Function2[Int, Int, Int] = (a: Int, b: Int) => a + b
  val subtractStrategy: Function2[Int, Int, Int] = (a: Int, b: Int) => a - b
  val multiplyStrategy: Function2[Int, Int, Int] = (a: Int, b: Int) => a * b

  def execute(callback: Function2[Int, Int, Int])(x: Int)(y: Int): Int = callback.apply(x, y)

  println(s"Add:      ${execute(addStrategy)(3)(4)}")
  println(s"Subtract: ${execute(subtractStrategy)(3)(4)}")
  println(s"Multiply: ${execute(multiplyStrategy)(3)(4)}")
}

