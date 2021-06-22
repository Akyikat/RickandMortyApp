package com.example.myapplication.ui.quiz

import com.example.myapplication.R

object Constants{
    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()
        questionList.apply {
            add(Question(
                1,
                "What is the number of Rick’s universe?",
                R.drawable.ic_rick_137,
                "C-137",
                "J-147",
                "B-147",
                "C-126",
                1
            ))
            add(Question(
                1,
                "How many seasons of the show were released?",
                R.drawable.ic_seasons_released,
                "1",
                "6",
                "5",
                "4",
                4
            ))
            add(Question(
                1,
                "In which episode Bird person was introduced?",
                R.drawable.ic_birdperson,
                "Second episode of 3rd season",
                "First episode of 1st season",
                "In the final episode of season 1",
                "Not yet",
                2
            ))

            add(Question(
                1,
                "What was the name of the Smith family’s pet dog?",
                R.drawable.ic_snuffles,
                "Snow",
                "White",
                "Max",
                "Snuffles",
                4
            ))

            add(Question(
                1,
                "How Rick travelled between universes?",
                R.drawable.ic_travel,
                "By using time machine",
                "Portal gun",
                "Spaceship",
                "Intergalactic crystals",
                2
            ))

            add(Question(
                1,
                "How old is Morty?",
                R.drawable.ic_morty_q,
                "13",
                "12",
                "14",
                "15",
                4
            ))

            add(Question(
                1,
                "Who saved Morty and Annie in the episode ‘Anatomy Park’?",
                R.drawable.ic_annie_morty,
                "Rick",
                "Sanchez",
                "Glootie",
                "Giant Monster",
                4
            ))

            add(Question(
                1,
                "Who was Rick’s ex-lover in the third episode of the second season?",
                R.drawable.ic_unity,
                "Samantha",
                "Brittany",
                "Unity",
                "Dr Wang",
                3
            ))

        }
            return questionList
    }
}