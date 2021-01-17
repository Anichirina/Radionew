package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    void shouldUseChannelRadio() {
        Radio radio = new Radio(
                100,
                0,
                10,
                0,
                20,
                20
        );

        assertEquals(0, radio.switchChannel());
        assertEquals(20,radio.switchVolume());
        assertEquals(10, radio.getMaxChannel());
        assertEquals(100, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(0, radio.getMinChannel());

    }

    @Test
    void shouldUseNotArgRadio() {
        Radio radio = new Radio();
        {
            assertEquals(10, radio.getMaxChannel());
        }

    }

    @Test
    void shouldNextChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);

        radio.nextChannel();
        assertEquals(10, radio.nextChannel());
    }
    @Test
    void shouldPrevChannelAndVolume() {

        Radio radio = new Radio(
                100,
                0,
                10,
                0,
                20,
                9
        );
        radio.prewChannel();
        radio.prewVolume();

        assertEquals(8, radio.prewChannel());
        assertEquals(19, radio.prewVolume());

    }
    @Test
    void shouldNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        radio.nextVolume();
        assertEquals(8, radio.nextVolume());
    }
    @Test
            void shouldPrewVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.prewVolume();
        assertEquals(6, radio.prewVolume());

    }
    @Test
    void shouldBoarderUpChannelAndVolume() {

        Radio radio = new Radio(
                100,
                0,
                10,
                0,
                120,
                19
        );
        radio.switchChannel();
        radio.switchVolume();

        assertEquals(0, radio.switchChannel());
        assertEquals(100, radio.switchVolume());

    }
    @Test
    void shouldBoarderDownChannelAndVolume() {

        Radio radio = new Radio(
                100,
                0,
                10,
                0,
                -10,
                -10
        );
        radio.switchChannel();
        radio.switchVolume();

        assertEquals(10, radio.switchChannel());
        assertEquals(0, radio.switchVolume());

    }
}

