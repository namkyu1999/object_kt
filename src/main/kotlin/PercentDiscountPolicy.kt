class PercentDiscountPolicy(
    private val percent:Double,
    vararg conditions: DiscountCondition
): DiscountPolicy(*conditions) {
    override fun getDiscountAmount(screening: Screening): Money = screening.getMovieFee().times(percent)
}
