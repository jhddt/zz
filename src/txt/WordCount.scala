package txt

import java.io.{BufferedWriter, FileWriter}

object WordCount {
  import scala.io.Source
  def main(args: Array[String]): Unit = {
    //读取文件
    val source=Source.fromFile("D:\\qq文件\\1876990651\\FileRecv\\word.txt")
    //将读取到的数据放入一个List【String】类型的list集合中，每一行内容作为list的一个元素
    val list:List[String]=source.getLines().toList
    //通过flatMap加上split，将每一个元素，也就是文件中每一行的单词单独拆出来，放入一个新的List集合中
    val wordList:List[String]=list.flatMap(line=>{line.split(",")})
    //通过groupBy函数，将每一个单词作为key，将所有的相同的单词构建成一个list集合，然后将key和list集合
    //作为键值对放入map集合中
    val wordsMap:Map[String,List[String]]=wordList.groupBy(w=>w)
    //hello，List（"hello","hello","hello"）
    //利用map函数对每一个元素，也就是每一个键值对进行处理，计算list集合的长度，即可得出相同单词的个数
    var resultlist=wordsMap.map(x=>(x._1,x._2.size)).toList.sortBy(_._2).reverse
    resultlist.foreach(println)
    //通过BufferWriter将排序后的数据写入到目的地文件中
    val bw=new BufferedWriter(new FileWriter("d:\\result.txt"))
    for(r <- resultlist)
      bw.write(r+"\r\n")
    bw.flush()
    println("写入成功......")
    source.close()
  }
}
