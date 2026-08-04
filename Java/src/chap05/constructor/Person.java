package chap05.constructor;

public class Person {
    String name;
    float height;
    float weight;

    public Person() {} //default 생성자

    public  Person(String pname){
        name = pname;
    }

    public Person(String pname, float pheight, float pweight){
        name = pname;
        height = pheight;
        weight = pweight;
    }
}
