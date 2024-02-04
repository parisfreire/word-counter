package adaptavist

import adaptavist.utils.Utils

class FileReader {
    def readLocalFile(String location) {
        try {
            // Read the content from a local file
            def content = new File(location).text.toLowerCase()

            return Utils.findOccurrences(content)

        } catch (FileNotFoundException e) {
            println("File '${location}' not found.")
            throw e
        }
    }
    def readUrlFile (String location) {

        try {
            // Open a connection to the URL and read the content directly
            def content = new URL(location).text

            return Utils.findOccurrences(content)

        } catch (Exception e) {
            println "An error occurred: ${e.message}"
            throw e
        }
    }
}
