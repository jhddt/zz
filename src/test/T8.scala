package test

object T8 {
  def main(args: Array[String]): Unit = {
    //方式 1- 构造不可变映射
    //1.默认Map 是 immutable.Map
    //2.key-value 类型支持Any
    //（“Alice”，10）-键值对-元组
    //3.从输出的结果看到，输出顺序和声名顺序一致
    val map1=Map("Alice"->10,"Bob"->20,"Kotlin"->"北京")
    //Map(("Alice",10),("Bob",20),("Kotlin"," 北京"))
    println(map1)
    //方式2-构造可变映射
    //1.从输出的结果看到，可变的map输出顺序和声名顺序不一致
    import scala.collection.mutable
    val map2=mutable.Map("Alice"->10,"Bob"->20,"Kotlin"->"北京")
    println(map2)

    //方式3-创建空的映射
    val map3=mutable.Map[String,Int]()
    map3+=("a"->1)
    println("map3="+map3)


    //映射 Map-取值
    //方式 1-使用map（key）
    //说明：
    //如果 key 存在，则返回对应的值
    //如果 key 不存在，则抛出异常
    val value1=map2("Alice")
    println(value1)
    //抛出异常
    //println（map2（“Alice~”））

    //方式 2-使用contains方法检查是否存在key
    //返回Boolean
    //1.如果key存在，则返回true
    //2.如果key不存在，则返回false
    //使用contains先判断取值，可以防止异常，并加入相应的处理逻辑
    if(map2.contains("Alice")){
      println("key存在,值="+map2("Alice"))
    }else{
      println("key 不存在:")
    }

    //Map- 对 map 修改、添加和删除
    //更新 map 的元素
    //1） map 是可变的，才能修改，否则报错
    //2） 如果 key 存在：则修改对应的值，key 不存在， 等价于添加一个key-val
    val map5=mutable.Map(("A",1),("B","北京"),("c",3))
    map5("A")=20//添加
    map5("E")=20//修改
    map5+=("D"->4)
    map5+=("B"->5)
    println("map5="+map5)


    //添加多个元素
    map5+=("E"->6,"F"->7)
    val map6=map5+("g"->9,"z"->8)
    println(map6)


    //删除元素
    //1）“A”，“B”就是要删除的key，可以写多个
    //2）如果 key 存在，就删除，如果 key 不存在，也不会报错
    map5 -=("A","B","AAA")//直接填入key就行了
    println("map5="+ map5)


    val map7=mutable.Map(("A",1),("B","北京"),("C",3))
    println("------(k,v) <- map7--------")
    for((k,v)<-map7) println(k+"is mapped to"+v)
    //这样取出方式 v 类型是元组
    println("--------v<-map7--------")
    for(v <- map7) println(v+"key"+v._1+"val="+v._2)
    println("-----v <-map7.keys-------")
    for(k <- map7.keys) println("key:"+k+"value:"+map7(k))
    println("---------v <- map7.values----------")
    for(v <- map7.values) println(v)
  }
}
