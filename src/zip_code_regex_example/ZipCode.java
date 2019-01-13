package zip_code_regex_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class ZipCode {
    private static final String CORRECT_ZIP_CODE = "Given zip code is correct";
    private static final String INCORRECT_ZIP_CODE = "Given zip code is incorrect";
    private static final String PATTERN = "\\d{2}-\\d{3}";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String textToCheck = bufferedReader.readLine();

        String message = Pattern.matches(PATTERN, textToCheck) ? CORRECT_ZIP_CODE : INCORRECT_ZIP_CODE;
        System.out.println(message);
    }
}
