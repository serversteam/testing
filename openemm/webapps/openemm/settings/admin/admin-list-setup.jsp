<%@ page language="java" contentType="text/html; charset=utf-8" import="org.agnitas.web.AdminAction" errorPage="/error.jsp"%>
<%@ taglib uri="/WEB-INF/agnitas-taglib.tld" prefix="agn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<agn:CheckLogon/>

<agn:Permission token="admin.show"/>

<% request.setAttribute("sidemenu_active", new String("Administration")); %>          <!-- links Button -->
<% request.setAttribute("sidemenu_sub_active", new String("settings.Admins")); %>  <!-- links unter Button -->
<% request.setAttribute("agnTitleKey", new String("settings.Admins")); %>          <!-- Titelleiste -->
<% request.setAttribute("agnSubtitleKey", new String("settings.Admins")); %>       <!-- ueber rechte Seite -->
<% request.setAttribute("agnNavigationKey", new String("admins")); %>         <!-- welche Reiterleiste -->
<% request.setAttribute("agnHighlightKey", new String("default.Overview")); %>          <!-- welcher Reiter -->
<% request.setAttribute("ACTION_VIEW", AdminAction.ACTION_VIEW); %>
<%request.setAttribute("ACTION_VIEW", AdminAction.ACTION_VIEW);
request.setAttribute("ACTION_CONFIRM_DELETE" ,AdminAction.ACTION_CONFIRM_DELETE);
request.setAttribute("ACTION_LIST", AdminAction.ACTION_LIST);%>
<c:set var="agnHelpKey" value="newUser" scope="request" />
