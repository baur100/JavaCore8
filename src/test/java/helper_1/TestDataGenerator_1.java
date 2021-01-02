package helper_1;

import org.apache.commons.lang3.RandomStringUtils;

public class TestDataGenerator_1 {
    public static String randomString(int length){
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }
}
