<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ page session="false"%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="keywords" content="">
  <meta name="description" content="">
  <meta name="viewport" content="initial-scale=1">
  <link rel="stylesheet"
        href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
        integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
        crossorigin="anonymous">
  <title>QuickStart</title>
  <style type="text/css">
    .empty-table {
      color: rgb(127, 127, 127);
      text-align: center;
      margin-top: 50px;
    }
  </style>
</head>
<body>
  <div class="row">
    <div class="col-sm-7">
      <table class="table">
        <tr>
          <th scope="col">Name</th>
          <th scope="col">Quantite</th>
          <th scope="col">Price</th>
        </tr>
        <tbody>
        <c:forEach items="${products}" var="prd">
          <tr>
            <th scope="row"><c:out value="${prd.name}" /></th>
            <td><c:out value="${prd.quantite}" /></td>
            <td><c:out value="${prd.price}" /></td>
          </tr>
        </c:forEach>
        </tbody>
      </table>
      <c:if test="${isEmpty}">
        <h4 class="empty-table">
          <b>Student table is Empty</b>
        </h4>
      </c:if>
    </div>
  </div>
</div>
</body>
</html>
