package com.runssnail.monolith.momo.support;

import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;

public abstract class MetadataParser {

    protected final Logger      log                         = Logger.getLogger(getClass());

    private static final String DEFAULT_SERVICE_NAME_PREFIX = "/remoting/";

    private static final String DEFAULT_SERVICE_NAME_SUFFIX = ".htm";

    /**
     * ���ɷ�������, /remoting/$protocol/$serviceName/$version.htm
     * 
     * @param protocol Э��, Ĭ��hessian
     * @param name ��������
     * @param serviceInterface ����ӿ�
     * @param version �汾, Ĭ��1.0
     * @return
     */
    protected String buildServiceName(String protocol, String name, String serviceInterface, String version) {
        return this.buildServiceName(protocol, name, serviceInterface, version, null);
    }

    /**
     * ���ɷ�������, ��ʽ��/remoting/$protocol/$serviceName/$version.htm?$queryString
     * 
     * @param protocol Э��, Ĭ��hessian
     * @param name ��������
     * @param serviceInterface ����ӿ�
     * @param version �汾, Ĭ��1.0
     * @param queryString ��ѯ����
     * @return
     */
    protected String buildServiceName(String protocol, String name, String serviceInterface, String version,
                                      String queryString) {

        StringBuilder sb = new StringBuilder(DEFAULT_SERVICE_NAME_PREFIX + protocol + "/");
        if (StringUtils.hasText(name)) {
            sb.append(name);
        } else {

            serviceInterface = serviceInterface.replaceAll("\\.", "/");
            sb.append(serviceInterface);
        }

        // version = version.replaceAll("\\.", "/");

        sb.append("/").append(version);

        sb.append(DEFAULT_SERVICE_NAME_SUFFIX);

        if (StringUtils.hasText(queryString)) {
            sb.append("?").append(queryString);
        }

        String serviceName = sb.toString();

        if (log.isDebugEnabled()) {
            log.debug("build service name success, serviceName=" + serviceName);
        }

        return serviceName;
    }
}
