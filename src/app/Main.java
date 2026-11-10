package app;
public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Іваненко Іван Іванович", "Розробник",
                "ivan@mail.com", "+380501234567", 30);

        System.out.println("ПІБ: " + e.getFullName());
        System.out.println("Посада: " + e.getPosition());
        System.out.println("Email: " + e.getEmail());
        System.out.println("Телефон: " + e.getPhone());
        System.out.println("Вік: " + e.getAge());

        Car car = new Car();
        car.start();
    }
}