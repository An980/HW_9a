package ru.netology.radio;

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

    public Radio() { //праметры радио по умолчанию
    }

/*
public Radio(int minStat, int maxStat) {
        this.minStat = minStat;
        this.maxStat = maxStat;
        this.currentStat = minStat;
  }
*/


    public int getCurrentStat() {
        return currentStat;
    }

    public int getMinStat() {
        return minStat;
    }

    public int getMaxStat() {
        return maxStat;
    }

    public int getCurrentVol() {
        return currentVol;
    }

    public int getMinVol() {
        return minVol;
    }

    public int getMaxVol() {
        return maxVol;
    }


    //--------------------------------------Station methods--------------------------------------//

/*
  public void setCurrentStat(int newCurrentStat) {
        if (newCurrentStat < minStat) {
            return;
        }
        if (newCurrentStat > maxStat) {
            return;
        }
        currentStat = newCurrentStat;
    }
*/

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


