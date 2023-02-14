package de.balvi.ce.screen.customer;

import io.jmix.ui.screen.*;
import de.balvi.ce.entity.Customer;

@UiController("ce_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
public class CustomerBrowse extends StandardLookup<Customer> {
}