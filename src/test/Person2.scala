package test
//该类中一共有3个构造方法（实例化对象和初始化操作），一个主构造方法（类的里面，方法的
// 外面都是主构造方法），两个辅助构造方法
class Person2{
  println("这里是主构造方法。。。。。。。")
  private var name=""
  private var age=0

  def this(name:String){
    //一个辅助构造器
    //每一个辅助构造器都必须以一个对先前已定义的其他辅助构造器或主构造器的调用开始
    this()//先调用默认的主构造方法
    this.name=name
  }
  def this(name:String,age:Int){//另一个辅助构造器
    //调用上面的辅助构造器，来初始化name
    this(name)
    this.age=age
  }
}


object Person2 {
  def main(args: Array[String]): Unit = {
    //通过各个构造方法来产生对象
    val p1 = new Person2() //主构造器
    println(p1.name)
    val p2 = new Person2("Fred") //第一个辅助构造器
    println(p2.name)
    val p3 = new Person2("Fred", 42) //第二个辅助构造器
    println(p3.name)
    println(p3.age)
  }
}