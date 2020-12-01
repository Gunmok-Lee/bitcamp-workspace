package com.eomcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test extends SeleniumTest {

  //  public static void main(String[] args) {
  //    // Jsoup를 이용해서 http://www.cgv.co.kr/movies/ 크롤링
  //    String url = "https://movie.naver.com/movie/bi/mi/photoView.nhn?code=136900"; //크롤링할 url지정
  //    Document doc = null;        //Document에는 페이지의 전체 소스가 저장된다
  //
  //    try {
  //      doc = Jsoup.connect(url).get();
  //    } catch (IOException e) {
  //      e.printStackTrace();
  //    }
  //    //select를 이용하여 원하는 태그를 선택한다. select는 원하는 값을 가져오기 위한 중요한 기능이다.
  //    //    Elements element = doc.select("div.sect-movie-chart");
  //    //    Elements element = doc.select("div.mv_info_area");
  //
  //    Elements elements = doc.select("div.img_src._img_area").select("div.img_obj").select("div.img_ar").select("div.viewer_img");
  //    System.out.println(elements.select("img").attr("src"));
  //    Elements elements2 = doc.select("div.img_src._img_area").select("div.img_obj").select("div.img_ar").select("div.viewer_img");
  //    System.out.println(elements2.select("img").attr("src"));
  //
  //    WebDriver driver = new ChromeDriver();
  //    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  //    try {
  //        driver.get("https://google.com/ncr");
  //        driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
  //        WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector("h3>div")));
  //        System.out.println(firstResult.getAttribute("textContent"));
  //    } finally {
  //        driver.quit();
  //    }
  //  }

  public static void main(String[] args) {

    SeleniumTest selTest = new SeleniumTest();
    selTest.crawl();

  }


  //WebDriver
  private WebDriver driver;

  //Properties
  public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
  public static final String WEB_DRIVER_PATH = "D:/selenium/chromedriver_win32/chromedriver.exe";

  //크롤링 할 URL
  private String base_url;

  public SeleniumTest() {
    super();

    //System Property SetUp
    System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);

    //Driver SetUp
    driver = new ChromeDriver();
    base_url = "https://www.naver.com";
  }

  @Override
  public void crawl() {

    try {
      //get page (= 브라우저에서 url을 주소창에 넣은 후 request 한 것과 같다)
      driver.get(base_url);
      System.out.println(driver.getPageSource());

    } catch (Exception e) {

      e.printStackTrace();

    } finally {

      driver.close();
    }

  }
}


