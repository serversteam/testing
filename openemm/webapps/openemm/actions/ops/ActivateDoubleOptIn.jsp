<%--
/*********************************************************************************
 * The contents of this file are subject to the Common Public Attribution
 * License Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.openemm.org/cpal1.html. The License is based on the Mozilla
 * Public License Version 1.1 but Sections 14 and 15 have been added to cover
 * use of software over a computer network and provide for limited attribution
 * for the Original Developer. In addition, Exhibit A has been modified to be
 * consistent with Exhibit B.
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for
 * the specific language governing rights and limitations under the License.
 * 
 * The Original Code is OpenEMM.
 * The Original Developer is the Initial Developer.
 * The Initial Developer of the Original Code is AGNITAS AG. All portions of
 * the code written by AGNITAS AG are Copyright (c) 2007 AGNITAS AG. All Rights
 * Reserved.
 * 
 * Contributor(s): AGNITAS AG. 
 ********************************************************************************/
 --%><%@ page language="java" import="org.agnitas.util.*, org.agnitas.web.*, java.util.*" contentType="text/html; charset=utf-8"  errorPage="/error.jsp" %>
<%@ taglib uri="/WEB-INF/agnitas-taglib.tld" prefix="agn" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<% int index=((Integer)request.getAttribute("opIndex")).intValue(); %>
<agn:ShowByPermission token="actions.change">

<div id="show-comments-check-holder" style="display: inline; margin-top: 10px;">
	<div class="filterbox_checkbox_item">
	    <html:hidden property='<%= new String("__STRUTS_CHECKBOX_actions["+index+"].forAllLists") %>' value="off" />
	    <html:checkbox styleId='<%="useTrack_id_"+index%>' property='<%= new String("actions["+index+"].forAllLists") %>' />
	    <label for="show-comments-check"><bean:message key="action.op.ActivateDOI.mailinglists"/></label>
	</div>
</div>

<div class="action_button no_margin_right no_margin_bottom">
    <a href="<html:rewrite page='<%= new String("/action.do?action=" + EmmActionAction.ACTION_SAVE + "&deleteModule=" + index) %>'/>"><span><bean:message key="button.Delete"/></span></a>
</div>
</agn:ShowByPermission>