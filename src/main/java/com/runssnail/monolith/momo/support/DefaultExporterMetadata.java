package com.runssnail.monolith.momo.support;

/**
 * ���񷢲���Ԫ��������
 * 
 * @author zhengwei
 */
public class DefaultExporterMetadata extends AbstractMetadata implements ExporterMetadata {

    /**
     * ��������
     */
    private String serviceRef;

    private String name;

    public String getServiceRef() {
        return serviceRef;
    }

    public void setServiceRef(String serviceRef) {
        this.serviceRef = serviceRef;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
