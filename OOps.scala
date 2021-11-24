package OOps

object OOps extends App {
  val author = new Writer("Rowlling", "Joanne",1965)

  val novel = new Novel("Harry Potter",1997,author)

  val Counter = new counter(10)

  println(author.fullname())
  println(novel.isWritenBy(author))



  println(Counter.incrementer.C)
}
class Writer(fname:String,Sname:String,val YOB:Int){
  def fullname() :String = fname+ " "+Sname
}

class Novel(name:String,YOR:Int,author:Writer){

  def authorAge():Int = YOR - author.YOB

  def isWritenBy(author:Writer) = author == this.author

  def copy(newYear:Int):Novel = new Novel(name,newYear,author)
}

class counter(val C:Int){

  def incrementer = new counter(C+1)

  def decrementer = new counter(C-1)

  def incrementer(n:Int):counter = {
    if(n<=0) this
    else incrementer.incrementer(n+1)
  }
  def decrementer(n:Int):counter = {
    if(n<=0) this
    else decrementer.decrementer(n-1)
  }

}