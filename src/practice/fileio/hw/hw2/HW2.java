package practice.fileio.hw.hw2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;

//2. Создать программно и заполнить файл случайными целыми числами.
//        После чего отсортировать содержимое файла по возрастанию (т.е. перезаписать файл с новым порядком чисел)

public class HW2 {

    public static void main(String[] args) throws IOException {
        Path resultPath = Path.of("resources", "task2-result.txt");
        Files.write(resultPath, RandomUtil.generateDigits(100), CREATE, TRUNCATE_EXISTING);
        Files.write(resultPath, DigitHelper.readSorted(resultPath), TRUNCATE_EXISTING);
    }
}
