package com.runssnail.monolith.momo.support;

import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * �ͻ���Ԫ���ݽ�����
 * 
 * @author zhengwei
 *
 */
public interface ServiceMetadataParser {

    ServiceMetadata parse(Element element, ParserContext parserContext);
    
}
