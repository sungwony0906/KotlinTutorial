package chap06.section3

class KCustomer {
    companion object {
        const val LEVEL = "INTERMEDIATE"
        @JvmStatic
        fun login() = println("Login...") // 애노테이션 표기 사용
        fun klogin() = println("KLogin")
    }
}