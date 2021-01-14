package homework24;

import com.github.javafaker.Faker;
import modelsNK.CategoryNK;
import modelsNK.PetNK;
import modelsNK.StatusNK;
import modelsNK.TagNK;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class TestDataGeneratorNK {
    public static String randomString(int length){
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }
    public static PetNK getPet(){
        Random random = new Random();
        Faker faker = new Faker();

        CategoryNK category = new CategoryNK(random.nextInt(20),faker.dog().breed());
        TagNK[] tags = {new TagNK(random.nextInt(10),faker.cat().breed())};
        String[] photoUrls = new String[1];
        photoUrls[0]=faker.internet().url();
        return new PetNK(category,faker.funnyName().name(),photoUrls,tags, StatusNK.sold);
    }
}
