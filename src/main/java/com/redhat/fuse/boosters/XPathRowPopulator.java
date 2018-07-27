package com.redhat.fuse.boosters;

import org.apache.camel.Exchange;
import org.apache.camel.language.XPath;

public class XPathRowPopulator {

    public void process(@XPath("item/id") String id, @XPath("item/name") String name, Exchange exchange)
            throws Exception {
        exchange.getIn().setHeader("id", id);
        exchange.getIn().setHeader("name", name);
    }
}