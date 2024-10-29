public class Dog extends Animal{
    boolean hasTeeth;

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void eat() {
        System.out.println("dog eat meat");
    }
}
