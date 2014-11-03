package com.runssnail.monolith.momo.support;

import com.runssnail.monolith.momo.support.hessian.HessianServiceMetadataParser;
import com.runssnail.monolith.momo.support.xfire.XfireServiceMetadataParser;

public class ServiceMetadataParserFactory {

    public static ServiceMetadataParser getServiceMetadataParser(String protocol) {
        ServiceMetadataParser parser = null;
        if (EnumProtocol.isHessian(protocol)) {
            parser = HessianServiceMetadataParser.getInstance();
        } else if (EnumProtocol.isHttpInvoker(protocol)) {
            parser = DefaultServiceMetadataParser.getInstance();
        } else if (EnumProtocol.isXfire(protocol)) {
            parser = XfireServiceMetadataParser.getInstance();
        } else {
            throw new RuntimeException("can not find 'ServiceMetadataParser', protocol=" + protocol);
        }

        return parser;
    }

}
