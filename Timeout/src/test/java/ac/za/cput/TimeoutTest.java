package ac.za.cput;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TimeoutTest {

    String text = "Cheese";
    Timeout theText = new Timeout(text);


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(timeout = 1000)
    public void testPrintTextMessage()
    {
        System.out.println("in the textMessage()");
        theText.printMessage();
    }

    @Test
    public void testTextMessage() {
        System.out.println("in the textMessage()");
        text = "Say" + "Cheese";
        assertEquals(text,theText.textMessage());
    }
}