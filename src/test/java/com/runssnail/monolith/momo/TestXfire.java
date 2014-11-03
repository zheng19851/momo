package com.runssnail.monolith.momo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestXfire {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context-test-xfire.xml");

        TestService testService = (TestService) context.getBean("testService");
        testService.print();

        System.out.println(context.getBean("/remoting/xfire/com/runssnail/monolith/momo/TestService/1.0.htm"));

        TestService remoteTestService = (TestService) context.getBean("com.runssnail.monolith.momo.TestService");

//        remoteTestService.print();
        System.out.println(remoteTestService);

    }

}
