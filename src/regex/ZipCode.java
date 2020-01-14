package regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class ZipCode {
    private static final String CORRECT_ZIP_CODE_MESSAGE = "Given zip code is correct";
    private static final String INCORRECT_ZIP_CODE_MESSAGE = "Given zip code is incorrect";
    private static final String ZIP_CODE_PATTERN = "\\d{2}-\\d{3}";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String textToCheck = bufferedReader.readLine();

        String message = Pattern.matches(ZIP_CODE_PATTERN, textToCheck) ? CORRECT_ZIP_CODE_MESSAGE : INCORRECT_ZIP_CODE_MESSAGE;
        System.out.println(message);
    }
}
