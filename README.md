# Spring Data Elastic Search 

spring Data Elastic Search 관련 예제

출처 : [관련예제](https://juntcom.tistory.com/137)
  [설치관련](https://crynut84.github.io/)

elastic search를 먼저 설치해 줘야 한다.  

주의 사항
1. spring-data-elasticsearch 4.0.0 이상부터는,
   TransportClient 클래스가 Deprecated 되어 `RestHighLevelClient` 또는 `ReactiveRestLevelClients` 만 사용 가능하다.
   