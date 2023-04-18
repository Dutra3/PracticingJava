package poo;

public class PooStudy {

    public static void main(String[] args) {
        // One to One
        Car c1 = new Car();
        System.out.println(c1.isOn());

        c1.turnOn();
        System.out.println(c1.isOn());

        c1.speedUp();
        c1.speedUp();
        c1.brake();
        System.out.println(c1.getMotor().spin());

        // One to Many
        Purchase purchase = new Purchase();
        purchase.client = "Gabriel Dutra";
        purchase.addProduct(new Product("Caneta", 20, 7.45));
        purchase.addProduct("Caderno", 12, 12.45);
        purchase.products.add(new Product("Borracha", 5, 1.35));

        System.out.println(purchase.getTotalValue());

        // Many to Many
        Student student1 = new Student("Joao");
        Student student2 = new Student("Debora");
        Student student3 = new Student("Gabriel");

        Course course1 = new Course("Java Completo");
        Course course2 = new Course("Web JS 2023");
        Course course3 = new Course("React JS");

        course1.addStudent(student1);
        course1.addStudent(student2);

        course2.addStudent(student1);
        course2.addStudent(student3);

        student1.addCourse(course3);
        student2.addCourse(course3);
        student3.addCourse(course3);

        for (Student student : course1.getStudents()) {
            System.out.println(" \n Estou matriculado no curso " + course1.getName() + "...");
            System.out.println("... e o meu nome e " + student.getName());
        }

        for (Student student : course2.getStudents()) {
            System.out.println(" \n Estou matriculado no curso " + course2.getName() + "...");
            System.out.println("... e o meu nome e " + student.getName());
        }

        for (Student student : course3.getStudents()) {
            System.out.println(" \n Estou matriculado no curso " + course3.getName() + "...");
            System.out.println("... e o meu nome e " + student.getName());
        }

        Course existingCourse = student2.getCourseByName("Java Completo");

        if (existingCourse != null) {
            System.out.println("Aluno matriculado nesse curso!");
        } else {
            System.out.println("Aluno nao matriculado nesse curso!");
        }
    }

}
