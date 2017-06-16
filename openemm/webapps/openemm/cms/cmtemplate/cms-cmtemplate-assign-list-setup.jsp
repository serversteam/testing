<%@ page language="java" contentType="text/html; charset=utf-8" import="org.agnitas.cms.web.CMTemplateAction"  errorPage="/error.jsp" %>
<%@ page import="org.agnitas.web.MailingBaseAction" %>
<%@ taglib uri="/WEB-INF/agnitas-taglib.tld" prefix="agn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<agn:CheckLogon/>

<agn:Permission token="cms.central_content_management"/>

<c:set var="sidemenu_active" value="Mailings" scope="request" />
<c:set var="sidemenu_sub_active" value="ContentManagement" scope="request" />
<c:set var="agnTitleKey" value="ContentManagement" scope="request" />
<c:set var="agnSubtitleKey" value="cms.CMTemplates" scope="request" />
<c:set var="agnSubtitleValue" value="${cmTemplateForm.name}" scope="request" />
<c:set var="agnNavigationKey" value="ContentManagementSub" scope="request" />
<c:set var="agnHighlightKey" value="cms.CMTemplates" scope="request" />
<c:set var="agnNavHrefAppend" value="&cmTemplateId=${cmTemplateForm.cmTemplateId}" scope="request" />

<c:set var="ACTION_ASSIGN_LIST" value="<%= CMTemplateAction.ACTION_ASSIGN_LIST %>" scope="request" />
<c:set var="ACTION_VIEW_MAILING" value="<%= MailingBaseAction.ACTION_VIEW %>" scope="request" />
<c:set var="agnHelpKey" value="cmTemplateForMailing" scope="request" />