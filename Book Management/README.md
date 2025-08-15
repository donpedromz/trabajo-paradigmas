## Exercise 2 - “Book Management App” (No Database) Node.js
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
### Running the program
```
npm run start
```
## Docs used
- https://www.geeksforgeeks.org/node-js/node-js-fs-readfile-method/
- https://www.geeksforgeeks.org/node-js/node-js-fs-writefile-method/
- https://nodejs.org/en/learn
- https://nodejs.org/en/learn/command-line/accept-input-from-the-command-line-in-nodejs