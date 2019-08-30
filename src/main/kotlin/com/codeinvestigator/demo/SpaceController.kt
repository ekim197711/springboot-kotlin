package com.codeinvestigator.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/space")
class SpaceController(@Autowired val mothership : MotherShip){

    @GetMapping("/mothership")
    fun getMotherShip() : MotherShip {
        mothership.showShips()
        return mothership
    }

    @GetMapping("/greeting")
    fun greetAliens(): String{
        return "We come in peace. Hello fellow space traveler"
    }

    @GetMapping("/spacecraft")
    fun spaceCraft() = SpaceCraft(rocketFuel = 840.726323)

}