package ex3;

public abstract class Cat implements Animal {

    public  String walk;
    //public String talk;
    //public String eat;

    public Cat(String walk) {
        this.walk = walk;
    }
    @Override
    public String walk() {
        return "cat-walking";
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
