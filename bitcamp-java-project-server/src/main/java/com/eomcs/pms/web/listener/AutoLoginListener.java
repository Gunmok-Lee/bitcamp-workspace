package com.eomcs.pms.web.listener;

import java.util.Map;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import com.eomcs.pms.domain.Member;

@WebListener
public class AutoLoginListener implements ServletRequestListener {
  @SuppressWarnings("unchecked")
  @Override
  public void requestInitialized(ServletRequestEvent sre) {
    System.out.println("ㅋㅋ 자동 로그인!");
    HttpSession session = ((HttpServletRequest)sre.getServletRequest()).getSession();

    if (session.getAttribute("loginUser") == null) {

      Map<String,Object> beanContainer =
          (Map<String,Object>) sre.getServletContext().getAttribute("beanContainer");

      Member member = new Member().setNo(22).setName("bit").setEmail("bit@test.com");

      session.setAttribute("loginUser", member);
    }
  }
}
