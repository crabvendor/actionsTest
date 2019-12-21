package com.leste;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActionTest {

    private Action action;

    @BeforeEach
    void init() {
        action = new Action();
    }

    @Test
    void add2adds2() {
        assertEquals(4, action.add2(2));
    }
}