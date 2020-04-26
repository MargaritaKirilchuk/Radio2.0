package ru.netology.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Radio {
    private String name;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int maxStation = 10;
    private int minStation = 0;
    private int currentStation;

    public void setCurrentStation(int inputStation) {
        if (inputStation > maxStation) {
            return;
        }
        if (inputStation < minStation) {
            return;
        }
        currentStation = inputStation;
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
