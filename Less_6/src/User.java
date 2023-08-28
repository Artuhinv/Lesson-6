import java.util.Scanner;

public class User {
    private String name;
    private Integer age;

    User(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public String toString(){
        return name + ", возраст " + age + " лет";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя первого пользователя: ");
        String name = in.nextLine();
        System.out.println("Введите возраст первого пользователя: ");
        int age = in.nextInt();
        in.nextLine();

        User user1 = new User(name, age);

        System.out.println("Введите имя второго пользователя: ");
        name = in.nextLine();
        System.out.println("Введите возраст второго пользователя: ");
        age = in.nextInt();

        User user2 = new User(name, age);
        if(user1.getAge() < user2.getAge()){
            System.out.println(user1.toString());
        } else {
            System.out.println(user2.toString());
        }
    }
}
