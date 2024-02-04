package adaptavist

import spock.lang.Specification

class WordCounterTest extends Specification {
    WordCounter wordCounter

    def setup() {
        wordCounter = new WordCounter()
    }

    def "wordCounter should count words correctly"() {
        given:
        def words = ['apple', 'banana', 'apple', 'orange', 'banana']

        when:
        def result = wordCounter.count(words)

        then:
        result.size() == 3
        result.find { it.key == 'apple' }.value == 2
    }
}
