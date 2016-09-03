package net.codesree.paginex1.api.action;

import java.io.Serializable;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IAction extends Serializable {
  public String execute(HttpServletRequest _req,HttpServletResponse _res)
    throws IOException, ServletException;
}