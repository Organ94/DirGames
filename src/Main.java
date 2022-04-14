import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static final String DIR = "D://Games";
    private static final StringBuilder SB = new StringBuilder();
    private static final String EXECEPT = "Что-то пошло не так ':-('";

    public static void main(String[] args) {

        List<String> dirPath = Arrays.asList(DIR + "/src", DIR + "/res", DIR + "/savegames", DIR + "/temp",
                DIR + "/src/main", DIR + "/src/Test",
                DIR + "/res/drawables", DIR + "/res/vectors", DIR + "/res/icons");

        List<String> filePath = Arrays.asList(DIR + "/src/main/Main.Java", DIR + "/src/main/Utils.java");

        for (String dir : dirPath) {
            File dirs = new File(dir);
            writeToTheDirAndFile(dirs, dirs.mkdir());
        }

        for (String file : filePath) {
            try {
                File files = new File(file);
                writeToTheDirAndFile(files, files.createNewFile());
            } catch (IOException e) {
                System.out.println(EXECEPT);
            }
        }

        writeToTheSB(new File(DIR + "/temp/temp.txt"));
    }

    private static void writeToTheDirAndFile(File file, boolean result) {
        SB.append(file.isDirectory() ? "Каталог " : "Файл ")
                .append(file.getName())
                .append(result ? " создан" : " не создан")
                .append((!result && file.exists()) ? ", потому что уже существует!" : "")
                .append((!result && file.exists()) ? ", потому что не верно указан путь!" : "")
                .append("\n");
    }

    private static void writeToTheSB(File file) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(SB.toString());
        } catch (IOException e) {
            System.out.println(EXECEPT);
        }
    }
}
