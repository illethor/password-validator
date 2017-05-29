package com.example.david.myapplication;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by David on 2017-05-29.
 */

public class ValidTest {
    @Test
    public void testValidator(){
        String password = "!Petrucci123";
        boolean result = MainActivity.valid(password);
        assertTrue(result);
    }
}
