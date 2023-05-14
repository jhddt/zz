package txt7

import java.io.PrintWriter

object demo4 {
  //以字符流的形式写入
  def main(args: Array[String]): Unit = {
    var pw=new PrintWriter("demo.txt")
    pw.print("Hello World\n")
    pw.print("Hello 中国\n")
    pw.print("Hello 文华")
    pw.close()
    print("写入成功......")
  }
}
