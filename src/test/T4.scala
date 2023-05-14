package test

object T4 {

  def getSalary(datas: Array[String], func: String => Int)={
    var tmp = datas(0)
    for(element<-datas){
      if(func(tmp)<func(element)){
        tmp=element
      }
    }
   tmp
  }


  def main(args: Array[String]): Unit = {
    val datas = Array("张三 20 2500","李四 30 5000","赵五 25 3500")
    val result=getSalary(datas,x=>x.split(" ")(2).toInt)
    println("最高工资用户信息:"+result)
  }
}


