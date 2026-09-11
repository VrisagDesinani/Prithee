# Prithee Design

## Main

The Main class starts the program.

Main creates a Prithee object and calls its play method.

## Prithee

The Prithee class contains the game's data and logic.

The sonnet is stored as a String and divided into individual words.

During each round, the program randomly selects one word from the sonnet.
The program prints every word before the selected word and then prints
underscores in place of the selected word.

The user enters a guess using the console.

The program compares the user's answer with the missing word and keeps
track of correct and incorrect answers.

The program ends when the user reaches either three correct answers or
three incorrect answers.

## Testing

JUnit tests check that:

- Correct answers are accepted.
- Incorrect answers are rejected.
- Capitalization does not affect answers.
- Punctuation does not affect answers.
- Punctuation can be removed from words correctly.