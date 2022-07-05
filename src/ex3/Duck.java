package ex3;

public class Duck implements Animal{
    public String walk;
    public String talk;
    public String eat;

    public Duck(String walk) {
        this.walk = walk;
    }


    @Override
    public String walk() {
        return "Duck-walking";
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
