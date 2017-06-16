<%@ page language="java" contentType="text/html; charset=utf-8"
         import="org.agnitas.util.AgnUtils, org.agnitas.util.EmmCalendar, org.agnitas.web.MailingStatForm, java.util.*"  errorPage="/error.jsp" %>
<%@ taglib uri="/WEB-INF/agnitas-taglib.tld" prefix="agn" %>

<agn:CheckLogon/>

<agn:Permission token="stats.rdir"/>

<% Integer tmpMailingID = 0;
    int tmpTargetID = 0;
    // int tmpUniqueClicks=0;
    String tmpNetto = "no";
    String tmpShortname = new String("");
    MailingStatForm aForm = null;
    Integer maxblue = 0;
    Integer maxNRblue = 0;
    Integer maxSubscribers = 0;
    if (session.getAttribute("mailingStatForm") != null) {
        aForm = (MailingStatForm) session.getAttribute("mailingStatForm");
        tmpMailingID = aForm.getMailingID();
        tmpTargetID = aForm.getTargetID();
        tmpShortname = aForm.getMailingShortname();
        maxblue = aForm.getMaxblue();
        maxNRblue = aForm.getMaxNRblue();
        maxSubscribers = aForm.getMaxSubscribers();
    }

    request.setAttribute("maxblue", maxblue);
    request.setAttribute("maxNRblue", maxNRblue);
    request.setAttribute("maxSubscribers", maxSubscribers);
    request.setAttribute("tmpMailingID", tmpMailingID);
%>

<% request.setAttribute("sidemenu_active", new String("Mailings")); %>
<% request.setAttribute("sidemenu_sub_active", new String("none")); %>
<% request.setAttribute("agnTitleKey", new String("Mailing")); %>
<% request.setAttribute("agnSubtitleKey", new String("Mailing")); %>
<% request.setAttribute("agnSubtitleValue", tmpShortname); %>
<% request.setAttribute("agnNavigationKey", new String("mailingView")); %>
<% request.setAttribute("agnHighlightKey", new String("Statistics")); %>
<% request.setAttribute("agnNavHrefAppend", new String("&mailingID=" + tmpMailingID)); %>


<%
    EmmCalendar my_calendar = new EmmCalendar(java.util.TimeZone.getDefault());
    my_calendar.changeTimeWithZone(TimeZone.getTimeZone(AgnUtils.getAdmin(request).getAdminTimezone()));
    java.util.Date my_time = my_calendar.getTime();
    String Datum = my_time.toString();
    String timekey = Long.toString(my_time.getTime());
    pageContext.setAttribute("time_key", timekey);

    // map for the csv download
    Map<Object, Object> my_map = null;
    if (pageContext.getSession().getAttribute("map") == null) {
        my_map = new Hashtable<Object, Object>();
        pageContext.getSession().setAttribute("map", my_map);
    } else {
        my_map = (Map<Object, Object>) (pageContext.getSession().getAttribute("map"));
    }
    // put csv file from the form in the hash table:
    // String file = ((MailingStatForm)(session.getAttribute("mailingStatForm"))).getCsvfile();
%>
