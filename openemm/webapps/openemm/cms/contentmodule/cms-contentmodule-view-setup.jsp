<%@ page language="java" contentType="text/html; charset=utf-8"  errorPage="/error.jsp" %>
<%@ page import="org.agnitas.cms.web.forms.ContentModuleForm" %>
<%@ taglib uri="/WEB-INF/agnitas-taglib.tld" prefix="agn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<agn:Permission token="cms.central_content_management"/>

<% ContentModuleForm aForm = (ContentModuleForm) session.getAttribute("contentModuleForm"); %>

<% request.setAttribute("sidemenu_active", "Mailings"); %>
<% request.setAttribute("sidemenu_sub_active", "ContentManagement"); %>
<% request.setAttribute("agnTitleKey", "ContentManagement"); %>
<% request.setAttribute("agnSubtitleKey", "cms.ContentModules"); %>
<%
    if (aForm.getContentModuleId() > 0) {
        request.setAttribute("agnNavigationKey", "ContentManagementSub");
    } else {
        request.setAttribute("agnNavigationKey", "ContentManagementSub");
    }%>
<% request.setAttribute("agnHighlightKey", "cms.ContentModules"); %>
<% request.setAttribute("agnNavHrefAppend", "&contentModuleId=" + aForm.getContentModuleId()); %>
<c:set var="agnHelpKey" value="cmContentModuleView" scope="request" />
<c:set var="agnSubtitleValue" value="${contentModuleForm.name}" scope="request" />

<script type="text/javascript" src="<%= request.getContextPath() %>/js/lib/cms/cmPreviewResize.js">
</script>
