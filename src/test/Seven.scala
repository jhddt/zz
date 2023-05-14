package test

object Seven {
  def main(args: Array[String]): Unit = {

    var myArray=Array(1.9,2.9,3.4,3.5)
    println("数组第一个元素:"+myArray(0))
    println("数组元素个数:"+myArray.length)
    //循环输出所有数组元素 方式1
    for(i <- 0 to (myArray.length-1)){
      print(myArray(i)+" ")
    }
    println()
    //循环输出所有数组元素  方式2
    for(x <- myArray){
      print(x+" ")
    }
    println()
    //循环输出所有数组元素  方式3
    myArray.foreach(println)
    //计算数组所有元素的总和
    var total=0.0
    for(i <- 0 to (myArray.length-1)){
      total+=myArray(i)
    }
    println("总和为："+total)
    println("平均值为："+total/myArray.length)
    //计算数组的最大值
    var maxvalue=myArray(0)
    for(i <- 1 to (myArray.length-1)){
      if(myArray(i)>maxvalue){
        maxvalue=myArray(i)
      }
    }
    println("数组最大值:"+maxvalue)
  }
}
