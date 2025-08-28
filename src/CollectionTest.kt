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
    val nums = mutableListOf<Int>(1,2);
    nums.add(3)
    println(nums)
  }

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

    // 랃다식
    val f2: () -> Unit = {println("Hello world")}
    // fun() () -> Unit =   이런 형식으로 되어있는거임. Unit 이 꼭 들어가야함.
    // Unit은 람다함수를 작성할 때 쓰는 예약어이고, 반환타입이라고 보면됨.
  }}
}