package org.springboot.study.util;

/**
 * @author chenyao
 * @date 2020/8/17 13:34
 * @description
 */
public class ResultUtil {
    public static<T> Result<T> response(T data,Integer code,String msg){
        return new Result<T>(code,msg,data);
    }
    public static<T> Result<T> response(Integer code,String msg){
        return new Result<T>(code,msg);
    }
    public static Result success(){
        return new Result(200,null);
    }

}
