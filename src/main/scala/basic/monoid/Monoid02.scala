package basic.monoid

/**
  * Created by Administrator on 2017/1/11 0011.
  */
object Monoid02 extends App{

  val l1= List(1,2,3)
  val result = ListFunctor.map(l1)(i => String.valueOf(i+"abc"))
  println(result)
}


trait Functor[F[_]]{
  def map[A,B](x:F[A])(f:A=>B):F[B]
}

object ListFunctor extends Functor[List]{
  override def map[A, B](list: List[A])(f: (A) => B): List[B] = list map f
}