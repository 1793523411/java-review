package four.equals;

public class Apple {
    private String color;
    private boolean ripe;

    public Apple(String aColor, boolean isRipe) {
        color = aColor;
        ripe = isRipe;
    }

    public void setColor(String aColor) {
        color = aColor;
    }

    public void setRipe(boolean isRipe) {
        ripe = isRipe;
    }

    public String getColor() {
        return color;
    }

    public boolean getRipe() {
        return ripe;
    }

    public String toString() {
        if (ripe) return ("A ripe " + color + " apple");
        else return ("A not so ripe " + color + " apple");
    }
    public boolean equals(Object obj) {
        if (obj instanceof Apple) {
            Apple a = (Apple) obj;
            return (color.equals(a.getColor()) && (ripe == a.getRipe()));
        }
        return false;
    }
}

