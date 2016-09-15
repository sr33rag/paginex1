package net.codesree.paginex1.api.controller;

import java.util.Map;
import java.util.HashMap;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.codesree.paginex1.api.action.IAction;

public abstract class AbstractController extends HttpServlet {

  protected Map<String,Class<? extends IAction>> actionMap=null;

  public void init() {
    this.actionMap=new HashMap<>();
    configure();
  }

  public abstract void configure() throws Exception;  
  public abstract IAction getCommandAction(HttpServletRequest _req) throws Exception;
  
  public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
    try {
      String url=getCommandAction(req).execute(req,res);
    } catch(Exception ex) {
    }
  }

  public void destroy() {}  

}