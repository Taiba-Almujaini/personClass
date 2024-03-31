import object.Person;

public class Main {

    public static void main(String[] args) {
        Person person=new Person();
        person.setPersonName("Ali");
        person.setPersonAge(22);

        System.out.println("Person Name is "+person.getPersonName());
        System.out.println("Person Age is "+person.getPersonAge());

    }
}
