package com.codeinvestigator.demo

typealias BunchOfShips = List<SpaceCraft>
data class MotherShip (val dockedShips: BunchOfShips){

    fun showShips(){
        this.dockedShips.forEach({
            println("Ship docked: $it")
        })
    }
}


fun main (args: Array<String>){
    val spaceCraft1 = SpaceCraft(crew=40, rocketFuel = 2.5)

    val (crew, hyperdrivefuel) = spaceCraft1
    println("crew $crew fuel: $hyperdrivefuel")

    val mymap = hashMapOf<Int, String>(10 to "ten", 20 to "twenty", 100 to "one hundred...")
    for ((key, value) in mymap){
        println("Key: $key, value: $value")
    }
}