package ru.netology.javaqa;

public class Radio {
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentRadioStation = minRadioStation;
    private int currentVolume;

    public Radio(int minRadioStation, int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
        this.minRadioStation = minRadioStation;
        this.currentRadioStation = minRadioStation;
    }

    public int getminRadioStation() {
        return minRadioStation;
    }

    public int getmaxRadioStation() {
        return maxRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
        }

        if (newCurrentRadioStation < 0) {
            return;
        }

        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }

        if (newCurrentVolume < 0) {
            return;
        }

        currentVolume = newCurrentVolume;
    }

    public void VolumeUp() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void VolumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

}
