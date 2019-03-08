import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author chenyao
 * @Description: clone方法测试
 * @date 2018/6/6/10:43
 */
public class CloneTest {
    public static  int a=0;
    @Test
    public void test1(){
        a++;
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(1);
        }
        int[] arr= new int[10];
        int[] ints = Arrays.copyOf(arr, 20);

        list.add(6,100);
        CloneTest cloneTest = new CloneTest();
        System.out.println(Object[].class==Object[].class);
    }
    @Test
    public void test(){
        int i = 1;
        switch (i){
            case 0:
                System.out.println(i);
                break;
            case 1:
                System.out.println(1);
                System.out.println(1);
                break;
            default:
                System.out.println(12213);
                System.out.println(12213);
        }
    }
}
