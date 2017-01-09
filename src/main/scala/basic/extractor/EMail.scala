package basic.extractor

/**
  * Created by Administrator on 2017/1/6 0006.
  */
object EMail {
  def apply(user:String,domain:String) = user + "@" + domain
  def unapply(str: String) :Option[(String, String)] ={
    val parts = str split "@"
    if(parts.length==2) Some(parts(0),parts(1)) else None
  }

  def userTwiceUpper(s:String) = s match{
    case EMail(Twice(x @ UpperCase() ),domain) =>
      "match:" + x + " in domain " + domain
    case _ => "no match"
  }

  def main(args: Array[String]) {
    println(userTwiceUpper("DIDI@HOTMAIL.COM"))
  }
}