import org.junit.Assert.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TestEnum {

    @Test
    public void testEnum(){

            Color myColor = Color.RED;
            System.out.printf("%s%s%n",myColor, myColor.rgbValue());

    }

    @Test
    public void testPetEnumReturnTrue(){
        Person mario = new Person();
        mario.setName("Mário");
        mario.setAge(30);
        mario.setPet(Pet.DOG);

        Person expectedPerson = new Person();
        expectedPerson.setName("Mário");
        expectedPerson.setAge(30);
        expectedPerson.setPet(Pet.DOG);

        assertEquals(expectedPerson.getPet(),mario.getPet());
        System.out.println(mario.getPet());

    }

    @Test
    public void testPetEnumReturnFalse(){
        Person mario = new Person();
        mario.setName("Mário");
        mario.setAge(30);
        mario.setPet(Pet.DOG);

        Person expectedPerson = new Person();
        expectedPerson.setName("Mário");
        expectedPerson.setAge(30);
        expectedPerson.setPet(Pet.CAT);

        assertEquals(expectedPerson.getPet(),mario.getPet());
        System.out.println(mario.getPet());

    }

}
