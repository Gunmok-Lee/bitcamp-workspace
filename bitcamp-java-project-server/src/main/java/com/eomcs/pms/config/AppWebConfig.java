package com.eomcs.pms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.util.UrlPathHelper;

@ComponentScan("bitcamp.app2")
// => 지정된 패키지를 뒤져서 @Component, @Controller 등 붙은 클래스에 대해 인스턴스를 생성한다.
//

@EnableWebMvc
// => Web MVC 관련 객체를 등록하고 설정한다.
// => WebMvcConfigurer 구현체를 찾아 메서드를 호출한다.
//
public class AppWebConfig implements WebMvcConfigurer {

  // DispatcherServlet의 기본 ViewResolver를 교체하기
  // 1) XML 설정
  // <bean id="viewResolver"
  // class="org.springframework.web.servlet.view.InternalResourceViewResolver">
  // <property name="viewClass" value="org.springframework.web.servlet.view.JstlView"/>
  // <property name="prefix" value="/WEB-INF/jsp/"/>
  // <property name="suffix" value=".jsp"/>
  // </bean>
  //
  // 2) Java Config 설정
  @Bean
  public ViewResolver viewResolver() {
    return new InternalResourceViewResolver("/WEB-INF/app/",".jsp");
  }
  // @EnableWebMvc 애노테이션 표시
  @Override
  public void configurePathMatch(PathMatchConfigurer configurer) {
    UrlPathHelper helper = new UrlPathHelper();
    helper.setRemoveSemicolonContent(false);
    configurer.setUrlPathHelper(helper);
  }

  // 프론트 컨트롤러에 적용할 인터셉터 설정하기
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
  }
}


