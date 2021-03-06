package com.jee.basic;

// 1. 添加JEE Web Container: 将tomcat作为web server添加
// 2. 修改tomcat的配置信息：Server Locations > Use Tomcat Installation 允许Eclipse启动和关闭tomcat
// 3. tomcat/wtpwebapps 作为set up/deploy应用的位置路径

// 4. 构建HttpServlet服务端程序，用于处理请求

// 5. 构建JSP和JSTL前端view，呈现动态的页面
// 6. 添加JSTL的两种方式：下载.jar类库，添加到WebContent/WEB-INF/lib/ (不推荐)
//    . javax.servlet.jsp.jstl.jar, javax.servlet.jsp.jstl-api.jar
// 7. 添加JSTL的两种方式：使用maven来(构建)添加项目的依赖
public class BaseJavaEE {

	// 使用Spring框架来开发JEE > 在marketplace下载Spring IDE
	// 1. Spring IDE, Eclipse的插件(软件的扩展,提供额外的功能)，开源项目
	//    beans + dependencies

	// 2 Spring Tool Suite (STS): 包含server集成和多种组件
	//   Spring Tool 4 主要支持Spring Boot
	//   Spring Tool 3 Add On for STS 4 作为补充
	//   Spring Tool 3 直接安装，针对beans configuration !!!
	//   = Elipse JEE + Spring IDE + Maven + Git + Cloud + Server ...
	//   Cloud foundry: 开源的云平台, build, deploy, run app on the top of Kubernetes

	// 3. 安装maven M2Eclipse > Eclipse自带的插件，其中集成了Maven
	//    help > About Eclipse IDE > Installation Details > 查看m2e是否安装
	//    window > Preferences > Maven > Installation > 查看嵌入的版本号
	//    > 使用CLI(command line interface)
	//    > 使用IDE
}
