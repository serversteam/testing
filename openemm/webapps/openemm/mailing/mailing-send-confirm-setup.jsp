<%@ page language="java" import="org.agnitas.web.MailingSendForm" contentType="text/html; charset=utf-8" errorPage="/error.jsp" %>
<%@ taglib uri="/WEB-INF/agnitas-taglib.tld" prefix="agn" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<agn:CheckLogon/>

<agn:Permission token="mailing.send.show"/>

<% int tmpMailingID=0;
   String tmpShortname=new String("");
   MailingSendForm aForm=(MailingSendForm) request.getAttribute("mailingSendForm");

   if(aForm != null) {
      tmpMailingID=aForm.getMailingID();
      tmpShortname=aForm.getShortname();
   }
   request.setAttribute("tmpMailingID", tmpMailingID);
%>

<logic:equal name="mailingSendForm" property="isTemplate" value="true">
<% // template navigation:
  request.setAttribute("sidemenu_active", new String("Mailings"));
  request.setAttribute("sidemenu_sub_active", new String("none"));
  request.setAttribute("agnNavigationKey", new String("templateView"));
  request.setAttribute("agnHighlightKey", new String("mailing.Send_Mailing"));
  request.setAttribute("agnNavHrefAppend", new String("&mailingID="+tmpMailingID));
  request.setAttribute("agnTitleKey", new String("Template"));
  request.setAttribute("agnSubtitleKey", new String("Template"));
  request.setAttribute("agnSubtitleValue", tmpShortname);
%>
</logic:equal>

<logic:equal name="mailingSendForm" property="isTemplate" value="false">
<%
// mailing navigation:
    request.setAttribute("sidemenu_active", new String("Mailings"));
    request.setAttribute("sidemenu_sub_active", new String("none"));
    request.setAttribute("agnNavigationKey", new String("mailingView"));
    request.setAttribute("agnHighlightKey", new String("mailing.Send_Mailing"));
    request.setAttribute("agnNavHrefAppend", new String("&mailingID="+tmpMailingID));
    request.setAttribute("agnTitleKey", new String("Mailing"));
    request.setAttribute("agnSubtitleKey", new String("Mailing"));
    request.setAttribute("agnSubtitleValue", tmpShortname);
%>
</logic:equal>
<c:set var="agnHelpKey" value="sendMailing" scope="request" />
