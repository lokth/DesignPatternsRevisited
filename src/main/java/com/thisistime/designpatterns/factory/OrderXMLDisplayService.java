package com.thisistime.designpatterns.factory;

import com.thisistime.designpatterns.factory.DisplayService;

public class OrderXMLDisplayService extends DisplayService {

    @Override
    public XMLParser getParser() {
        return new OrderXMLParser();
    }

}
