package learn.scala

object Basic extends App {

  val aInt: Int = 12
  val aBoolean = true // infers the type without specifying
  //  String operations

  // Concepts of public, private and protected access modifiers:
  // See: https://www.programiz.com/java-programming/access-modifiers
  private val aString = "This is a string"
  protected val newString = s"Using aString here: $aString"

}
