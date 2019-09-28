<%--
  Created by IntelliJ IDEA.
  User: xunmi
  Date: 2019/9/26
  Time: 8:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css">
    <stryle type="text/css">

    </stryle>
</head>
<body>
<div id="top">
    <jsp:include page="top.jsp"/>
</div>
<div id="search">
    <h2>读书时刻</h2>
    <input type="text" placeholder="书名、作者、ISBN" class="search-input">
    <div class="search-btn">
        <img src="images/search.png" alt="">
    </div>
</div>

<div class="container">
    <div class="row">
        <div class="col-8">
            <h3>新书速递</h3>
            <hr>
            <div class="row">
                <%
                    List<Book> bookList = (List<Book>) request.getAttribute("bookList");
                    for (Book book : bookList) {
                        pageContext.setAttribute("book", book);
                    }
                %>
                <div></div>
            </div>
        </div>
    </div>
</div>
</body>
</html>