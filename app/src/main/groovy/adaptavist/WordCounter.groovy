package adaptavist

class WordCounter {
    def count(List words){
        // Group based on their own values creating lists of elements with the same value.
        def wordCounts = words.groupBy { it }.collectEntries { k, v -> [(k): v.size()] }
        // Sort words by frequency in descending order
        def sortedWordCounts = wordCounts.entrySet().toList().sort { it.value }.reverse()

        return sortedWordCounts
    }
}
