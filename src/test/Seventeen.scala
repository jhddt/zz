package test

object Seventeen {
  def main(args: Array[String]): Unit = {
    def main(args: Array[String]): Unit = {
      val arr:Array[Int]=Array(1,3,4,5,7,2,54,6)
      //分别计算大于4，等于4，小于4的个数
      val tp=getCounts(arr,4)
      println(tp)
      //数组反转，俩俩交换
      val tp1=swap(arr)
      tp1.foreach(x=>print(x+" "))
    }

    def getCounts(arr: Array[Int], v: Int):(Int,Int,Int)={
      val v1=arr.count(_<v)
      val v2=arr.count(_>v)
      val v3=arr.count(_==v)
      return (v1,v2,v3)
    }
    //数组反转，俩俩交换
    def swap(arr:Array[Int]):Array[Int]={
      for(i <- 0 to (arr.length-1-1,2)){
        //定义一个中间变量
        val tmp=arr(i)
        arr(i)=arr(i+1)
        arr(i+1)=tmp
      }
      return  arr
    }
  }
}
