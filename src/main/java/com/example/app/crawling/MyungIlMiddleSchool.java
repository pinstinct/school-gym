package com.example.app.crawling;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class MyungIlMiddleSchool {

  private static final String BASE_URL = "https://myungil.sen.ms.kr/79384/subMenu.do";


  public List<String> getNotice() {
    // todo: 명일중학교 공지사항 페이지의 제목들을 크롤링한다.

    List<String> result = new ArrayList<>();
    result.add("title 1");
    result.add("title 2");
    return result;
  }
}
