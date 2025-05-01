package TheoryCoding;

public class thisDemo {
    int a = 2;
    public void getData(){
        int a = 3;
        int b = this.a +a;
        System.out.println("Local Variable:- " +a);
        System.out.println("Instance Variable:- " +this.a);
        System.out.println("Sum of local and Instance Variable:- " +b);
    }

    public static void main(String[] args) {
        thisDemo td = new thisDemo();
        td.getData();
    }
}
