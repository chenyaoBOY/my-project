package excel.parse.util;

import cn.hutool.core.exceptions.ExceptionUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.cell.CellEditor;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import org.apache.poi.ss.usermodel.Cell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author chenyao
 * @date 2020/7/10 18:21
 * @description
 */
public class HutoolExcel {

    public static void main(String[] args) throws FileNotFoundException {
        try{
            String s=null;
            s.equals("1");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(ExceptionUtil.getMessage(e));
            System.out.println(ExceptionUtil.getSimpleMessage(e));
            System.out.println(ExceptionUtil.getRootCauseMessage(e));
//            e.printStackTrace();
        }
        String s = "2.1123";
        int i = s.indexOf(".");
//        System.out.println(isNumeric("1234567890"));
//        System.out.println(isNumeric("1234567890r"));
//        System.out.println(isNumeric("*"));
        System.out.println(isNumeric2("1.123451111111111111111"));
        System.out.println(isNumeric2("1.2123"));
        System.out.println(isNumeric2("1"));
        System.out.println(isNumeric2("3456.0"));
        System.out.println(isNumeric2("3456."));
        System.out.println(isNumeric2("3456.0.1"));
//        hutool();
    }
    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }
    public static boolean isNumeric2(String str){
        return str.matches("[0-9]+(\\.[0-9]*)?");
    }

    public static void hutool() throws FileNotFoundException {
        // 1.获取上传文件输入流
        InputStream inputStream = new FileInputStream("E:\\Java\\file\\PayU.xlsx");
        // 2.应用HUtool ExcelUtil获取ExcelReader指定输入流和sheet
        ExcelReader excelReader = ExcelUtil.getReader(inputStream, 0);
        // 可以加上表头验证
        // 3.读取第二行到最后一行数据
        List<List<Object>> read = excelReader.read(1);
        for (List<Object> data : read) {
            // objects.get(0),读取某行第一列数据
            // objects.get(1),读取某行第二列数据
            for (Object d : data) {
                if(d==null)continue;
//                System.out.println(d.toString());

            }
        }


    }
}
