<%-- 
    Document   : kullaniciislemleri
    Created on : Mar 1, 2014, 7:36:42 PM
    Author     : user
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kullanıcı İşlemleri</title>
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
        <form method="POST" action="giriskontrol.jsp">
            <table style="margin: 0 auto;">
                <tr>
                    <td>E-mail : </td>
                    <td><input type="text" name="email" /></td>
                </tr>
                <tr>
                    <td>Password : </td>
                    <td><input type="password" name="password" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Login" style="float:right;" /></td>
                </tr>
            </table>
        </form>
        
    </body>
</html>
