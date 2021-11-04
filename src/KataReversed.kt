class KataReversed {
    object Reverse{
        fun reverseWords(str:String): String{
            val delimiter = (" ")
            var split = str.split(delimiter)
            var reversed = split.reversed()
            var reversedSentence = reversed.joinToString(delimiter)
            return reversedSentence
        }
    }
}