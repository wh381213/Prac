<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Search</title>
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
                    <li><h2><a href="/search" class="active">Search</a></h2></li>
                    <li><h2><a href="/boardsRead">Boards</a></h2></li>
                </ul>
            </nav>
            <hr />
            <section class="contents">
                <div>
                    <h3>${result}</h3>
                    <hr class="d-block" />
                    <div>
                        <form>
                            <input type="text" placeholder="Search" name="q" value="${param.q}" />
                            <button>Search</button>
                        </form>
                    </div>
                    <hr class="d-block" />
                    <div>
                        <table class="table-search">
                            <thead>
                                <tr>
                                    <th>Name</th>
                                    <th>Age</th>
                                </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${users}" var="user" varStatus="status">
                                <tr>
                                    <td>${user.name}</td>
                                    <td>${user.age}</td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </section>
            <hr />
        </div>
        <footer>Copyright</footer>
    </div>
</body>
</html>