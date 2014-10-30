package com.runssnail.monolith.momo.support;

import org.springframework.beans.factory.config.BeanDefinitionHolder;

/**
 * BeanDefinition´´½¨¹¤³§
 * 
 * @author zhengwei
 */
public interface ExporterBeanDefinitionCreator {

    public BeanDefinitionHolder createBeanDefinitionHolder(ExporterMetadata exporterMetadata);
}
