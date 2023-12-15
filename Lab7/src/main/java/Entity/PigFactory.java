package Entity;

public class PigFactory {
    public static Pig createPig(String name, String type, String imageURL) {
        return new Pig(name, type, imageURL);
    }
}