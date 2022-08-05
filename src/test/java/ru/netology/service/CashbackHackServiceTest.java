package ru.netology.service;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldReturnNull() {
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturn() {
        int actual = service.remain(1999);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }
}