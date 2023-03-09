package practice10_2;

import java.io.*;

class Employee implements Serializable {
    String name;
    int age;
}

class Department implements Serializable {
    String name;
    Employee leader;
}

public class practice10_2 {
    public static void main(String[] args) throws Exception {
        Employee tanaka = new Employee();
        tanaka.name = "田中一郎";
        tanaka.age = 41;

        Department soumubu = new Department();
        soumubu.name = "総務部";
        soumubu.leader = tanaka;

        FileOutputStream fos = new FileOutputStream("C:\\Users\\General\\Documents\\Practice\\Java\\application\\chapter10\\src\\main\\java\\practice10_2\\company.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(soumubu);
        oos.flush();
        oos.close();
    }
}
