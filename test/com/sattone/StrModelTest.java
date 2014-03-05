package com.sattone;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class StrModelTest {

    @Test
    public void testGetStr() {
        StrModel sm = new StrModel("Hello");
        assertTrue(sm.getStr().equals("Hello"));
    }

    @Test
    public void testSetStr() {
        StrModel sm = new StrModel("");
        sm.setStr("Hello");
        assertTrue(sm.getStr().equals("Hello"));
        assertTrue(sm.getRevstr().equals("olleH"));
    }

    @Test
    public void testReverse() {
        StrModel sm = new StrModel("");
        char [] arr = {'H', 'e', 'l', 'l','o'};
        char [] exp = {'o', 'l', 'l', 'e', 'H'};
        sm.reverse(arr);
        Arrays.equals(exp, arr);
    }
    
    @Test
    public void testReverse2() {
        StrModel sm = new StrModel("");
        String str = "Hello";
        String exp = "olleH";                
        String res = sm.reverse(str);
        assertTrue(exp.equals(res));
    }   
}
