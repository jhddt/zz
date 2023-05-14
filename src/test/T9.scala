package test

object T9 {
  def main(args: Array[String]): Unit ={
    val prices=Map("apple"->8000,"Sanxing"->7000,"huawei"->6000)
    //通过 for --yiel产生新的map对象
    val newmap=for((k,v)<-prices) yield (k,v*0.9)
    for((k,v)<-newmap){
      println(k+" : "+v)
    }
  }
}
