package com.ann.app.view.helper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HtmlTopToolbar implements HtmlMenu, Serializable{

    

     private final List<MenuLink> links = new ArrayList<>();

    {
        links.add(new MenuLink("./home", "Home", MenuLinkStatus.ACTIVE));
        links.add(new MenuLink("./about", "About", MenuLinkStatus.NOT_ACTIVE));
        links.add(new MenuLink("./services", "Services", MenuLinkStatus.NOT_ACTIVE));
        links.add(new MenuLink("./addjob", "Add Job", MenuLinkStatus.NOT_ACTIVE));
        links.add(new MenuLink("./help", "Help Center", MenuLinkStatus.NOT_ACTIVE));
        links.add(new MenuLink("./logout", "Logout", MenuLinkStatus.NOT_ACTIVE));
    }

    @Override
    public String menu(int activeLinkIndex) {

        this.activateLink(activeLinkIndex);

        String menuBar = "<div class=\"topnav\">";

        for (MenuLink link : links)
            menuBar += "<a " + (link.getStatus() == MenuLinkStatus.ACTIVE? "class=\"active\"" : "")
                + " href=\"" + link.getUrl() + "\">" + link.getLabel() + "</a>";

        menuBar += "</div>";

        return menuBar;
    }

    private void activateLink(int linkIndex){
        for (int index = 0; index < links.size(); index++){
            if (index == linkIndex)
                links.get(index).setStatus(MenuLinkStatus.ACTIVE);
            else
                links.get(index).setStatus(MenuLinkStatus.NOT_ACTIVE);
        }

    }
    
}
