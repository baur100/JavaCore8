package helper_1;

import com.github.javafaker.Faker;
import models_1.Category_1;
import models_1.Pet_1;
import models_1.Status_1;
import models_1.Tag_1;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class TestDataGenerator_1 {
    public static String randomString(int length){
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }
    public static Pet_1 getPet(){
        Random random = new Random();
        Faker faker = new Faker();

        Category_1 category_1 = new Category_1(random.nextInt(20),faker.dog().breed());
        Tag_1[] tags_1 = {new Tag_1(random.nextInt(10),faker.cat().breed())};
        String[] photoUrls = new String[1];
        photoUrls[0]=faker.internet().url();
        return new Pet_1(category_1,faker.funnyName().name(),photoUrls,tags_1, Status_1.sold);
    }
}

