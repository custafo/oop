public class Person {


    // atributes

    private String name;
    private int age;

    // builder
    public Person(String name, int age){
        this.name = name; //// name = parName;
        this.age = age; //// age = parAge;
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

    public void setName(String name){
        this.name = name;
    }

    // object by strings 

    public String toString(){ // representation in strings by objects
        return this.name + ":" + this.age;
    }
}