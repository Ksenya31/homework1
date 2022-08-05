package ru.netology.service;

import org.testng.Assert;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.BeforeMethod
    public void shouldReturnNull() {
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturn() {
        int actual = service.remain(800);
        int expected = 200;
        Assert.assertEquals(actual, expected);

    }
}