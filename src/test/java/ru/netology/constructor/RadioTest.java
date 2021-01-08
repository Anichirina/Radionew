package ru.netology.constructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    Radio radio = new Radio(
            100,0,10,0,20,20
    );
    assertEquals(20,radio.getCurrentVolume());
}


