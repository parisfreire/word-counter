package adaptavist

import adaptavist.utils.Utils
import spock.lang.Specification

class FileReaderTest extends Specification {
    FileReader fileReader
    Utils utils

    def setup() {
        fileReader = new FileReader()
        utils = new Utils()
    }

    def "readLocalFile should read content from a file correctly"() {
        given:
        def location = "src/test/resources/mocked_file.txt"

        when:
        def result = fileReader.readLocalFile(location)

        then:
        result == ['this', 'is', 'is', 'a', 'test', 'file', 'file']
    }

    def "readUrlPath should read content from a URL correctly"() {
        given:
        def location = "https://www.example.com"

        when:
        def result = fileReader.readUrlFile(location)

        then:
        result.size() > 0
    }
}
