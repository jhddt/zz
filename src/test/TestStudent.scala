package test

//创建学生类
class Studetnt{
  private var name=""
  private var number=""
  private var score=0

  def this(name:String,number:String,score:Int){
    this()
    this.name=name
    this.number=number
    this.score=score
  }
  //对学生成绩进行冒泡排序
  def sortByScore( studetnts:Array[Studetnt]):Unit={
    for(i <- 0 to studetnts.length-2){
      for(j <- 0 to studetnts.length-2){
        if(studetnts(i).score>studetnts(j).score){
          //降序排序
          var b=studetnts(i)
          studetnts(i)=studetnts(j)
          studetnts(j)=b
        }
      }
    }
    println("按成绩排序后的结果如下：")
    for(i <- 0 to studetnts.length-1){
      println(studetnts(i).name+"   "+studetnts(i).number+"   "+studetnts(i).score)
    }
  }
}




object TestStudent {
  def main(args: Array[String]): Unit = {
    val s1=new Studetnt("zck","01",21)
    val s2=new Studetnt("wjm","02",19)
    val s3=new Studetnt("tpf","03",20)
    val s4=new Studetnt("qq","04",20)
    //把对象放入数组
    val studetnts=Array[Studetnt](s1,s2,s3)
    //调用排序方法
    s3.sortByScore(studetnts)
  }
}
