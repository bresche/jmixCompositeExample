package de.balvi.ce.screen.customer;

import io.jmix.ui.screen.*;
import de.balvi.ce.entity.Customer;

@UiController("ce_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
public class CustomerEdit extends StandardEditor<Customer> {
}