package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldNegativeRemain() {
        CashbackHackService cashback = new CashbackHackService();
        int actual = cashback.remain(-800);
        assertEquals(0, actual);
    }

    @Test
    public void shouldremain() {
        CashbackHackService cashback = new CashbackHackService();
        int actual = cashback.remain(800);
        assertEquals(200, actual);
    }

    @Test
    public void remain() {
        CashbackHackService cashback = new CashbackHackService();
        int actual = cashback.remain(1000);
        assertEquals(0, actual);
    }
}