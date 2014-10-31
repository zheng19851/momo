package com.runssnail.monolith.momo;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * momo�����ռ䴦����
 * 
 * @author zhengwei
 *
 */
public class MomoNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("service", 
                                     new MomoServiceBeanDefinitionParser());    
        registerBeanDefinitionParser("exporter", 
                                     new MomoExporterBeanDefinitionParser());     
    }

}
