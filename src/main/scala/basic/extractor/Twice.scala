package basic.extractor

/**
  * Created by Administrator on 2017/1/6 0006.
  */
object Twice {
  def apply(s:String) = s + s
  def unapply(s:String):Option[String] ={
    val length=s.length/2
    val half = s.substring(0,length)
    if(half == s.substring(length)) Some(half) else None
  }

  def main(args: Array[String]) {
    print(Twice("okok@hakim.com"))
  }
}