package test

import scala.collection.mutable.ArrayBuffer

object Tweleve {
  def main(args: Array[String]): Unit = {
    var arr=new ArrayBuffer[Int]
    //造数据
    for(i <- 1 to 10){
      arr.append((math.random()*100).toInt)
      //打印
      arr.foreach(x=>print(x+" "))
      //找出最大最小数并删除
      arr.remove(arr.indexOf(arr.max))
      arr.remove(arr.indexOf(arr.min))
      //打印
      println()
      arr.foreach(x=>print(x+" "))
    }
  }
}
