package com.eomcs.pms.web.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.MemberService;

@WebListener
public class AutoLoginListener implements ServletRequestListener {

  @Override
  public void requestInitialized(ServletRequestEvent sre) {
    System.out.println("세션 생성되었음! - ㅋㅋ 자동 로그인!");
    try {
      HttpSession session = ((HttpServletRequest)sre.getServletRequest()).getSession();
      MemberService memberService =
          (MemberService) session.getServletContext().getAttribute("memberService");
      Member member = memberService.get("f2@test.com", "1111");
      session.setAttribute("loginUser", member);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
