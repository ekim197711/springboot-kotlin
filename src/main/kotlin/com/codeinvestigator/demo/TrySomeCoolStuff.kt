package com.codeinvestigator.demo


data class SpaceCraft (val crew: Int = 10, val rocketFuel: Double = 200.0) {
    var craftName: String = "NOT_SET"

    constructor (crew: Int, hyperspaceFuel: Double, name: String) : this(crew, hyperspaceFuel*10.0){
        this.craftName = name
    }
}


fun main(args: Array<String>){

}