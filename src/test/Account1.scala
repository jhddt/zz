package test


class Account1{//半生类
  //银行账户，账户必须是唯一的，不能重复，只能通过该类的半生对象产生，因为半生对象可以定义静态变量和静态方法
  //在半生类中可以访问半生对象的方法，直接通过名称访问
  val accountid=Account1.newUniqueNumber()
  private var balance=0.0
  //向账户中存入前
  def deposit(amount:Double){
    balance+=amount
    println("账号"+accountid+"\t余额"+balance)
  }

}
object Account1 {//伴生对象
  //在object中定义的属性和方法都是静态的，共享属性和共享方法
  private var lastNumber=10000
  //方法实现开户
  private def newUniqueNumber()={
    lastNumber+=1
    lastNumber
  }

  def main(args: Array[String]): Unit = {
    for(i <- 1 to 10){
      //产生10个银行账户类的对象，而且10个账户都不相同，达到我们的目的！
      var a=new Account1()
      //调用存钱方法，向新建账户中存钱
      a.deposit(10)
    }
  }
}
