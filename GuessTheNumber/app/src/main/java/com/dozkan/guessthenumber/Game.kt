package com.dozkan.guessthenumber

import kotlin.random.Random
import java.util.*

fun main() {
    val randomNumber = (0..101).random()
    var guessesCount = 3
    println("Welcome to the Guess the Number Game!\nBe careful, you have 3 guesses. To start the game, enter your first guess: ")

    while(guessesCount in 1..3) {
        val reader = Scanner(System.`in`)
        val guessedNumber:Int = reader.nextInt()
        if(guessedNumber != null) {
            if(guessedNumber == randomNumber){
                println("Congratulations! You guess is correct.")
                break
            } else if(guessedNumber < randomNumber) {
                guessesCount-=1
                println("Your guess is too low. Try again.\nRemaining Guess: $guessesCount")
            } else {
                guessesCount-=1
                println("Your guess is too high. Try again.\nRemaining Guess: $guessesCount")
            }
        }
    }
    if(guessesCount == 0) {
        println("Game over!\nYou cannot guess the correct number. The number is \"$randomNumber\".\nTry again.")
    }
}