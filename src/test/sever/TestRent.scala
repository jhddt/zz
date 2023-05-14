package test.sever

object TestRent {
  def main(args: Array[String]): Unit = {
    var days=5
      //租车天数
    var totalRent=0
    //总租用费
    //1。客户租车的多辆汽车信息及租车天数
    val motos = new Array[MotoVehicle](4)
    motos(0)=new Car("京NY0000","宝马","1")
    motos(1)=new Car("京NY1111","宝马","1")
    motos(2)=new Car("京NY2222","宝马","5")
    motos(3)=new Car("京NY8888","五菱","34")
    //2.计算总费用
    val customer=new Customer("zck")
    totalRent=customer.calcTotalRent(motos,days)
    //输出客户姓名和总费用
    println("\n客户名"+customer.name+",租车天数:"+days+",租车总费用:"+totalRent+"。")
  }
}
