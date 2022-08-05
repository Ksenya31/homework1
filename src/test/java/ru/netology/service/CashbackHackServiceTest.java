package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldReturnNull() {
        int actual = service.remain(9990);
        int expected = 10;
        Assert.assertEquals(expected,actual);
    }
}