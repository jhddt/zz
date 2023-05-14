package test

object firstdemo {
  //Unit 代表  Void
  def main(args: Array[String]): Unit = {
//    print("hello word")
//    var name:String="zck"
//    var age:Int=20
//    var weight:Double=60
    var name ="zck"
    var age =20
    println("姓名："+name+",年龄："+age)
    printf("姓名：%s,年龄：%d\n",name,age)
    println(s"姓名：$name,年龄：$age")
  }
}
