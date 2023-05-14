package test.sever
//客户类
class Customer {
  var name:String=""//客户姓名
  def this(name:String){//辅助构造器
    this()
    this.name=name
  }

  /**
   * 计算多辆汽车总租价
   */
  def calcTotalRent(motos:Array[MotoVehicle],days:Int):Int={
    var sum=0
    var i=0
    //计算费用
    for(i <- 0 to motos.length-1){
      sum+=motos(i).calRent(days)
    }
    sum
  }
}
