package org.springboot.study.controller;

import org.springboot.study.filter.ServletRequestWrapperFilter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.ContentCachingRequestWrapper;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

/**
 * @author chenyao
 * @date 2020/6/29 14:23
 * @description
 */
@RestController
public class MultiFileController {

    /**
     * 测试得知：HttpServletRequest中获取流只能获取一次 再次获取为空
     * 如果想二次获取 可以通过
     * 1.第一步获取流：{@link ContentCachingRequestWrapper#getInputStream}
     * 2.第二步获取缓存：{@link ContentCachingRequestWrapper#getContentAsByteArray}
     * 使用过滤器 将HttpServletRequest包装成ContentCachingRequestWrapper
     * 见{@link ServletRequestWrapperFilter}
     * 若在doFilter方法中获取了流则再controller里面就不能再获取到了
     * 上传文件时 如果是多个key和一个file文件 直接在request中获取不到流只能通过MultipartFile
     * @param request
     * @return
     * @throws IOException
     */
    @PostMapping("/file/upload")
    public String fileUpload(HttpServletRequest request) throws IOException {
//        String streamString1 = getInpustStreamString(request.getInputStream());//有值
//        String streamString2 = getInpustStreamString(request.getInputStream());//无值
        if (request instanceof ContentCachingRequestWrapper) {
            ContentCachingRequestWrapper wrapper = (ContentCachingRequestWrapper) request;
            String string = getInpustStreamString(wrapper.getInputStream());
            byte[] byteArray = wrapper.getContentAsByteArray();
            String s = new String(byteArray);
            return s;
        }
        return "ok";
    }

    private String getInpustStreamString(InputStream stream) throws IOException {
        StringBuilder sb = new StringBuilder();
        byte[] bytes = new byte[1024];
        int b;
        while ((b = stream.read(bytes, 0, bytes.length)) > 0) {
            sb.append(new String(bytes, 0, b));
        }
        return sb.toString();
    }
}
