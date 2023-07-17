import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class LionParameterizedNegativeTest {

    Feline feline;
    private String sex;


    public LionParameterizedNegativeTest(String sex) {
        this.sex = sex;

    }

    @Parameterized.Parameters()
    public static Object[][] parameters() {
        return new Object[][]{
                {"НЕСамка"},
                {""},
                {null}
        };
    }


    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
    }
}
