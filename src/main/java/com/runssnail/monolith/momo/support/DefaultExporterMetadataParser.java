package com.runssnail.monolith.momo.support;

import java.util.List;

import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

/**
 * Ĭ�Ϸ���˵�Ԫ���ݽ�����
 * 
 * @author zhengwei
 */
public class DefaultExporterMetadataParser extends AbstractExporterMetadataParser {

    private static final DefaultExporterMetadataParser INSTANCE = new DefaultExporterMetadataParser();

    @Override
    public ExporterMetadata parse(Element element, ParserContext parserContext) {

        List<Element> childElts = DomUtils.getChildElements(element);

        String serviceName = getServiceName(parserContext, childElts);

        String serviceRef = element.getAttribute("serviceRef");

        String serviceInterface = element.getAttribute("serviceInterface");

        String id = element.getAttribute("id");

        String protocol = element.getAttribute("protocol");
        String version = element.getAttribute("version");

        // ���������
        String name = element.getAttribute("name");

        if (!StringUtils.hasText(serviceName)) {
            String queryString = element.getAttribute("queryString");
            if (!StringUtils.hasText(queryString)) {
                queryString = getDefaultQueryString();
            }
            serviceName = buildServiceName(protocol, name, serviceInterface, version, queryString);
        }

        DefaultExporterMetadata metadata = createExporterMetadata();

        metadata.setId(id);
        metadata.setProtocol(protocol);
        metadata.setServiceInterface(serviceInterface);
        metadata.setServiceName(serviceName);
        metadata.setServiceRef(serviceRef);
        metadata.setVersion(version);
        metadata.setName(name);

        return metadata;
    }

    /**
     * ��ѯ����Ĭ��Ϊ��
     * 
     * @return
     */
    protected String getDefaultQueryString() {
        return null;
    }

    protected DefaultExporterMetadata createExporterMetadata() {
        return new DefaultExporterMetadata();
    }

    public static ExporterMetadataParser getInstance() {
        return INSTANCE;
    }

}
