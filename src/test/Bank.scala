package test
import io.StdIn

class BankAccount(var balance:Double=0.0){
  //存钱方法
  def depoist(money:Double)={
    balance+=money-1
    println("---存钱成功---")
    balance
  }
  //取钱方法
  def withdraw(value:Double)={
    if(balance - value >=0){
      balance -=value
      println("---取钱成功---")
      println("金额:"+(value-1))
    }else{
      println("---取钱失败，余额不足---")
    }
    balance
  }
  //查询余额方法
  def searchbalance=balance
}


object Bank {
  def main(args: Array[String]): Unit = {
    var ch=new BankAccount()
    println("欢迎来到本银行办理业务")
    var t=true
    while(t){
      println("1.存款 2.取款 3.查询余额 0.退出")
      println("请选择你需要办理的业务：\n每次办理存款取款业务都需要收取1元手续费！")
      val choice=readInt()
      if(choice==1){
        println("请输入存款金额:")
        var ck=readDouble()
        ch.depoist(ck)
      }else if(choice==2){
        println("请输入取款金额：")
        var qq=readDouble()
        ch.withdraw(qq)
      }else if(choice==3){
        println("\t当前余额："+ch.searchbalance)
      }else if(choice==0){
        println("退出。")
      }else{
        println("输入错误!")
      }
    }
  }
}
