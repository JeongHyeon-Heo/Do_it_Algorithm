## 01-1 알고리즘이란 ? 
* 어떤 문제를 해결하기 위한 절차로, 명확하게 정의되고 순서가 있는 유한 개의 규칙으로 이루어진 집합

-----
## Q1 ~ Q3
##### 순차 구조 : 세 값의 최댓값,최솟값구하기

    max = a;
    if(b>max){ max = b; }
    if(c>max){ max = c; } 

* 순차적으로 실행되는 구조를 순차 구조라고 한다.
* if문으로 연속되어 a,b,c의 세 값을 비교하고 최댓값을 출력한다.

##### 숫자와 문자열 입력하기
    
    import java.util.Scanner    
    Scanner sc = new Scanner(System.in);    
    sc.nextInt(); 입력한 값 중 정숫값을 읽어들인다. 
    next(), nextLine()등이 있다.

* 가인수 : 메서드를 정의할 때 메서드에 전달되는 값을 저장하기 위해 변수를 선언할 때 쓰는 변수로
    
    매개변수 또는 파라미터라고 부른다. 
* 실인수 : 메서드를 호출할 때 사용하는 매개변숫값 

-----
## Q4 ~ Q5 

#### 결정 트리 : 조합을 나열한 모양이 나무 형태라서 결정 트리이다.
* 조건이 성립하면 윗가지로, 아니라면 아랫 가지로

#### 흐름 분기 
* if (false) -> else if(false) -> else 
* if (false) -> else if(false) -> else if(false) -> else if(false) 조건 만족을 못할 시 아무것도 출력하지 않음.

#### 3항 연산자 
     a = (x > y) ? x : y; // 큰 값을 a에 대입한다. true면 왼쪽, false면 오른쪽
     (2항) x>y
     (1항) a++

#### 순서도의 기호
* 사다리꼴 : 데이터의 입력과 출력 
* 직사각형 : 처리의 여러 종류
* 직사각형+외각 : 이미 정의된 하나 이상의 연산 또는 여러 개의 명령어
* 마름모 : 판단은 하나의 입구와 하나를 선택하는 몇개의 출구가 있어 조건을 평가한다.
* 루프 범위 : i: 1, 1, n 은 i를 1부터 n까지 1씩 증가하면서 처리를 n번 반복하는 순서도
* 선 : 제어의 흐름
* 단말 : 외부 환경에서 들어오거나 나가는 것.

----

## 01-2 반복 
