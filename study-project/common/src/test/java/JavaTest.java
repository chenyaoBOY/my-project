import org.junit.Test;
import org.study.common.util.ResultUtil;

/**
 * @author chenyao
 * @Description:
 * @date 2018/7/1/13:13
 */
public class JavaTest {


    @Test
    public void test01(){

        Person data = new Person("cy",12);


        ResultUtil<Person> util = ResultUtil.success(data);

        ResultUtil<Integer> util1 = ResultUtil.success(2);
        Person person = util.getData();

        ResultUtil util2 = ResultUtil.fail("失败");

        Object data1 = util2.getData();
        System.out.println(person);
        System.out.println(data1);

    }
}


class Person{

    private String name;
    private int age;

    public Person(String name,int age){
        this.age=age;
        this.name=name;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
