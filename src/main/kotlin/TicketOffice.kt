class TicketOffice(private var amount: Long = 0L, private val tickets: ArrayList<Ticket> = ArrayList<Ticket>()) {

    constructor(amount: Long = 0, vararg tickets: Ticket) : this(amount = amount) {
        this.tickets.addAll(tickets.asList())
    }

    private fun getTicket(): Ticket {
        return tickets.removeAt(0)
    }

    fun minusAmount(amount: Long){
        this.amount -= amount
    }

    private fun plusAmount(amount: Long){
        this.amount += amount
    }

    fun sellTicketTo(audience: Audience){
        plusAmount(audience.buy(getTicket()))
    }
}