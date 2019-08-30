package com.codeinvestigator.demo


fun main(args: Array<String>) {

    var importantObject: Any = "Important Note"
    if (importantObject is String){
        println("This is in upperCase ${importantObject.toUpperCase()}")
    }

}
