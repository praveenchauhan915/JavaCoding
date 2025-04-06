package TheoryCoding;

public class constructorExample {
    String name;
    int age;
    int id;
    String collegeName;

    constructorExample(String n, int a,int i, String colName){
        name = n;
        age =a;
        id= i;
        collegeName = colName;
    }
    void display(){
        System.out.println("Name is:-" +name);
        System.out.println("Age is:-" +age);
        System.out.println("Id is:-" +id);
        System.out.println("College name is:-" + collegeName);
    }

    public static void main(String[] args) {
        constructorExample s1 = new constructorExample("Praveen", 32,1,"Kit");
        s1.display();
        constructorExample s2 = new constructorExample("Kajal", 30, 2,"Mit");
        s2.display();
    }
}
