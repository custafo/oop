public class Person {


    // atributes

    private String name;
    private int age;

    // builder
    public Person(String parName, int parAge){
        name = parName;
        age = parAge;
    }

    //identity
    public boolean equals(Object obj){
        if(obj instanceof Person){
            Person other = (Person) obj;
            return this.name.equals(other.name);
        }
        return false;
    }

    // operations

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    // object by strings

    public String toString(){
        return this.name + ":" + this.age;
    }
}