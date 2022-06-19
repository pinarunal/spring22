package day20;

public class StudentRunner {

    public static void main(String[] args) {

        Student std1 = new Student();
        System.out.println(std1);//Student{name='Tom Hanks', age=13, successful=true}

        std1.setName("Andy Smart");
        std1.setAge(24);
        std1.setSuccessful(false);
        System.out.println(std1);//Student{name='Andy Smart', age=24, successful=false}

        std1.setName("Mary Star");
        std1.setAge(22);
        std1.setSuccessful(false);
        System.out.println(std1);//Student{name='Mary Star', age=22, successful=false}

        Student std2 = new Student();
        System.out.println(std2);//Student{name='Tom Hanks', age=13, successful=true}

        Student std3 = new Student("Ali Can", 12, true);

    }
}
