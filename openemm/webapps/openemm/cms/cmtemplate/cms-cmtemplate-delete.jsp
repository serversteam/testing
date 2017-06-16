<%@ page language="java" contentType="text/html; charset=utf-8"  errorPage="/error.jsp" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<html:form action="/cms_cmtemplate.do">
    <html:hidden property="cmTemplateId"/>
    <html:hidden property="action"/>

    <div class="new_mailing_start_description"><bean:message
            key="cms.CMTemplate"/>:&nbsp;${cmTemplateForm.name}<br>
            <bean:message key="DeleteCMTemplateQuestion" bundle="cmsbundle"/>
    </div>
    <div class="remove_element_button_container">
        <div class="greybox_small_top"></div>
        <div class="greybox_small_content">
            <div class="new_mailing_step1_left_column">
                <input type="hidden" id="kill" name="kill" value=""/>

                <div class="big_button"><a href="#"
                                           onclick="document.getElementById('kill').value='true'; document.cmTemplateForm.submit(); return false;"><span><bean:message
                        key="button.Delete"/></span></a></div>
            </div>
            <div class="new_mailing_step1_right_column">
                <div class="big_button"><a
                        href="<html:rewrite page="/cms_cmtemplate.do?action=${cancelAction}&cmTemplateId=${cmTemplateForm.cmTemplateId}"/>"><span><bean:message
                        key="button.Cancel"/></span></a></div>
            </div>
        </div>
        <div class="greybox_small_bottom"></div>
    </div>

</html:form>
