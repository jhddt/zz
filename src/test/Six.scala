package test

object Six {
  def main(args: Array[String]): Unit = {
    var str ="sshelloworldhellojavahellojsp"
    var count =0
    var index =0
    var substr="hello"
    index=str.indexOf(substr,index)
    while(index != -1){
      count+=1
      index=index+substr.length();
      index=str.indexOf(substr,index)
    }
    print("出现次数："+count)
  }
}
