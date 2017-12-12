package com.thisistime.designpatterns.factory;

import com.thisistime.designpatterns.factory.DisplayService;
import com.thisistime.designpatterns.factory.FeedbackXML;

public class FeedbackXMLDisplayService extends DisplayService {

    @Override
    public XMLParser getParser() {
        return new FeedbackXML();
    }

}