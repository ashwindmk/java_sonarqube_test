package com.ashwin.sonarqube;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServiceTest {
    private Service service;

    @BeforeEach
    public void setUp() {
        service = new Service();
    }

    @Test
    public void addTest() {
        int res = service.add(3, 4);
        Assertions.assertEquals(7, res);
    }

    @Test
    public void calculateSubTest() {
        int res = service.calculate("sub", 5, 2);
        Assertions.assertEquals(3, res);
    }

    @Test
    public void calculateDivTest() {
        int res = service.calculate("div", 15, 3);
        Assertions.assertEquals(0, res);
    }

//    @Test
//    public void calculateNullTest() {
//        int res = service.calculate(null, 15, 3);
//        Assertions.assertEquals(-1, res);
//    }

    @Test
    public void calculateEmptyTest() {
        int res = service.calculate("", 15, 3);
        Assertions.assertEquals(-1, res);
    }

    @Test
    public void positiveTest() {
        service.foo(2);
    }

    @Test
    public void negativeTest() {
        service.foo(-2);
    }

    @AfterEach
    public void tearDown() {
        service = null;
    }
}
