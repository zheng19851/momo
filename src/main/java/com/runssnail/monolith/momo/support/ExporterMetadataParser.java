package com.runssnail.monolith.momo.support;

import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * ������������Ԫ����
 * 
 * @author zhengwei
 *
 */
public interface ExporterMetadataParser {

    ExporterMetadata parse(Element element, ParserContext parserContext);
}
