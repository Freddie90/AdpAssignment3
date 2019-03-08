package ac.za.cput;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertSame;
import static org.junit.Assert.*;

public class EqualityTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void CompareObject()
    {
        Equality stuff1 = new Equality();
        Equality stuff2 = stuff1.getEquals();
        assertSame("these are the same",stuff2,stuff1);
    }
}