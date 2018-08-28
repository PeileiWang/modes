package builder.method1;

import builder.method1.domain.Student;
import builder.method1.studentbuilder.Builder;
import builder.method1.studentbuilder.StudentBuilder;

/**
 * Created by Wangpl
 * Time 2018/8/28 9:54
 */

public class Test {
    public static void main(String[] args) {
        Builder builder = new StudentBuilder();
        Student student1 = ((StudentBuilder) builder).buildAge(18)
                .buildId(15)
                .buildName("Wang")
                .buildSchool("Huake")
                .buildSex("男").build();
        System.out.println(student1.toString());

        Builder builder1 = new StudentBuilder();
        Student student2 = ((StudentBuilder) builder1).build();
        System.out.println(student2.toString());
    }
}