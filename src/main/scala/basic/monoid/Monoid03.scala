package basic.monoid

/**
  * Created by Administrator on 2017/1/11 0011.
  */
object Monoid03 extends App{


  case class Person(name:String,isMale:Boolean,children:Person*)

  val lara = Person("Lara",false)
  val bob = Person("Bob",true)
  val julie = Person("Julie",false,bob,lara)
  val persons = List(lara,bob,julie)
  println(
    persons filter( p => !p.isMale) flatMap (p=>(p.children map(c=> (p.name,c.name))))
  )


  println(
    for (
      p<-persons ;if !p.isMale; c <-p.children
    ) yield (p.name,c.name)
  )


  println(
    for (
      p<-persons ;c <-p.children  //生成器
       if !p.isMale  //过滤器
    ) yield (p.name,c.name)
  )

  println(
    for {
      p <- persons   //生成器
      n = p.name     //定义
      if(n startsWith "Bo")   //过滤器
    }yield n
  )


}
