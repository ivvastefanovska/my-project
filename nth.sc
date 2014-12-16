import week4._
object nth{
  def nth(n: Int, xs: List[Int]): Int =
   //if (xs.isEmpty) throw new IndexOutOfBoundsException
   if (n==0) xs.head
   else nth(n-1, xs.tail)
  val list= new Cons(1,new Cons(2, new Cons(3, new Nil)))
  nth(2,list)
  nth(-1, list)