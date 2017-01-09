package basic.cakepattern

/**
  * Created by Administrator on 2017/1/9 0009.
  */
trait Config {

  load
  val text:String
  def load:Unit
}


trait InMemoryConfig extends Config{
  lazy  val text = "Hello"
  def load = println("load :"+text)
}

object ConfigMain extends InMemoryConfig{

  def main(args: Array[String]): Unit = {
    load
  }
}