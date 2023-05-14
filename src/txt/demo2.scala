package txt

import scala.io.Source

object demo2 {
  def main(args: Array[String]): Unit = {
    //1.获取数据源对象.
    val source=Source.fromFile("d:\\user.txt")
    //2.获取数据源文件中的每一个字符.
    val iter=source.buffered
    //3.通过hasNext(),next()方法获取数据.
    while(iter.hasNext){
      print(iter.next())
    }
    //4.关闭scoure对象节约资源,提高效率.
    source.close()
  }
}
