Exercise 3 – Recursive Text File Analyzer (Python)
Create a program that analyzes a set of text files in a folder and provides a
summary of basic statistics.
Requirements:
1. The program should accept a folder path as input.
2. Recursively scan the folder and all its subfolders to find files ending in .txt .
3. For each .txt file, compute:
Number of lines
Number of words
Number of characters
4. Display a summary table in the console showing for each file:
5. Include a total row with the combined statistics of all files.
6. Organize the program using functions or methods to separate folder traversal,
file reading, counting statistics, and printing results.
7. The program must handle empty folders or missing files gracefully.
8. Use only the built-in modules/libraries.
```
py analizer.py
```
## Docs used
- https://www.geeksforgeeks.org/python/python-os-scandir-method/
- https://docs.python.org/3/library/pathlib.html#pattern-language
- https://docs.python.org/3/library/pathlib.html#pathlib.PurePath.full_match
