📘 Day 19 – JSP, JSTL & MVC Pattern
====================================

✅ What I learned today

1. JSP (JavaServer Pages)
   -----------------------

- HTML ke andar Java embed karne ka tool

- Scriptlet <% %>, Expression <%= %>, Declaration <%! %>

2. JSTL & EL
   ---------

- JSTL tags: <c:if>, <c:forEach>

- EL (Expression Language): ${attributeName}

3. MVC Architecture
   -----------------

- Model (Data/Logic) → User.java

- View (UI) → login.jsp, welcome.jsp

- Controller (Request Handler) → LoginServlet.java

4. Practice: MVC Login App
   -------------------------

- Controller (LoginServlet.java):

java code
---------

req.setAttribute("username", username);

req.getRequestDispatcher("welcome.jsp").forward(req, resp);

View (welcome.jsp):

jsp code
---------

<h1>Welcome, ${username}!</h1>

5. Forward vs Redirect (Bonus)
   -----------------------------

- forward(): Request ke andar hi redirect (URL same rahega)

- sendRedirect(): New request (URL badal jayega)
