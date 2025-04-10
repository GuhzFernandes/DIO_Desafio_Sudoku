# 🧩 Sudoku - CLI Edition (Java)

Welcome to the **Sudoku CLI Game**, a console-based Sudoku puzzle experience built entirely in Java.  
This project is based on a challenge originally proposed by [DIO (Digital Innovation One)](https://github.com/digitalinnovationone/exercicios-java-basico/blob/main/projetos/2%20-%20Programação%20Orientada%20a%20Objetos%20e%20Estruturas%20de%20Dados%20com%20Java.md), and expanded with new features to provide a more interactive and complete gameplay experience.

## 🚀 Features

- Full command-line interface (CLI) gameplay
- Puzzle loading from a local database (`db.json`)
- Save/load game progress with `save.json` in the execution directory
- Clean console-based Sudoku board rendering
- Input-friendly commands (e.g. `B2 5`, `C7`)
- Automatic validation of puzzle completion
- Reset functionality to restart the puzzle anytime

## 📁 Puzzle Dataset
This project includes a small sample of puzzles sourced from the amazing dataset by Rohan Rao on Kaggle.

📦 Dataset on Kaggle:
https://www.kaggle.com/datasets/rohanrao/sudoku

📜 All rights to the original dataset belong to its creator. Many thanks for making it publicly available!

🔄 Data Conversion Tool
To convert the dataset to a Java-friendly JSON format, this script was used:

📂 [SudokuDB_PythonConverter](https://github.com/GuhzFernandes/SudokuDB_PythonConverter)
Developed specifically to facilitate the transition from .csv puzzles to JSON for usage in this project.

## ✍️ Credits

📊 Puzzle Dataset: @rohanrao

💡 Original Challenge: Digital Innovation One

## 📦 Download

Grab the latest release from the link below:

🔗 **[Download .JAR (v1.0)](https://github.com/GuhzFernandes/Sudoku/releases/tag/v1.0)**

> Requires Java 17 or higher installed.

To run:
```bash
java -jar Sudoku.jar
```
---

### ❤️ Thanks for playing!
If you liked the project, feel free to ⭐ star it, open issues or contribute!
Let's keep spreading clean code and fun puzzles 😄🧩