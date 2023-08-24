package learn.scala

class Bike {
  var Model: String = ""
  var TopSpeed: Int = 0
  private var Average = 0

  def setAverage(x: Int): Unit = {
    Average = x
  }

  def getAverage: Int = {
    return Average
  }
}

object MyObject {
  def main(args: Array[String]): Unit = {
    val myBike = new Bike()
    myBike.Model = "BMW S1000 RR"
    myBike.TopSpeed = 300
    myBike.setAverage(15)

    println("Bike Name: " + myBike.Model)
    println("Top Speed: " + myBike.TopSpeed)
    println("Average: " + myBike.getAverage)
  }
}
