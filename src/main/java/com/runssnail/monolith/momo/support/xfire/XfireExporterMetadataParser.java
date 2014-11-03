package com.runssnail.monolith.momo.support.xfire;

import com.runssnail.monolith.momo.support.DefaultExporterMetadataParser;

/**
 * xfire服务发布元数据解析器
 * 
 * @author zhengwei
 */
public class XfireExporterMetadataParser extends DefaultExporterMetadataParser {

    private static final XfireExporterMetadataParser INSTANCE = new XfireExporterMetadataParser();

    public static final String                       WSDL_STR = "wsdl";

    @Override
    protected String getDefaultQueryString() {
        return XfireExporterMetadataParser.WSDL_STR;
    }

    public static XfireExporterMetadataParser getInstance() {
        return INSTANCE;
    }
}
