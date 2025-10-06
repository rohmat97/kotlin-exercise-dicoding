# exercise-kotlin

A minimal Kotlin (JVM) project using Gradle Kotlin DSL.

## Requirements

- JDK 17+
- IntelliJ IDEA (Community or Ultimate)

## Open in IntelliJ

1. File > Open...
2. Select this folder: `/Users/rohmat.dasuki/Documents/exercise/kotlin`
3. When prompted, import as a Gradle project (use Kotlin DSL).
4. Let IntelliJ download dependencies and index the project.

## Run

### From IntelliJ IDEA (Recommended)

- Open any exercise file and click Run on the `main()` function.
  - `src/main/kotlin/Main.kt` (main application)
  - `src/main/kotlin/Latihan1-TipeData/Exercise1.kt`
  - `src/main/kotlin/Latihan2-ControlFlow/Exercise2.kt`
  - `src/main/kotlin/Latihan3-Collections/Exercise3.kt`
  - `src/main/kotlin/Latihan4-OOP/Exercise4.kt`
  - `src/main/kotlin/Latihan5-Coroutines/Exercise5.kt`

### From Terminal

This project uses Gradle Wrapper, so you can run exercises directly from the terminal:

1. **Run the main application:**

   ```bash
   ./gradlew run
   ```

2. **Run individual exercises:**
   To run each exercise file individually, you can use the custom Gradle tasks that have been added to the project:

   ```bash
   # Run Latihan 1 - Tipe Data
   ./gradlew runLatihan1

   # Run Latihan 2 - Control Flow
   ./gradlew runLatihan2

   # Run Latihan 3 - Collections
   ./gradlew runLatihan3

   # Run Latihan 4 - OOP
   ./gradlew runLatihan4

   # Run Latihan 5 - Coroutines
   ./gradlew runLatihan5
   ```

   Alternatively, you can:

   - Open the specific exercise file in IntelliJ IDEA and click the Run button, OR
   - Compile and run them using the Kotlin compiler (if installed):

     ```bash
     # For Latihan 1
     kotlinc src/main/kotlin/Latihan1-TipeData/Exercise1.kt -include-runtime -d latihan1.jar
     java -jar latihan1.jar

     # For Latihan 2
     kotlinc src/main/kotlin/Latihan2-ControlFlow/Exercise2.kt -include-runtime -d latihan2.jar
     java -jar latihan2.jar

     # For Latihan 3
     kotlinc src/main/kotlin/Latihan3-Collections/Exercise3.kt -include-runtime -d latihan3.jar
     java -jar latihan3.jar

     # For Latihan 4
     kotlinc src/main/kotlin/Latihan4-OOP/Exercise4.kt -include-runtime -d latihan4.jar
     java -jar latihan4.jar

     # For Latihan 5
     kotlinc src/main/kotlin/Latihan5-Coroutines/Exercise5.kt -include-runtime -d latihan5.jar
     java -jar latihan5.jar
     ```

## Tests

- From IntelliJ: right-click the `test` directory > Run Tests.
- From terminal (after wrapper is added):
  ```bash
  ./gradlew test
  ```

## Generate Gradle Wrapper (recommended)

If you have Gradle installed locally, run:

```bash
gradle wrapper --gradle-version 8.7
```

This will create `gradlew`, `gradlew.bat`, and `gradle/wrapper/*` so builds are reproducible.

If you don't have Gradle, you can still open the project in IntelliJ and let it use a downloaded Gradle distribution, then run the `wrapper` task from the Gradle tool window.

## Project structure

```
exercise-kotlin/
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
├── src/
│   ├── main/
│   │   └── kotlin/
│   │       ├── Main.kt
│   │       ├── Latihan1-TipeData/
│   │       │   └── Exercise1.kt (Tipe Data examples)
│   │       ├── Latihan2-ControlFlow/
│   │       │   └── Exercise2.kt (Control Flow examples)
│   │       ├── Latihan3-Collections/
│   │       │   └── Exercise3.kt (Collections examples)
│   │       ├── Latihan4-OOP/
│   │       │   └── Exercise4.kt (OOP examples)
│   │       └── Latihan5-Coroutines/
│   │           └── Exercise5.kt (Coroutines examples)
│   └── test/
│       └── kotlin/
│           └── MainTest.kt
└── .gitignore
```

# kotlin-exercise-dicoding
