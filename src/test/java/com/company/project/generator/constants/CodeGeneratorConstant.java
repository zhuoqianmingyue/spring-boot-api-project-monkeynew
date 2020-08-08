package com.company.project.generator.constants;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author：zhuoqianmingyue
 * @Date： 2020/6/21
 * @Description： 项目公共常量
**/
public final class CodeGeneratorConstant {

    /**生成代码所在的基础包名称，可根据自己公司的项目修改（注意：这个配置修改之后需要手工修改src目录项目默认的包路径，使其保持一致，不然会找不到类）*/
    public static final String BASE_PACKAGE = "com.company.project";
    /**生成的Model所在包*/
    public static final String MODEL_PACKAGE = BASE_PACKAGE + ".model";
    /**生成的Mapper所在包*/
    public static final String MAPPER_PACKAGE = BASE_PACKAGE + ".dao";
    /**生成的Service所在包*/
    public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".service";
    /**生成的ServiceImpl所在包*/
    public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";
    /**生成的Controller所在包*/
    public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + ".web";
    /**Mapper插件基础接口的完全限定名*/
    public static final String MAPPER_INTERFACE_REFERENCE = BASE_PACKAGE + ".core.Mapper";

    public static final String PROJECT_PATH = System.getProperty("user.dir");//项目在硬盘上的基础路径
    public static final String TEMPLATE_FILE_PATH = PROJECT_PATH + "/src/test/resources/generator/template";//模板位置

    public static final String JAVA_PATH = "/src/main/java"; //java文件路径
    public static final String JAVA_TEST_PATH = "/src/test/java"; //java文件路径
    public static final String JAVA_PATHP_REFIX = PROJECT_PATH + JAVA_PATH;
    public static final String RESOURCES_PATH = "/src/main/resources";//资源文件路径
    public static final String RESOURCES_PATH_REFIX = PROJECT_PATH + RESOURCES_PATH;
    public static final String AUTHOR = "CodeGenerator";//@author
    public static final String DATE = new SimpleDateFormat("yyyy/MM/dd").format(new Date());//@date
}