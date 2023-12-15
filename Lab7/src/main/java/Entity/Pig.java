package Entity;

public class Pig {
    private String name, type, imageURL;

    public Pig(String name, String type,String imageURL) {
        this.name = name;
        this.type = type;
        this.imageURL=imageURL;
    }
    public Pig setName(String name) {
        this.name = name;
        return this;
    }

    public Pig setType(String type) {
        this.type = type;
        return this;
    }

    public Pig setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }

    public Pig build() {
        return new Pig(name, type, imageURL);
    }
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    public String getImageURL(){
        return imageURL;
    }
}