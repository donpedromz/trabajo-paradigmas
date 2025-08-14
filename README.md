# Primer trabajo PARADIGMAS DE LENGUAJES
## Juan Pablo Olave Muñoz
### Ejercicios propuestos TO DO
Exercise 1 – “Store Inventory + Sales” Java – Free Style
You are developing a small inventory and sales tracking system for a store.
Given a list of products, each with:
name (String)
category (String)
price (double)
stock (int)
unitsSold (int)
You must:
1. Print all products in the "Electronics" category with stock > 0, sorted
alphabetically by name.
2. Increase the price of all products in "Home" category by 10%, but only if their
stock is below 5 units.
3. Calculate the total revenue for each category ( revenue = price * unitsSold ).
4. Print the category with the highest total revenue.
5. Return a list of product names sorted by price (descending), then by stock
(ascending) if prices are equal.
Exercise 2 - “Book Management App” (No Database) Node.js
You are tasked with building a simple console-based application in Node.js that
manages a personal book collection. The application should allow the user to add,
view, search, and remove books, keeping the data persistent between runs by
storing it locally in a JSON file. The program must operate entirely using Node.js
built-in modules — no external packages are allowed.
Requirements:
Create a Node.js application that:
Allows managing a list of books. Each book should have at least:
Title
Author
Year of publication
Genre
Supports the following operations through a menu displayed in the console:
1. Add a new book.
2. List all books.
3. Search books by title.
4. Remove a book by title.
Stores the book data in a local file in JSON format so that the information is
preserved when the application is closed and reopened.
Reads and writes the JSON file using only Node.js built-in modules (no
external libraries).
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