fun main() {
    println(spentMoreScreenTimeToday(timeSpentToday = 300, timeSpentYest = 250))
    println(spentMoreScreenTimeToday(timeSpentToday = 300, timeSpentYest = 300))
    println(spentMoreScreenTimeToday(timeSpentToday = 300, timeSpentYest = 400))
}

fun spentMoreScreenTimeToday(timeSpentToday: Int, timeSpentYest: Int): Boolean {
    if (timeSpentToday > timeSpentYest) {
        return true
    }
    else {
        return false
    }
}