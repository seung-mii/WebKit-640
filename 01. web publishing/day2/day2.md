## CSS
### style

- 여백
  - margin : 외부 여백
  - padding : 내부 여백

- 테이블 태그
  - 레이아웃은 레이어로 만들며, 테이블로 레이아웃을 만들면 안됨
  - caption : 테이블의 제목
  - cellpadding : 셀과 셀 사이의 간격
  - cellspacing : 데이터와 셀의 간격
  - rowspan : row와 row를 합치는 것
  - colspan : col와 col를 합치는 것
  - thead : 밑에서 선언해도 테이블 맨 위로 올라감
  - tbody : 굳이 안적어도 Elements를 확인해보면 자동으로 들어가있긴 함
  - th : 테이블 헤드
  - tr : 행
  - td : 열

- 미디어 태그
  - image
    - src : 이미지 경로
    - alt : 그림이 존재하지 않으면 띄워주는 글
  - background
    - background-image : 배경을 이미지로 설정
    - background-repeat : 배경을 반복할 건지 말 건지
    - background-position : 배경의 위치 선정
    - background-attachment : 배경이 스크롤과 따라 움직일 건지 말 건지
    
- 전달 방식
  - get 방식은 url의 ? 뒤에 쿼리스트링으로 바로 서버로 보내도 됨, 노출 O
  - post 방식은 꼭 폼(바디)에 작성해서 서버에 보내야함, 노출 X