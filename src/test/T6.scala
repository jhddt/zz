package test

object T6 {
  def main(args: Array[String]): Unit = {
    //map：为list中的每个元素都加上一个前缀
    List("leo","Jen","Peter").map("Name is "+_).foreach(println(_))
    //foreach：打印List中的每一个单词
    List("I","have","a","beautiful","house").foreach(x=>print(x+" "))
    //flatMap：将List中的多行句子拆分为单词
    List("Hello World","You Me").flatMap(_.split(" ")).foreach(println(_))
    //zip:对学生姓名和学生成绩进行关联
    List("leo","Jen","Peter").zip(List(100,90,83)).foreach(println(_))
  }
}
