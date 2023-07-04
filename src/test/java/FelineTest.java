import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest {

    @Mock
    Feline feline;

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
       // feline.getFamily();
       // Mockito.verify(objCat).getFamily();
        // feline.getFamily();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

}
