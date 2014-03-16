<%-- 
    Document   : kontrol
    Created on : Mar 1, 2014, 8:13:32 PM
    Author     : user
--%>

<%@page import="com.bilisimegitim.course.dao.KullaniciDAO"%>
<%@page import="com.bilisimegitim.course.entity.Kullanici"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kontrol</title>
        <style type="text/css">
            body
            { 
                background: url(../icon/kulube.jpg) no-repeat center center fixed; 
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;
                background-size: cover;
            }
        </style>
    </head>
    <body>
        <%
            String email = request.getParameter("email");
            String sifre = request.getParameter("sifre");

            KullaniciDAO kullaniciDAO = new KullaniciDAO();
            Kullanici kullanici = kullaniciDAO.getKullanici(email);

            if (kullanici == null) {
                request.getServletContext().getRequestDispatcher("/kullanici/girisbasarisiz.jsp").forward(request, response);
            } else {
                if (kullanici.getSifre().equals(sifre)) {
                    request.getServletContext().getRequestDispatcher("/kullanici/girisbasarili.jsp").forward(request, response);
                } else {
                    request.getServletContext().getRequestDispatcher("/kullanici/girisbasarisiz.jsp").forward(request, response);
                }
            }
        %>
    </body>
</html>
