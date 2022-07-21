import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {
    //   Radio radio = new Radio();


    @Test
    public void radioMin() {
        Radio radio = new Radio(0,2);

        Assertions.assertEquals(0, radio.getMinStat());
        Assertions.assertEquals(2, radio.getMaxStat());
        Assertions.assertEquals(0, radio.getCurrentStat());
    }


    //--------------------------------------Station tests--------------------------------------//
/*
    @Test//установка станции
    public void currentStationSet() {
        Radio radio = new Radio();

        radio.setCurrentStat(5);

        int expected = 5;
        int actual = radio.getCurrentStat();

        Assertions.assertEquals(expected, actual);
    }

    @Test//установка станции ниже лимита
    public void currentStationSetMin() {
        Radio radio = new Radio();

        radio.setCurrentStat(-1);

        int expected = 0;
        int actual = radio.getCurrentStat();

        Assertions.assertEquals(expected, actual);
    }

    @Test//установка станции выше лимита
    public void currentStationSetMax() {
        Radio radio = new Radio();

        radio.setCurrentStat(10);

        int expected = 0;
        int actual = radio.getCurrentStat();

        Assertions.assertEquals(expected, actual);
    }

    @Test//переключение станции вперед
    public void nextStationSelect() {
        Radio radio = new Radio();

        radio.setCurrentStat(5);
        radio.nextStationSelect();

        int expected = 6;
        int actual = radio.getCurrentStat();

        Assertions.assertEquals(expected, actual);
    }

    @Test//переключение на след. станцию (выше лимита)
    public void nextStationSelectMax() {
        Radio radio = new Radio();

        radio.setCurrentStat(9);
        radio.nextStationSelect();

        int expected = 0;
        int actual = radio.getCurrentStat();

        Assertions.assertEquals(expected, actual);
    }

    @Test///переключение на след. станцию (граничное)
    public void nextStationSelectBoundary() {
        Radio radio = new Radio();

        radio.setCurrentStat(8);
        radio.nextStationSelect();

        int expected = 9;
        int actual = radio.getCurrentStat();

        Assertions.assertEquals(expected, actual);
    }

    @Test///переключение на пред. станцию
    public void prevStationSelect() {
        Radio radio = new Radio();

        radio.setCurrentStat(5);
        radio.prevStationSelect();

        int expected = 4;
        int actual = radio.getCurrentStat();

        Assertions.assertEquals(expected, actual);
    }

    @Test//переключение на пред. станцию (ниже лимита)
    public void prevStationSelectMin() {
        Radio radio = new Radio();

        radio.setCurrentStat(-1);
        radio.prevStationSelect();

        int expected = 9;
        int actual = radio.getCurrentStat();

        Assertions.assertEquals(expected, actual);
    }

    @Test//переключение на пред. станцию (граничное)
    public void prevStationSelectBoundary() {
        Radio radio = new Radio();

        radio.setCurrentStat(1);
        radio.prevStationSelect();

        int expected = 0;
        int actual = radio.getCurrentStat();

        Assertions.assertEquals(expected, actual);
    }

    //--------------------------------------Volume tests--------------------------------------//

    @Test//установка громкости
    public void currentVolumeSet() {
        Radio radio = new Radio();

        radio.setCurrentVol(1);

        int expected = 1;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test//установка максимальной громкости
    public void maxVolumeSet() {
        Radio radio = new Radio();

        radio.setCurrentVol(10);

        int expected = 10;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test//установка громкости выше лимита
    public void limitVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVol(11);

        int expected = 0;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test//увеличение громкости
    public void increaseVol() {
        Radio radio = new Radio();

        radio.setCurrentVol(5);
        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test//увеличение громкости выше максимума
    public void increaseVolAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVol(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test//установка минимальной громкости
    public void minVolumeSet() {
        Radio radio = new Radio();

        radio.setCurrentVol(0);

        int expected = 0;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test//установка громкости ниже лимита
    public void limitVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVol(-1);

        int expected = 0;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test//умуньшение громкости
    public void decreaseVol() {
        Radio radio = new Radio();

        radio.setCurrentVol(5);
        radio.decreaseVolume();

        int expected = 4;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test//умуньшение громкости (ниже лимита)
    public void decreaseVolBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVol(-1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

 */
}
