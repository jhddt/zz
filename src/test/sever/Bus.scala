package test.sever

class Bus extends MotoVehicle {
  var seatCount:Int=0
  def this(no:String,brand:String,searCount:Int){
    this()
    this.no=no
    this.brand=brand
    this.seatCount=searCount
  }
  def calRent(days:Int):Int=
    if(seatCount <= 16) days * 800 else days * 1500
}
