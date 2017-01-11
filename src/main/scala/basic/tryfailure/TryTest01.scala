package basic.tryfailure

import scala.util.{Failure, Success, Try}

/**
  * Created by Administrator on 2017/1/11 0011.
  */
object TryTest01 extends App{

  def divideBy(x:Int,y:Int):Try[Int] = {
    Try(x/y)
  }

  println(divideBy(1,2).getOrElse(0))
  println(divideBy(1,0).getOrElse(0))

  divideBy(1,1).foreach(println)
  divideBy(1,0).foreach(println)



  divideBy(1,0) match {
    case Success(i) =>println("success")
    case Failure(s) =>println("failure")
  }



  def divideBy2(x:Int,y:Int) :Either[String,Int] = {
    if(y==0) Left("Dude,can't divide by 0")
    else Right(x/y)
  }



  divideBy2(1,0) match {
    case Left(s) =>println("Answer:"+s)
    case Right(i) =>println("Sorry Answer:"+i)
  }

}
