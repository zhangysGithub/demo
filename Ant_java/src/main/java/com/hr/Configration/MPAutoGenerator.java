package com.hr.Configration;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * created  on 2021/5/12 9:52
 */
public class MPAutoGenerator {

    public static void main(String[] args) {
        String moduleName="Ant_java";
        String username="root";
        String url="jdbc:mysql://localhost:3306/test";
        String password="123456";



        AutoGenerator generator = new AutoGenerator();
        GlobalConfig globalConfig = new GlobalConfig();

        globalConfig.setOutputDir(moduleName+"/src/main/java");
        globalConfig.setAuthor("zhang");
        generator.setGlobalConfig(globalConfig);

        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUrl(url);
        dataSourceConfig.setUsername(username);
        dataSourceConfig.setPassword(password);
        generator.setDataSource(dataSourceConfig);

        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setMapper("dao");
        packageConfig.setParent("com.hr");
        generator.setPackageInfo(packageConfig);

        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setEntityLombokModel(true);
        strategyConfig.setInclude("menus2");
//        strategyConfig.setInclude("表名");生成包括哪些表
//        strategyConfig.setExclude("表名");生成不包括那些表
        strategyConfig.setRestControllerStyle(true);
        generator.setStrategy(strategyConfig);

        InjectionConfig injectionConfig =new InjectionConfig() {
            @Override
            public void initMap() {


            }
        };
        String template="/templates/mapper.xml.vm";
        List<FileOutConfig> list =new ArrayList<>();
        list.add(new FileOutConfig(template) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return moduleName+"/src/main/resources/mappers/"+tableInfo.getEntityName()+"mapper.xml";
            }
        });
        injectionConfig.setFileOutConfigList(list);
        generator.setCfg(injectionConfig);

        TemplateConfig templateConfig =new TemplateConfig();
        templateConfig.setXml(null);
        generator.setTemplate(templateConfig);

        generator.execute();
    }
}
