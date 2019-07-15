package com.tws.refactoring.extract_method;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
        //given
        Order order = new Order(4.0);
        Order order1 = new Order(5.0);
        //List<Order> orders = Arrays.asList(new <{order,order1});
        List<Order> orders = new ArrayList<>();
        orders.add(order);
        orders.add(order1);
        OwingPrinter owingPrinter = new OwingPrinter();
        //when
        owingPrinter.printOwing("Tomi",orders);
        //then
        String test ="*****************************\n" +
                "****** Customer totals ******\n" +
                "*****************************\n" +
                "name: Tomi\n" +
                "amount: 9.0";
        assertEquals(test,outContent.toString());
    }
}