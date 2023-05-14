package test

object SencondDemo {
  def main(args: Array[String]): Unit = {
//    //从控制台输入数据
//    print("请输入一个数字:")
//    var num=StdIn.readInt()
//    println("num="+num)
//    val  g=num%10          //个位
//
//    val  s=num/10%10       //十位
//
//    val  b=num/100%10      //百位
//    print("个位："+g,"十位：" +s,"百位："+b)

//    print("请输入年龄:")
//    val n=StdIn.readInt()
//    val result=if(n>=18) "成年" else "未成年"
//    print("状态："+result)


//    val num=1
//    for(num<-1 to 10 reverse){   //reverse代表反向输出
//      print(num+" ")
//    }


    val nlist =List(1,2,3,4,5,6)
    val newnlist =for(a<-nlist) yield 2*a
    for(a<-newnlist){
      print(a+" ")
    }



//    for(a <- nlist){
//      print(a)
//    }
//    for( a <- nlist){
//      if(a%2==0){
//        println(a)
//      }
//    }
//    for(a<-nlist if a%2==0){
//      println(a)
//    }




  }
}
