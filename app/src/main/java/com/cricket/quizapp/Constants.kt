package com.cricket.quizapp

import com.cricket.quizapp.R
import com.cricket.quizapp.Question

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "The distance between the popping crease and the bowling crease is?",
            R.drawable.popping,
            "4 feet", "14 feet",
            "41 feet", "3.4 feet", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "How many minutes before play should the umpires take the field?",
            R.drawable.umpire,
            "Four", "Five",
            "comes 2 hours before", "No need for Umpire", 2
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "What Indian cricketer is called Zak or Zippy Zakky?",
            R.drawable.zaheer,
            "Zaheer Khan", "Rishav Pant",
            "Bumrah", "Irfan Pathan", 1
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Define a wide ball in Limited overs matches?",
            R.drawable.wide,
            "A ball moving two feet wide either side of the wicket is called a Wide Ball", "There is no wide ball in limited over Matches",
            "A ball moving one feet wide either side of the wicket is called a Wide Ball", "A ball moving 41.37 feet wide either side of the wicket is called a Wide Ball", 1
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Sunny Days is an autobiography of ___?",
            R.drawable.sunil,
            "Virat Kohli", "Kapil Dev",
            "Sunil Gavaskar", "Abdul Kalam", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What does LBW stand for?",
            R.drawable.lbw,
            "Leg Before Wicket", "Long Ball Wide",
            "Leg Beyond Width", "Lol bout to win", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Who Captained India to victory in the World Cup in 1983?",
            R.drawable.wcup,
            "KL Rahul", "Robin Uthappa",
            "Sunil Gavaskar", "Kapil Dev", 4
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "How long do test cricket matches usually go on for?",
            R.drawable.test1,
            "2 minutes", "6 hours",
            "3 to 5 days", "Over a week", 3
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "How do you win at cricket?",
            R.drawable.win,
            "By scoring Most Goals", "By scoring the most run and loosing the least wickets",
            "By Cheating", "By losing all your wickets", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What do you call a referee in cricket?",
            R.drawable.umpire,
            "An Umpire", "A vampire",
            "A cricketfree", "A cricket freak", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}