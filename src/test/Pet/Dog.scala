package test.Pet

class Dog extends Pet {
  //品种
  var strain=""
  def this(name:String,health:Int,strain:String){
    this()
    this.name=name
    this.health=health
    this.strain=strain
  }

  //重写方法类
  def eat(): Unit={
    System.out.println("吃狗粮")
    this.health=(health+3)
  }

  //子类特有方法：狗接飞盘游戏
  def catchingFlyDisc(): Unit = {
    this.health=(health+6)
    System.out.println("正在和狗进行接飞盘游戏。。。。。。")
  }
}
