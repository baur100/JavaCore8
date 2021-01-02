package helper;

import com.github.javafaker.Faker;
import models.Category;
import models.Pet;
import models.Status;
import models.Tag;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class TestDataGenerator {
    public static String randomString(int length){
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }
    public static Pet getPet(){
        Random random = new Random();
        Faker faker = new Faker();

        Category category = new Category(random.nextInt(20),faker.dog().breed());
        Tag[] tags = {new Tag(random.nextInt(10),faker.cat().breed())};
        String[] photoUrls = new String[1];
        photoUrls[0]=faker.internet().url();
        return new Pet(category,faker.funnyName().name(),photoUrls,tags, Status.sold);
    }
}
