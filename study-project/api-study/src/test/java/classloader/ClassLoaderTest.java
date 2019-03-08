package classloader;

import org.junit.Test;

public class ClassLoaderTest {

    @Test
    public void test(){
        Class<ClassLoaderTest> clazz = ClassLoaderTest.class;
        ClassLoader classLoader = clazz.getClassLoader();

        System.out.println(classLoader);

        ClassLoader loaderParent = classLoader.getParent();
        System.out.println(loaderParent);

        ClassLoader parent = loaderParent.getParent();

        System.out.println(parent);
    }
}
