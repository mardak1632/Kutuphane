<%-- 
    Document   : kontrol
    Created on : Mar 1, 2014, 8:13:32 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kontrol</title>
    </head>
    <body>
        <%
        boolean onaylandi = true;
        if(!request.getParameter("email").equals("ardauslu@gmail.com")){
            onaylandi = false;
        }
        
        if(!request.getParameter("password").equals("123456")){
            onaylandi = false;
        }
        
        if(onaylandi == false){
            out.write("<script type='text/javascript'>document.location.href='http://www.wallpick.com/wp-content/uploads/2014/01/11/beautiful-garden-waterfall.jpg'</script>");
                        //<span style="font-size:50px">E-mail veya şifre yanlış.</span>

                    //request.getServletContext().getRequestDispatcher("/kullanici/kullanici islemleri").forward(request, response);
        } else {
            out.write("<script type='text/javascript'>document.location.href='http://hdwallpapervault.com/wp-content/uploads/2013/05/Beautiful-Summer-Scenery.jpg'</script>");
            //<span style="font-size:50px">Giriş onaylandı.</span>
            //request.getServletContext().getRequestDispatcher("kullanici_islemleri.jsp").forward(request, response);
        }
        %>
    </body>
</html>
