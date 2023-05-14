package txt

import scala.io.Source

object demo1 {
  def main(args: Array[String]): Unit = {
    //1.获取数据源对象.
    val source=Source.fromFile("d:\\user.txt")
    //2.通过getLines()方法，逐行获取文件中的数据.
    val lines=source.getLines()
    //3.将获取到的每一条数据都封装到列表中.
    val list=lines.toList
    list.foreach(println)
  }
}
