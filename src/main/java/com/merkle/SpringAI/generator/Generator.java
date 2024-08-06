//package com.merkle.SpringAI.generator;
//
//import com.baomidou.mybatisplus.annotation.FieldFill;
//import com.baomidou.mybatisplus.annotation.IdType;
//import com.baomidou.mybatisplus.generator.FastAutoGenerator;
//import com.baomidou.mybatisplus.generator.config.OutputFile;
//import com.baomidou.mybatisplus.generator.config.rules.DateType;
//import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;
//import com.baomidou.mybatisplus.generator.fill.Column;
//import com.baomidou.mybatisplus.generator.fill.Property;
//import com.merkle.SpringAI.entity.MybatisBaseEntity;
//import com.merkle.SpringAI.utils.dataaccess.BaseServiceDataAccess;
//import com.merkle.SpringAI.utils.dataaccess.impl.BaseServiceDataAccessImpl;
//
//import java.util.Collections;
//
////自动生产bean，不用需要注释掉
//public class generator {
//    //数据库URL
//    private static final String URL = "jdbc:mysql://127.0.0.1:3306/chatbot_dev";
//    //数据库帐户
//    private static final String NAME = "root";
//    //数据库密码
//    private static final String PASSWORD = "ikazuchi";
//    //生产bean作者
//    private static final String AUTHOR = "Ikazuchi";
//
//    //项目前缀
//    private static final String PROJECT_PREFIX = "/Users/sding02/Desktop/workspace/learn_springai/SpringAIDemo/src/main/";
//
//    //指定输出目录，一般指定到java目录
//    private static final String OUTPUTDIR = PROJECT_PREFIX + "java";
//    //设置mapperXml生成路径
//    private static final String MAPPERPATH = PROJECT_PREFIX + "resources/mapper";
//
//    private static final String[] TABELNAME = {"message"};
//
//
//    public static void main(String[] args) {
//        //创建一个代码生成器
//        FastAutoGenerator.create(URL,
//                        NAME, PASSWORD)
//                //全局配置(GlobalConfig)
//                .globalConfig(builder -> {
//                    builder.author(AUTHOR) // 设置作者，可以写自己名字
//                            //.enableSwagger() // 开启 swagger 模式，这个是接口文档生成器，如果开启的话，就还需要导入swagger依赖
//                            .fileOverride() // 覆盖已生成文件
//                            .dateType(DateType.TIME_PACK) //时间策略
//                            .commentDate("yyyy-MM-dd") //注释日期
//                            .outputDir(OUTPUTDIR); // 指定输出目录，一般指定到java目录
//                })
//                //包配置(PackageConfig)
//                .packageConfig(builder -> {
//                    builder.parent("com.merkle.SpringAI") // 设置父包名
//                            .moduleName("") // 设置父包模块名，这里一般不设置
//                            .entity("dao.entity")
//                            .mapper("dao.mapper")
//                            .service("dataaccess")
//                            .serviceImpl("dataaccess.impl")
//                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, MAPPERPATH)); // 设置mapperXml生成路径，这里是Mapper配置文件的路径，建议使用绝对路径
//                })
//                //策略配置(StrategyConfig)
//                .strategyConfig(builder -> {
//                    builder.addInclude(TABELNAME); // 设置需要生成的表名
//                    // .addTablePrefix("tbl_"); // 设置过滤表前缀
//                    builder.entityBuilder()
//                            .superClass(MybatisBaseEntity.class)
//                            .enableLombok()
//                            .enableTableFieldAnnotation()
//                            .logicDeleteColumnName("deleted")
//                            .addSuperEntityColumns("id", "created_at", "updated_at", "deleted_at", "deleted")
//                            .addTableFills(new Column("created_at", FieldFill.INSERT))
//                            .addTableFills(new Property("updated_at", FieldFill.INSERT_UPDATE))
//                            .idType(IdType.AUTO)
//                            .formatFileName("%sEntity");
//
//                    builder.serviceBuilder()
//                            .superServiceClass(BaseServiceDataAccess.class)
//                            .superServiceImplClass(BaseServiceDataAccessImpl.class)
//                            .formatServiceFileName("%s") //设置service的命名策略,没有这个配置的话，生成的service和serviceImpl类前面会有一个I，比如IUserService和IUserServiceImpl
//                            .formatServiceImplFileName("%s")//设置serviceImpl的命名策略
//                            .convertServiceFileName((entityName -> entityName + "Access"))
//                            .convertServiceImplFileName((entityName -> entityName + "AccessImpl"));
////                    builder.controllerBuilder()
////                            .enableRestStyle(); // 开启生成@RestController 控制器，不配置这个默认是Controller注解，RestController是返回Json字符串的，多用于前后端分离项目。
//                    builder.mapperBuilder()
//                            .enableMapperAnnotation();//开启 @Mapper 注解，也就是在dao接口上添加一个@Mapper注解，这个注解的作用是开启注解模式，就可以在接口的抽象方法上面直接使用@Select和@Insert和@Update和@Delete注解。
//                })
////                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
//                .templateEngine(new VelocityTemplateEngine())
//                .execute(); //执行以上配置
//    }
//
//}
//
