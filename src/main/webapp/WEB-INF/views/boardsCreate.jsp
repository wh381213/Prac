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
                    <li><h2><a href="/membersRead">Members</a></h2></li>
                    <li><h2><a href="/search">Search</a></h2></li>
                    <li><h2><a href="/boardsRead" class="active">Boards</a></h2></li>
                </ul>
            </nav>
            <hr />
            <section class="contents">
                <div>
                    <form method="post" action = "./boardsCreate">
                        <h3>Boards</h3>
                        <hr class="d-block" />
                        <div>
                            <h4>Create</h4>
                            <div>
                                <input type="text" name="title" placeholder="제목" />
                            </div>
                            <div>
                                <textarea name="contents" placeholder="내용"></textarea>
                            </div>
                        </div>
                        <hr class="d-block" />
                        <div>
                            <button>Create</button>
                        </div>
                    </form>
                </div>
            </section>
            <hr />
        </div>
        <footer>Copyright</footer>
    </div>
</body>
</html>