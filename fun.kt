fun main() {
    reverseInt(123)
}

fun reverseInt(n:Int) {
    var p:Int = n
    while(p>0) {
        print(p%10)
        p = p/10
    }
}