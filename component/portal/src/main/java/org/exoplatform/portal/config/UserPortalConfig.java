package org.exoplatform.portal.config;

import java.util.ArrayList;
import java.util.List;

import org.exoplatform.portal.config.model.PageNavigation;
import org.exoplatform.portal.config.model.PortalConfig;
import org.exoplatform.portal.config.model.Widgets;

public class UserPortalConfig {
  
  private PortalConfig  portal ;
  
  private List<PageNavigation> navigations ;
  
  private Widgets widgets;
  
  public UserPortalConfig(){
    
  }
  
  public UserPortalConfig(PortalConfig portal, List<PageNavigation> navigations, Widgets widgets){
    this.portal = portal;
    this.navigations = navigations;
    this.widgets = widgets;
  }
  
  public PortalConfig getPortalConfig() { return portal ; }
  public void   setPortal(PortalConfig portal) {  this.portal =  portal ; }
  
  public void  setNavigations(List<PageNavigation> navs) { navigations = navs ; }
  public List<PageNavigation>  getNavigations()  { return navigations ; }
  
  public void addNavigation(PageNavigation nav) {
    if(navigations == null) navigations = new ArrayList<PageNavigation>() ;
    if(nav == null) return;
    navigations.add(nav) ;
  }

  public Widgets getWidgets() { return widgets; }
  public void setWidgets(Widgets widgets) { this.widgets = widgets; }
    
}