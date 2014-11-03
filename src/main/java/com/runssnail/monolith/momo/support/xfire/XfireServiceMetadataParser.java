package com.runssnail.monolith.momo.support.xfire;

import com.runssnail.monolith.momo.support.DefaultServiceMetadataParser;

/**
 * xfire�ͻ���Ԫ���ݽ�����
 * 
 * @author zhengwei
 */
public class XfireServiceMetadataParser extends DefaultServiceMetadataParser {

    private static final XfireServiceMetadataParser INSTANCE = new XfireServiceMetadataParser();

    @Override
    protected String getDefaultQueryString() {
        return XfireExporterMetadataParser.WSDL_STR;
    }

    public static XfireServiceMetadataParser getInstance() {
        return INSTANCE;
    }

}
