package ru.netology.domain;

public class Radio {
    private String name;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }


    public void nextStation() {
        if ((currentStation + 1) >= maxStation) {
            currentStation = minStation;
        }
        currentStation++;
    }

    public void prevStation() {
        if ((currentStation - 1) <= minStation) {
            currentStation = maxStation;
        }
        currentStation--;
    }

    public void increaseVolume() {
        if ((currentVolume + 1) > maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void decreaseVolume() {
        if ((currentVolume - 1) < minVolume) {
            return;
        }
        currentVolume--;
    }

}
