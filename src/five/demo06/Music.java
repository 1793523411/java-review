package five.demo06;

public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}

/**
 *运行中，Instrument类的对象实际是Wind类的，所以调用了Wind类中的play方法
 */
