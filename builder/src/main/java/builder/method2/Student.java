package builder.method2;

import lombok.Data;

/**
 * Created by Wangpl
 * Time 2018/8/28 10:40
 */
@Data
public class Student {
    private int id;
    private String name;
    private String sex;
    private int age;
    private String school;

    public static class Builder {
        private int id;
        private String name;
        private String sex;
        private int age;
        private String school;

        Builder setId(int id) {
            this.id = id;
            return this;
        }

        Builder setName(String name) {
            this.name = name;
            return this;
        }

        Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        Builder setAge(int age) {
            this.age = age;
            return this;
        }

        Builder setSchool(String school) {
            this.school = school;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    public Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
        this.school = builder.school;
    }
}
