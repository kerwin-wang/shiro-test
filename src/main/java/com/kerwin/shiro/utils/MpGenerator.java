package com.kerwin.shiro.utils;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @className: MpGenerator
 * @version: v1.0.0
 * @author: d.w
 * @date: 2019-12-02 16:48
 */
public class MpGenerator
{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        AutoGenerator mpg = new AutoGenerator();

        //全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir("D:\\code\\shiro-test-git\\src\\main\\java");
        gc.setFileOverride(false);
        gc.setEnableCache(false);
        gc.setActiveRecord(false);
        // XML ResultMap
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(true);
        gc.setAuthor("wd");
        gc.setDateType(DateType.ONLY_DATE);
        mpg.setGlobalConfig(gc);

        //数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setTypeConvert(new MySqlTypeConvert());
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("qwe123!@#");
        dsc.setUrl("jdbc:mysql://localhost:3306/shiro?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai");
        mpg.setDataSource(dsc);

        //策略配置
        StrategyConfig strategy = new StrategyConfig();
        // 需要生成的表
        strategy.setInclude(new String[] { "user","role","permission","user_role","role_permission" });
        // 此处可以修改为您的表前缀
        strategy.setTablePrefix("sys_");
        // 表名生成策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        mpg.setStrategy(strategy);

        //包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.kerwin.shiro");
        mpg.setPackageInfo(pc);

        //目录配置
        TemplateConfig tc = new TemplateConfig();
        tc.setController(null);
        mpg.setTemplate(tc);

        //执行生成
        mpg.execute();
    }

}
