import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
        myString.setString("THIS");
        boolean check = myString.detectCapitalUse();
        assertEquals(true, check);
    }
    // test for all capital letters, expected output is true
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("this");
        boolean check = myString.detectCapitalUse();
        assertEquals(false, check);
    }
    // test for all lowercase letters, expected output is false
    @Test
    public void detectCapitalUseTest3() {
        myString.setString("This");
        boolean check = myString.detectCapitalUse();
        assertEquals(true, check);
    }
    @Test
    public void detectCapitalUseTest4() {
        myString.setString("ThIs");
        boolean check = myString.detectCapitalUse();
        assertEquals(false, check);
    }
    // test for proper capitalization, expected output is true

}
