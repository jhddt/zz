package test

object Nine {
  def main(args: Array[String]): Unit = {
    //数组中没2个元素互相交换
    val a=Array(2,3,5,7,11,12)
    for(i <- 0 until (a.length-1,2)){
      val tmp =a(i)
      a(i)=a(i+1)
      a(i+1)=tmp
    }
    //交换后输出
    for(x<-a)
      print(x+" ")
  }
}
