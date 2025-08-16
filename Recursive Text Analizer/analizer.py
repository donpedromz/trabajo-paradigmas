import os
from pathlib import PurePath
def examine_dir(path:str):
    try:
        with os.scandir(path) as d:
            for f in d:
                if f.is_dir():
                    examine_dir(f.path)
                else:
                    if PurePath(f.path).match('*.txt', case_sensitive=False):
                        with open(f.path, "r") as fp:
                            lines = fp.readlines()
                            wordsCount = 0
                            charCount = 0
                            for line in lines:
                                words = line.split()
                                wordsCount += len(words)
                                for word in words:
                                    charCount += len(word)
                            print(f'{f.name}\t {len(lines)}\t {wordsCount}\t{charCount}')
    except PermissionError:
        print("Acceso denegado")
    except OSError:
        print("Directorio no encontrado")

path = input("Enter a folder path: ")
print("File Name \t Lines \t Words \t Characters")
print("-----------------------------------------------")
examine_dir(path)

