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
 --%>
 
 
 <%--
 
 
 ********************************************************************************
 	IMPORTANT NOTE
 ********************************************************************************
 
 
 
Your message / error message is not shown?

DO NOT POKE AROUND IN THIS FILE!!

First check, that your message / error message is in the right property!
To few your message at the classic location (near top of page), add your message or error message by

errors.add( ActionMessages.GLOBAL_MESSAGE, ...)
or
errors.add( ActionErrors.GLOBAL_MESSAGE, ...)

Using any other keys only makes sense with an additional <html:message property="..." /> tag at the form element where you
want to show your message / error message!
 
 






 
  --%>
 
 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<logic:messagesPresent property="org.apache.struts.action.GLOBAL_MESSAGE" message="true">
	<div class="statusbox_containter top_10">
		<div class="statusbox_top"></div>
		<div class="statusbox_content">
            <div class="status_ok">
				<html:messages id="msg" property="org.apache.struts.action.GLOBAL_MESSAGE" message="true" >
					${msg}<br />
				</html:messages>
            </div>
		</div>
		<div class="statusbox_bottom"></div>
	</div>
</logic:messagesPresent>

<logic:messagesPresent property="de.agnitas.GLOBAL_WARNING" message="true">
	<div class="statusbox_containter top_10">
		<div class="statusbox_top"></div>
		<div class="statusbox_content">
            <div class="status_warning">
				<html:messages id="msg" property="de.agnitas.GLOBAL_WARNING" message="true" >
					${msg}<br />
				</html:messages>
            </div>
		</div>
		<div class="statusbox_bottom"></div>
	</div>
</logic:messagesPresent>

<logic:messagesPresent property="org.apache.struts.action.GLOBAL_MESSAGE" message="false">
	<div class="statusbox_containter top_10">
		<div class="statusbox_top"></div>
		<div class="statusbox_content">
		 	<div class="status_error">
				<html:messages id="msg" property="org.apache.struts.action.GLOBAL_MESSAGE" message="false">
					${msg}<br />
				</html:messages>
		 	</div>
		 	<c:if test="${not empty errorReport }">
				<display:table name="errorReport" id="reportRow" class="errorTable" >
				<display:column  headerClass="head_name" class="name"  sortable="false" titleKey="mailing.tag">
				 <c:choose>
				 	<c:when test="${not empty reportRow[1] }">
						${reportRow[1]}
					</c:when>
					<c:otherwise>
					   ${reportRow[2]}
					</c:otherwise>	
				</c:choose>
				</display:column>
				</display:table>
			</c:if>
		</div>
		<div class="statusbox_bottom"></div>
	</div>
</logic:messagesPresent>
 