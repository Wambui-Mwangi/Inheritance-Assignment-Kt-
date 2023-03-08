fun main(){
val nissan = Car("Nissan", "Caravan", "White", 14 )
    var passengers = nissan.carry(10)
    var passengerss = nissan.carry(20)

    nissan.identity()

    var pfees = nissan.calculateParkingFees(2)
    println(pfees)

val bus = Bus("Mercedes", "eCitaro", "Black", 40)
    var busfare = bus.maxTripFare(80.0)
    println(busfare)

    var busparking = bus.calculateParkingFees(5)
    println(busparking)

    var pass = bus.carry(30)
    var passes = bus.carry(50)

    bus.identity()
}

open class Vehicles(var make:String, var model:String, var color:String, var capacity:Int) {

    fun carry(people: Int) {
        var x = people - capacity
        if (people<=capacity){
            println("Carrying $people passengers")
        }
        else{
            println("overcapacity by $x people")
        }

    }

    fun identity() {
        println("I am a $color $make $model")
    }

   open fun calculateParkingFees(hours: Int): Int {
        var fees = hours * 20
        return fees
    }
}
class Car(make:String, model:String, color:String, capacity:Int):Vehicles(make, model, color, capacity){

}

class Bus(make: String, model: String, color: String, capacity: Int):Vehicles(make, model, color, capacity){
    fun maxTripFare(fare:Double):Double{
        var money = fare*capacity
        return money
    }

    override fun calculateParkingFees(hours: Int): Int {
//        return super.calculateParkingFees(hours)
        var busparking = hours*capacity
        return busparking
    }
}