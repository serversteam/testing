<%-- checked --%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         import="org.agnitas.web.MailingBaseAction, org.agnitas.web.forms.MailingBaseForm"  errorPage="/error.jsp" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://ajaxanywhere.sourceforge.net/" prefix="aa" %>

<script>

    function go() {
        document.getElementsByName('mailingBaseForm')[0].submit();
    }

    ajaxAnywhere.getZonesToReload = function () {
        return "loading"
    };

    ajaxAnywhere.onAfterResponseProcessing = function () {
        if (! ${mailingBaseForm.error })
            window.setTimeout("go();", ${mailingBaseForm.refreshMillis});
    }
    ajaxAnywhere.showLoadingMessage = function() {
    };

    ajaxAnywhere.onAfterResponseProcessing();

</script>

<%
    MailingBaseForm mailingBaseForm = (MailingBaseForm) session.getAttribute("mailingBaseForm");
    mailingBaseForm.setAction(MailingBaseAction.ACTION_LIST);
%>
<aa:zone name="loading">

    <html:form action="/mailingbase">
        <html:hidden property="action"/>
        <html:hidden property="error"/>
        <html:hidden property="numberofRows" value="${mailingBaseForm.numberofRows}"/>
        <html:hidden property="numberOfRowsChanged" value="${mailingBaseForm.numberOfRowsChanged}"/>
        <div class="loading_container">
            <table border="0" cellspacing="0" cellpadding="0" width="400">

                <tr>
                    <td>
                        <b>&nbsp;<b>
                    </td>
                </tr>
                <tr>
                    <td>
                        <logic:equal value="false" name="mailingBaseForm" property="error">
                            <img border="0" width="44" height="48"
                                 src="${emmLayoutBase.imagesURL}/wait.gif"/>
                        </logic:equal>
                        <logic:equal value="true" name="mailingBaseForm" property="error">
                            <img border="0" width="29" height="30"
                                 src="${emmLayoutBase.imagesURL}/warning.gif"/>
                        </logic:equal>
                    </td>
                </tr>
                <tr>
                    <td>
                        <b>&nbsp;<b>
                    </td>
                </tr>
                <tr>
                    <td>
                        <b>
                            <logic:equal value="false" name="mailingBaseForm" property="error">
                                <bean:message key="default.loading"/>
                            </logic:equal>
                            <logic:equal value="true" name="mailingBaseForm" property="error">
                                <bean:message key="default.loading.stopped"/>
                            </logic:equal>

                            <b>
                    </td>
                </tr>
                <tr>
                    <td>
                        <b>&nbsp;<b>
                    </td>
                </tr>

            </table>
        </div>

    </html:form>
</aa:zone>
