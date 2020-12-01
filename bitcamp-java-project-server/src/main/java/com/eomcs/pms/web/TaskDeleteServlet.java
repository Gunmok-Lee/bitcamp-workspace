package com.eomcs.pms.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.eomcs.pms.service.TaskService;

@WebServlet("/task/delete")
public class TaskDeleteServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    ServletContext ctx = request.getServletContext();
    TaskService taskService =
        (TaskService) ctx.getAttribute("taskService");

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<title>작업삭제</title></head>");
    out.println("<body>");

    try {
      out.println("<h1>작업 삭제</h1>");

      int no = Integer.parseInt(request.getParameter("no"));


      if (taskService.delete(no) == 0) {
        out.println("해당 번호의 작업이 존재하지 않습니다.");
      } else {
        out.println("작업을 삭제하였습니다.");
      }

      response.setHeader("Refresh",
          "1;url=../project/detail?no=" + request.getParameter("projectNo"));

    } catch (Exception e) {
      out.println("<h2>작업 처리 중 오류 발생!</h2>");
      out.printf("<pre>%s</pre>\n", e.getMessage());

      StringWriter errOut = new StringWriter();
      e.printStackTrace(new PrintWriter(errOut));
      out.println("<h3>상세 오류 내용</h3>");
      out.printf("<pre>%s</pre>\n", errOut.toString());
    }

    out.println("</body>");
    out.println("</html>");
  }
}
