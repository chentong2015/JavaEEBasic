package com.jee.basic;


/**
 * JEE: collection of tech and APIs for Java platform, support for "Enterprise" applications
 * JEE 是由JCP(Java Community Process)所开发的
 * 企业级应用的基本架构
 * .     APP    APP    APP    APP    .
 * .          Java EE APIs           .
 * .    Java EE API implementations  .
 * .    Java EE Application Server   .
 * .         Java SE Platform        .
 * .   Solaris Linux Windows MacOS   .
 */
public class MasterJavaEE {
	
	  /**
     * JEE技术所包含:
     * JDBC: Java Database Connectivity
     * JNDI: Java Naming and Directory Interface
     * EJBs: Enterprise Java Bean
     * RMI:  Remote Method Invocation
     * JSP:  Java ServerPage
     * Servlets: Server side tech     扩展了web server的Java class, 能够部署在Server端的JEE Component
     * HttpServlet: Create a Servlet  提供doGet, doPost, doHead, doTrace 更加底层的技术
     */

    /**
     * JEE vs Spring :
     * 1. JEE在开发微服务Microservices
     *   (com.ctong.springboot.service oriented architecture (SOA) 面向架构的服务)比Spring要更加的困难
     * 2. Spring能够支持NoSQL数据库 <-> "RDBMS"关系型数据库管理系统
     */
	
    // JEE 7                        Spring
    // EJB CDI           DI         Spring IoC
    // Interceptor       AOP        Spring AOP, AspectJ
    // JPA            Persistence   JPA, JDBC
    // JSF2              UI         Spring MVC, JSF2
    // JAX-WS            WS         Spring MVC REST Support, SOAP WS
    // JEE Security    Security     Spring Security
    // N/A             Testing      Spring Testing 支持测试

    // EJB - Enterprise Java Bean
    // CDI - Contexts and Dependency Injection
    // JPA - Java Persistent API
    // JAX-WS - A Set of APIs for creating web services 开发Web服务的APIs集
    // REST - Representational State Transfer, architecture style for WS
    // SOAP - Simple Object Access Protocol
    // WS - Web Services

}
