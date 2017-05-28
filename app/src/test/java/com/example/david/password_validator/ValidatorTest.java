package com.example.david.password_validator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by David on 2017-05-28.
 */

public class ValidatorTest{

    @Test
    public void testValidator(){
        String password = "woAh$123123123";
        String result = Validator.valid(password);
        assertEquals(result, "Password is valid");
    }
}
