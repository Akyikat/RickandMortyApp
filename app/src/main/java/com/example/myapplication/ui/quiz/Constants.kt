package com.example.myapplication.ui.quiz

import com.example.myapplication.R
import java.util.function.IntPredicate

data class Tests(
    var id: Int,
    var title: String,
    var image: String
)

object Constants {
    fun getTests(): MutableList<Tests> {
        return mutableListOf<Tests>().apply {
            add(Tests(1, "Season 1", "https://www.indiewire.com/wp-content/uploads/2020/05/Rick-Morty-Rick-Five-Arms.png?w=670&h=377&crop=1"))
            add(Tests(2, "Season 2", "https://thumbor.forbes.com/thumbor/fit-in/1200x0/filters%3Aformat%28jpg%29/https%3A%2F%2Fspecials-images.forbesimg.com%2Fimageserve%2F5eb2f693e249d2000639cdc0%2F0x0.jpg"))
            add(Tests(3, "Season 3", "https://smartcdn.prod.postmedia.digital/nationalpost/wp-content/uploads/2015/10/rick-and-morty-1_2924_.jpg"))
            add(Tests(4, "Season 4", "https://image-cdn.hypb.st/https%3A%2F%2Fhypebeast.com%2Fimage%2F2017%2F11%2Frick-morty-father-son-relationship-0.jpg?w=960&cbr=1&q=90&fit=max"))
        }
    }

    fun getQuestionsByTest(id: Int): MutableList<Question> {
        return  mutableListOf<Question>().apply {
            add(
                Question(
                    1,
                    "What is the number of Rick’s universe?",
                    R.drawable.ic_rick_137,
                    "C-137",
                    "J-147",
                    "B-147",
                    "C-126",
                    1
                )
            )
            add(
                Question(
                    1,
                    "How many seasons of the show were released?",
                    R.drawable.ic_seasons_released,
                    "1",
                    "6",
                    "5",
                    "4",
                    4
                )
            )
            add(
                Question(
                    1,
                    "In which episode Bird person was introduced?",
                    R.drawable.ic_birdperson,
                    "Second episode of 3rd season",
                    "First episode of 1st season",
                    "In the final episode of season 1",
                    "Not yet",
                    2
                )
            )

            add(
                Question(
                    1,
                    "What was the name of the Smith family’s pet dog?",
                    R.drawable.ic_snuffles,
                    "Snow",
                    "White",
                    "Max",
                    "Snuffles",
                    4
                )
            )

            add(
                Question(
                    1,
                    "How Rick travelled between universes?",
                    R.drawable.ic_travel,
                    "By using time machine",
                    "Portal gun",
                    "Spaceship",
                    "Intergalactic crystals",
                    2
                )
            )

            add(
                Question(
                    1,
                    "How old is Morty?",
                    R.drawable.ic_morty_q,
                    "13",
                    "12",
                    "14",
                    "15",
                    4
                )
            )

            add(
                Question(
                    1,
                    "Who saved Morty and Annie in the episode ‘Anatomy Park’?",
                    R.drawable.ic_annie_morty,
                    "Rick",
                    "Sanchez",
                    "Glootie",
                    "Giant Monster",
                    4
                )
            )

            add(
                Question(
                    1,
                    "Who was Rick’s ex-lover in the third episode of the second season?",
                    R.drawable.ic_unity,
                    "Samantha",
                    "Brittany",
                    "Unity",
                    "Dr Wang",
                    3
                )
            )
            add(
                Question(
                    2,
                    "Who was Rick’s ex-lover in the third episode of the second season?",
                    R.drawable.ic_unity,
                    "Samantha",
                    "Brittany",
                    "Unity",
                    "Dr Wang",
                    3
                )
            )
            //
            add(
                Question(
                    3,
                    "3What is the number of Rick’s universe?",
                    R.drawable.ic_rick_137,
                    "C-137",
                    "J-147",
                    "B-147",
                    "C-126",
                    1
                )
            )
            add(
                Question(
                    3,
                    "3How many seasons of the show were released?",
                    R.drawable.ic_seasons_released,
                    "1",
                    "6",
                    "5",
                    "4",
                    4
                )
            )
            add(
                Question(
                    3,
                    "3In which episode Bird person was introduced?",
                    R.drawable.ic_birdperson,
                    "Second episode of 3rd season",
                    "First episode of 1st season",
                    "In the final episode of season 1",
                    "Not yet",
                    2
                )
            )

            add(
                Question(
                    3,
                    "3What was the name of the Smith family’s pet dog?",
                    R.drawable.ic_snuffles,
                    "Snow",
                    "White",
                    "Max",
                    "Snuffles",
                    4
                )
            )

            add(
                Question(
                    3,
                    "3How Rick travelled between universes?",
                    R.drawable.ic_travel,
                    "By using time machine",
                    "Portal gun",
                    "Spaceship",
                    "Intergalactic crystals",
                    2
                )
            )

            add(
                Question(
                    3,
                    "3How old is Morty?",
                    R.drawable.ic_morty_q,
                    "13",
                    "12",
                    "14",
                    "15",
                    4
                )
            )

            add(
                Question(
                    3,
                    "2Who saved Morty and Annie in the episode ‘Anatomy Park’?",
                    R.drawable.ic_annie_morty,
                    "Rick",
                    "Sanchez",
                    "Glootie",
                    "Giant Monster",
                    4
                )
            )

            add(
                Question(
                    3,
                    "2Who was Rick’s ex-lover in the third episode of the second season?",
                    R.drawable.ic_unity,
                    "Samantha",
                    "Brittany",
                    "Unity",
                    "Dr Wang",
                    3
                )
            )
            //
            add(
                Question(
                    3,
                    "What is the number of Rick’s universe?",
                    R.drawable.ic_rick_137,
                    "C-137",
                    "J-147",
                    "B-147",
                    "C-126",
                    1
                )
            )
            add(
                Question(
                    3,
                    "How many seasons of the show were released?",
                    R.drawable.ic_seasons_released,
                    "1",
                    "6",
                    "5",
                    "4",
                    4
                )
            )
            add(
                Question(
                    3,
                    "In which episode Bird person was introduced?",
                    R.drawable.ic_birdperson,
                    "Second episode of 3rd season",
                    "First episode of 1st season",
                    "In the final episode of season 1",
                    "Not yet",
                    2
                )
            )

            add(
                Question(
                    3,
                    "2What was the name of the Smith family’s pet dog?",
                    R.drawable.ic_snuffles,
                    "Snow",
                    "White",
                    "Max",
                    "Snuffles",
                    4
                )
            )

            add(
                Question(
                    3,
                    "2How Rick travelled between universes?",
                    R.drawable.ic_travel,
                    "By using time machine",
                    "Portal gun",
                    "Spaceship",
                    "Intergalactic crystals",
                    2
                )
            )

            add(
                Question(
                    3,
                    "2How old is Morty?",
                    R.drawable.ic_morty_q,
                    "13",
                    "12",
                    "14",
                    "15",
                    4
                )
            )

            add(
                Question(
                    3,
                    "2Who saved Morty and Annie in the episode ‘Anatomy Park’?",
                    R.drawable.ic_annie_morty,
                    "Rick",
                    "Sanchez",
                    "Glootie",
                    "Giant Monster",
                    4
                )
            )

            add(
                Question(
                    4,
                    "2Who was Rick’s ex-lover in the third episode of the second season?",
                    R.drawable.ic_unity,
                    "Samantha",
                    "Brittany",
                    "Unity",
                    "Dr Wang",
                    3
                )
            )

        }.filter { it.id == id} as MutableList<Question>
    }
}