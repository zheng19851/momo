package com.runssnail.monolith.momo.support;

/**
 * ����Ԫ����
 * 
 * @author zhengwei
 *
 */
public interface Metadata {

    /**
     * ����id
     * 
     * @return
     */
    String getId();

    /**
     * ����ӿ�
     * 
     * @return
     */
    String getServiceInterface();

    /**
     * ��������
     * 
     * @return
     */
    String getServiceName();

    /**
     * Э��
     * 
     * @return
     */
    String getProtocol();

    /**
     * ����汾
     * 
     * @return
     */
    String getVersion();

}
