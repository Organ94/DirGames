import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static final String DIR = "D://Games";
    private static final StringBuilder SB = new StringBuilder();

    public static void main(String[] args) {

        List<String> dirPath = Arrays.asList(DIR + "/src", DIR + "/res", DIR + "/savegames", DIR + "/temp",
                DIR + "/src/main", DIR + "/src/Test",
                DIR + "/res/drawables", DIR + "/res/vectors", DIR + "/res/icons");

        List<String> filePath = Arrays.asList(DIR + "/src/main/Main.Java", DIR + "/src/main/Utils.java");
    }
}
