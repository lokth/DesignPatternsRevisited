package com.thisistime.designpatterns.factory;

public class ResponseXMLDisplayService extends DisplayService {

    @Override
    public XMLParser getParser() {
        return new ResponseXMLParser();
    }

}
