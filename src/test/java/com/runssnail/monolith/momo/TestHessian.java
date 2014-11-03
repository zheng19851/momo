package com.runssnail.monolith.momo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHessian {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        TestService testService = (TestService) context.getBean("testService");
        testService.print();

        System.out.println(context.getBean("/remoting/hessian/com/runssnail/monolith/momo/TestService/1.0.htm"));

        TestService remoteTestService = (TestService) context.getBean("com.runssnail.monolith.momo.TestService");

//        remoteTestService.print();
        System.out.println(remoteTestService);
    }

}
