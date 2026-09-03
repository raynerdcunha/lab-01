package com.example.petshop

class Happy(date: String): Mood(date) {
    override fun name() : String {
        return "The mode is happy and the date is $date"
    }
}