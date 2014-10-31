package com.runssnail.monolith.momo.support;

/**
 * ���õ�Ԫ����
 * 
 * @author zhengwei
 */
public abstract class AbstractMetadata implements Metadata {

    /**
     * ����id
     */
    private String id;

    /**
     * ����ӿ�
     */
    private String serviceInterface;

    /**
     * Э��
     */
    private String protocol;

    /**
     * �汾
     */
    private String version;

    /**
     * ��������
     */
    private String serviceName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceInterface() {
        return serviceInterface;
    }

    public void setServiceInterface(String serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

}
