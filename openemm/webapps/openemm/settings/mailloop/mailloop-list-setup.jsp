<%@ page import="org.agnitas.web.MailloopAction"  errorPage="/error.jsp" %>
<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ taglib uri="/WEB-INF/agnitas-taglib.tld" prefix="agn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<agn:CheckLogon/>

<agn:Permission token="mailing.show"/>

<% request.setAttribute("sidemenu_active", new String("Administration")); %>
<% request.setAttribute("sidemenu_sub_active", new String("settings.Mailloops"));  %>
<% request.setAttribute("agnNavigationKey", new String("Mailloops")); %>
<% request.setAttribute("agnHighlightKey", new String("default.Overview")); %>
<% request.setAttribute("agnTitleKey", new String("settings.Mailloops")); %>
<% request.setAttribute("agnSubtitleKey", new String("settings.Mailloops")); %>
<%request.setAttribute("ACTION_VIEW", MailloopAction.ACTION_VIEW);
request.setAttribute("ACTION_CONFIRM_DELETE" ,MailloopAction.ACTION_CONFIRM_DELETE);
request.setAttribute("ACTION_LIST",MailloopAction.ACTION_LIST);%>
<c:set var="agnHelpKey" value="bounceFilter" scope="request" />
