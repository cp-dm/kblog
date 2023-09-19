# Jar File Link

https://github.com/cp-dm/file/blob/master/blog.jar

[jar file](https://github.com/cp-dm/file/blob/master/blog.jar)

```bash
java -jar blog.jar
```

# Environment

- Post : 8080
- Java Version : 11
- Open API KEY
  - [KaKao](https://developers.kakao.com)
  - [Naver](https://developers.naver.com)

# API

## 블로그 검색 API

### path
```http
GET /blog
```

### Request 
```
curl -v -X GET "http://localhost:8080/blog" \
--data-urlencode "query=카카오뱅크" \
```

#### Parameter
|Key|                 Desc                 | Required |
|:---:|:------------------------------------:|:---:|
|query|                 검색어                  |O|
|sort| 정렬 방식 : accuracy(정확도순),recency(최신순)  |X|
|page|    결과 페이지 번호, 1~50 사이의 값, 기본 값 1     |X|
|size| 한 페이지에 보여질 문서 수, 1~50 사이의 값, 기본 값 10 |X|

### Response
```json
{
  "content": [
    {
      "title": "Django RestFramework 카카오 소셜 로그인_사이트 모음 정리",
      "contents": "https://velog.io/@mechauk418/DRF-%<b>EC</b>%<b>B</b><b>9%</b><b>B</b><b>4%</b><b>EC</b>%<b>B</b><b>9%</b><b>B</b><b>4%</b><b>EC</b>%<b>98%</b><b>A4</b>-%<b>EC</b>%86%8C%<b>EC</b>%<b>85%</b>9C-%<b>EB</b>%A<b>1%</b>9C%EA%<b>B</b>7%<b>B</b>8%<b>EC</b>%9D%B8-%EA%<b>B</b>5%<b>AC</b>%<b>ED</b>%<b>98%</b>84%<b>ED</b>%95%<b>98%</b>EA%<b>B</b>8%B0-JWT-%<b>EC</b>%BF%A0%<b>ED</b>%82%<b>A4</b>-%<b>EC</b>%84%<b>A4</b>%<b>EC</b>%A0%95-%<b>EB</b>%<b>B</b>0%8F-%<b>EC</b>%A3%BC%<b>EC</b>%9D%<b>98%</b><b>EC</b>%82%<b>AC</b>%<b>ED</b>%95%AD-CORS%EA%<b>B</b><b>4%</b>80%<b>EB</b>%A0%A8 [DRF] 카카오 소셜 로그인 구현하기 (JWT...",
      "url": "https://chipchip-dev.tistory.com/3",
      "blogname": "ChipChip_DEV",
      "thumbnail": "https://search2.kakaocdn.net/argon/130x130_85_c/IqNcsV9cLoa",
      "datetime": "2023-09-07T23:49:17.000+09:00"
    },
    {
      "title": "카카오 소셜 로그인 구현 진행과정",
      "contents": "아래의 포스팅에 잘 나와있으니 참고하면 좋을 것 같다. https://velog.io/@rayong/%<b>EC</b>%<b>B</b><b>9%</b><b>B</b><b>4%</b><b>EC</b>%<b>B</b><b>9%</b><b>B</b><b>4%</b><b>EC</b>%<b>98%</b><b>A4</b>%<b>ED</b>%86%A1-%<b>EC</b>%86%8C%<b>EC</b>%<b>85%</b>9C%<b>EB</b>%A<b>1%</b>9C%EA%<b>B</b>7%<b>B</b>8%<b>EC</b>%9D%B8-%<b>EC</b>%9D%<b>B</b>8%EA%<b>B</b>0%80-%<b>EC</b>%BD%94%<b>EB</b>%93%9C-%<b>EB</b>%<b>B</b>0%9B%EA%<b>B</b>8%B0 카카오톡 소셜로그인 인가 코드 받기 위코드 2차 프로젝트를 진행하며 정리한 카카오...",
      "url": "https://wan-do-it.tistory.com/82",
      "blogname": "Wan",
      "thumbnail": "https://search4.kakaocdn.net/argon/130x130_85_c/K8jYqYXwVln",
      "datetime": "2023-09-12T17:06:49.000+09:00"
    },
    {
      "title": "Nextjs 카카오 소셜 로그인(REST API 방식)",
      "contents": "oort/Next.js-%<b>EC</b>%86%8C%<b>EC</b>%<b>85%</b>9C%<b>EB</b>%A<b>1%</b>9C%EA%<b>B</b>7%<b>B</b>8%<b>EC</b>%9D%B8-%<b>EC</b>%<b>B</b><b>9%</b><b>B</b><b>4%</b><b>EC</b>%<b>B</b><b>9%</b><b>B</b><b>4%</b><b>EC</b>%<b>98%</b><b>A4</b>-%<b>EB</b>%A<b>1%</b>9C%EA%<b>B</b>7%<b>B</b>8%<b>EC</b>%9D%<b>B</b>8%<b>EC</b>%9D%84-%<b>EC</b>%A0%95%<b>EB</b>%A7%90-%<b>EC</b>%89%BD%EA%<b>B</b>2%8C-%EA%<b>B</b>5%<b>AC</b>%<b>ED</b>%<b>98%</b>84%<b>EC</b>%9D%<b>B</b><b>4%</b><b>EB</b>%9D%BC%<b>EB</b>%8F%84-%<b>ED</b>%95%<b>B</b><b>4%</b><b>EB</b>%<b>B</b>3%<b>B</b><b>4%</b>EA%<b>B</b>3%A0%<b>EC</b>%8B%<b>B</b>6%<b>EB</b>%8B%<b>A4</b>%<b>EB</b>%A9%B4-%<b>ED</b>%95%84%<b>EB</b>%8F%85 [Next.js 소셜...",
      "url": "https://cwdeveloper.tistory.com/52",
      "blogname": "Developer's Workspace",
      "thumbnail": "https://search4.kakaocdn.net/argon/130x130_85_c/IohfBLnfvJt",
      "datetime": "2023-07-08T00:51:34.000+09:00"
    },
    {
      "title": "의식의 흐름으로 생각해본 금융업, 금산분리, 은산분리 그리고 핀테크",
      "contents": "금산분리 뒤흔든 카카오뱅크 확실한 주인 있는 최대 금융사 탄생 기존 금융사 역차별 논란 www.chosun.com https://namu.wiki/w/%<b>EC</b>%<b>B</b><b>9%</b><b>B</b><b>4%</b><b>EC</b>%<b>B</b><b>9%</b><b>B</b><b>4%</b><b>EC</b>%<b>98%</b><b>A4</b>%<b>EB</b>%<b>B</b><b>1%</b><b>85%</b><b>ED</b>%<b>81%</b><b>AC</b> 카카오뱅크 - 나무위키 1. 개요 같지만 다른 은행, 카카오뱅크 이미 모두의 은행, 지금은 카카오뱅크 대한민국 의 2번째 인터넷전문은행...",
      "url": "https://blog.naver.com/pjspo2/223157643933",
      "blogname": "All That 건축주, 토지개발 그리고 금융",
      "thumbnail": "https://search2.kakaocdn.net/argon/130x130_85_c/5Fxy7yZtNZE",
      "datetime": "2023-07-16T16:08:00.000+09:00"
    },
    {
      "title": "[TIL]230726(스터디-SpringBoot Project(Aura) -코드설계: JPA/Thymeleaf/로그인/카카오 로그인 401...",
      "contents": "소셜로그인 구현 Flow이 suyeoniii.tistory.com https://velog.io/@dktlsk6/Spring% <b>EC</b>% 9C% BC% <b>EB</b>% A<b>1%</b>9C-%<b>EC</b>% <b>B</b><b>9%</b> <b>B</b><b>4%</b> <b>EC</b>% <b>B</b><b>9%</b> <b>B</b><b>4%</b> <b>EC</b>%<b>98%</b> <b>A4</b>-%<b>EB</b>% A<b>1%</b> 9C% EA% <b>B</b>7% <b>B</b>8% <b>EC</b>% 9D% B8-%EA% <b>B</b>5% <b>AC</b>% <b>ED</b>%<b>98%</b>84% <b>ED</b>%95%<b>98%</b> EA% <b>B</b>8% B0 Spring으로 카카오 로그인 구현하기 Spring으로 카카오 로그인 REST API 방식으로 구현...",
      "url": "http://yezi-i.tistory.com/81",
      "blogname": "개발자일지",
      "thumbnail": "https://search4.kakaocdn.net/argon/130x130_85_c/8yyoAh7T7sX",
      "datetime": "2023-07-26T23:58:20.000+09:00"
    },
    {
      "title": "React와 Express로 Kakao Login OAuth 구현하기 (1)",
      "contents": "Express의 기초코드를 설명하진 않는다. https://velog.io/@gbwlxhd97/express%<b>EB</b>%A<b>1%</b>9C-%<b>EC</b>%<b>B</b><b>9%</b><b>B</b><b>4%</b><b>EC</b>%<b>B</b><b>9%</b><b>B</b><b>4%</b><b>EC</b>%<b>98%</b><b>A4</b>-%<b>EC</b>%86%8C%<b>EC</b>%<b>85%</b>9C-%<b>EB</b>%A<b>1%</b>9C%EA%<b>B</b>7%<b>B</b>8%<b>EC</b>%9D%B8-%EA%<b>B</b>8%<b>B</b>0%<b>EB</b>%8A%A5%<b>EC</b>%9D%84-%<b>EC</b>%A0%<b>81%</b><b>EC</b>%9A%A9%<b>ED</b>%95%<b>98%</b>EA%<b>B</b>8%B0 1. 프론트에서 인증코드 요청 /signin 페이지를 다음과 같이 만들었다. 버튼을...",
      "url": "https://wnsdufdl.tistory.com/535",
      "blogname": "기록 (21.7.19 ~",
      "thumbnail": "https://search4.kakaocdn.net/argon/130x130_85_c/1MauGack7Wv",
      "datetime": "2023-07-12T19:57:30.000+09:00"
    },
    {
      "title": "[ORBITY] SpringBoot로 카카오톡 로그인 API 구현하기(1) - 소셜 로그인",
      "contents": "참고 https://codebibimppap.tistory.com/m/11 https://m.blog.naver.com/adamdoha/222674641842 https://velog.io/@shwncho/Spring-%<b>EC</b>%<b>B</b><b>9%</b><b>B</b><b>4%</b><b>EC</b>%<b>B</b><b>9%</b><b>B</b><b>4%</b><b>EC</b>%<b>98%</b><b>A4</b>-%<b>EB</b>%A<b>1%</b>9C%EA%<b>B</b>7%<b>B</b>8%<b>EC</b>%9D%B8-APIoAuth-2.0 https://velog.io/@dktlsk6/Spring%<b>EC</b>%9C%BC%<b>EB</b>%A<b>1%</b>9C-%<b>EC</b>%<b>B</b><b>9%</b><b>B</b><b>4%</b><b>EC</b>%<b>B</b><b>9%</b><b>B</b><b>4%</b><b>EC</b>%<b>98%</b><b>A4</b>-%<b>EB</b>%A<b>1%</b>9C%EA%<b>B</b>7%<b>B</b>8%<b>EC</b>%9D...",
      "url": "http://wonderson.tistory.com/344",
      "blogname": "꾸준히 하자",
      "thumbnail": "https://search1.kakaocdn.net/argon/130x130_85_c/33pcbr3Wx6U",
      "datetime": "2023-05-10T23:06:58.000+09:00"
    },
    {
      "title": "[일본 여행] 후쿠오카 소프트뱅크 호크스 페이페이 돔(pay pay Dom) 야구 직관 예매 방법 / 2023매의...",
      "contents": "있어요!!! ​ ​ ​ ​ 드디어 왔당 후쿠오카 페이페이 돔 ​ 사진출처 : 나무위키 https://namu.wiki/w/%<b>ED</b>%9B%84%<b>EC</b>%BF%A0%<b>EC</b>%<b>98%</b><b>A4</b>%<b>EC</b>%<b>B</b><b>9%</b><b>B</b><b>4%</b>20%<b>EC</b>%86%8C%<b>ED</b>%94%84%<b>ED</b>%8A%<b>B</b>8%<b>EB</b>%<b>B</b><b>1%</b><b>85%</b><b>ED</b>%<b>81%</b><b>AC</b>%20%<b>ED</b>%<b>98%</b><b>B</b>8%<b>ED</b>%<b>81%</b><b>AC</b>%<b>EC</b>%8A%<b>A4</b> ​ 우선 후쿠오카 소프트뱅크 호크스 구단 설명을 조금 해드릴게요! 일본프로야구 퍼시픽 리그의 프로...",
      "url": "https://blog.naver.com/suaddua94/223185950967",
      "blogname": "뚜앙이와 모래",
      "thumbnail": "https://search2.kakaocdn.net/argon/130x130_85_c/FqpXPnLzpxI",
      "datetime": "2023-08-17T12:48:00.000+09:00"
    },
    {
      "title": "케이팝 남돌 소트 최신판 링크ㅣ 후기",
      "contents": "<b>85%</b><b>ED</b>%<b>98%</b>B8&amp;%<b>EC</b>%A0%84%<b>EC</b>%9B%85&amp;%<b>EC</b>%<b>B</b>0%A8%<b>EC</b>%<b>A4</b>%80%<b>ED</b>%<b>98%</b>B8&amp;%<b>EC</b>%88%<b>98%</b><b>EB</b>%<b>B</b><b>9%</b>88&amp;%EA%<b>B</b><b>9%</b>80%<b>EC</b>%<b>A4</b>%80%<b>EC</b>%84%9C&amp;%<b>ED</b>%9C%<b>98%</b><b>EC</b>%<b>B</b>0%<b>AC</b>&amp;%<b>EB</b>%AA%<b>85%</b><b>EC</b>%9E%<b>AC</b>%<b>ED</b>%<b>98%</b>84&amp;%<b>EC</b>%<b>A4</b>%80%<b>EC</b>%9A%B0&amp;%<b>EC</b>%95%84%<b>EC</b>%9D%<b>B</b><b>4%</b><b>EC</b>%97%94&amp;%EA%<b>B</b>0%95%<b>EC</b>%84%9D%<b>ED</b>%99%94&amp;%<b>EC</b>%84%<b>B</b><b>1%</b><b>EB</b>%AF%BC(%<b>ED</b>%<b>81%</b><b>AC</b>%<b>EB</b>%9E%<b>98%</b><b>EB</b>%<b>B</b><b>9%</b>84%<b>ED</b>%8B%B0)&amp;%<b>ED</b>%83%9C%<b>EB</b>...",
      "url": "https://blog.naver.com/hyeouni0022/223193407301",
      "blogname": "NANAMEE",
      "thumbnail": "https://search1.kakaocdn.net/argon/130x130_85_c/GvlFbcJWJ1d",
      "datetime": "2023-08-25T17:28:00.000+09:00"
    },
    {
      "title": "독소전 이유는 ?",
      "contents": "8A%<b>A4</b>%20%<b>EC</b>%<b>B</b><b>9%</b><b>B</b><b>4%</b><b>EC</b>%9D%<b>B</b><b>4%</b><b>EC</b>%82%<b>AC</b>%<b>EB</b>%A5%<b>B</b><b>4%</b>20%<b>EC</b>%95%94%<b>EC</b>%82%<b>B</b><b>4%</b>20%<b>EC</b>%82%<b>AC</b>%EA%<b>B</b><b>1%</b>B4 제우스 아빠의 아빠의 고추를 자르는 것은 제우스 아빠였고, 율리우스 카이사르를 죽인 것은 그가 아들 같이 여긴이였고, 진 秦 시황의 만리장성을 지키는 장수를 죽이고 맏아들을 죽이고 을 진 秦 의 멸망으로 이끈 호 胡...",
      "url": "https://blog.naver.com/knock001/223200822937",
      "blogname": "무르 의 공방",
      "thumbnail": "",
      "datetime": "2023-09-03T01:10:00.000+09:00"
    }
  ],
  "pageable": {
    "sort": {
      "empty": true,
      "sorted": false,
      "unsorted": true
    },
    "offset": 10,
    "page_size": 10,
    "page_number": 1,
    "paged": true,
    "unpaged": false
  },
  "last": false,
  "total_pages": 500,
  "total_elements": 5000,
  "size": 10,
  "number": 1,
  "sort": {
    "empty": true,
    "sorted": false,
    "unsorted": true
  },
  "first": false,
  "number_of_elements": 10,
  "empty": false
}
```

## 인기 검색어 API

### path
```http
GET /blog/rank
```

### Request
```
curl -v -X GET "http://localhost:8080/blog/rank"
```

### Response
```json
[
  {
    "keyword": "카카오뱅크2345646",
    "hit": 2
  },
  {
    "keyword": "카카오뱅크1",
    "hit": 2
  },
  {
    "keyword": "카카오뱅크234564657533234",
    "hit": 1
  },
  {
    "keyword": "카카오뱅크23456465753323",
    "hit": 1
  },
  {
    "keyword": "카카오뱅크2345646575332",
    "hit": 1
  },
  {
    "keyword": "카카오뱅크234564657533",
    "hit": 1
  },
  {
    "keyword": "카카오뱅크23456465753",
    "hit": 1
  },
  {
    "keyword": "카카오뱅크2345646575",
    "hit": 1
  },
  {
    "keyword": "카카오뱅크234564657",
    "hit": 1
  },
  {
    "keyword": "카카오뱅크23456465",
    "hit": 1
  }
]
```

# 기능

1. 블로그 검색 (API 장애시 외부 API 사용)
2. 인기 검색어 (redis 실패시 db 조회)

# 외부 라이브러리

- [lombok](https://github.com/projectlombok/lombok)
