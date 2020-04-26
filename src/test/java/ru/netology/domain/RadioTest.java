package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.nextStation();

        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void nextStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.nextStation();

        assertEquals(0, radio.getMinStation());


    }

    @Test
    void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.prevStation();

        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    void prevStationAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();

        assertEquals(9, radio.getMaxStation());
    }

    @Test
    void increaseVolumeUnderMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.increaseVolume();

        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void increaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.increaseVolume();

        assertEquals(11, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.decreaseVolume();

        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolumeAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();

        assertEquals(-1, radio.getCurrentVolume());
    }
}
