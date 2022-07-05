package ex3;

public class Dog implements Animal {
    public String walk;
    public String talk;
    public String eat;

    public Dog(String walk) {
        this.walk = walk;
    }

    @Override
    public String walk() {
        return "dog-walking";
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
