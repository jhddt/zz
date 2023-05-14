package txt

import scala.io.Source

object WordCount1 {
  //定义一个函数统计单词出现的次数
  def getWordCount(word:List[String]):Map[String,Int]={
    //定义一个map对象,map的key是单词,value是单词出现的次数
    var mapcount=Map[String,Int]()
    //遍历列表,来获得列表中每一个单词，添加到集合
    for(w<-word){
      //向map中添加键值对
      mapcount+=(w->(mapcount.getOrElse(w,0)+1))
    }
    return mapcount
  }

  def main(args: Array[String]): Unit = {
    //读取文件
    val source=Source.fromFile("D:\\qq文件\\1876990651\\FileRecv\\word.txt")
    //将读取到的数据放入一个List[String]类型的list集合中,每一行内容作为list的一个元素
    val list =source.getLines().toList
    //通过flatmap加上split,将每一个元素,也就是文件中每一行的单词都单独拆出来,放入一个新的List集合中
    val wordList=list.flatMap(line=>{line.split(",")})
    //调用函数
    var mapstr=getWordCount(wordList)
    //循环输出map对象
    for((k,v)<-mapstr){
      println(""+k+":"+v)
    }
  }
}
