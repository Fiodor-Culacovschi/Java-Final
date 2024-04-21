package com.finalProject;


import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testMain() {
        Main main = new Main();
        assertEquals("My first maven project...", main.getOutput());
    }
}
