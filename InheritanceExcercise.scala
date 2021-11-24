package OOps

abstract class InheritanceExcercise {
  def head : Int
  def tail : InheritanceExcercise
  def isEmpty : Boolean
  def add(ele:Int) : InheritanceExcercise
  def printElements : String

  override def toString: String = "["+printElements+"]"
}

object Empty extends InheritanceExcercise {
  def head : Int = throw new NoSuchElementException
  def tail : InheritanceExcercise = throw  new NoSuchElementException
  def isEmpty : Boolean = true
  def add(ele:Int) : InheritanceExcercise = new creation(ele, Empty)
  def printElements : String = ""
}

class creation(h: Int,t: InheritanceExcercise) extends InheritanceExcercise{
  def head : Int = h
  def tail : InheritanceExcercise = t
  def isEmpty : Boolean = false
  def add(ele:Int) : InheritanceExcercise = new creation(ele, this)

  override def printElements: String =
    if(t.isEmpty) ""+h
    else h+" "+t.printElements
}
object Testing extends App{
  val list = new creation(1,new creation(2,new creation(3, Empty)))
  val new_list = list.add(4)
  println(new_list.toString)
}

