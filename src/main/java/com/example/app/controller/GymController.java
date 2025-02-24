package com.example.app.controller;

import com.example.app.crawling.MyungIlMiddleSchool;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gym")
@RequiredArgsConstructor
public class GymController {

  private final MyungIlMiddleSchool myungIlMiddleSchool;

  @GetMapping
  public List<String> print() {
    return myungIlMiddleSchool.getNotice();
  }
}
