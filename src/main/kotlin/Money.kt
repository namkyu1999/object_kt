import java.math.BigDecimal

class Money(private val amount: BigDecimal){

    companion object {
        val ZERO: Money = Money.wons(0L)

        fun wons(amount: Long):Money = Money(BigDecimal.valueOf(amount))

        fun wons(amount: Double): Money = Money(BigDecimal.valueOf(amount))
    }

    fun plus(amount: Money): Money = Money(this.amount.add(amount.amount))

    fun minus(amount: Money): Money = Money(this.amount.subtract(amount.amount))

    fun times(percent: Double): Money = Money(this.amount.multiply(BigDecimal.valueOf(percent)))

    fun isLessThan(other: Money): Boolean = amount < other.amount

    fun isGreaterThanOrEqual(other: Money): Boolean = amount >= other.amount

}