# 프로젝트 

## Requirement

- Java 23
- Spring Boot 3.4.3

### Dependencies

- spring-boot-starter-web: 웹 애플리케이션 개발을 위한 패키지 (Spring MVC, Tomcat, Jackson 등 웹 개발에 필요한 라이브러리를 포함)
- lombok: 반복적으로 사용하는 기본적인 코드 블록(Boilerplate code)을 줄이는데 도움을 주는 패키지
    - getter, setter, toString, equals, hasCode 메서드를 자동으로 생성하거나, builder 패턴을 지원하는 기능을 제공

## Code Convention

구글 자바 포맷을 사용하며, 프로젝트에 포함된 intellij-java-google-style.xml 파일을 이용해 포맷팅을 한다.

- Settings - Editor - Code Style - Java 메뉴로 이동
- Schema 옆 톱니바퀴 Import Schema - Intellij IDEA Code Style XML 클릭 후, 위의 파일을 클릭

코드를 작성 후 Code - Reformat Code 실행 후 커밋한다.


# Git Branch 전략

아래와 같이 2가지 브랜치로 운영한다.

- main (출시 브랜치)
- feature (작업 브랜치)

작업자는 main 브랜치에서 feature 브랜치를 만들어 작업한 후, Pull Request 를 작성해 main에 merge한다.

```shell
# main 브랜치에서 최신 작업 내역 받기
git checkout main
git pull

# 새로운 작업 브랜치 생성 
git checkout -b branch-name
# 작업 후 커밋 & 푸시
# 커밋은 최대한 작은 작업 단위로 작성
```

단, 충돌이 발생한 경우 해결 후 푸시한다.

푸시 후, GitHub Repository의 Pull Requests 탭에서 New Pull Request 버튼을 눌러 PR을 생성한다.
상대방의 리뷰가 완료되면 병합(merge)한다.

병합 후, 작업 브랜치는 삭제 후 새 작업 브랜치를 생성한다.

## Reference

- [[GIT] 📈 깃 브랜치 전략 정리](https://inpa.tistory.com/entry/GIT-⚡%EF%B8%8F-github-flow-git-flow-📈-브랜치-전략#)
- [Git에서 머지 충돌을 해결하는 방법과 실용 예시](https://www.freecodecamp.org/korean/news/how-to-resolve-merge-conflicts-in-git/)


# Todo

### todo-001: ~3월 3일 까지, 단일 페이지 크롤링
- 아래의 사이트를 참고해 End Point가 작동하도록 작업한다.
    - Ref: [[JAVA] jsoup을 이용해서 웹 스크래핑 하는 방법](https://hyeonju0121.tistory.com/73)
    - End Point: http://localhost:8080/gym
- 작업 위치: src/main/java/com/example/app/crawling/MyungIlMiddleSchool getNotice() 메서드
