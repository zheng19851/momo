package com.runssnail.monolith.momo.support.hessian;

import com.runssnail.monolith.momo.support.DefaultExporterMetadata;
import com.runssnail.monolith.momo.support.DefaultExporterMetadataParser;

/**
 * hessian exporter Ԫ���ݽ�����
 * 
 * @author zhengwei
 */
public class HessianExporterMetadataParser extends DefaultExporterMetadataParser {

    private static final HessianExporterMetadataParser INSTANCE = new HessianExporterMetadataParser();

    @Override
    protected DefaultExporterMetadata createExporterMetadata() {
        return new HessianExporterMetadata();
    }

    public static HessianExporterMetadataParser getInstance() {
        return INSTANCE;
    }

}
