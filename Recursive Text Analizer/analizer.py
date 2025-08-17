import os
from pathlib import PurePath
def examine_dir(path:str, totalLines, totalWords, totalChars):
    try:
        with os.scandir(path) as d:
            for f in d:
                if f.is_dir():
                    l,w,c = examine_dir(f.path, 0, 0, 0)
                    totalLines += l
                    totalWords += w
                    totalChars += c
                else:
                    if PurePath(f.path).match('*.txt', case_sensitive=False):
                        with open(f.path, "r") as fp:
                            lines = fp.readlines()
                            linesCount = len(lines)
                            wordsCount = 0
                            charCount = 0
                            for line in lines:
                                words = line.split()
                                wordsCount += len(words)
                                for word in words:
                                    charCount += len(word)
                            print(f'{f.name}\t {linesCount}\t {wordsCount}\t{charCount}')
                            totalLines += linesCount
                            totalWords += wordsCount
                            totalChars += charCount     
    except PermissionError:
        print("Acceso denegado")
        pass
    except FileNotFoundError:
        print("Directorio no encontrado")
        pass
    except OSError as e:
        print(f"Error fatal, no se pudo leer el directorio: {e.filename}")
        pass
    except Exception:
        print("Error durante la lectura del archivo")
        pass
    return (totalLines, totalWords, totalChars)


def leerArchivo():
    path = input("Enter a folder path: ")
    print("File Name \t Lines \t Words \t Characters")
    print("-----------------------------------------------")
    totalLines, totalWords, totalChar = examine_dir(path,0,0,0)
    print("-----------------------------------------------")
    print(f"Total \t{totalLines} \t{totalWords} \t{totalChar}")
while True:
    try:
        print("------------Menu--------------")
        print("1. Read Dir")
        print("2. Exit")
        opc = int(input("Enter an option: "))
        match opc:
            case 1:
                print("Option selected: Text Analizer")
                print("---------------------------------")
                leerArchivo()
            case 2: 
                print("Thank you!!! :D")
                break
            case _:
                print("Incorrect option")
    except ValueError:
        print("Incorrect input")
        continue