import java.time.Duration

class Movie(
    private val title:String,
    private val runningTime: Duration,
    private val fee: Money,
    private val discountPolicy: DiscountPolicy
) {

    fun getFee(): Money = fee

    fun calculateMovieFee(screening: Screening): Money = fee.minus(discountPolicy.calculateDiscountAmount(screening))

}