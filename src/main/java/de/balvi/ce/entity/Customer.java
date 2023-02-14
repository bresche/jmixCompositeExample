package de.balvi.ce.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "CE_CUSTOMER")
@Entity(name = "ce_Customer")
public class Customer
{
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    public List<Order> getOrders() {return orders;}

    public void setOrders(List<Order> orders) {this.orders = orders;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public UUID getId() {return id;}

    public void setId(UUID id) {this.id = id;}
}