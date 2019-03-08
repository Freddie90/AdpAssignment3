package ac.za.cput;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IdentityTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    Identity stuff = new Identity();

    @Test
    public void compareTest()
    {
        String object1 = "Bar One";
        assertEquals("Objects are identical",stuff.getProdName(),object1);

    }

}