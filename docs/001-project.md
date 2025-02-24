# 프로젝트 생성

[Spring initializer](https://start.spring.io)에서 원하는 옵션을 선택후 Generate 버튼을 통해 프로젝트를 다운 받는다.

## Dependencies

- spring-boot-starter-web: 웹 애플리케이션 개발을 위한 패키지 (Spring MVC, Tomcat, Jackson 등 웹 개발에 필요한 라이브러리를 포함)
- lombok: 반복적으로 사용하는 기본적인 코드 블록(Boilerplate code)을 줄이는데 도움을 주는 패키지
    - getter, setter, toString, equals, hasCode 메서드를 자동으로 생성하거나, builder 패턴을 지원하는 기능을 제공

## Code Convention

구글 자바 포맷을 사용하며, 프로젝트에 포함된 intellij-java-google-style.xml 파일을 이용해 포맷팅을 한다.

- Settings - Editor - Code Style - Java 메뉴로 이동
- Schema 옆 톱니바퀴 Import Schema - Intellij IDEA Code Style XML 클릭 후, 위의 파일을 클릭

코드를 작성 후 Code - Reformat Code 실행 후 커밋한다.

## Todo

- todo-001 브랜치: ~3월 3일 까지
  - 아래의 사이트를 참고해 End Point가 작동하도록 작업한다.
    - Ref: [[JAVA] jsoup을 이용해서 웹 스크래핑 하는 방법](https://hyeonju0121.tistory.com/73)
    - End Point: http://localhost:8080/gym
  - 작업 위치: main/java/com/example/app/crawling/MyungIlMiddleSchool getNotice() 메서드