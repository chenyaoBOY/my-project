package org.study;


import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AutoBeanTool extends DefaultCommentGenerator{

	public static void main(String[] args) throws Exception {
		List<String> warnings = new ArrayList<String>();
		//指定 逆向工程配置文件
		File configFile = new File("generatorConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(true);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
				callback, warnings);
		myBatisGenerator.generate(null);
	}
	@Override
	public void addFieldComment(Field field, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
		
		// 添加字段注释
		if (introspectedColumn.getRemarks() != null) {
			String doc = introspectedColumn.getRemarks();
			field.addJavaDocLine("//"+doc);
		}
		 // 添加字段注释
//		StringBuffer sb = new StringBuffer();
//		field.addJavaDocLine("/**");
//		field.addJavaDocLine(" *");
//		if (introspectedColumn.getRemarks() != null)
//		field.addJavaDocLine(" * " + introspectedColumn.getRemarks());
//		sb.append(" * 表字段 : ");
//		sb.append(introspectedTable.getFullyQualifiedTable());
//		sb.append('.');
//		sb.append(introspectedColumn.getActualColumnName());
//		field.addJavaDocLine(sb.toString());
//		field.addJavaDocLine(" * ");
//		field.addJavaDocLine(" * ");
//		// addJavadocTag(field, false);
//		field.addJavaDocLine(" */");
	}



}




