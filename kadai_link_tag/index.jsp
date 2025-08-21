<%@ page contentType="text/html; charset=UTF-8" %>
<%
    //Servletのデータ受け取り
   request.setCharacterEncoding("UTF8");
   String strMessage = (String) request.getAttribute("message");
   if(strMessage == null){
	   strMessage="";
   }
%>
<html>
    <body>
        <%-- リンクのクリック時にServletへデータを渡す(GETメソッド) --%>
        <a href="<%= request.getContextPath() %>/link?name=侍太郎">名前「侍太郎」をServletに送信</a>
    </body>
    <body>
    <p>
    <%=strMessage%>
    </p>
    </body>
</html>