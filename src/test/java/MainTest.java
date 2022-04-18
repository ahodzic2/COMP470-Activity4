import COMP470.Activity4.Main;
import org.junit.jupiter.api.*;

public class MainTest {

    @BeforeEach
    public void setUp() {
        System.out.println("Running tests...");
    }

    @Test
    public void reverseStringTest() {
        String str="Apple";
        String expectedStr="elppA";
        String nstr=Main.reverseString(str);

        Assertions.assertEquals(expectedStr, nstr);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Running tear down...");
    }
}
