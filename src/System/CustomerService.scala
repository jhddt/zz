//package System
//
//import scala.collection.mutable.ListBuffer
//import scala.io.StdIn
//import util.control.Breaks._
//
//class CustomerService {
//  //初始化2个客户对象
//  val customer1=new Customer(1,18,"zz",'男',"1234567891","zz@qq.com")
//  val customer2=new Customer(2,18,"cc",'男',"6234567892","cc@qq.com")
//  //定义一个列表对象
//  var customerInfo=new ListBuffer[Customer]()
//  var customerId=3
//  //添加客户对象到列表中
//  customerInfo.append(customer1)
//  customerInfo.append(customer2)
//  /**
//   * 获取客户信息：
//   */
//  def getCustomerInfo():Unit={
//    println("客户列表:")
//    println("编号\t\t年龄\t\t性别\t\t电话\t\t邮箱")
//    for(customer <- customerInfo{
//      println(customer.toString)
//    }
//    println("客户列表显示完毕...\n...................................")
//  }
//
//  /**
//   * 添加客户信息
//   */
//  def addCustomerInfo(): Unit={
//    println("添加客户")
//    println("请依次输入用户信息:")
//    println("姓名")
//    val name=StdIn.readLine()
//    println("年龄")
//    val age=StdIn.readShort()
//    println("性别")
//    val gender=StdIn.readChar()
//    println("电话")
//    val tel=StdIn.readLine()
//    println("邮箱")
//    val email=StdIn.readLine()
//    //构造对象
//    val customer=new Customer(customerId,age,name,gender,tel,email)
//    customerId+=1
//    customerInfo.append(customer)
//    println("添加客户信息成功!\n")
//  }
//
//  /**
//   * 根据id找到customerInfo的index
//   */
//  def findIndexById(id:Int)={
//    //默认-1，如果找到就改成对，如果没有找到，就返回-1
//    var index = -1
//    //遍历customerInfo
//    breakable{
//      for (i <- 0 until customerInfo.length){
//        //找到
//        if(customerInfo(i).id == id){
//          index = i
//          break()
//        }
//      }
//    }
//    index
//  }
//  def updateCustomerInfo(): Unit={
//    println("修改客户操作：")
//    println("请选择待修改客户编号（-1退出）:")
//    val id = StdIn.readInt()
//    if(id == -1){
//      println("退出修改操作")
//      return
//    }
//    val index
//  }
//}
