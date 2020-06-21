package seven.homework;

public class Birth {
    int year, month, day;

    Birth(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
    }

    public String toString() {
        return this.year + "年" + this.month + "月" + this.day+"日";
    }
}
