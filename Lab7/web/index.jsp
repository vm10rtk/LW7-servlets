<!DOCTYPE html>
<html>
<head>
  <title>Pig List</title>
</head>
<body>
<h1>List of Pigs</h1>
<ul>
  <c:forEach items="${pigs}" var="pig">
    <li>
      Name: ${pig.name}<br>
      Type: ${pig.type}<br>
      <img src="${pig.imageURL}" alt="${pig.name}"><br>
    </li>
  </c:forEach>
</ul>
</body>
</html>
