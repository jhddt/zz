package System

class Customer {
  /**
   * 客户信息
   */
  var id:Int=_
  var age:Int=_
  var name:String=_
  var gender:Char=_
  var phone:String=_
  var email:String=_
  /**
   * 辅助构造器
   */
  def this(id:Int,age:Int,name:String,gender:Char,phone:String,email:String){
    this
    this.id=id
    this.age=age
    this.name=name
    this.gender=gender
    this.phone=phone
    this.email=email
  }

  /**
   * 辅助构造器
   */
  def this(age:Int,name:String,gender:Char,phone:String,email:String){
    this
    this.id=id
    this.age=age
    this.name=name
    this.gender=gender
    this.phone=phone
    this.email=email
  }

  /**
   * 重写toString方法
   */
  override def toString: String={
    this.id+"\t\t"+this.age+"\t\t"+this.name+"\t\t"+this.gender+"\t\t"+this.phone+"\t\t"+this.email
  }
}
