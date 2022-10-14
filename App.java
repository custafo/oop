public class App {
    public static void main(String[] args){
        Person person1 = new Person("Pepeu" , 18); // instances
        Person person2 = new Person("Guga", 19);

        System.out.println(person1); // call tostring object1
        // sout person1.name + ":" +person1.age;
        System.out.println(person2); 
        
        person2.setName("Another name");

        boolean isEquals = person1.equals(person2);
        System.out.println(isEquals);
    }
}
