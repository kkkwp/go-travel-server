# ✈️ 여행 가자 — 여행 패키지 예약 서비스

여행 패키지 검색부터 일정 선택, 예약/결제 흐름까지 제공하는 풀스택 여행 예약 플랫폼입니다.

프론트는 `React 19` 기반으로 최신 `Declarative Router`, `Zustand`, `TanStack Query`를 사용했고,

백엔드는 `Spring Boot + JPA + JWT` 인증 기반으로 구성했습니다.

서비스 목표는 빠른 조회, 직관적인 UI, 안정적인 예약 흐름입니다.

<br />

## 📦 주요 기능

#### 🔐 인증 / 회원

- 회원가입 / 로그인
- JWT 기반 인증
- AccessToken 단독 운영 (RefreshToken 없음)
- `/auth/me` API로 로그인 상태 확인

#### 🛫 여행 패키지 검색

- 지역 기반 패키지 조회
- 필터링 + 정렬
- 상세페이지: 일정, 후기, 가격 정보 표시

#### 📅 항공 스케줄 / 캘린더 조회 최적화

- 월 단위 fetch (서버는 한 번, 클라이언트는 필요한 셀만 렌더)
- `Query Select`로 데이터 가공 최적화
- 가격 스티커 / 항공사 정보 즉시 추출

#### 🧾 예약 시스템

- 패키지 선택 → 날짜 선택 → 항공편 선택 → 예약 완료
- 예약 내역 / 취소 내역 조회
- 예약 상세 페이지

<br />

## 🚀 기술 스택

> Frontend [레포지토리 바로 가기](https://github.com/taeyoung-jo/go-travel-client)

![Vite](https://img.shields.io/badge/Vite-646CFF?logo=vite&logoColor=white)
![React](https://img.shields.io/badge/React-61DAFB?logo=react&logoColor=black)
![React Router](https://img.shields.io/badge/React_Router_v7-CA4245?logo=reactrouter&logoColor=white)
![TypeScript](https://img.shields.io/badge/TypeScript-3178C6?logo=typescript&logoColor=white)
![TailwindCSS](https://img.shields.io/badge/TailwindCSS-38B2AC?logo=tailwindcss&logoColor=white)
![shadcn/ui](https://img.shields.io/badge/shadcn/ui-000000?logo=shadcnui&logoColor=white)
![Zustand](https://img.shields.io/badge/Zustand-443E38)
![TanStack_Query](https://img.shields.io/badge/TanStack_Query-FF4154?logo=reactquery&logoColor=white)
![Axios](https://img.shields.io/badge/Axios-5A29E4?logo=axios&logoColor=white)
![Sonner](https://img.shields.io/badge/Sonner-000000)


- `Vite` — 빠른 개발 서버와 최소 설정으로 빌드 환경 구성
- `React 19` — 전체 UI 렌더링과 페이지 구성
- `React Router v7 (Declarative)` — 페이지 라우팅 구조 선언형으로 관리
- `TypeScript` — API/도메인 타입 안정성 확보
- `TailwindCSS` — UI 스타일을 유틸리티 기반으로 빠르게 구성
- `shadcn/ui` — 재사용 가능한 UI 컴포넌트 세트 활용
- `Zustand` — 로그인 여부 등 최소 전역 상태 관리
- `TanStack Query` — 서버 상태 캐싱 및 비동기 데이터 요청 관리
- `Axios` — 백엔드 API 통신 및 JWT 헤더 처리
- `Sonner` — 토스트 기반 사용자 피드백 제공

<br />

> Backend [레포지토리 바로 가기](https://github.com/taeyoung-jo/go-travel-server)

![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?logo=springboot&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?logo=springsecurity&logoColor=white)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-6DB33F)
![JWT](https://img.shields.io/badge/JWT-000000?logo=jsonwebtokens&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?logo=mysql&logoColor=white)
![MyBatis](https://img.shields.io/badge/MyBatis-BF0A30?logo=mybatis&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?logo=gradle&logoColor=white)

- `Spring Boot 3.x` — 전체 REST API 서버 프레임워크
- `Spring Security 6` — JWT 기반 인증/인가 처리
- `Spring Data JPA` — DB 조회/저장 로직 자동화
- `JWT (jjwt)` — AccessToken 생성 및 검증
- `MySQL` — 서비스 데이터 저장소
- `MyBatis` - 동적 쿼리(필터링) 구현
- `Gradle` — 빌드 및 의존성 관리

<br />

## 💻 실행

> Frontend
```
cd go-travel-client
pnpm install
pnpm dev
```

> backend
```
cd go-travel-server
./gradlew bootRun
```

<br />

## 👨‍👨‍👧‍👧 팀원

<table>
  <tbody>
    <tr>
      <td align="center"><a href="https://github.com/Me1onMusk"><img src="https://github.com/Me1onMusk.png" width="100px;" alt=""/></td>
      <td align="center"><a href="https://github.com/kkkwp"><img src="https://github.com/kkkwp.png" width="100px;" alt=""/></td>
      <td align="center"><a href="https://github.com/choiseohyun55"><img src="https://github.com/choiseohyun55.png" width="100px;" alt=""/></td>
     </tr>
     <tr>
      <td align="center"><a href="https://github.com/Me1onMusk">태영</td> 
      <td align="center"><a href="https://github.com/kkkwp">채윤</td>
      <td align="center"><a href="https://github.com/choiseohyun55">서현</td>
     </tr>
  </tbody>
</table>
