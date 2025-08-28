//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

//TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
//TIP <shortcut actionId="Debug"/>을(를) 눌러 코드 디버그를 시작하세요. 1개의 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 중단점을 설정해 드렸습니다
// 언제든 <shortcut actionId="ToggleLineBreakpoint"/>을(를) 눌러 중단점을 더 추가할 수 있습니다.
// IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.

fun main() {   // 코틀린의 목적이 자유로운 언어라고 하셨나 뭐라나
  val name = "Kotlin"  // val: 상수, var: 변수
  println("Hello, " + name + "!")  // 원래 system.out ~이S걸로 썼었는데 여기서는 println으로 씀.

  for (i in 1..5) {  // 1 -- 5 를 뜻하는거.
    println("i = $i")
  }

  //------------------------------------
  val nums = arrayOf(1, 2, 3, 4, 5)
  for (i in 1 until 9) {
    if (i in nums) println("1 is $i. ")
  }
    if (nums is Int) {print(nums.contentToString())}

  //------------------------------------
  //코틀린은 switch가 없음
  // 대신 사용하는 것으로 when
  when (name) {
    "Kotlin" -> println("Kotlin")
    else -> println("UnKnown")
  }

  //------------------ 구구단 -----------------
 for (i in 2 .. 9) {
   for(j in 1 .. 9) {
     println("$i 단: $i * $j = ${i * j}")
   }
 }

// ------------------- 함수 -----------------
  fun add(a: Int, b: Int): Int {
    return a + b
  }  // 여기는 세미콜론 종결자를 안씀.
  // 되게 식이 직관적임.

  var sum = add(3, 5)
  println("$sum")
  println("${add(3, 7)}")

  //----------------- 클래스 -----------------
  open class Animal(var name: String, var age: Int) {
    override fun toString(): String {
      return "[name: ${name} , age: ${age}]"
    }
  } // open 을 적으면 상속 받을 수 있음

  class Dog(name: String, age: Int) : Animal(name = name, age =  age) {}


  var a1 = Animal("사자", 5)
  var a2 = Animal("호랑이",2)

  println("${a1.name} 은(는) ${a1.age} 살 입니다.")
  println("${a2.name} 은(는) ${a2.age} 살 입니다.")

  println(a1)
  println(a2)

  var numberString: Any = 1
  println(numberString)
  numberString = "문자열입니다."
  println(numberString)   // Any를 쓰고싶으면 명시를 해야함.

  var arrayTest: Array<Any> = arrayOf(1,2,3,"문자", "숫자") //Any가 최상위 클래스임.

  // -----------------------CollectionTest---------------------
  val class1 = CollectionTest()
  class1.sample1();  // collectionTest만들었던걸 여기로 부르는 건가.

  CollectionTest().sample1()
  CollectionTest().sample2()
  CollectionTest().sample3()
}

// 코틀린의 변수를 선언할 때 사용하는 예약어 var
// val =>  상수  / 뒤쪽에 형식을 정의해줄 수 있음. 자료형으로

// 코틀린의 자료형 (자바의 기본 자료형에 앞글자만 대문자로 바뀐)
// Byte, Short, Int, Long, Float, Double, Char, Boolean, String
// 연산자도 자바에서 했었던 것들 다 씀
// +, -, *, /, %. >, <, ==, >=, <=, !=, &&, ||, !

// 코틀린에만 있는 연산자
// in ---> 배열형 자료에 값이 포함되어있으면 true. 없으면 false
/*  var nums: Array<Int> = array.of(1,2,3,4,5,6)       // list, array, set 이렇게 3개가 있음
    if(nums in 5) {
      5가 있으면 이곳을 수행
   }
 */

// is ---> 변수의 자료형이 이것인지 확인.
/*  var num: Int = 1
*   if (num is Int) {
*   "num" 이 Int형이면 이곳을 수행
*   }
*/
