package com.runssnail.monolith.momo.support;

import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;

public abstract class MetadataParser {

    protected final Logger      log                         = Logger.getLogger(getClass());

    private static final String DEFAULT_SERVICE_NAME_PREFIX = "/remoting/";

    private static final String DEFAULT_SERVICE_NAME_SUFFIX = ".htm";

    /**
     * 生成服务名称, /remoting/$protocol/$serviceName/$version.htm
     * 
     * @param protocol 协议, 默认hessian
     * @param name 服务名称
     * @param serviceInterface 服务接口
     * @param version 版本, 默认1.0
     * @return
     */
    protected String buildServiceName(String protocol, String name, String serviceInterface, String version) {
        return this.buildServiceName(protocol, name, serviceInterface, version, null);
    }

    /**
     * 生成服务名称, 格式：/remoting/$protocol/$serviceName/$version.htm?$queryString
     * 
     * @param protocol 协议, 默认hessian
     * @param name 服务名称
     * @param serviceInterface 服务接口
     * @param version 版本, 默认1.0
     * @param queryString 查询参数
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
