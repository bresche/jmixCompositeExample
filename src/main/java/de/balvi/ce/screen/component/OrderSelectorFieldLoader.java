package de.balvi.ce.screen.component;

import io.jmix.ui.xml.layout.loader.AbstractFieldLoader;

public class OrderSelectorFieldLoader extends AbstractFieldLoader<OrderSelectorField>
{
    @Override
    public void createComponent()
    {
        resultComponent = factory.create(OrderSelectorField.NAME);
        loadId(resultComponent, element);
    }
}
