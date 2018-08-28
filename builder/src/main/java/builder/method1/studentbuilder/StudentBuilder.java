package builder.method1.studentbuilder;

import builder.method1.domain.Student;

/**
 * Created by Wangpl
 * Time 2018/8/28 10:36
 */
public class StudentBuilder implements Builder {
    private Student student;

    public StudentBuilder() {
        student = new Student();
    }

    public StudentBuilder buildId() {
        student.setId(0);
        return this;
    }

    public StudentBuilder buildName() {
        student.setName(null);
        return this;
    }

    public StudentBuilder buildSex() {
        student.setSex("男");
        return this;
    }

    public StudentBuilder buildAge() {
        student.setAge(18);
        return this;
    }

    public StudentBuilder buildSchool() {
        student.setSchool(null);
        return this;
    }

    public StudentBuilder buildId(int id) {
        student.setId(id);
        return this;
    }

    public StudentBuilder buildName(String name) {
        student.setName(name);
        return this;
    }

    public StudentBuilder buildSex(String sex) {
        student.setSex(sex);
        return this;
    }

    public StudentBuilder buildAge(int age) {
        student.setAge(age);
        return this;
    }

    public StudentBuilder buildSchool(String school) {
        student.setSchool(school);
        return this;
    }

    public Student build() {
        return this.student;
    }
}
