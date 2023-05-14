package test.Pet

class Master(var name:String) {
  //领养宠物：方法的返回值是父类类型，更加通用性，这也是多态
  def getPet(typeid: Int): Pet = {
    //父类类型的引用，可以指向子类的对象
    var pet:Pet=null
    if(typeid == 1){
      pet=new Dog("小花",100,"金毛")
      println("领养成功")
    }
    else if(typeid==2){
      pet=new Penigue("小草",90,"母")
      println("领养成功")
    }
    return pet
  }

  /**
   * 给宠物喂食
   */
  /**
   * 把父类的类型作为方法的形参，父类更具通用性，就形成了多态
   * 一个方法可以给所有的宠物喂食，方法更具通用性
   */
  def feed(p:Pet): Unit={
    p.eat()
  }

  /**
   * 和宠物玩耍
   */
  def playing(pet: Pet): Unit={
    /**
     * 把父类类型转换为子类类型，需要强制转换，
     * 一般要配合isInstanceof运算符使用，防止转换异常
     */
    if(pet.isInstanceOf[Dog]){
      /**
       * 强制转换成狗对象
       */
      val d=pet.asInstanceOf[Dog]
      //调用狗的方法
      d.catchingFlyDisc()
    }
    if(pet.isInstanceOf[Penigue]){
      //强制转换成企鹅类型
      val p=pet.asInstanceOf[Penigue]
      //调用企鹅方法
      p.swimming()
    }
  }
}
