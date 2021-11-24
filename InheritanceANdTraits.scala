package OOps

object InheritanceANdTraits extends App {
  class Animals {
    val creatureType = "Wild"
    def eat:Unit= {
      println("creature Eatss")
    }
  }

  class cat extends Animals {

    def says:Unit= {
      eat
      println("Cat says meow")
    }
  }

  val Cat = new cat
  val animal:Animals = new cat
  //println(animal.eat)
  println("Animalcart")

  println(Cat.says)

  class Dog extends Animals{
    override def eat = {
      super.eat
      println("Eatssss")
    }
  }

  val dog = new Dog
  //dog.eat
}
