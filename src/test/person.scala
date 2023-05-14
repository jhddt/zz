package test

object person {
  class person(var name:String,var age:Int){
    def sayHello():String="hello "+name+" the age is:"+age
  }

  class Employee(name:String,age:Int,var salary:Int)extends person(name,age){
    //重写父类方法
    override def sayHello(): String = super.sayHello()+",salary:"+salary
  }

  def main(args: Array[String]): Unit = {
    var p1=new person("Tom",20)
    println(p1.sayHello())
    var p2:person=new Employee("Mike",21,5000)
    println(p2.sayHello())
  }
}
