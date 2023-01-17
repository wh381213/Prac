<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Members</title>
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
                    <li><h2><a href="/membersRead" class="active">Members</a></h2></li>
                    <li><h2><a href="/search">Search</a></h2></li>
                </ul>
            </nav>
            <hr />
            <section class="contents">
                <div>
                    <h3>Members</h3>
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
                                <c:forEach items="${members}" var="member" varStatus="status">
                                    <form method="POST">
                                    <tr>
                                        <td><input type="text" name="name" placeholder="Name" value="${member.name}" /></td>
                                        <td><input type="text" name="age" placeholder="Age" value="${member.age}" /></td>
                                        <td>
                                            <button onclick="this.form.action = '/membersUpdate/${status.index}';">Update</button>
                                            <button onclick="this.form.action = '/membersDelete/${member.memberPk}';">Delete</button>
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
                        <form method="POST" action="/membersCreate">
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