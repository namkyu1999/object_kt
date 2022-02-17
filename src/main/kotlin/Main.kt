import java.time.DayOfWeek
import java.time.Duration
import java.time.LocalTime

fun main() {

    val avatar:Movie = Movie(
        "아바타",
        Duration.ofMinutes(120),
        Money.wons(1000),
        AmountDiscountPolicy(
            Money.wons(800),
            SequenceCondition(1),
            SequenceCondition(10),
            PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
            PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
        ),
    )

    val kingsMen:Movie = Movie(
        "아바타",
        Duration.ofMinutes(120),
        Money.wons(1000),
        PercentDiscountPolicy(
            0.1,
            SequenceCondition(1),
            SequenceCondition(10),
            PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
            PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
        ),
    )




}
