/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.24
 * Generated at: 2015-08-17 11:00:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ckeditor_002d3_6_3.plugins.emm.dialogs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.agnitas.dao.MailingDao;
import org.agnitas.dao.TitleDao;
import org.agnitas.util.AgnUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import java.util.List;
import java.util.Map;

public final class emm_002dtags_002ddialog_002dcontent_002dframe_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("/WEB-INF/lib/struts-taglib-1.3.8.jar", Long.valueOf(1437749471000L));
    _jspx_dependants.put("/WEB-INF/lib/jakarta-standard-1.1.2.jar", Long.valueOf(1437749470000L));
    _jspx_dependants.put("jar:file:/home/openemm/webapps/openemm/WEB-INF/lib/jakarta-standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098711090000L));
    _jspx_dependants.put("/WEB-INF/agnitas-taglib.tld", Long.valueOf(1437749468000L));
    _jspx_dependants.put("jar:file:/home/openemm/webapps/openemm/WEB-INF/lib/struts-taglib-1.3.8.jar!/META-INF/tld/struts-logic.tld", Long.valueOf(1172915892000L));
    _jspx_dependants.put("jar:file:/home/openemm/webapps/openemm/WEB-INF/lib/struts-taglib-1.3.8.jar!/META-INF/tld/struts-html.tld", Long.valueOf(1172915892000L));
    _jspx_dependants.put("jar:file:/home/openemm/webapps/openemm/WEB-INF/lib/struts-taglib-1.3.8.jar!/META-INF/tld/struts-bean.tld", Long.valueOf(1172915892000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.agnitas.util.AgnUtils");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("org.springframework.web.context.support.WebApplicationContextUtils");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("org.agnitas.dao.TitleDao");
    _jspx_imports_classes.add("org.springframework.context.ApplicationContext");
    _jspx_imports_classes.add("org.agnitas.dao.MailingDao");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fagn_005fCheckLogon_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fagn_005fShowColumnInfo_0026_005fid;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fagn_005fCheckLogon_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fagn_005fShowColumnInfo_0026_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fagn_005fCheckLogon_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fagn_005fShowColumnInfo_0026_005fid.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"/error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_agn_005fCheckLogon_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("\t\t<meta content=\"noindex, nofollow\" name=\"robots\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    function getResultValue() {\r\n");
      out.write("        return buildTagParameters(document.getElementById('tagsel').value);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function hideAll() {\r\n");
      out.write("        document.getElementById('param1').style.visibility = 'hidden';\r\n");
      out.write("        document.getElementById('param2').style.visibility = 'hidden';\r\n");
      out.write("        document.getElementById('param3').style.visibility = 'hidden';\r\n");
      out.write("\r\n");
      out.write("        document.getElementById('paramlabel1').style.visibility = 'hidden';\r\n");
      out.write("        document.getElementById('paramlabel2').style.visibility = 'hidden';\r\n");
      out.write("        document.getElementById('paramlabel3').style.visibility = 'hidden';\r\n");
      out.write("\r\n");
      out.write("        document.getElementById('columns').style.visibility = 'hidden';\r\n");
      out.write("        document.getElementById('types').style.visibility = 'hidden';\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function updateTagParameters(input) {\r\n");
      out.write("        hideAll();\r\n");
      out.write("        var parameters = getTagParameters(input);\r\n");
      out.write("        if (parameters) {\r\n");
      out.write("            for (i = 0; i < parameters.length; ++i) {\r\n");
      out.write("                var parname = 'param' + (i + 1);\r\n");
      out.write("                var parlabel = 'paramlabel' + (i + 1);\r\n");
      out.write("                if (parameters[i] == 'column') {\r\n");
      out.write("                    document.getElementById('columns').style.visibility = 'visible';\r\n");
      out.write("                } else {\r\n");
      out.write("                    if (parameters[i] == 'type') {\r\n");
      out.write("                        document.getElementById('types').style.visibility = 'visible';\r\n");
      out.write("                    } else {\r\n");
      out.write("                        document.getElementById(parname).style.visibility = 'visible';\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                document.getElementById(parlabel).firstChild.data = parameters[i] + \":\";\r\n");
      out.write("                document.getElementById(parlabel).style.visibility = 'visible';\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        return true;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function buildTagParameters(input) {\r\n");
      out.write("        var parameters = getTagParameters(input);\r\n");
      out.write("        var params = '';\r\n");
      out.write("        if (parameters) {\r\n");
      out.write("            for (i = 0; i < parameters.length; ++i) {\r\n");
      out.write("                var parname = 'par' + (i + 1);\r\n");
      out.write("                if (parameters[i] == 'column') {\r\n");
      out.write("                    parname = 'colsel';\r\n");
      out.write("                }\r\n");
      out.write("                if (parameters[i] == 'type') {\r\n");
      out.write("                    parname = 'typesel';\r\n");
      out.write("                }\r\n");
      out.write("                var parvalue = document.getElementById(parname).value;\r\n");
      out.write("                params = params + \" \" + parameters[i] + '=\"' + parvalue + '\"';\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        return '[' + document.getElementById('tagsel').options[document.getElementById('tagsel').selectedIndex].text + params + ']';\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function getTagParameters(input) {\r\n");
      out.write("        var parameters = input.match(/\\{[^}]*\\}/g);\r\n");
      out.write("        if (parameters) {\r\n");
      out.write("            for (i = 0; i < parameters.length; ++i) {\r\n");
      out.write("                parameters[i] = parameters[i].substr(1, parameters[i].length - 2);\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        return parameters;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("    body {\r\n");
      out.write("        background:  transparent;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    body * {\r\n");
      out.write("        font-family: Tahoma, sans-serif;\r\n");
      out.write("        font-size: 11px;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");

    ApplicationContext aContext = WebApplicationContextUtils.getWebApplicationContext(application);
    MailingDao mailingDao = (MailingDao) aContext.getBean("MailingDao");
    TitleDao titleDao = (TitleDao) aContext.getBean("TitleDao");
    List<org.agnitas.beans.Title> titles = titleDao.getTitles(AgnUtils.getCompanyID(request));
    pageContext.setAttribute("titles",titles);
    List<Map<String, String>> tags = mailingDao.getTags(AgnUtils.getCompanyID(request));
    pageContext.setAttribute("tags",tags);

      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<table cellSpacing=\"3\" cellPadding=\"2\" width=\"100%\" border=\"0\">\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td noWrap><label for=\"tagsel\">");
      if (_jspx_meth_bean_005fmessage_005f0(_jspx_page_context))
        return;
      out.write(":</label>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td width=\"100%\">\r\n");
      out.write("            <select name=\"tagsel\" id=\"tagsel\"\r\n");
      out.write("                    onchange=\"updateTagParameters(document.getElementById('tagsel').value)\" size=\"1\" style=\"width:180px\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </select>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td vAlign=\"top\" nowrap>\r\n");
      out.write("            <div id=\"paramlabel1\" style=\"position:relative; top:0; left:0; visibility:hidden\">\r\n");
      out.write("                Parameter 1:\r\n");
      out.write("            </div>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td vAlign=\"top\">\r\n");
      out.write("            <div id=\"cntnr\" style=\"position:relative; top:0; left:0\">\r\n");
      out.write("                <div id=\"param1\" style=\"position:absolute; top:0; left:0; visibility:hidden\">\r\n");
      out.write("                    <input type=\"text\" id=\"par1\" name=\"par1\" size=\"25\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"columns\" style=\"position:absolute; top:0; left:0; visibility:hidden\">\r\n");
      out.write("                    <select id=\"colsel\" class=\"tags_dialog_select\" name=\"colsel\" size=\"1\" style=\"width:180px\">\r\n");
      out.write("                        ");
      //  agn:ShowColumnInfo
      org.agnitas.taglib.ShowColumnInfoTag _jspx_th_agn_005fShowColumnInfo_005f0 = (org.agnitas.taglib.ShowColumnInfoTag) _005fjspx_005ftagPool_005fagn_005fShowColumnInfo_0026_005fid.get(org.agnitas.taglib.ShowColumnInfoTag.class);
      _jspx_th_agn_005fShowColumnInfo_005f0.setPageContext(_jspx_page_context);
      _jspx_th_agn_005fShowColumnInfo_005f0.setParent(null);
      // /ckeditor-3.6.3/plugins/emm/dialogs/emm-tags-dialog-content-frame.jsp(148,24) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_agn_005fShowColumnInfo_005f0.setId("colsel");
      int _jspx_eval_agn_005fShowColumnInfo_005f0 = _jspx_th_agn_005fShowColumnInfo_005f0.doStartTag();
      if (_jspx_eval_agn_005fShowColumnInfo_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_agn_005fShowColumnInfo_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_agn_005fShowColumnInfo_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_agn_005fShowColumnInfo_005f0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("                            <option value='");
          out.print( pageContext.getAttribute("_colsel_column_name") );
          out.write('\'');
          out.write('>');
          out.print( pageContext.getAttribute("_colsel_shortname") );
          out.write("\r\n");
          out.write("                            </option>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_agn_005fShowColumnInfo_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_agn_005fShowColumnInfo_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_agn_005fShowColumnInfo_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fagn_005fShowColumnInfo_0026_005fid.reuse(_jspx_th_agn_005fShowColumnInfo_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fagn_005fShowColumnInfo_0026_005fid.reuse(_jspx_th_agn_005fShowColumnInfo_005f0);
      out.write("\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"types\" style=\"position:absolute; top:0; left:0; visibility:hidden\">\r\n");
      out.write("                    <select id=\"typesel\" class=\"tags_dialog_select\" name=\"typesel\" size=\"1\" style=\"width:180px\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td vAlign=\"top\" nowrap>\r\n");
      out.write("            <div id=\"paramlabel2\" style=\"position:relative; top:0; left:0; visibility:hidden\">\r\n");
      out.write("                Parameter 2:\r\n");
      out.write("            </div>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td vAlign=\"top\">\r\n");
      out.write("            <div id=\"param2\" style=\"position:relative; top:0; left:0; visibility:hidden\">\r\n");
      out.write("                <input type=\"text\" id=\"par2\" name=\"par2\" size=\"25\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td vAlign=\"top\" nowrap>\r\n");
      out.write("            <div id=\"paramlabel3\" style=\"position:relative; top:0; left:0; visibility:hidden\">\r\n");
      out.write("                Parameter 3:\r\n");
      out.write("            </div>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td vAlign=\"top\">\r\n");
      out.write("            <div id=\"param3\" style=\"position:relative; top:0; left:0; visibility:hidden\">\r\n");
      out.write("                <input type=\"text\" id=\"par3\" name=\"par3\" size=\"25\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td vAlign=\"top\" nowrap>\r\n");
      out.write("            <div id=\"paramlabel4\" style=\"position:relative; top:0; left:0; visibility:hidden\">\r\n");
      out.write("                Parameter 4:\r\n");
      out.write("            </div>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td vAlign=\"top\">\r\n");
      out.write("            <div id=\"param4\" style=\"position:relative; top:0; left:0; visibility:hidden\">\r\n");
      out.write("                <input type=\"text\" id=\"par4\" name=\"par4\" size=\"25\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    updateTagParameters(document.getElementById('tagsel').value);\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_agn_005fCheckLogon_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  agn:CheckLogon
    org.agnitas.taglib.CheckLogonTag _jspx_th_agn_005fCheckLogon_005f0 = (org.agnitas.taglib.CheckLogonTag) _005fjspx_005ftagPool_005fagn_005fCheckLogon_005fnobody.get(org.agnitas.taglib.CheckLogonTag.class);
    _jspx_th_agn_005fCheckLogon_005f0.setPageContext(_jspx_page_context);
    _jspx_th_agn_005fCheckLogon_005f0.setParent(null);
    int _jspx_eval_agn_005fCheckLogon_005f0 = _jspx_th_agn_005fCheckLogon_005f0.doStartTag();
    if (_jspx_th_agn_005fCheckLogon_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fagn_005fCheckLogon_005fnobody.reuse(_jspx_th_agn_005fCheckLogon_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fagn_005fCheckLogon_005fnobody.reuse(_jspx_th_agn_005fCheckLogon_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fmessage_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f0 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f0.setParent(null);
    // /ckeditor-3.6.3/plugins/emm/dialogs/emm-tags-dialog-content-frame.jsp(122,39) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bean_005fmessage_005f0.setKey("htmled.tag");
    int _jspx_eval_bean_005fmessage_005f0 = _jspx_th_bean_005fmessage_005f0.doStartTag();
    if (_jspx_th_bean_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /ckeditor-3.6.3/plugins/emm/dialogs/emm-tags-dialog-content-frame.jsp(127,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("tag");
    // /ckeditor-3.6.3/plugins/emm/dialogs/emm-tags-dialog-content-frame.jsp(127,16) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tags}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    ");
          if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /ckeditor-3.6.3/plugins/emm/dialogs/emm-tags-dialog-content-frame.jsp(128,20) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("tagM");
    // /ckeditor-3.6.3/plugins/emm/dialogs/emm-tags-dialog-content-frame.jsp(128,20) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tag}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <option value='");
          if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write('\'');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tagM.key}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /ckeditor-3.6.3/plugins/emm/dialogs/emm-tags-dialog-content-frame.jsp(129,39) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tagM.value}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    // /ckeditor-3.6.3/plugins/emm/dialogs/emm-tags-dialog-content-frame.jsp(156,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("title");
    // /ckeditor-3.6.3/plugins/emm/dialogs/emm-tags-dialog-content-frame.jsp(156,24) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${titles}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title.description}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }
}
