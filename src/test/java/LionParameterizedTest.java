import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


@RunWith(Parameterized.class)
public class LionParameterizedTest {

    Feline feline;
    private String sex;


    public LionParameterizedTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters()
    public static Object[][] parameters() {
        return new Object[][]{
                {"Самец"},
                {"Самка"}
        };
    }


    @Test
    public void doesHaveManeTest() throws Exception {
            Lion lion = new Lion(sex, feline);
    }
}