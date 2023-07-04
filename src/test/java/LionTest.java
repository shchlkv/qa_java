import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {
    String sex;
    Feline feline;
    public static Object[] parameters() {
        return new Object[]{
                "Самец",
                "Самка",
                "Не самец",
                null
        };
    }

   // @Mock


    @Test
    public void getSexTest() throws Exception {
        Lion lion = new Lion(sex, feline);


       // assertEquals(expected, actual);

    }

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion(sex, feline);

    }



//     car.setCarBrand("Lamborghini"); // вызвали метод объекта с аргументом
//        Mockito.verify(car).setCarBrand("Lamborghini");

}


