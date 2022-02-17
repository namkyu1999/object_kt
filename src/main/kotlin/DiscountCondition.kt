interface DiscountCondition {

    fun isSatisfiedBy(screening: Screening): Boolean

}