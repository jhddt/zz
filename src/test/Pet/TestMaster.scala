package test.Pet
import io.StdIn._
object TestMaster {
  def main(args: Array[String]): Unit = {
    val master=new Master("王明")
    println("请输入要领养的编号：\n 1.领养狗 \n 2.领养企鹅")
    var n=readInt()
    var pet=master.getPet(n)
    if(pet!=null){
      //领养成功后喂食
      master.feed(pet)
      //领养成功后陪宠物玩耍
      master.playing(pet)
    }else{
      System.out.println("输入错误，领养失败..")
    }
  }
}
