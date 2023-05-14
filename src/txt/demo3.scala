package txt

import java.io.FileOutputStream

object demo3 {
  //以字节流的形式写入
  def main(args: Array[String]): Unit = {
    val fileOutputStream=new FileOutputStream("3.txt")
    fileOutputStream.write("好好学习\n".getBytes())
    fileOutputStream.write("天天向上".getBytes())
    fileOutputStream.close()
    print("写入成功......")
  }
}
