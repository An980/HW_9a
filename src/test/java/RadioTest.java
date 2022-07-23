import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {

    //--------------------------------------Station tests--------------------------------------//

    @Test//заказные параметры радио
    public void radioCustomSizeStat() {
        Radio radio = new Radio(15);

        Assertions.assertEquals(0, radio.getMinStat());
        Assertions.assertEquals(14, radio.getMaxStat());
        Assertions.assertEquals(0, radio.getCurrentStat());
    }

    @Test//праметры радио по умолчанию
    public void radioDefaultSizeStat() {
        Radio radio = new Radio();

        Assertions.assertEquals(0, radio.getMinStat());
        Assertions.assertEquals(9, radio.getMaxStat());
        Assertions.assertEquals(0, radio.getCurrentStat());
    }

    @Test//установка текущей станции
    public void radioSetCurrentStation() {
        Radio radio = new Radio(30);
        radio.setCurrentStat(15);

        Assertions.assertEquals(15, radio.getCurrentStat());
    }

    @Test//установка текущей станции ниже лимита
    public void radioSetCurrentStationBelowMin() {
        Radio radio = new Radio(30);
        radio.setCurrentStat(-1);

        Assertions.assertEquals(29, radio.getCurrentStat());
    }

    @Test//установка текущей станции выше лимита
    public void radioSetCurrentStationAboveMax() {
        Radio radio = new Radio(30);
        radio.setCurrentStat(31);

        Assertions.assertEquals(0, radio.getCurrentStat());
    }

    @Test//переключение станции вперед
    public void radioNextStationSelect() {
        Radio radio = new Radio(30);
        radio.setCurrentStat(15);
        radio.nextStationSelect();

        Assertions.assertEquals(16, radio.getCurrentStat());
    }

    @Test//переключение станции (граничное значение)
    public void radioNextStationSelectAboveMaxBoundary() {
        Radio radio = new Radio(30);
        radio.setCurrentStat(28);
        radio.nextStationSelect();

        Assertions.assertEquals(29, radio.getCurrentStat());
    }

    @Test//переключение станции вперед выше лимита
    public void radioNextStationSelectAboveMax() {
        Radio radio = new Radio(30);
        radio.setCurrentStat(29);
        radio.nextStationSelect();

        Assertions.assertEquals(0, radio.getCurrentStat());
    }

    @Test//переключение станции назад
    public void radioPrevStationSelect() {
        Radio radio = new Radio(30);
        radio.setCurrentStat(15);
        radio.prevStationSelect();

        Assertions.assertEquals(14, radio.getCurrentStat());
    }

    @Test//переключение станции (граничное значение)
    public void radioPrevStationSelectBelowMinBoundary() {
        Radio radio = new Radio(30);
        radio.setCurrentStat(1);
        radio.prevStationSelect();

        Assertions.assertEquals(0, radio.getCurrentStat());
    }

    @Test//переключение станции назад ниже лимита
    public void radioPrevStationSelectBelowMin() {
        Radio radio = new Radio(30);
        radio.setCurrentStat(0);
        radio.prevStationSelect();

        Assertions.assertEquals(29, radio.getCurrentStat());
    }

    //--------------------------------------Volume tests--------------------------------------//

    @Test//установка громкости
    public void currentVolumeSet() {
        Radio radio = new Radio();

        radio.setCurrentVol(50);

        int expected = 50;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test//установка максимальной громкости
    public void maxVolumeSet() {
        Radio radio = new Radio();

        radio.setCurrentVol(100);

        int expected = 100;
        int actual = radio.getMaxVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test//установка громкости выше лимита
    public void limitVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVol(101);

        int expected = 100;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test//увеличение громкости
    public void increaseVol() {
        Radio radio = new Radio();

        radio.setCurrentVol(50);
        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test//увеличение громкости выше максимума
    public void increaseVolAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVol(101);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test//установка минимальной громкости
    public void minVolumeSet() {
        Radio radio = new Radio();

        radio.setCurrentVol(0);

        int expected = 0;
        int actual = radio.getMinVol();

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

        radio.setCurrentVol(50);
        radio.decreaseVolume();

        int expected = 49;
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

}
