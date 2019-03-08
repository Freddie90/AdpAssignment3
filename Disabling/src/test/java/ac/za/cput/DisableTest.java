package ac.za.cput;


import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class DisableTest {

    String name = "Doritos";
    Disable the = new Disable(name);



    @Ignore
    @Test
    public void testView() {
        name = "Doritos";
        assertEquals(name,the.viewProdName());
    }



    @Test
    public void testDisable() {

        name = "Price of " + "Doritos";
        assertEquals(name,the.displayProdName());
    }
}