public class Main {
    public static void main(String[] args) {

        Student obj = new EngineeringStudent().setRollNumber(7).setName("Sainikhil")
                .setAge(25).setFatherName("Ram").setMotherName("swarna").setSubjects().build();

        System.out.println(obj.getDetails());
    }
}