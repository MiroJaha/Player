import kotlin.random.Random

data class Player (val name: String, val age: Int, val height: Double)

fun main(){
    // Lambda
    val greeting = { println("Hello") }
    greeting()
    // Function
    fun greetingFun(){
        println("Hello")
    }
    greetingFun()
    // Lambda
    val personalGreeting = { name:String -> println("Hello $name") }
    personalGreeting("Sam")
    // Function
    fun personalGreetingFun(name: String){
        println("Hello $name")
    }
    personalGreetingFun("Sam")
    // Lambda
    val returnSum = { a: Int, b: Int -> a + b }
    println(returnSum(4, 5))
    // Function
    fun returnSumFun(a: Int, b: Int): Int{
        return a + b
    }
    println(returnSumFun(4, 5))

    val players = arrayListOf<Player>()
    players.add(Player("Miro", 29, 170.3))
    for(i in 1 until 20) {
        val randomAge = Random.nextInt(15,50)
        val randomTall = String.format("%1.1f",Random.nextDouble(120.0,220.0)).toDouble()
        players.add(Player("player$i",randomAge,randomTall))
    }

    // Lambda
    val lambda = {sortedPlayers : ArrayList<Player> ->
        sortedPlayers.sortBy { it.height }
        sortedPlayers.filter { it.name == "player5" }
    }
    println("\n${lambda(players)}\n")

    for (i in players)
        println(i)
    println("\n")

    // Function
    fun lambdaFun(list : ArrayList<Player>): List<Player>{
        list.sortBy { it.name }
        println("${list.filter { it.name == "player8" }}\n")
        return list
    }
    lambdaFun(players)
    for (i in players)
            println(i)
}