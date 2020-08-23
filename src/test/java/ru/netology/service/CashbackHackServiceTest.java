package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldNegativeRemain() {
        CashbackHackService cashback = new CashbackHackService();
        int actual = cashback.remain(-800);
        assertEquals(actual, 0);
    }

    @org.testng.annotations.Test
    public void shouldremain() {
        CashbackHackService cashback = new CashbackHackService();
        int actual = cashback.remain(800);
        assertEquals(actual, 200);
    }

    @org.testng.annotations.Test
    public void remain() {
        CashbackHackService cashback = new CashbackHackService();
        int actual = cashback.remain(1000);
        assertEquals(actual, 0);
    }
}