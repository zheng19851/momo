package com.runssnail.monolith.momo.support.hessian;

import com.runssnail.monolith.momo.support.DefaultServiceMetadata;
import com.runssnail.monolith.momo.support.DefaultServiceMetadataParser;
import com.runssnail.monolith.momo.support.ServiceMetadataParser;

/**
 * hessian �ͻ���Ԫ���ݽ�����
 * 
 * @author zhengwei
 */
public class HessianServiceMetadataParser extends DefaultServiceMetadataParser {

    private static final HessianServiceMetadataParser INSTANCE = new HessianServiceMetadataParser();

    public static ServiceMetadataParser getInstance() {
        return INSTANCE;
    }

    @Override
    protected DefaultServiceMetadata createServiceMetadata() {
        return new HessianServiceMetadata();
    }

}
