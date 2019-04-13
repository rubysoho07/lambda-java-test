# Java Lambda Test

## 테스트 환경

* Ubuntu 18.10
* Java 8 (1.8.191)

## 콘솔에서 설정 방법

* 함수 생성 시 설정해야 할 것들
    * 함수 이름: 임의로 설정
    * 런타임: Java 8로 지정 (현재 Java 8만 지원함)
    * 권한은 필요에 따라 적당히 부여
* 핸들러
    * 패키지.클래스명::Lambda가 호출할 함수 
    * (예) kr.gonigoni.lambdaTest.HelloLambda::testHandler
* `mvn package` 명령을 실행하면 `/target` 디렉터리에 `.jar` 파일이 나오는데, 이 파일을 올리면 됨
    * Python이나 Node.js와는 다르게 즉석에서 함수 내용 수정 불가
* 이 함수에서는 String을 입력 값으로 받음. 테스트 시 임의의 문자열을 넣으면 그대로 출력됨

## SAM을 이용한 함수 생성 및 배포

### SAM 설치 및 초기화

참고문서: [AWS Serverless Application Model](https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/serverless-sam-cli-install.html)

* AWS CLI 및 Docker 설치 필요
* Python이 설치되어 있다면, `pip install --user aws-sam-cli`로 설치 후 `sam --version`으로 설치 여부 확인
* `sam init --runtime java8` 명령으로 함수 샘플 생성: `sam-app/` 디렉토리에 함수 코드 및 필요한 파일들 생성함

### 함수 빌드 및 배포

*`sam-app` 디렉토리의 [README.md](./sam-app/README.md) 파일 참조*

### 발생 가능한 문제

* `dockerpycreds.errors.InitializationError: docker-credential-secretservice not installed or not available in PATH` 오류 발생 시 대처 방법
    * `$HOME/.docker/config.json` 파일 삭제

## 참고한 자료

* [IDE 없이 Maven을 사용하여 .jar 배포 패키지 만들기](https://docs.aws.amazon.com/ko_kr/lambda/latest/dg/java-create-jar-pkg-maven-no-ide.html)
* [핸들러 입력/출력 유형(Java)](https://docs.aws.amazon.com/ko_kr/lambda/latest/dg/java-programming-model-req-resp.html)