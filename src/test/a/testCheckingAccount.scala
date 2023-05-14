package test.a
class BankAccount1(var balance:Double=0.0){
  //存钱方法
  def deposit(money:Double)={
    balance+=money
    println("---存钱成功---")
    balance
  }

  //取钱方法
  def withdraw(value:Double)={
    if(balance-value>0){
      balance-=value
      println("---取钱成功---")
    }else{
      println("---余额不足---")
    }
    balance
  }
  //查询余额
  def searchbalance=balance
}

class CheckingAccount(initialBalance:Double) extends BankAccount1(initialBalance){
  override def deposit(amount: Double): Double = super.deposit(amount-1)
  override def withdraw(amount: Double): Double = super.withdraw(amount-1)
}

object testCheckingAccount {
  def main(args: Array[String]): Unit = {
    var ca=new CheckingAccount(0.0)
    //存钱方法
    ca.deposit(200)
    println("余额:"+ca.searchbalance)
    //取钱方法
    ca.withdraw(140)
    println("余额:"+ca.searchbalance)
  }
}
