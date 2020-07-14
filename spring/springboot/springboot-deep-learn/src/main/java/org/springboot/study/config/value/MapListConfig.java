package org.springboot.study.config.value;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author chenyao
 * @date 2020/5/29 11:21
 * @description
 */
@ConfigurationProperties("kabin.source.filename")
@Component
public class MapListConfig {
    private Map<String,String> map;
    private List<String> list;

    public List<String> getList() {
        return list;
    }


    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
