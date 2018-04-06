package top.littletry.sharezone.common;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.xiaoleilu.hutool.setting.dialect.Props;
import com.xiaoleilu.hutool.util.StrUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Generater {
    /**
     * 包名
     */
    private static final String PACKAGE_NAME = "top.littletry.sharezone";
    /**
     * 保存位置
     */
    private static final String OUT_DIR = "D:\\codeGen";
    /**
     * 模块 方法级别的驼峰命名 用于变量名
     */
    private static final String MODULES_NAME = "user";
    /**
     * Author
     */
    private static final String AUTHOR = "littletry";

    public static void main(String[] args) {
        /**
         * 表明以及包名
         */
        generateByTables(PACKAGE_NAME,"user");
    }
    private static void generateByTables(String packageName, String... tableNames) {
        System.out.println("generate start ：" + Arrays.toString(tableNames));
        if (tableNames.length > 1) {
            System.out.println("多表同时生成请手动修改，controller.java 中的变量名");
        }
        if (StrUtil.isEmpty(AUTHOR)) {
            System.err.println("请问尊姓大名！ ===> AUTHOR");
            return;
        }
        if (StrUtil.isEmpty(MODULES_NAME)) {
            System.err.println("设置 此模块 驼峰命名  用于变量名！ ===> MODULES_NAME");
            return;
        }
        Props props = new Props("jdbc.properties");
        String dbUrl = props.getStr("jdbc.url");
        String userName = props.getStr("jdbc.username");
        String password = props.getStr("jdbc.password");

        // 数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();

        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername(userName)
                .setPassword(password)
                .setDriverName("com.mysql.jdbc.Driver");

        // 策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        //.setDbColumnUnderline(true)     //字段下划线命名，去掉为驼峰
        strategyConfig
                .setCapitalMode(false)
                .setEntityLombokModel(false)
                .setDbColumnUnderline(true)
                .setRestControllerStyle(true)
                .setSuperControllerClass("top.littletry.sharezone.common.base.BaseController")
                .setNaming(NamingStrategy.underline_to_camel)
                .setControllerMappingHyphenStyle(true)
                .setInclude(tableNames);
        // 全局配置
        GlobalConfig config = new GlobalConfig();

        config.setActiveRecord(true)
                .setAuthor(AUTHOR)
                .setOutputDir(OUT_DIR)
                .setEnableCache(false)
                .setBaseResultMap(true)
                .setBaseColumnList(true)
                .setFileOverride(true);
        // 模板设置
        TemplateConfig tc = new TemplateConfig();

        // 注入自定义配置，可以在 VM 中使用 cfg.abc 【可无】
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("modulesName", MODULES_NAME);
                this.setMap(map);
            }
        };

        new AutoGenerator().setGlobalConfig(config)
                .setCfg(cfg)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setTemplate(tc)
                .setPackageInfo(
                        // 包配置
                        new PackageConfig()
                                .setParent(packageName)
                                .setMapper("dao")
                                .setController("controller")
                                .setEntity("model")
                                .setXml("dao.xml")
                ).execute();

    }
}
