package de.balvi.ce.screen.order;

import io.jmix.ui.screen.*;
import de.balvi.ce.entity.Order;

@UiController("ce_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
public class OrderBrowse extends StandardLookup<Order> {
}