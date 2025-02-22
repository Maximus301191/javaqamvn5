package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void shouldSetRadioStation() {
        Radio radio = new Radio(0, 9);

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ShouldSetMinMax() {
        Radio radio = new Radio(0, 29);

        Assertions.assertEquals(0, radio.getminRadioStation());
        Assertions.assertEquals(29, radio.getmaxRadioStation());
    }

    @Test

    public void SetStationLessMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void SetStationAfterMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void nextStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);
        radio.nextRadioStation();

        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void nextStationUpBorder() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void prevStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);
        radio.prevRadioStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void prevStationDownBorder() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void increaseVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.VolumeUp();

        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setVolumeAfterMax() {

        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setVolumeLessMin() {

        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

        @Test

    public void increaseVolumeMoreMax() {

        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.VolumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void decreaseVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.VolumeDown();

        int expected = 49;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void decreaseVolumeLessMin() {

        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.VolumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
