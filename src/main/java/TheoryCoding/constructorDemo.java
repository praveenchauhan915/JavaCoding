package TheoryCoding;

public class constructorDemo {
    public constructorDemo(){
        System.out.println("I am in constructor block");
    }

    public constructorDemo(int a, int b){
        System.out.println("I am in parameterized constructor block");
        int c = a+b;
        System.out.println("Sum :- " +c);
    }

    public constructorDemo(String name){
        System.out.println("I am in String parameterized constructor block");

        System.out.println("Name :- " + name );
    }
    public void getMethod(){
        System.out.println("I am in method block");
    }

    public static void main(String[] args) {
        constructorDemo cd= new constructorDemo(); // As soon as object reference defined constructor block is called
        cd.getMethod();
        constructorDemo cd1 = new constructorDemo(4,6);
        constructorDemo cd2 = new constructorDemo("Praveen");
    }
}
