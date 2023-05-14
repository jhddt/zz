package test.Pet

class Penigue extends Pet {
  //性别：公，母
  var sex=""
  def this(name:String,health:Int,Sex:String){
    this()
    this.name=name
    this.health=health
    this.sex=sex
  }

  def eat(): Unit = {
    System.out.println("吃鱼......")
    this.health=(health+3)
  }

  /*
  子类特有的方法：企鹅游泳方法
   */
  def swimming(): Unit = {
    this.health=(health+3)
    System.out.println("正在和企鹅游泳......")
  }
}
