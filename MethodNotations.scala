package OOps
import scala.language.postfixOps
object MethodNotations extends App {
  class Person(val name:String, favourateMovie:String,val age:Int = 0){

    def likes(movie:String):Boolean = movie == favourateMovie

    def +(person: Person):String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname:String) : Person = new Person(s"$name($nickname)",favourateMovie)

    def unary_! : String = s"$name says, How was the Movie?"
    def unary_+ : Person = new Person(name,favourateMovie,age+1)

    def learns(sub:String):String = s"$name learns $sub"
    def learnsScala : String = this learns "Scala"
    def isAlive : Boolean = true

    def apply() : String = s"$name likes $favourateMovie"
    def apply(n:Int):String = s"$name watched $favourateMovie $n times"

  }

  var person1 = new Person("Tom Holland","The Avengers")

  var person2 = new Person("Chris Evans","Captain America")
  //infix notation can be used for method with only on paramenter
  println(person1.likes("The Avengers"))
  println(person1 likes "The Avengers")

  println(person1 + person2)
  println(person1.+(person2))

  //Prefix Unary_ + - ! ~
  println(person1.unary_!)
  println(!person1)

  //postfix can be used with methods with no paramerters and we have to import scala postfix module at the beginning
  println(person1.isAlive)
  println(person1 isAlive)

  //apply()
  println(person1.apply())
  println(person1())

  println((person1+"The Rockstar")())

  println((+person1).age)

  println(person1 learnsScala)
  println(person1(2))
}
