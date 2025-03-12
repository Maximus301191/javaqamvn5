package ru.netology.javaqa;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    @Getter
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentRadioStation = minRadioStation;
    private int totalRadioStation = 10;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    @Generated
    public int getMaxRadioStation() {
        return this.maxRadioStation;
    }

    @Generated
    public int getCurrentRadioStation() {
        return this.currentRadioStation;
    }

    @Generated
    public int getTotalRadioStation() {
        return this.totalRadioStation;
    }

    @Generated
    public int getMinVolume() {
        return this.minVolume;
    }

    @Generated
    public int getMaxVolume() {
        return this.maxVolume;
    }

    @Generated
    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }
    public void nextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadioStation;
        }
    }
    public void prevRadioStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void VolumeUp () {
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


