package test
object Eight {
  def main(args: Array[String]): Unit = {
    val a=Array(2,3,5,6,11)
    val result=for(elem <- a) yield 2*elem//result是Array（4，6，10，12，22）
    for(x<-result)
      println(x)
    import Array.range
    var myList1=range(10,20,2)
    var myList2=range(10,20)
    //输出所有数组元素
    for(x <- myList1){
      print(" "+x)
    }
    println()
    for(x <- myList2){
      print(" "+x)
    }
    println()
  }
}
