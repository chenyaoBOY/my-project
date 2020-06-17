package org.springboot.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author chenyao
 * @date 2020/5/29 13:06
 * @description
 */
@RestController
public class WiriteFileToDiskController {


    @GetMapping("/write")
    public String write() throws IOException {
        File file = new File("/path/file/demo.txt");
        if (!file.exists()) file.mkdirs();
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());

        return "ok";
    }

    public static void main(String[] args) throws IOException {
        File file = new File("/Java/file/adyen.txt");
        if (!file.exists()) {
            return;
        }
        BufferedReader reader = Files.newBufferedReader(Paths.get("/Java/file/adyen.txt"));
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        try {
            String s = reader.readLine();//跳过第一行
            String line;
            while ((line = reader.readLine()) != null) {
                String[] strs = line.split("\\t");

            }
        } finally {
            if(reader!=null){
                reader.close();
            }
        }

    }


}
