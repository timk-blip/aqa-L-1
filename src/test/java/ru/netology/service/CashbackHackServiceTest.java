package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        final int boundary = 1000;
        int amountSumm = 860;
        CashbackHackService cashback = new CashbackHackService();
        int expected = cashback.remain(amountSumm) % boundary;
        assertEquals(140, expected);
    }
}