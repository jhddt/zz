package test

import scala.collection.mutable.ArrayBuffer

object Eleven {
  def main(args: Array[String]): Unit = {
    val a=new ArrayBuffer[Int]
    //或者 new ArrayBuffer【Int】，一个空的数组缓冲，准备存放整数
    a+=1// ArrayBuffer 用+=在尾端添加元素
    a+=(1,2,3,5)
    a.append(6)
    println(a)
    //用++=操作符追加任何集合或者数组
    a++= Array(8,9,10)
    println(a)
    // ArrayBuffer(1,1,2,3,5,6,8,9,10)
    a.trimEnd(5)// ArrayBuffer(1,1,2,3)移除后五个元素
    a.remove(1)
    println(a)
    a.remove(1,2)
    println(a)
  }
}
