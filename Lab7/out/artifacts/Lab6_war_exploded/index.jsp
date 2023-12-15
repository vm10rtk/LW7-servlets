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
      Name: Vasya${Va}<br>
      Type: Big Pig${pig.type}<br>
      Reference: https://images.techinsider.ru/upload/img_cache/d4d/d4d287dfa120da7e62a77e3051572811_ce_800x426x0x79_cropped_666x444.jpeg
      <img src="${vff}" alt="${pig.name}"><br>
    </li>
    <li>
      Name: Petya${Va}<br>
      Type: Small Pig${pig.type}<br>
      <img src="${pig.imageURL}" alt="${pig.name}"><br>
    </li>
  </c:forEach>
</ul>
</body>
</html>
