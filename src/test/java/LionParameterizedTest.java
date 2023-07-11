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
    private boolean hasMane;

    public LionParameterizedTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters()
    public static Object[][] parameters() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }


    @Test
    public void doesHaveManeTest() {
        try {
            Lion lion = new Lion(sex, feline);
            boolean actual = lion.doesHaveMane();
            assertEquals(hasMane, actual);
        } catch (Exception thrown) {
            thrown.printStackTrace();
        }
    }

}