package com.runssnail.monolith.momo.support;

import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;

public abstract class AbstractServiceBeanDefinitionCreator implements ServiceBeanDefinitionCreator {

    protected final Logger log = Logger.getLogger(getClass());

    /**
     * ���ɷ���id
     * 
     * @param id ���õ�id
     * @param serviceInterface ���õķ���ӿ�
     * @return
     */
    protected String buildServiceId(String id, String serviceInterface) {
        String serviceId = null;
        if (StringUtils.hasText(id)) {
            serviceId = id;
        } else {
            serviceId = serviceInterface;
        }

        if (log.isDebugEnabled()) {
            log.debug("build service id success, serviceId=" + serviceId);
        }
        return serviceId;
    }
}
