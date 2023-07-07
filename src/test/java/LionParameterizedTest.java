import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


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
                {"Самка", false},
                {"НЕСамка", false},
                {null, false}
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex,feline);
        boolean actual = lion.doesHaveMane();
        System.out.println(actual);
        System.out.println(hasMane);
      //  Assert.assertEquals(hasMane, actual);
        assertEquals(hasMane, actual);
    }
}