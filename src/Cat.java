public class Cat {
    //instance variables
    private String name;
    private int timesFed;

    // constructor
    public Cat(String name) {
        this.name = name;
    }

    // getter method
    public int getTimesFed() {
        return timesFed;
    }

    // feed the cat
    public void feed(String food) {
        System.out.println("Yum! " + name + " loves " + food + "!");
        timesFed++;
    }

    // introduce the cat
    public void introduce() {
        System.out.println("Hello. My name is " + name);
    }
}