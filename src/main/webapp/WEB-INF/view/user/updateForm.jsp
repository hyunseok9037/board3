<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ include file="../layout/header.jsp" %>

        <div class="align_center">
            <h1>회원수정 페이지</h1>
        </div>
        <hr>
        <div class="align_center">
            <form action="/user/1/update" method="post">
            <input type="password" name="password" value="1234" placeholder="Enter password" required><br />
            <input type="email" name="email" value="ssar@nate.com" placeholder="Enter email" required><br />
                <button type="submit">회원수정</button>
            </form>
        </div>

        <%@ include file="../layout/footer.jsp" %>