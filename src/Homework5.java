public class Homework5 {
    
    public static void main(String[] args) {
        Employee[] worker = new Employee[5];
        worker[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",50000,39);
        worker[1] = new Employee("Petrov Petr", "Creator", "petrov@mailbox.com", "892312314",50000,32);
        worker[2] = new Employee("Sidorov Sidr", "Water pot", "sidorov@mailbox.com", "892312315",10000,43);
        worker[3] = new Employee("Pupkina Nadegda", "EnvelopeLicker", "pupkina@mailbox.com", "892312316",5000,28);
        worker[4] = new Employee("Davidov David", "GrinderPencil", "juk@mailbox.com", "892312317",3000,31);
        for (Employee employee : worker)
            if (employee.getAge()>40)
                System.out.println(employee);

    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public String toString(){
        return(name+ "\n"
                +position+ "\n"
                +email+ "\n"
                +phone+ "\n"
                +salary+ "\n"
                +age);
    }
}
