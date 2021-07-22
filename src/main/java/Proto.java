public class Proto {
    public static void main(String[] args) {
        PersonOuterClass.Person person = PersonOuterClass.Person.newBuilder().setName("Buford Tanner").setAge(22).build();
        System.out.println(person.toString());
    }
}
