package com.runssnail.monolith.momo.support;

import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;

public abstract class MetadataParser {

    protected final Logger      log                         = Logger.getLogger(getClass());

    private static final String DEFAULT_SERVICE_NAME_PREFIX = "/remoting/";

    private static final String DEFAULT_SERVICE_NAME_SUFFIX = ".htm";

    /**
     * ���ɷ�������
     * 
     * @param name ��������
     * @param protocol Э��, Ĭ��hessian
     * @param version �汾, Ĭ��1.0
     * @param serviceInterface ����ӿ�
     * @return
     */
    protected String buildServiceName(String name, String protocol, String version, String serviceInterface) {

        StringBuilder sb = new StringBuilder(DEFAULT_SERVICE_NAME_PREFIX + protocol + "/" + version + "/");
        if (StringUtils.hasText(name)) {
            sb.append(name);
        } else {

            serviceInterface = serviceInterface.replaceAll("\\.", "/");
            sb.append(serviceInterface);
        }

        String serviceName = sb.toString();

        if (!serviceName.endsWith(DEFAULT_SERVICE_NAME_SUFFIX)) {
            serviceName = serviceName + DEFAULT_SERVICE_NAME_SUFFIX;
        }

        if (log.isDebugEnabled()) {
            log.debug("build service name success, serviceName=" + serviceName);
        }

        return serviceName;
    }
}
