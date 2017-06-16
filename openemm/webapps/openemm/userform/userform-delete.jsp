<%@ page import="org.agnitas.web.UserFormEditForm"  errorPage="/error.jsp" %>
<%@ page import="org.agnitas.web.UserFormEditAction" %>
<%-- checked --%>
<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<%
    UserFormEditForm  aForm = (UserFormEditForm) request.getAttribute("userFormEditForm");
    int cancelAction = UserFormEditAction.ACTION_VIEW;
    if(aForm.getFromListPage()) {
        cancelAction = UserFormEditAction.ACTION_LIST;
    }
%>

<html:form action="/userform">
    <html:hidden property="formID"/>
    <html:hidden property="action"/>

    <div class="new_mailing_start_description">
        <bean:message
                key="Form"/>:&nbsp;${userFormEditForm.formName}<br>
        <bean:message
                key="settings.form.delete.question"/></div>
    <div class="remove_element_button_container">
        <div class="greybox_small_top"></div>
        <div class="greybox_small_content">
            <div class="new_mailing_step1_left_column">
                <input type="hidden" id="delete" name="delete" value=""/>

                <div class="big_button"><a href="#"
                                           onclick="document.getElementById('delete').value='true'; document.userFormEditForm.submit(); return false;"><span><bean:message
                        key="button.Delete"/></span></a></div>
            </div>
            <div class="new_mailing_step1_right_column">
                <div class="big_button"><a
                        href="<html:rewrite page='<%= new String ("/userform.do?action="+ cancelAction +"&formID=" + aForm.getFormID())%>'/>"><span><bean:message
                        key="button.Cancel"/></span></a></div>
            </div>
        </div>
        <div class="greybox_small_bottom"></div>
    </div>

</html:form>
