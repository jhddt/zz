package test

object T2 {
//  def main(args: Array[String]): Unit = {
//    var myset = Set[String]("Hadoop","Spark")
//    println(myset)
//    myset+="Scala"
//    println(myset)
//    println("集合元素个数："+myset.size)
//
//    var set1=Set[Int](1,2,3)
//    set1+=5
//    println(set1+4)
//    println(set1-1)
//    println(set1)
//    println(set1.count(_>1))
//  }


  //随机产生0-20之间的整数，把数据放入list,set集合中，
  // 集合中只能存放10个不相同的数据
  //println((math.random*21).toInt)
  def main(args: Array[String]): Unit = {
    //set
    import scala.collection.mutable.Set
    var s1=Set[Int]()
    while (s1.size<10){
      var n=(math.random*20).toInt
      s1.add(n)
    }
    println("set:"+s1)

  }
  //list
  var listvar=List[Int]()
  while(listvar.size<10){
    var n=(math.random*20).toInt
    if(listvar.contains(n==false)){
      listvar=n+:listvar
    }
  }
  println("list:"+listvar)
}
