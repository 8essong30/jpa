//package com.sparta.jpa.jdbc.my;
//
//import org.springframework.beans.factory.support.BeanDefinitionRegistry;
//import org.springframework.beans.factory.support.GenericBeanDefinition;
//import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
//import org.springframework.core.type.AnnotationMetadata;
//
//import java.util.Map;
//
//// 직접 레파지토리 주입 프로그래밍
//public class MyRepositoryRegistrar implements ImportBeanDefinitionRegistrar {
//    // 스프링이 실행될 때 실행됨
//    @Override
//    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
//        // 주입할 빈에 대해 프로그래밍
//        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
//        beanDefinition.setBeanClass(MyRepository.class);
//        beanDefinition.getPropertyValues().add("dataTable", Map.of(1L, "data"));
//        //
//
//        registry.registerBeanDefinition("myRepository", beanDefinition);
//    }
//}
