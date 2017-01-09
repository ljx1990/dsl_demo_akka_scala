package basic.extractor

/**
  * Created by Administrator on 2017/1/6 0006.
  */
object UpperCase {
  def unapply(s:String):Boolean = s.toUpperCase ==s

  def main(args: Array[String]) {
    println(UpperCase.unapply("OKOK"))
  }
}