package basic.cakepattern

/**
  * Created by Administrator on 2017/1/9 0009.
  */
trait Context ;


trait MyContext extends Context{
  this:Config =>
  def welcome = this.text
}


object Env extends MyContext with InMemoryConfig{


  def main(args: Array[String]) {
    println(Env.text)
  }
}