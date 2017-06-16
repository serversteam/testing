<%@ page import="org.agnitas.web.MailinglistForm"  errorPage="/error.jsp" %>
<%@ page import="org.agnitas.web.MailinglistAction" %>
<%-- checked --%>
<%@ page language="java"  contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form action="/mailinglist">
    <html:hidden property="mailinglistID"/>
    <html:hidden property="action"/>
    <html:hidden property="shortname"/>
    <html:hidden property="description"/>

    <div class="new_mailing_start_description"><bean:message
            key="Mailinglist"/>:&nbsp;${mailinglistForm.shortname}<br><bean:message
            key="settings.mailinglist.delete.question"/></div>
    <div class="remove_element_button_container">
        <div class="greybox_small_top"></div>
        <div class="greybox_small_content">
            <div class="new_mailing_step1_left_column">
                <input type="hidden" id="kill" name="kill" value=""/>

                <div class="big_button"><a href="#"
                                           onclick="document.getElementById('kill').value='true'; document.mailinglistForm.submit(); return false;"><span><bean:message
                        key="button.Delete"/></span></a></div>
            </div>
            <div class="new_mailing_step1_right_column">
                <div class="big_button"><a
                        href="<html:rewrite page="/mailinglist.do?action=${mailinglistForm.previousAction}&mailinglistID=${mailinglistForm.mailinglistID}"/>"><span><bean:message
                        key="button.Cancel"/></span></a></div>
            </div>
        </div>
        <div class="greybox_small_bottom"></div>
    </div>


</html:form>
