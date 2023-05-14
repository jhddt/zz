package test.Pet

abstract class Pet {
  var name =""
  var health= 0

  //抽象方法，没有方法体，不实现，让子类去实现该方法
  def eat(): Unit
}
