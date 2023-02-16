<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Users</title>
    <link href="./css/app.css" rel="stylesheet">
</head>
<body>
    <div>
        <c:import url="../layout/header.jsp" charEncoding="UTF-8">
        </c:import>
        <hr />
        <div class="container">
            <nav class="nav">
                <ul>
                    <li><h2><a href="/usersRead" class="active">Users</a></h2></li>
                    <li><h2><a href="/search">Search</a></h2></li>
                    <li><h2><a href="/boardsRead">Boards</a></h2></li>
                </ul>
            </nav>
            <hr />
            <section class="contents">
                <div>
                    <h3>Users</h3>
                    <hr class="d-block" />
                    <div>
                        <h4>${result}</h4>
                        <table>
                            <thead>
                                <tr>
                                    <th>Name</th>
                                    <th>Age</th>
                                    <th>Modify</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${users}" var="user" varStatus="status">
                                    <form method="POST">
                                    <tr>
                                        <td><input type="text" name="name" placeholder="Name" value="${user.name}" /></td>
                                        <td><input type="text" name="age" placeholder="Age" value="${user.age}" /></td>
                                        <td>
                                            <button onclick="this.form.action = '/usersUpdate/${user.userPk}';">Update</button>
                                            <button onclick="this.form.action = '/usersDelete/${user.userPk}';">Delete</button>
                                        </td>
                                    </tr>
                                    </form>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <hr class="d-block" />
                    <div>
                        <h4>Create</h4>
                        <form method="POST" action="/usersCreate">
                            <input type="text" name="name" placeholder="Name" />
                            <input type="text" name="age" placeholder="Age" />
                            <button>Create</button>
                        </form>
                    </div>
                </div>
            </section>
            <hr />
        </div>
        <footer>Copyright</footer>
    </div>
</body>
</html>