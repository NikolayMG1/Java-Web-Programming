package bg.uni.fmi.lab01.baseline;

public class Person {
    int age;
    String name;

    Person(){
        this.age = -1;
        this.name = "No Name";
    }

    Person(String name){
        this.name = name;
        this.age = -1;
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    String getName(){
        return this.name;
    }

    int getAge(){
        return this.age;
    }

    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }

}
