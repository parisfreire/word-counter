package adaptavist.utils

class Utils {
    static def findOccurrences(String content) {
        // RegEx matching a word boundary between start / end of string.
        return content.findAll(/\b\w+\b/)
    }
}
