import java.time.LocalDateTime

class Screening(private val movie: Movie, private val sequence: Int, private val whenScreened: LocalDateTime){

    fun getStartTime(): LocalDateTime = whenScreened

    fun isSequence(sequence: Int): Boolean = this.sequence == sequence

    fun getMovieFee(): Money = movie.getFee()

    fun reserve(customer: Customer, audienceCount: Int): Reservation = Reservation(customer, this, calculateFee(audienceCount), audienceCount)

    private fun calculateFee(audienceCount: Int): Money = movie.calculateMovieFee(this).times(audienceCount.toDouble())

}