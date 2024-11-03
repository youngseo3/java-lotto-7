# java-lotto-precourse

## 로또 발매기 당첨 기준 및 금액
사용자가 구입한 로또 수만큼 발행하여 당첨 번호에 맞는지 확인해 통계를 낸다. <br>
당첨은 1등부터 5등까지 있다. 당첨 기준과 금액은 아래와 같다.

- 1등: 6개 번호 일치 / 2,000,000,000원
- 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
- 3등: 5개 번호 일치 / 1,500,000원
- 4등: 4개 번호 일치 / 50,000원
- 5등: 3개 번호 일치 / 5,000원

## 기능 목록

### 로또 발매기 흐름
- 사용자에게 로또 구입 금액을 입력 받는다.
  - 로또 1장의 가격은 1,000원이다.
  - 구입 금액은 1,000원 단위로 입력 받는다.


- 로또 구입 금액에 해당하는 만큼 로또를 발행한다.
  - 로또 번호의 숫자 범위는 1~45까지이다.
  - 1개의 로또를 발행할 때 중복되지 않는 6개의 랜덤 숫자를 뽑는다.


- 당첨 번호를 입력 받는다.
  - 중복되지 않는 숫자 6개를 입력 받는다.
  - 번호는 쉼표(,)를 기준으로 구분한다.


- 보너스 번호를 입력 받는다.
  - 당첨 번호와 중복되지 않는 숫자 1개를 입력 받는다.


- 발행한 로또 수량 및 번호를 출력한다.
  - 로또 번호는 오름차순으로 정렬한다.


- 당첨 통계를 출력한다.
  - 위 당첨 기준과 금액을 참고한다.
  - 구매한 로또 번호와 당첨 번호를 비교해서 당첨 내역을 출력한다.
  - 수익률은 소수점 둘째 자리에서 반올림하여 출력한다. (ex. 100.0%, 51.5%, 1,000,000.0%)
  - 모든 출력이 끝나면 로또 게임을 종료한다.

### 예외 사항

**요구사항**

- 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨다.
  - "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
  - Exception이 아닌 IllegalArgumentException, IllegalStateException 등과 같은 명확한 유형을 처리한다.

**로또 구입 금액**
- 1,000원으로 나누어 떨어지지 않는 경우 예외 처리한다.

**로또 번호**
- 로또 번호의 개수가 6개가 아니라면 예외가 발생한다.
- 중복되는 숫자인 경우 예외가 발생한다.

**당첨 번호 및 보너스 번호**
- 중복되는 숫자인 경우 예외가 발생한다.