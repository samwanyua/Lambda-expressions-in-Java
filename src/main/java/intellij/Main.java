package intellij;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        // Lamda
        // interface - is like a contract, any class that implements that interface has to provide their own implementation of methods specified by that interface

        Cat myCat = new Cat();
//        myCat.print();
        printThing(myCat);


    }
    static void printThing(Printable thing){
        thing.print();
    }
}