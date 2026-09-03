package com.example.petshop

class Sad(date:String): Mood(date) {
    override fun name() : String {
        return "The mode is sad and the date is $date"
    }
}