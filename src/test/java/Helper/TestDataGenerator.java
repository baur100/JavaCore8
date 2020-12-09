package Helper;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class TestDataGenerator {
    public  static String randomString(int lenght){
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(lenght, useLetters, useNumbers);

    }
}
