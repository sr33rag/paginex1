<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/dtd/strict.dtd"><%@page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%><%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
 <head>
  <meta http-equiv="Content-Type" content="text/html;charset=UTF-8"/>
  <title><fmt:message key="page.lststudents.title"/></title><c:url var="cssurl" scope="application" value="/css/style2.css" context="${pageContext.request.contextPath}"/>
  <link rel="stylesheet" type="text/css" href="${cssurl}"/>
 </head>
 <body>
  <div id="container">
   <div id="header">
    <h1>Pagination Example</h1>
   </div>
   <div id="content">
      <c:forEach >
      </c:forEach> 
   </div><c:url var="homeurl" value="/home" scope="application" context="${pageContext.request.contextPath}"/>
   <div id="sidebar"><a href="${homeurl}"><fmt:message key="page.lststudents.link.home"/></a></div>
   <div id="footer">Copyright @copy; Codesree (Sreerag S)</div>
  </div>
 </body>
</html>