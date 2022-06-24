# hello-spring

[강의](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%EC%9E%85%EB%AC%B8-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8)보면서
정리하기

## 프로젝트 세팅
- https://start.spring.io/ 을 이용하자.

## 라이브러리 살펴보기
- build.gradle
- Intellij 좌측 하단 버튼 > Gradle > Dependencies
  - *표시는 중복된 dependency
- 로깅 -> spring-boot-starter-logging
  - logback, slf4j를 주로 쓴다.
- 테스팅
  - junit: 테스트 프레임워크
  - mockito: 모킹 라이브러리
  - assertj: 테스트 코드를 더 쉽게 작성하도록 도와주는 라이브러리
  - spring-test: 스프링 통합 테스트 지원함.

## 빌드하고 실행하기

```shell
> ./gradlew build
> cd build/libs
> java -jar hello-spring-0.0.1-SNAPSHOT.jar
```

```shell
> .gradlew clean build
# build 디렉토리 비우고 빌드하기
```
