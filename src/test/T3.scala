package test

import scala.collection.mutable.ArrayBuffer

object T3 {
  //获得数组中的所有地址，重复的地址只算一个
  def main(args: Array[String]): Unit = {
    val arr = Array[String]("张三 女 深圳","李四 男 北京","王五 男 深圳","whr 男 武汉")
    //调用函数
    var resultarray=getAddress(arr,x=>x.split(" ")(2))
    //mkString：吧数组中的元素用逗号连接成一个字符串
    println(resultarray.mkString(","))
  }

  //自定义函数
  def getAddress(arr: Array[String], func: String => String)={
    //定义结果数组
    var result = ArrayBuffer[String]()
    for(elem<-arr){
      val city = func(elem)
      //判断数组中存不存在
      if(result.contains(city)==false){
        //把对应的城市添加在数组中
        result+=city
      }
    }
    result
  }
}
