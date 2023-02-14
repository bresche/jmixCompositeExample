package de.balvi.ce;

import de.balvi.ce.screen.component.OrderSelectorField;
import de.balvi.ce.screen.component.OrderSelectorFieldLoader;
import io.jmix.ui.sys.registration.ComponentRegistration;
import io.jmix.ui.sys.registration.ComponentRegistrationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentConfiguration
{
    @Bean
    public ComponentRegistration registerOrderSelectorField()
    {
        return ComponentRegistrationBuilder.create(OrderSelectorField.NAME)
                .withComponentClass(OrderSelectorField.class)
                .withComponentLoaderClass(OrderSelectorFieldLoader.class)
                .build();
    }
}
