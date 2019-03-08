package org.study.springbootdemo.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenyao
 * @Description:
 *  指定标签、指定别名等推送
 *      有效的别名标签组成：
 *          字母（区分大小写）、数字、下划线、汉字、特殊字符@!#$&*+=.|￥
 * @date 2018/6/28/11:46
 */
public class AudiencePush {
    /**
     * Audience value must be JSON Array format!
     */
    //推送给多个标签（只要在任何一个标签范围内都满足）：在深圳、广州、或者北京
    private List tag = new ArrayList();
    //推送给多个标签（需要同时在多个标签范围内）：在深圳并且是“女”
    private List tag_and = new ArrayList();
    //推送给多个别名： "alias" : [ "4314", "892", "4531" ]
    private List alias = new ArrayList();
    //推送给多个注册ID："registration_id" : [ "4312kjklfds2", "8914afd2", "45fdsa31" ]
    private List registration_id = new ArrayList();

    public AudiencePush(){

    }
    public AudiencePush(List alias){
        this.alias=alias;
    }

    public List getTag() {
        return tag;
    }

    public void setTag(List tag) {
        this.tag = tag;
    }

    public List getTag_and() {
        return tag_and;
    }

    public void setTag_and(List tag_and) {
        this.tag_and = tag_and;
    }

    public List getAlias() {
        return alias;
    }

    public void setAlias(List alias) {
        this.alias = alias;
    }

    public List getRegistration_id() {
        return registration_id;
    }

    public void setRegistration_id(List registration_id) {
        this.registration_id = registration_id;
    }
}
