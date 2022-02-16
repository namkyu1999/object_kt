class Bag(private var amount:Long = 0L, private var invitation: Invitation? = null, private var ticket: Ticket? = null) {

    private fun hasInvitation(): Boolean{
        return this.invitation != null
    }

    fun hasTicket(): Boolean{
        return this.ticket != null
    }

    private fun setTicket(ticket: Ticket): Unit{
        this.ticket = ticket
    }

    private fun minusAmount(amount: Long): Unit{
        this.amount -= amount
    }

    fun plusAmount(amount: Long): Unit{
        this.amount += amount
    }

    fun hold(ticket: Ticket): Long{
        return if(hasInvitation()){
            setTicket(ticket)
            0L
        } else{
            minusAmount(ticket.getFee())
            setTicket(ticket)
            ticket.getFee()
        }
    }

}