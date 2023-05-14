package txt

import java.io.{BufferedWriter, FileWriter}

import scala.collection.mutable.ListBuffer
import scala.io.Source
import scala.reflect.io.File

object demo综合 {
  //案例:按照学员的总分降序排列.
  //1.定义样例类Student,属性:姓名,语文成绩,数学成绩,英语成绩,且该类中有一个获取总成绩的方法.
  case class Student(name:String,chinese:Int,math:Int,english:Int){
    //计算总成绩方法
    def getSum()=chinese+math+english
  }

  def main(args: Array[String]): Unit = {
    //2.获取数据源文件对象.
    val source=Source.fromFile("D:\\qq文件\\1876990651\\FileRecv\\student.txt")
    //3.读取指定文件(student.txt)中所有的数据,并将其封装到List列表中.
    var studentList=source.getLines().map(_.split(" ")).map(_.toList)
    //4.定义可变的列表ListBuffer【Student】,用来记录所有学生的信息.
    val list=new ListBuffer[Student]()
    //5.遍历第二步获取到的数据,将其封装成Student类的对象后,然后添加到ListBuffer中.
    for(s<-studentList){
      list+=Student(s(0),s(1).toInt,s(2).toInt,s(3).toInt)
    }
    //6.对第5步获取到的数据,将其封装成Student类的对象后,然后添加到ListBuffer中.
   val sortList=list.sortBy(_.getSum()).reverse.toList
    //7.按照指定格式,通过BufferedWriter将排序后的数据写入到目的地文件中
    val bw=new BufferedWriter(new FileWriter("stu.txt"))
    for(s<-sortList)
      bw.write(s"${s.name} ${s.chinese} ${s.math} ${s.english} ${s.getSum()}\r\n")
    bw.flush()
    print("写入完成......")
    //8.关闭流对象
    bw.close()
    }

}
