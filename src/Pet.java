public class Pet {

    private final string name;

    private boolean clean;

    public Pet(String name) { 
        this.name = name;
        this.clean = false;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }



}
