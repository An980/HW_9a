package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int minStat = 0;
    private int maxStat = 9;
    private int currentStat = minStat;
    private int minVol = 0;
    private int maxVol = 100;
    private int currentVol = minVol;

    public Radio(int sizeStat) { //заказные параметры радио
        maxStat = minStat + sizeStat - 1;
    }

/* lombok generated
    public int getMinStat() {
        return minStat;
    }

    public int getMaxStat() {
        return maxStat;
    }

    public int getCurrentStat() {
        return currentStat;
    }

    public int getMinVol() {
        return minVol;
    }

    public int getMaxVol() {
        return maxVol;
    }

    public int getCurrentVol() {
        return currentVol;
    }

 */

//--------------------------------------Station methods--------------------------------------//


    public void setCurrentStat(int newCurrentStat) {
        if (newCurrentStat < minStat) {
            newCurrentStat = maxStat;
        }
        if (newCurrentStat > maxStat) {
            return;
        }
        this.currentStat = newCurrentStat;
    }

    public void nextStationSelect() {
        currentStat++;
        if (currentStat > maxStat) {
            currentStat = minStat;
        }
    }

    public void prevStationSelect() {
        currentStat--;
        if (currentStat < minStat) {
            currentStat = maxStat;
        }
    }

    //--------------------------------------Volume methods--------------------------------------//

    public void setCurrentVol(int newCurrentVol) {
        if (newCurrentVol < minVol) {
            return;
        }
        if (newCurrentVol > maxVol) {
            newCurrentVol = maxVol;
        }
        currentVol = newCurrentVol;
    }

    public int increaseVolume() {
        if (currentVol < maxVol) {
            currentVol = currentVol + 1;
        }
        return currentVol;
    }

    public int decreaseVolume() {
        if (currentVol > minVol) {
            currentVol = currentVol - 1;
        }
        return currentVol;
    }
}


