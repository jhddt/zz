package test

object Fourteen {
  def min(values:Array[Int])=values.min

  def signum(n:Int): Int={
    if(n>0){
      return 1
    }else if(n<0){
      return -1
    }else{
      return 0
    }
  }

  def main(args: Array[String]): Unit = {
    var d=Array(2,4,5,6)
    var c=min(d)
    println(d)
    var b=signum(5)
    print(b)


  }
}
