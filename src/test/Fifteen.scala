package test

object Fifteen {
  def main(args: Array[String]) {
    printString("Runoob","Scala","Python")
  }

  def printString(args:String*)={
    var i=0
    for(arg <- args){
      println("Arg value["+i+"]="+arg)
      i=i+1
    }
  }
}
