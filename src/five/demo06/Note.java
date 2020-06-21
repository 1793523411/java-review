package five.demo06;

public class Note {
    private int value;
    private Note(int val) { value = val; }
    public static final Note
    MIDDLE_C = new Note(0),
    C_SHARP  = new Note(1),
    B_FLAT   = new Note(2);
}
