package test

object T {

  //自定义函数map
  def map(arr:Array[String],optrator:String=>Int)={
    for(item <- arr)yield {
      optrator(item)
    }
  }

  def main(args: Array[String]): Unit = {
    val array=Array[String]("java","python","scala","idea")
    var resultarray=map(array,x=>x.length)
    resultarray.foreach(println)
  }

}
