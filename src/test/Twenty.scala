package test

object Twenty {
  def f1(x:Int,y:Int):Int={
    return  x*y
  }
  def f2(x:Int)={
    0.1*x
  }
  def main(args: Array[String]): Unit = {
    // 一个函数的参数又是一个函数，函数参数
    (1 to 9).map(f2(_)).foreach(println)
    (1 to 9).map(0.1*_).foreach(println)
    //
    print((1 to 9).reduceLeft(_*_))
    print((1 to 9).reduceLeft(f1(_,_)))

    //1.用reducelift得到数组中的最大元素
    var arraynum=Array[Int](4,5,6,7,21)
    val max=arraynum.reduceLeft((x,y)=>if(x>y) x else y)
    print(max)

    //2.用to和reduceleft实现阶乘函数，不得使用循环或递归
    //def fac1(n:Int)=(1 to n).reduceLeft(_*_)
    def fac2(n: Int)=(1 to n).reduceLeft((x,y)=>x*y)
    //print(fac1(5))
    print(fac2(5))
  }
}
