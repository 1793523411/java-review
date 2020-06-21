package seven.demo05;

import java.util.*;

public class Movie {
    private String title, type;
    private Vector actors;

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public Vector getActors() {
        return actors;
    }

    public void setTitle(String aTitle) {
        title = aTitle;
    }

    public void setType(String aType) {
        type = aType;
    }

    public Movie() {
        this("???", "???");
    }

    public Movie(String aTitle, String aType) {
        title = aTitle;
        type = aType;
        actors = new Vector();
    }

    public String toString() {
        return ("Movie: " + "\"" + title + "\"");
    }

    public void addActor(String anActor) {
        actors.add(anActor);
    }
}

