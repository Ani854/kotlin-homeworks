package collections.partition

// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> = customers.filter {
    val (delivered, undelivered) = it.orders.partition { it -> it.isDelivered }
    undelivered.size > delivered.size
}.toSet()
