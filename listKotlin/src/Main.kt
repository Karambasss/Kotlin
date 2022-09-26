//Реализуйте функцию calculateBugMentions, которая находит количество употреблений слова BUG в списке.
//
//Из консоли/в консоль ничего читать/писать не нужно!
//
//Sample Input:
//
//KLPQYM BUG KHQR KLPQYM JVOJTD JVOJTD BUG BUG KHQR BUG KLPQYM JVOJTD KLPQYM JVOJTD QLSPA KHQR JVOJTD KLPQYM JVOJTD KLPQYM KLPQYM JVOJTD JVOJTD BUG KLPQYM KHQR JVOJTD KHQR KLPQYM KLPQYM JVOJTD KLPQYM BUG BUG BUG
//Sample Output:
//
//8
fun main() {
    println("Введите предложение: ")
    val usr_string : String = readLine()!!
    val myList : List<String> = usr_string.split(" ").toList()
    println("Количество слов BUG в предложении: ${calculateBugMentions(myList)}")

}

fun calculateBugMentions(list_string : List<String>) : Int{
    var bug_cnt = 0
    for (str in list_string){
        if (str == "BUG") bug_cnt++
    }
    return bug_cnt
}