public class Cat extends Animal{
    boolean hasSherst;

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void eat() {
        System.out.println("barsik eat fish");
    }

    @Override
    public void makeNoise() {
        System.out.println("cat nouse");

    }
}
