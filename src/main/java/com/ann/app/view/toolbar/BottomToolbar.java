package com.ann.app.view.toolbar;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

public class BottomToolbar implements Menu, Serializable{
    
    @Override
    public String menu(int activeLinkIndex) {
        return StringUtils.EMPTY;
    }
}
