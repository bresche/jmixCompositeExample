package de.balvi.ce.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.util.UUID;

@JmixEntity
@Table(name = "CE_ORDER", indexes = {
        @Index(name = "IDX_CE_ORDER_CUSTOMER", columnList = "CUSTOMER_ID")
})
@Entity(name = "ce_Order")
public class Order
{
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @JoinColumn(name = "CUSTOMER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public Customer getCustomer() {return customer;}

    public void setCustomer(Customer customer) {this.customer = customer;}

    public UUID getId() {return id;}

    public void setId(UUID id) {this.id = id;}
}