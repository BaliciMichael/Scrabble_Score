class ScrabbleScore {

    fun scoreWord(word: String): Int{
        //TODO calculate using the scoreLetter method below, the scrabble value of the word passed as a parameter
        return word.sumOf { scoreLetter(it.uppercaseChar()) }// i used the uppercaseChar() so that any input no matter what will always be valid

    }

    //TODO the program if the user enters in any chars other than capital letters...try fix this.
    //Reference: https://exercism.org/tracks/kotlin/exercises/scrabble-score/solutions?page=1
    private fun scoreLetter(char: Char): Int {
        return when (char) {
            'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' ->  1
            'D', 'G' ->  2
            'B', 'C', 'M', 'P' ->  3
            'F', 'H', 'V', 'W', 'Y' ->  4
            'K' ->  5
            'J', 'X' ->  8
            'Q', 'Z' ->  10
            else -> error("Unknown character")
        }

    }

    fun letterValues() = println("""Letter                                   Value
           A, E, I, O, U, L, N, R, S, T       1
           D, G                               2
           B, C, M, P                         3
           F, H, V, W, Y                      4
           K                                  5
           J, X                               8
           Q, Z                               10""")
}