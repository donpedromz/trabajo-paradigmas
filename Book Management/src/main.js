import { Book } from "./domain/book.js";
import { writeFileSync } from "node:fs";
import { readFile } from "node:fs/promises";
import readline from "node:readline/promises";
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

const addBook = async () => {
    const bookTitle = await rl.question("Enter the Book title: ");
    const bookGenre = await rl.question("Enter the Book Genre: ");
    const author = await rl.question("Enter the book Author: ");
    const publicationYear = await rl.question("Enter the publication year: ");
    return new Book(bookTitle, author, publicationYear, bookGenre);
};
const listBooks = (books) => {
    if (books.length == 0) {
        console.log("Empty List");
    }
    books.forEach((book) => {
        console.log(book);
    });
};
const searchBookByTitle = (title, books) => {
    const search = books.filter((book) => {
        if (book.title.toLowerCase() === title.toLowerCase()) {
            return book;
        }
    });
    if (search.length == 0) {
        console.log("No books found");
        return;
    }
    search.forEach((book) => {
        console.log(book);
    });
};
const removeBookByTitle = (title, books) => {
    const initialLength = books.length;
    const result = books.filter(
        (book) => book.title.toLowerCase() !== title.toLowerCase()
    );
    const newLength = result.length;
    console.log(`${initialLength - newLength} Rows Affected`);
    return result;
};
const createFile = (path, data) => {
    writeFileSync(path, JSON.stringify(data), (err) => {
        if (err) {
            console.error(`Error creating file in path: ${path}`);
        }
        console.log("File written succesfully");
    });
};
const readBooks = async (path) => {
    try {
        const data = await readFile(path, "utf-8");
        return JSON.parse(data);
    } catch (err) {
        console.error(err);
        createFile(path, []);
        return [];
    }
};
const path = "data.json";
const main = async () => {
    let exec = true;
    while (exec) {
        let books = await readBooks(path);
        console.log("----------------------------------");
        console.log("Book Management System");
        console.log(`Current number of Books: ${books.length}`);
        console.log("--------------Menu----------------");
        console.log("1. Add a new Book");
        console.log("2. List all Books");
        console.log("3. Search book by title");
        console.log("4. Remove Book By title");
        console.log("5. Exit");
        console.log("----------------------------------");
        const option = await rl.question("Enter an option: ");
        switch (Number(option)) {
            case 1:
                console.log("Option selceted: Add a new Book");
                const book = await addBook();
                books.push(book);
                createFile(path, books);
                break;
            case 2:
                listBooks(books);
                break;
            case 3:
                const title = await rl.question("Enter a title: ");
                searchBookByTitle(title, books);
                break;
            case 4:
                const titleToRemove = await rl.question("Enter a title to remove: ");
                books = removeBookByTitle(titleToRemove, books);
                createFile(path, books);
                break;
            case 5:
                exec = false;
                console.log("Thank you :D !!!!");
                rl.close();
                break;
            default:
                console.error("Incorrect option");
        }
    }
};
main();
