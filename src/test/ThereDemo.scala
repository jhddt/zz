package test

object ThereDemo {
  def main(args: Array[String]): Unit = {
    val nList =List(1,2,3,4,5,6,7,8,9,10)
    for(a<-nList){
//    if(a==3){
//      print("")
//    }else if(a==8){
//      print(" ")
//    }else if(a==9){
//      print(" ")
//    }else if(a==10){
//      print(" ")
//    }else{
//      print(a+" ")
//    }
      if(a!=3) if(a<8){print(a+" ")}
    }
  }
}
