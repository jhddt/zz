package test

object ApplyCar {
  class Car(name:String){
    def into():Unit={
      println("car name is "+name)
    }
  }
  object Car{
    //通过apply产生半生类的对象
    def apply(name:String)=new Car(name)//调用半生类的构造方法
  }

  def main(args: Array[String]): Unit = {
    //var mycar=new Car("BMW")
    var mycar=Car("BMW")//调用伴生对象的apply方法
    mycar.into()
  }
}
