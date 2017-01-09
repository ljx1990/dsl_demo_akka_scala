package akka

import akka.actor.{Actor, ActorSystem, Props}

/**
  * akka基础 简单的 Scala hello
  */
object Hello1 extends App {

  val system = ActorSystem("actor-demo-scala")
  val hello = system.actorOf(Props[Hello])
  val angle = system.actorOf(Props[Angle])
  hello ! "Bob"
  angle !"lv"
  Thread sleep 1000
  system.terminate()
  class Hello extends Actor {
    def receive = {
      case name: String => println(s"Hello $name")
    }
  }
  class Angle extends Actor {
    def receive = {
      case name: String => println(s"Angle Receive $name")
    }
  }

}