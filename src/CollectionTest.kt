class CollectionTest {
  //  코틀린에서 대표적인 collection은
 /*
      listOf(), setOf(), mapOf() : 기본이 Immutable
      이 세가지는 불변성을 가지고 있어서 크기 뿐만 아니라 그 안에 들어있는 값도 바꾸지 못함.

      <mutable 타입>
      mutableListOf(), mutableSetOf(), mutableMapOf()
 */

  // ----------------sample1-------------------
  fun sample1() {
    val nums = mutableListOf<Int>(1,2,3);
    nums.add(4)
    println(nums)
  }

  // ----------------sample2-------------------
  fun sample2() {
    val nums = mutableSetOf<Int>(1,2,3);
    nums.add(3)
    println(nums)
  }  // setOf는 중복 제외함.

  // ----------------sample3-------------------
  fun sample3() {
    val nums = mutableMapOf(1 to "one", 2 to "two", 3 to "three");  // 앞에꺼가 key, 뒤에가 value
    nums[4] = "four"   // key값을 그냥 넣어줌. key값, value값

    // map에서 값을 하나씩 꺼내는 방법
    // 1.
    for((k,v) in nums) {
      println("$k -> $v")
    }
    // 2.
    nums.forEach { (k,v) -> println("$k -> $v") }

    // 3. Entry 객체를 이용
    for (entry in nums.entries) {
      println("${entry.key} -> ${entry.value}")
    }
  }

  // ----------------람다식-------------------
  fun sample4() { {
    // 일반함수
    val f1 = fun() {println("Hello world")}

    // 람다식
    val f2: () -> Unit = {println("Hello world")}
    // fun() () -> Unit =   이런 형식으로 되어있는거임. Unit 이 꼭 들어가야함.
    // Unit은 람다함수를 작성할 때 쓰는 예약어이고, 반환타입이라고 보면됨.

// ----------------람다식 언니가 보내준거. unit 없이 사용하는법-------------------
//    fun sample4() {
//    일반함수 fun () 대신 () -> Unit = 사용 가능 (무조건 Unit (반환 타임)) 예약어
//      val f1 = fun () {println("람다식 사용해보기 ㅎ")}

//      // 람다식
//      val f2: () -> Unit =  {
  //      println("Unit 사용해보기")
  //      }
//      val f3 = { println("타입추론 사용해보기 ㅎㅎ") }
//
//      f1()
//      f2()
//      f3()
//    }
// ----------------------------------------------------------------------------------

// ----------------람다식 사용법 250829 수업-------------------
    val sum: (x:Int, y:Int) -> Int = { x, y -> x + y }
    val sum1 = {x:Int, y:Int  -> x + y}   // 위에꺼랑 2개가 같은 코드. sum을 줄여서 표현하는 방법
    val sum2 = {x:Int, y: Int ->
      println("$x,$y")  // x 뒤에 값을 더 적을 때 붙여서 쓰면 합쳐서 다 변수로 보기때문에 중괄호 써줘야함.
      x + y  // 마지막 줄에 리턴되는 값 적으면 됨
    }
    println("${sum(2,2)}")   // print 템플릿에는 if나 반복문 그런것들은 들어갈 수 없음

    // 감단한 식을 람다식으로. 복잡한 식은 함수로 만들어서 함

  }}
}