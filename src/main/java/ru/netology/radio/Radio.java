package ru.netology.radio;

public class Radio {


    private int minStat = 0;
    private int maxStat = 9;
    private int currentStat = minStat;
    private int minVol = 0;
    private int maxVol = 10;
    private int currentVol = minVol;

    public Radio(int sizeStat) {
        maxStat = minStat + sizeStat;
    }

    public Radio(int minStat, int maxStat) {
        this.minStat = minStat;
        this.maxStat = maxStat;
        this.currentStat = minStat;
    }



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

    public void setCurrentStat(int newCurrentStat) {
        if (newCurrentStat < 0) {
            return;
        }
        if (newCurrentStat > 9) {
            return;
        }
        currentStat = newCurrentStat;
    }

    public void nextStationSelect() {
        currentStat++;
        if (currentStat > 9) {
            currentStat = 0;
        }
    }

    public void prevStationSelect() {
        currentStat--;
        if (currentStat < 0) {
            currentStat = 9;
        }
    }

     /*  косячный метод
    public void prevStationSelect() {
        if (currentStat > 0) {
            currentStat = currentStat - 1;
        }
        if (currentStat == 0) {
            currentStat = 9;
        }
    }
      */


    //--------------------------------------Volume methods--------------------------------------//

    public void setCurrentVol(int newCurrentVol) {
        if (newCurrentVol < 0) {
            return;
        }
        if (newCurrentVol > 10) {
            return;
        }
        currentVol = newCurrentVol;
    }

    public int increaseVolume() {
        if (currentVol < 10) {
            currentVol = currentVol + 1;
        }
        return currentVol;
    }

    public int decreaseVolume() {
        if (currentVol > 0) {
            currentVol = currentVol - 1;
        }
        return currentVol;
    }
}


