package de.balvi.ce.screen.order;

import io.jmix.ui.screen.*;
import de.balvi.ce.entity.Order;

@UiController("ce_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
public class OrderEdit extends StandardEditor<Order> {
}