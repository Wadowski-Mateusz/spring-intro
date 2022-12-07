package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(RandomTextMessageServiceConfig.class);

        RandomTextMessageService ran = ctx.getBean(RandomTextMessageService.class);
        System.out.println(ran.getMessage() + " " + ran.hashCode());
        RandomTextMessageService ran1 = ctx.getBean(RandomTextMessageService.class);
        System.out.println(ran1.getMessage() + " " + ran1.hashCode());

        ApplicationContext ctx1 =
                new AnnotationConfigApplicationContext(MyNameMessageServiceConfig.class);
        MyNameMessageService ran2 = ctx1.getBean(MyNameMessageService.class);
        System.out.println(ran2.getMessage() + " " + ran2.hashCode());



//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
//        MessageService messageService1 = applicationContext.getBean("messageService1", MessageService.class);
//
//        System.out.println(messageService.getMessage() + messageService.hashCode());
//        System.out.println(messageService1.getMessage() + messageService1.hashCode());
//
//        applicationContext.close();

    }
}
