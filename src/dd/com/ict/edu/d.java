package dd.com.ict.edu;

public class d {
/*
  this : 객체 내에서 객체 자신을 지칭하는 예약어
         전역변수와 지역변수의 이름이 같으면 전역변수 앞에 this를 붙임
this() : 객체 내에서 객체 자신의 생성자를 지칭하는 예약어

상속의 중요성
객체 재사용
코드의 간결함을 제공해주는 객체지향적 언어의 장점과 중요한 특징이 됨
개발 시간 단축

추상 클래스
추상화 : 구체적인 개념으로부터 공통된 부분만 추려내 일반화할 수 있도록 하는 것
추상 메서드 : 바디가 없는 메서드
                       구체적인 실행 내용이 없음
                       반드시 abstract 예약어 붙음
추상 클래스 : 추상 메서드를 하나 이상 갖고 있는 클래스
                      일반 클래스가 갖는 생성자, 멤버 필드, 멤버 메서드를 가질 수 있음
                      반드시 abstract 예약어 붙음
추상 클래스를 상속 받았을 때 처리 방법
상속받은 자식 클래스에서 추상 메서드를 구체화 시킴(오버라이딩)
자식 클래스도 추상화함(abstract 예약어 붙임)

디버깅 : 논리적인 오류를 잡기 위해 실행하는 행위
breakpoint : 디버깅 실행시 자동으로 해당 위치에서 실행 중단
단축키 : f8 - 중단점에서 중단점으로 이동
             f5 - 한 문장씩 실행, 메서드를 만나면 안으로 진입
             f6 - 한 문장씩 실행, 메서드를 만나면 건너뜀

예외처리(exception, try ~ catch) : 비정상적인 종료를 정상적인 종료로 유도하고, 예외 발생 시 예외에 대한 처리를 해줌
throws( 예외 전가) : 현재 메서드에서 예외처리를 하지 못 한 경우 자신을 호출한 곳으로 예외객체 전달 , 클래스에서는 사용할 수 없음

인터페이스
map 인터페이스 : 키와 밸류가 1 : 1 대응, 키를 호출하면 밸류가 나옴, 밸류는 중복 가능, 애드로 추가 안되고 풋을 사용해야 함 관련 클래스는 hashmap
queue 인터페이스 : 선입선출형식, 추가는 add, addfirst, addlast, offer, offerfirst, offerlast , 구현 클래스는 linkedlist
list 인터페이스 : 배열과 흡사한 구조, 삽입, 삭제, 추가가 자유로움, 크기 지정 미리 안 해도 됨, stack(후입선출, indexOf(검색, 배열관점), get(index)(요소반환), ArrayList(멀티 스레드 동기화 지원 x), Vector(멀티스레드 지원 o )
set 인터페이스 : 중복이나 특정 기준으로 정렬 x(treeset은 항상 오름차순 정렬), HashSet, TreeSet, 순서 : 컬렉션 생성(종류 : integer, double, character, string), 컬렉션에 객체 넣기(add)

제네릭 : 컬렉션이 어떤 객체로 이루어졌는지 표시하는 객체  타입
컬렉션 : 객체들을 모아서 관리하는 인터페이스들     

final 변수 = 상수 = 데이터 변경 방지
final 메서드 = 오버라이딩 방지 = 메서드 내용 변경 방지
final 클래스 = 상속 방지(자식 클래스 생성 방지)

내부 클래스 : 특정 클래스 내에 또 다른 클래스가 정의되는 것
                      외부 클래스의 모든 멤버들을 자신의 멤버처럼 사용
                      종류 : Member, Local, Static, Anonymous
member : 멤버 변수나 멤버 메서드들과 함께 클래스가 정의된 경우
local : 특정한 메서드 내에 클래스가 정의된 경우(지역변수랑 같음)
static : static 변수와 같이 클래스가 static으로 선언된 경우
anonymous : 참조할 수 있는 이름이 없는 경우 사용



 */
}