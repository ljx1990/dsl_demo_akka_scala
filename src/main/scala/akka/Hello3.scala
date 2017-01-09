package akka

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

/**
  * Created by Administrator on 2017/1/6 0006.
  */
object Hello3 extends App {

  import Greeter._
  val system = ActorSystem("actor-demo-scala")
  val bob = system.actorOf(props("Bob", "Howya doing"))
  val alice = system.actorOf(props("Alice", "Happy to meet you"))
  bob ! Greet(alice)
 // alice ! Greet(bob)
  Thread sleep 1000
  system shutdown

  object Greeter {
    case class Greet(peer: ActorRef)
    case object AskName
    case class TellName(name: String)
    def props(name: String, greeting: String) = Props(new Greeter(name, greeting))
  }

  class Greeter(myName: String, greeting: String) extends Actor {
    import Greeter._
    def receive = {
      case Greet(peer) => {println(s"$myName :hi,whats your name") ;peer ! AskName}
      case AskName => {println(s"$myName:my name is $myName");sender ! TellName(myName)}
      case TellName(name) => println(s"$myName:  $name !,nice name, $greeting!")
    }
  }
}
