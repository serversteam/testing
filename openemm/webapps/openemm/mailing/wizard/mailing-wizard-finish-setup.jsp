<%@ page language="java" import="org.agnitas.web.MailingWizardForm" contentType="text/html; charset=utf-8"  errorPage="/error.jsp" %>
<%@ page import="org.agnitas.web.MailingWizardAction" %>
<%@ page import="org.agnitas.web.MailingBaseAction" %>
<%@ taglib uri="/WEB-INF/agnitas-taglib.tld" prefix="agn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<agn:CheckLogon/>
<% 	Integer tmpMailingID=0;
   	MailingWizardForm aForm=null;
    // String permToken=null; wird nicht benutzt
	String permToken=null;
   
   String tmpShortname=new String("");
   if((aForm=(MailingWizardForm)session.getAttribute("mailingWizardForm"))!=null) {
       tmpMailingID=aForm.getMailing().getId();
       tmpShortname=aForm.getMailing().getShortname();
	}
    request.setAttribute("tmpMailingID",tmpMailingID);
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
    request.setAttribute("agnSubtitleValue", tmpShortname);
    request.setAttribute("ACTION_FINISH", MailingBaseAction.ACTION_VIEW);
%>
<c:set var="agnHelpKey" value="newMailingWizard" scope="request" />
