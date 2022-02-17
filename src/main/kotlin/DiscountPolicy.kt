import java.util.*
import kotlin.collections.ArrayList

abstract class DiscountPolicy {

    private var conditions: ArrayList<DiscountCondition> = ArrayList()

    constructor(vararg conditions: DiscountCondition) {
        this.conditions.addAll(conditions)
    }



    fun calculateDiscountAmount(screening: Screening): Money{
        for(each in conditions){
            if(each.isSatisfiedBy(screening)){
                return getDiscountAmount(screening)
            }
        }
        return Money.ZERO
    }

    protected abstract fun getDiscountAmount(screening: Screening): Money

}