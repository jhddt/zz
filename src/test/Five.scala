package test

object Five {
  def main(args: Array[String]): Unit = {
    var str="hELLO"
    println(str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase())
    println(str.substring(1,3))
    println(str.replace("1","t"))
    println("o")
    println(str.charAt(3))
    var str1=" dfd ADFKJDKF 3455 "
    var smallCount=0
    var bigCount=0
    var numberCount=0
    for(i<- 0 to str1.length-1){
      var ch=str1.charAt(i)
      if(ch >='a' && ch <='z'){
        smallCount+=1
      }else if (ch >='A' && ch<= 'Z'){
        bigCount+=1
      }else if (ch >= 'O' && ch <= '9'){
        numberCount+=1;
      }
    }
    print("小写字母："+smallCount+",大写字母:"+bigCount+",数字："+  numberCount)


    //判断文件后缀
    var strfile="demo.txt"
    var n=strfile.indexOf(".")
    var subtxt=strfile.substring(n+1)
    if(subtxt.equals("txt"))
      println(strfile+"该文件是记事本")
    else
      println(strfile+"该文件不是记事本")
  }
}
