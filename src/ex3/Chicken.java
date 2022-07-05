package ex3;

public class Chicken implements Animal{
    public String walk;
    public String talk;
    public String eat;

    public Chicken(String walk) {
        this.walk = walk;
    }


    @Override
    public String walk() {
        return "Chicken-walking";
    }

    @Override
    public String talk() {
        return null;
    }

    @Override
    public String eat() {
        return null;
    }
}
