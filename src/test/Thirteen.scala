package test

object Thirteen {
  def addInt(a:Int,b:Int):Int={
    var sum=a+b
    return sum
  }
  //def addInt(a:Int,b:Int)=a+b

  def main(args: Array[String]): Unit = {
    var n=addInt(3,6)
    print("n="+n)
  }
}
