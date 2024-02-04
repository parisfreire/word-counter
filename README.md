# word-counter
Groovy command-line application that takes a path to a file as an argument and prints a word count of its contents.

## Features

- **Word Count:** Analyze the provided file and display a word count with the frequency of each word.
- **Sorting:** The word count output is sorted by the number of occurrences in descending order.


## Requirements

- [Java 11](https://www.oracle.com/java/technologies/javase-downloads.html) or later installed

## Usage

1. Clone the repository:

    ```bash
    git clone https://github.com/parisfreire/word-counter.git
    cd word-counter
    ```

2. Build the application:

    ```bash
    ./gradlew build
    ```

3. Run the application:
    ```bash
    ./gradlew run --args="<path-to-your-file>"
    ```

   Replace `<path-to-your-file>` with the path to the file you want to analyze. 

    If you prefer, you can run it using the already existing files in this repository:

    - Local file:

        ```bash
        ./gradlew run --args="src/main/resources/file.txt"
        ```

    - URL file:

        ```bash
        ./gradlew run --args='https://raw.githubusercontent.com/parisfreire/word-counter/main/app/src/main/resources/file.txt'
        ```

4. Run the tests (optional):

   ```bash
   ./gradlew test
   ```

   This command will execute all the tests in the project and provide feedback on the test results.

   After running the tests, you can find the test reports in the `app/build/reports/tests/test` directory. Open the HTML report (`index.html`) in your browser to view detailed information about the test results.

   ```bash
   open app/build/reports/tests/test/index.html
   ```

   Replace `open` with the appropriate command based on your operating system (e.g., `start` on Windows).


## Example

Suppose you have a file named `sample.txt` with the following content:

```
This is a sample file. This file contains some sample text.
```

## Output
```
this: 2
sample: 2
file: 2
is: 1
a:1
contains: 1
some: 1
text: 1
...
```

