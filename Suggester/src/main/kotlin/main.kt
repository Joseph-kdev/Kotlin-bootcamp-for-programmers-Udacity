fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy"))
}
fun whatShouldIDoToday(mood : String,weather : String="sunny",temperature : Int = 24) : String{
    println("Enter mood:")
    val mood = readLine()!!

    val bubbly = mood == "happy" && weather == "Sunny"
    val down =  mood == "sad" && weather == "rainy" && temperature == 0
    val hot = temperature > 35
    return when{
        bubbly -> "go for a walk"
        down -> "stay in bed"
        hot -> "go swimming"
        else -> "Stay home and read."
    }
}