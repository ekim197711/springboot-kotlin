package com.codeinvestigator.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoKotlinApplication{

    @Bean
    fun motherShip(): MotherShip{
        return MotherShip(listOf(SpaceCraft(),
                SpaceCraft(crew=8),
                SpaceCraft(rocketFuel = 140.0)
        ));
    }
}

fun main(args: Array<String>) {
    runApplication<DemoKotlinApplication>(*args)
}

