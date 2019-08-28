# WordSearch
Words can be found along any diagonal, forwards, upwards, downwards or backwards and must not ‘wrap’ between edges.

# Tasks
1. Generate a board of random letters.
2. Identify all valid words (contained in the attached word list) in the board.
3. Display results to the user.

# Run the Code 
```
mvn package exec:java -Dexec.args="15 words.txt"
```
Parameter 0 : N which Generates a N X N matrix

Parameter 1 : Name of the Text File to Generator the Dictionary

# Implementation
1. Dictionary is implemented as a Trie Structure (WordDictionary.java)
2. Traverse each Element (as a starting point), then move along all 8-Directions. (WordSearch.java)

# Unit Tests

Test Name | Description
------------ | -------------
testBoardSquare | Test to check the board is a Square Matrix
testGenerateBoard | Test to check that every element in the matrix is populated
testReadTxtFile | Test to check when the File does not Exist
testGetTrieNotInitialized | Test to check when the Trie is not Initialized
testGetTrieWhenInitialized | TTest to check when the Trie is Initialized
testWordSearch |Test to check in a predefined 4X4 Matrix the searching Function works

# Results
15 X 15 Board 

<img width="1224" alt="Screen Shot 2019-08-28 at 11 45 14 AM" src="https://user-images.githubusercontent.com/38237395/63871408-d69fa500-c989-11e9-9cb5-a8ec5c21dade.png">

Tests

<img width="806" alt="Screen Shot 2019-08-28 at 11 45 01 AM" src="https://user-images.githubusercontent.com/38237395/63871447-e5865780-c989-11e9-842f-b452b63f7b72.png">

