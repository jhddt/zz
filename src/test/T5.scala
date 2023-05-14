package test

object T5 {
  def main(args: Array[String]): Unit = {
    var intlist=List(0,1,2,3)
    //循环打印列表中的元素方式1
    intlist.foreach(println)
    //循环打印列表中的元素方式2
    for(s<-intlist){
      println(s)
    }
    //循环打印列表中的元素方式3
    for(i<- 0 to intlist.size-1){
      println(intlist(i))
      println(intlist.apply(i))
    }
    //list列表中常用的方法
    println(intlist.contains(4))
    println(intlist.distinct)
    println(intlist.filter(_>1))
    println(intlist.count(_>1))
    println(intlist.map(s=>s*2))
    println(intlist.max)
    println(intlist.min)
    //在列表头部添加一个元素
    var newlist=2+:intlist
    println("newlist"+newlist)
    //求和第一种方式 列表元素求和
    var sum=0
    for(s<-0 to intlist.length-1){
      sum+=intlist(s)
    }
    //求和的第二种方式
    println(intlist.sum)
    //求和的第三种方式递归调用函数
    println(sumlist(intlist))
  }
  def sumlist(lst: List[Int]):Int={
    if(lst==Nil) 0 else lst.head+sumlist(lst.tail)
  }
}
