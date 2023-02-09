<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Boards</title>
    <link href="./css/app.css" rel="stylesheet">
</head>
<body>
    <div>
        <header>
            <h1>Spring Boot MVC study</h1>
        </header>
        <hr />
        <div class="container">
            <nav class="nav">
                <ul>
                    <li><h2><a href="/usersRead">Users</a></h2></li>
                    <li><h2><a href="/search">Search</a></h2></li>
                    <li><h2><a href="/boardsRead" class="active">Boards</a></h2></li>
                </ul>
            </nav>
            <hr />
            <section class="contents">
                <div>
                    <h3>Boards</h3>
                    <hr class="d-block" />
                    <div>
                        <h4>${result}</h4>
                        <table>
                            <thead>
                                <tr>
                                    <th>제목</th>
                                    <th>내용</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${boards}" var="board" varStatus="status">
                                    <form method="POST">
                                    <tr>
                                        <td><a href = "./boardsDetail?boardPk=${board.boardPk}">${board.title}</a></td>
                                        <td>${board.contents}</td>
                                    </tr>
                                    </form>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <hr class="d-block" />
                    <div>
                        <button onclick="document.location.href = '/boardsCreate';">Create</button>
                    </div>
                </div>
            </section>
            <hr />
        </div>
        <footer>Copyright</footer>
    </div>
</body>
</html>