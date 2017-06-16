<%@ page language="java" import="org.agnitas.beans.Mailing, org.agnitas.web.MailingWizardForm" contentType="text/html; charset=utf-8"  errorPage="/error.jsp" %>
<%@ page import="org.agnitas.web.MailingWizardAction" %>
<%@ taglib uri="/WEB-INF/agnitas-taglib.tld" prefix="agn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<agn:CheckLogon/>
<% MailingWizardForm aForm=null;
    aForm=(MailingWizardForm)session.getAttribute("mailingWizardForm");
    Mailing mailing=aForm.getMailing();
    request.setAttribute("mailing",mailing);
%>

<agn:Permission token="mailing.show"/>

<%
    // mailing navigation:
    request.setAttribute("sidemenu_active", new String("Mailings"));
    request.setAttribute("sidemenu_sub_active", new String("mailing.New_Mailing"));
    request.setAttribute("agnNavigationKey", new String("MailingNew"));
    request.setAttribute("agnHighlightKey", new String("mailing.New_Mailing"));
    request.setAttribute("agnTitleKey", new String("Mailing"));
    request.setAttribute("agnSubtitleKey", new String("Mailing"));
    request.setAttribute("agnSubtitleValue", mailing.getShortname());
    request.setAttribute("ACTION_TARGET", MailingWizardAction.ACTION_TARGET);
    request.setAttribute("ACTION_TARGET_FINISH",MailingWizardAction.ACTION_TARGET_FINISH);
    
%>
<c:set var="agnHelpKey" value="newMailingWizard" scope="request" />
