package OOps

object Objects extends App {
  object Person {
    val N_Eyes = 2
    def canFly : Boolean = false
  }

  val mary = Person
  val john = Person
  println(john.N_Eyes)
//Scala Objects are singleton instances by itslef
}
