/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.24
 * Generated at: 2015-08-22 06:23:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.settings.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.agnitas.web.AdminAction;

public final class admin_002dloading_002dsetup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/agnitas-taglib.tld", Long.valueOf(1437749468000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.agnitas.web.AdminAction");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fagn_005fCheckLogon_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fagn_005fPermission_0026_005ftoken_005fnobody;

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
    _005fjspx_005ftagPool_005fagn_005fPermission_0026_005ftoken_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fagn_005fCheckLogon_005fnobody.release();
    _005fjspx_005ftagPool_005fagn_005fPermission_0026_005ftoken_005fnobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_agn_005fCheckLogon_005f0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_agn_005fPermission_005f0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
 request.setAttribute("sidemenu_active", new String("Administration")); 
      out.write("          <!-- links Button -->\n");
 request.setAttribute("sidemenu_sub_active", new String("settings.Admins")); 
      out.write("  <!-- links unter Button -->\n");
 request.setAttribute("agnTitleKey", new String("settings.Admins")); 
      out.write("          <!-- Titelleiste -->\n");
 request.setAttribute("agnSubtitleKey", new String("settings.Admins")); 
      out.write("       <!-- ueber rechte Seite -->\n");
 request.setAttribute("agnNavigationKey", new String("admins")); 
      out.write("         <!-- welche Reiterleiste -->\n");
 request.setAttribute("agnHighlightKey", new String("default.Overview")); 
      out.write("          <!-- welcher Reiter -->\n");
 request.setAttribute("ACTION_VIEW", AdminAction.ACTION_VIEW); 
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

  private boolean _jspx_meth_agn_005fPermission_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  agn:Permission
    org.agnitas.taglib.PermissionTag _jspx_th_agn_005fPermission_005f0 = (org.agnitas.taglib.PermissionTag) _005fjspx_005ftagPool_005fagn_005fPermission_0026_005ftoken_005fnobody.get(org.agnitas.taglib.PermissionTag.class);
    _jspx_th_agn_005fPermission_005f0.setPageContext(_jspx_page_context);
    _jspx_th_agn_005fPermission_005f0.setParent(null);
    // /settings/admin/admin-loading-setup.jsp(7,0) name = token type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_agn_005fPermission_005f0.setToken("admin.show");
    int _jspx_eval_agn_005fPermission_005f0 = _jspx_th_agn_005fPermission_005f0.doStartTag();
    if (_jspx_th_agn_005fPermission_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fagn_005fPermission_0026_005ftoken_005fnobody.reuse(_jspx_th_agn_005fPermission_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fagn_005fPermission_0026_005ftoken_005fnobody.reuse(_jspx_th_agn_005fPermission_005f0);
    return false;
  }
}
