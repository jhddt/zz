package test.sever

abstract class MotoVehicle {
  //定义父类
    var no=""
    var brand=""
    def this(no:String,brand:String) { //辅助构造器
      this()
      this.no=no
      this.brand=brand
    }
  //计算租金 抽象方法
  def calRent(days:Int):Int
}
