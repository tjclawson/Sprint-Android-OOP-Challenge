package com.example.sprint_android_oop_challenge.model

import kotlin.math.exp

abstract class Empire(val name: String, val expansion: String, var isFavorite: Boolean) {

    abstract fun getObjectDescription(): String
}

class Unit(name: String, expansion: String, isFavorite: Boolean, val description: String) : Empire(name, expansion, isFavorite) {

    override fun getObjectDescription(): String {
        return "Unit Info:\n" +
                "Name: $name\n" +
                "Expansion: $expansion\n" +
                "Description: $description"
    }
}

class Civilization(name: String, expansion: String, isFavorite: Boolean, val armyType: String) : Empire(name, expansion, isFavorite) {

    override fun getObjectDescription(): String {
        return "Civilization Info:\n" +
                "Name: $name\n" +
                "Expansion: $expansion\n" +
                "Army Type: $armyType"
    }
}

class Structure(name: String, expansion: String, isFavorite: Boolean, val age: String) : Empire(name, expansion, isFavorite) {

    override fun getObjectDescription(): String {
        return "Structure Info:\n" +
                "Name: $name\n" +
                "Expansion: $expansion\n" +
                "Age: $age"
    }
}

class Technology(name: String, expansion: String, isFavorite: Boolean, val buildTime: String) : Empire(name, expansion, isFavorite) {

    override fun getObjectDescription(): String {
        return "Technology Info:\n" +
                "Name: $name\n" +
                "Expansion: $expansion\n" +
                "Build Time: $buildTime"
    }
}
