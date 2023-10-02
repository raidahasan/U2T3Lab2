public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Fluffy");
        cat1.feed("tuna");
        System.out.println(cat1.getTimesFed());
        cat1.feed("mouse");
        System.out.println(cat1.getTimesFed());
        cat1.feed("treat");
        cat1.feed("cat food");
        cat1.feed("spinach");
        System.out.println(cat1.getTimesFed());
    }
}