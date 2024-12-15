# Anki Helper

Anki Helper is a utility written in Kotlin that helps automate the creation of flashcards for Anki. The program accepts a path to a text file with English sentences and a path to a CSV file to save the results. It uses a third-party translation service to generate a bilingual CSV file.

## Features

- Reads a text file containing English sentences separated by the `*` character.
- Utilizes a third-party API for translating text into Ukrainian.
- Displays numbered translation pairs in a formatted manner for user review.
- Allows users to modify translations by specifying a number before saving.
- Generates a CSV file in the format:
  ```
  Ukrainian Sentence | English Sentence
  ```
- Simplifies the integration of results into the Anki app for quick flashcard creation.

## System Requirements

- **JDK**: 8 or above
- Internet connection for using the third-party translation service

## Usage

### Input File

The input file format is a plain text file where English sentences are separated by the `*` character. For example:
```
Hello, how are you?*I am fine, thank you!*What about you?
```

### Command-Line Execution

Run the program from the command line by providing two arguments:
1. Path to the input file.
2. Path to the output CSV file.

Example:
```bash
java -jar anki-helper.jar /path/to/input.txt /path/to/output.csv
```

### Translation Review and Editing

After fetching translations, the program displays numbered pairs of sentences for user review in the format:
```
1. Привіт, як справи? | Hello, how are you?
2. Я в порядку, дякую! | I am fine, thank you!
3. А ти? | What about you?
```
Users can:
- Enter a number to modify the translation of a specific pair.
- Confirm to save the translations to the output file.

### Output File

The program generates a CSV file where each row is in the following format:
```
Ukrainian Sentence|English Sentence
Привіт, як справи?|Hello, how are you?
Я в порядку, дякую|,I am fine, thank you!
А ти?|What about you?
```

## Configuration

### Translation API

The program uses a third-party translation service (now DE). To configure:
1. Register on the API platform and obtain an access key.
2. Add the key to the `config.properties` file or run application and add enter your key when prompted.
   ```properties
   deepl.api.key=YOUR_API_KEY
   ```

---

> *Note: Additional setup may require initial testing of the translation API.*

