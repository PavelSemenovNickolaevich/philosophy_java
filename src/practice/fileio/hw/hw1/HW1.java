package practice.fileio.hw.hw1;


//1. Задан файл со стихотворением Александра Пушкина. Определить частоту повторяемости всех букв в стихотворении, игнорируя регистр.
//        Вывести результат в файл в виде:
//        а - 15
//        б - 7
//        ....
//        я - 11


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;

public class HW1 {

    public static void main(String[] args) throws IOException {

        Path poemPath = Path.of("resources", "poem.txt");
        Map<Character, Integer> characterFrequency = CharacterHelper.calcFrequency(poemPath);


        Path resultPath = Path.of("resources", "task1-result.txt");
        Files.write(resultPath, CharacterHelper.toListRepresentation(characterFrequency), CREATE, TRUNCATE_EXISTING);
    }
}
