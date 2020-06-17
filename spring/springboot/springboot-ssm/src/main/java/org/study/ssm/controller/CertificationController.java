package org.study.ssm.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.ssm.bean.date.DateInitBind;
import org.study.ssm.bean.date.DateTO;

import java.util.Date;
import java.util.List;


/**
 * 为了测试某些结果的controller
 *      例如：前台日期传递到后台Date类型 如何string直接转到Date
 *      例如：数字格式的小数位 保留n位小数，当有效值为0时，舍去
 */
@RestController
public class CertificationController {

//    @Autowired
//    private ShopOrderMapper contractMapper;
    /**
     * 日期类型的数据绑定
     *   创建一个DateInitBind类 继承PropertyEditorSupport并重写setAsText方法
     *
     * @param b
     */
    @InitBinder
    public void initBinder(WebDataBinder b) {
        //原理应该是：根据Date.class参数，判定当数据绑定类型为Date类型的时候，执行DateInitBind的setAsText方法
        b.registerCustomEditor(Date.class, new DateInitBind());
    }

    /**
     * DateTO：
     *      private Date date;
     *      private String name;
     * URL:
     *      http://localhost:18080/date?date=2018-05-28&name=佟丽娅
     * 通过数据绑定DateInitBind，将字符串2018-05-28转换成Date
     * @return
     */
    @RequestMapping("/date")
    public DateTO getDate(DateTO to){
        //{"date":1527436800000,"name":"陈瑶"}
        System.out.println(JSONObject.toJSONString((to)));
        //Date格式的2018-05-28，经过springmvc返回格式：2018-05-27T16:00:00.000+0000
        return to;
    }

    /**
     * 通过设置ObjectMapper的日期解析格式，将Date类型转为指定格式的字符串
     * @return
     */
    @RequestMapping("/date2")
    public String  getDate2(){
//        List<Contract> contract = contractMapper.listContract();
//        return JSONObject.toJSONString(contract);
        return null;
    }
    /**
     * 验证ObjectMapper对日期的转换
     *      设置解析时候的日期格式化
     *          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
     *          MAPPER.setDateFormat(sdf);
     * @return
     */
    @RequestMapping("/select")
    public String  select(){
//        Contract contract = contractMapper.getContract();
//        return JSONObject.toJSONString((contract));
        return null;
    }

}
