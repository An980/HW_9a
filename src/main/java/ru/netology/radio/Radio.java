package ru.netology.radio;

public class Radio {

    private int currentVol;
    private int currentStat;

    public int getCurrentVol() {
        return currentVol;
    }

    public int getCurrentStat() {
        return currentStat;
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


