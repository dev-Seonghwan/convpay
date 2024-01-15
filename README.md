## 프로젝트 소개
### 프로젝트 설명

- 편의점 결제 서비스
- 사용자가 편의점에서 간편 결제로 결제할 수 있는 시스템 개발
- 사용자 → 서비스 → 결제 수단 시스템 호출
- [[링크](https://github.com/dev-Seonghwan/convpay-v1)] v1에서 업데이트

### 개발환경


- Windows
- IDE : IntelliJ Community
- Language : Java( jdk 17 )
- Project : Gradle Project
- Spring Boot : 3.2.1




## 개선 내용 
### 클래스 UML
![image](https://github.com/dev-Seonghwan/convpay-v2/assets/91909986/c79795ef-321b-4d43-ab5c-4693a79317a3)

**결제 서비스가 구현체를 의존하지 않도록 개선**

### 어플리케이션 설정에 대한 역할을 분리한 결과
1. 결제서비스가 의존하는 서비스를 변경할 때 결제 서비스를 수정할 필요가 없음
2. 각 서비스가 본래의 역할에 충실
3. 서비스들이 의존하는 클래스를 변경할 때는 ApplicationConfig만 수정하면 되므로 더 쉽게
찾아갈 수 있음(분류)
