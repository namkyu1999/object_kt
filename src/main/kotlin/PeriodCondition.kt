import java.time.DayOfWeek
import java.time.LocalTime

class PeriodCondition(
    private val dayOfWeek: DayOfWeek,
    private val startTime: LocalTime,
    private val endTime: LocalTime,
):DiscountCondition {
    override fun isSatisfiedBy(screening: Screening): Boolean =
        screening.getStartTime().dayOfWeek.equals(dayOfWeek) &&
                startTime <= screening.getStartTime().toLocalTime() &&
                endTime >= screening.getStartTime().toLocalTime()
}