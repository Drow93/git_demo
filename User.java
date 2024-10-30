/**
* @program: git_demo
* @ClassName: User
* @description: 
* @author: ZJP
* @create: 2024-10-30 22:18
* @Version 1.0
**/
public class User {

    private String name;

    private int age;

    private String address;

    private String phone;

    public static void main(String[] args) {
        System.out.println("hate world");
    }

    public User(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
