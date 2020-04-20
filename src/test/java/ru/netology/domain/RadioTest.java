package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @org.junit.jupiter.api.Test
    void nextStation() {
        Radio radio = new Radio("name",10,0,4,9,0,4);
        radio.nextStation();

        assertEquals (5,radio.getCurrentStation());
    }

    @Test
    void nextStationAboveMax() {
        Radio radio = new Radio("name",10,0,4,9,0,9);
        radio.nextStation();

        assertEquals (0,radio.getMinStation());

    }

    @Test
    void prevStation () {
        Radio radio =  new Radio("name",10,0,4,9,0,4);
        radio.prevStation();

        assertEquals (3, radio.getCurrentStation());
    }

    @Test
    void setStation () {
        Radio radio = new Radio("name",10,0,4,9,0,4);
        radio.setCurrentStation();

        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void setStationAboveMax () {
        Radio radio = new Radio("name",10,0,4,9,0,10);
        radio.setCurrentStation();

        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    void setStationAboveMin () {
        Radio radio = new Radio("name",10,0,4,9,0,-1);
        radio.setCurrentStation();

        assertEquals(-1, radio.getCurrentStation());

    }

    @Test
    void prevStationAboveMin () {
        Radio radio =  new Radio("name",10,0,4,9,0,0);
        radio.prevStation();

        assertEquals (9, radio.getMaxStation());
    }

    @Test
    void increaseVolumeUnderMax () {
        Radio radio =  new Radio("name",100,0,4,9,0,4);
        radio.increaseVolume();

        assertEquals (5, radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeAboveMax () {
        Radio radio = new Radio("name",100,0,110,9,0,0);
        radio.increaseVolume();

        assertEquals (110, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeUnderMin () {
        Radio radio = new Radio ("name",100,0,4,9,0,0);
        radio.decreaseVolume();

        assertEquals (3, radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeAboveMin () {
        Radio radio = new Radio("name",10,0,-1,9,0,0);
        radio.decreaseVolume();

        assertEquals(-1, radio.getCurrentVolume());
    }
    }
