package ex3;

public class Main {
    public static void main(String[] args) {
        Cat mycat= new Cat("cat-walking") {
            @Override
            public String talk() {
                return null;
            }

            @Override
            public String eat() {
                return null;
            }
        };

        System.out.println(mycat.walk());


        Dog mydog = new Dog("dog-walking");

        System.out.println(mydog.walk());


        Mouse mymouse = new Mouse("mouse-walking");
        System.out.println(mymouse.walk());


        Chicken mychicken = new Chicken("chicken-walking");
        System.out.println(mychicken.walk());

        Duck myduck = new Duck("duck-walking");
        System.out.println(myduck.walk());


    }
}
