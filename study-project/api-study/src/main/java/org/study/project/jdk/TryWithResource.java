package org.study.project.jdk;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author chenyao
 * @date 2019/10/15 11:09
 * @description
 */
public class TryWithResource {
    public static void main(String[] args) {


        try(FileInputStream file = new FileInputStream("")){
            System.out.println(123);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
