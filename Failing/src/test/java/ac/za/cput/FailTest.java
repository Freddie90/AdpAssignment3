package ac.za.cput;

import static org.junit.Assert.fail;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FailTest {

    Fail fail;

    @Before
    public void setUp() throws Exception {

        fail = new Fail();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void method() {

        if(fail == null){
            fail("it is NULL");
        }

        try {
            fail.method(-1);
            fail("Throws an IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // handle exception
        }


    }
    }
