package model;

public class Student {
    private Long ID;
    private String name;
    private Integer age;
    private Integer gender;

    public Student() {
    }

    public Student(Long ID, String name, Integer age, Integer gender) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
