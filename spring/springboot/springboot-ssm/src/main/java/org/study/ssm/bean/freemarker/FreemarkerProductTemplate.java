package org.study.ssm.bean.freemarker;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

/**
 * @author chenyao
 * @Description: 自定义宏，使freemaker在加载到自定义标签后，再去后台加载数据源
 * @date 2018/6/22/14:18
 */
@Component("productTemplate")
public class FreemarkerProductTemplate implements TemplateDirectiveModel{


    public void execute(Environment environment, Map map,
                        TemplateModel[] templateModels,
                        TemplateDirectiveBody templateDirectiveBody)
            throws TemplateException, IOException {





    }
}
