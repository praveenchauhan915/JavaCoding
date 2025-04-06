package TheoryCoding;

public class thisKeywordExample {
    String name;
    int age;
    int id;
    String collegeName;
//    thisKeywordExample(String name, int age, int id, String collegeName){
//        name = name;
//        age = age;
//        id= id;
//        collegeName = collegeName;
//    }
// O/P NUll 0 0 NUll
// because whenever the local variable and instance variable name is same, JVM will get confused which is local variable
// and instance variable. This problem resolves by using this keyword
// 'This' keyword is always refers to the current class instance variable.
    thisKeywordExample(String name, int age, int id, String collegeName){
        this.name = name;
        this.age = age;
        this.id= id;
        this.collegeName = collegeName;
    }

}
