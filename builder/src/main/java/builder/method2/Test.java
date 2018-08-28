package builder.method2;

/**
 * Created by Wangpl
 * Time 2018/8/28 10:49
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student.Builder()
                .setId(1)
                .setName("Li")
                .setAge(12).build();
        System.out.println(student.toString());
    }
}
