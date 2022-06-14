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
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("this");
        boolean check = myString.detectCapitalUse();
        assertEquals(false, check);
    }
    @Test
    public void detectCapitalUseTest3() {
        myString.setString("This");
        boolean check = myString.detectCapitalUse();
        assertEquals(true, check);
    }

}
