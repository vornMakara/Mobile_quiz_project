package com.example.mobile_project

class QuestionAnswer {

    fun question(): Array<String> {
        var question = arrayOf (
            "Which company owns the android?",
            "Which one is not the programming language?",
            "Where you are watching this video?",
            "Which company owns the Apple?"
        )
       return question;
    }

    fun choices(): Array<Array<String>> {
        var choices = arrayOf(
            arrayOf("Google", "Apple", "Nokia", "Samsung"),
            arrayOf("Java", "Kotlin", "Notepad", "Python"),
            arrayOf("Facebook", "Whatsapp", "Instagram", "Youtube"),
            arrayOf("Google", "Apple", "Nokia", "Samsung")
        )
        return choices;
    }

    fun correctAnswers(): Array<String> {
        var correctAnswers = arrayOf (
            "Google",
            "Notepad",
            "Youtube",
            "Apple"
        )
        return correctAnswers;
    }
}