package test.sever

class Car extends MotoVehicle{
  var cartype=""//汽车型号
  def this(no:String,brand:String,cartype:String){//辅助构造器
    this()
    this.no=no
    this.brand=brand
    this.cartype=cartype

  }

  /**
   * 计算轿车租价
   */
  def calRent(days:Int):Int=
    if("1".equals("cartype")){//代表550i
      days * 600
    }else if("2".equals("cartype")){//2代表商务舱GL8
      500*days
    }else 300*days
}
