package test
object Sixteen {
  def main(args: Array[String]): Unit = {
    val arr=Array(1,3,4,5,7,2,54,6)
    var z=0
    var c=0
    var k=0
    for(i <- 0 to (arr.length-1)){
      if(arr(i)<4){
        z=z+1
      }else if(arr(i)>4){
        c=c+1
      }else if(arr(i)==4){
        k=k+1
      }
    }
    print("大于4个数:"+z+",小于4的个数："+c+",等于4的个数:"+k)
  }
}
