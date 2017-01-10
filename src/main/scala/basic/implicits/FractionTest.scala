package basic.implicits

import java.io.File

import scala.io.Source

/**
  * Created by Administrator on 2017/1/10 0010.
  */
object FractionTest extends App{
  implicit def file2RichFile(from:File) = new RishFile(from)
  new File("G:\\Dubbo.txt").read

}

class RishFile(val from:File){
  def read = Source.fromFile(from.getPath).mkString
}