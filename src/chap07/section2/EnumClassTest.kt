package chap07.section2

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class DayOfWeek(val num: Int){
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4),
    FRIDAY(5), SATURDAY(6), SUNDAY(7)
}

enum class Color(val r: Int, val g: Int, val b:Int){
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255,255,0), GREEN(0,255,0), BLUE(0,0,255),
    INDIGO(75,0,130), VIOLET(238,130,0);

    fun rgb() = (r * 256 + g) * 256 + b // 메서드를 포함할 수 있음
}

interface Score {
    fun getScore() : Int
}

enum class MemberType(var prio: String) : Score {
    NORMAL("Third"){
        override fun getScore(): Int = 100
    },
    SILVER("Second"){
        override fun getScore(): Int = 500
    },
    GOLD("first"){
        override fun getScore(): Int = 1500
    }
}

fun main() {
    println(Color.BLUE.rgb())

    println(MemberType.NORMAL.getScore())
    println(MemberType.GOLD)
    println(MemberType.valueOf("SILVER"))
    println(MemberType.SILVER.prio)

    for(grade in MemberType.values()){
        println("grade.name = ${grade.name}, prio = ${grade.prio}")
    }
}