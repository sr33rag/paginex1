<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/dtd/strict.dtd"><%@page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%><%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
 <head>
  <meta http-equiv="Content-Type" content="text/html;charset=UTF-8"/>
  <title><fmt:message key="page.srchstudents.title"/></title><c:url var="cssurl" scope="application" value="/css/style2.css" context="${pageContext.request.contextPath}"/>
  <link rel="stylesheet" type="text/css" href="${cssurl}"/>
 </head>
 <body>
  <div id="container">
   <div id="header">
    <h1>Pagination Example</h1>
   </div>
   <div id="content"><c:url var="srchsubmturl" value="lststudents" context="${pageContext.request.contextPath}" scope="application"/>
      <form id="frmsearch" name="frmsearch" method="post" action="${srchsubmturl}">
       <label for="sid"><fmt:message key="form.srchstudents.sid.label"/></label> <input type="text" name="sid" id="sid" value="${form.sid}"/> &nbsp;
       <label for="sname"><fmt:message key="form.srchstudents.sname.label"/></label> <input type="text" name="sname" id="sname" value="${form.sname}"/> &nbsp;
       <label for="dob"><fmt:message key="form.srchstudents.dob.label"/></label> <input type="text" name="dob" id="dob" value="${form.dob}"/> &nbsp;
       <label for="category"><fmt:message key="form.srchstudents.category.label"/></label>
       <select id="category" name="category">
        <option value="-1"><fmt:message key="form.srchstudents.cats.default.text"/></option>
        <option value="gen"><fmt:message key="form.srchstudents.cats.gen.text"/></option>
        <option value="sc"><fmt:message key="form.srchstudents.cats.sc.text"/></option>
        <option value="st"><fmt:message key="form.srchstudents.cats.st.text"/></option>
        <option value="obc"><fmt:message key="form.srchstudents.cats.obc.text"/></option>
       </select> &nbsp;
       <label for=""><fmt:message key="form.srchstudents.rexpp.label"/></label>
       <select id="rexpp" name="rexpp">
        <!--option value=""></option-->
       </select>
      </form> 
   </div><c:url var="homeurl" value="/home" scope="application" context="${pageContext.request.contextPath}"/>
   <div id="sidebar"><a href="${homeurl}"><fmt:message key="page.lststudents.link.home"/></a></div>
   <div id="footer">Copyright @copy; Codesree (Sreerag S)</div>
  </div>
 </body>
</html>