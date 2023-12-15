package Entity;

import java.util.ArrayList;

public class PigList {
    private static PigList instance;
    private ArrayList<Pig> pigs = new ArrayList<>();

    private PigList() {
    }

    public static PigList getInstance() {
        if (instance == null) {
            instance = new PigList();
        }
        return instance;
    }

    public void addPig(Pig pig) {
        pigs.add(pig);
    }

    public ArrayList<Pig> getPigs() {
        return pigs;
    }
}








