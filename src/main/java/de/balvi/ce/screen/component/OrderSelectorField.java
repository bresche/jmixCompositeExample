package de.balvi.ce.screen.component;

import de.balvi.ce.entity.Order;
import io.jmix.core.DataManager;
import io.jmix.core.common.event.Subscription;
import io.jmix.ui.action.Action;
import io.jmix.ui.component.*;
import io.jmix.ui.component.data.ValueSource;
import io.jmix.ui.component.validation.Validator;
import io.jmix.ui.meta.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;


@StudioComponent(
        caption = "OrderSelectorField",
        category = "Components",
        xmlElement = "orderLookupPickerField",
        icon = "io/jmix/ui/icon/component/entityComboBox.svg",
        canvasBehaviour = CanvasBehaviour.COMBO_BOX,
        documentationURL = "https://docs.jmix.io/jmix/%VERSION%/ui/vcl/components/combobox.html"
)
@StudioProperties(
        properties = {
                @StudioProperty(name = "id", type = PropertyType.COMPONENT_ID, required = true),
                @StudioProperty(name = "width", type = PropertyType.SIZE, defaultValue = "100%"),
        }
)
@CompositeDescriptor("order-selector-field.xml")
public class OrderSelectorField extends CompositeComponent<CssLayout> implements Field<Order>,
        CompositeWithCaption, CompositeWithHtmlDescription,
        CompositeWithIcon, CompositeWithContextHelp
{

    public static final String NAME = "orderSelectorField";

    private EntityComboBox<Order> orderLookupPickerField;
    @Autowired
    DataManager dataManager;


    public OrderSelectorField()
    {
        addCreateListener(this::onCreate);
    }


    private void onCreate(CreateEvent createEvent)
    {
        orderLookupPickerField = getInnerComponent("orderLookupPickerField");
        Action picker_open = orderLookupPickerField.getAction("picker_open");
        Action picker_clone = orderLookupPickerField.getAction("picker_clone");


        List<Order> orders = dataManager.load(Order.class)
                .query("select e from ce_Order e ")
                .list();

        orderLookupPickerField.setOptionsList(orders);

    }

    @Override
    public boolean isEditable()
    {
        return true;
    }

    @Override
    public void setEditable(boolean editable)
    {
    }

    @Override
    public boolean isCaptionAsHtml()
    {
        return false;
    }

    @Override
    public void setCaptionAsHtml(boolean captionAsHtml)
    {
    }

    @Override
    public void addValidator(Validator validator)
    {

    }

    @Override
    public void removeValidator(Validator validator)
    {

    }


    @Nullable
    @Override
    public Order getValue()
    {
        return null;
    }

    @Override
    public void setValue(@Nullable Order value)
    {

    }

    @Override
    public Subscription addValueChangeListener(Consumer listener)
    {

        return null;
    }

    @Override
    public boolean isRequired()
    {
        return false;
    }

    @Override
    public void setRequired(boolean required)
    {

    }

    @Nullable
    @Override
    public String getRequiredMessage()
    {
        return null;
    }

    @Override
    public void setRequiredMessage(@Nullable String msg)
    {

    }

    @Override
    public boolean isValid()
    {
        return false;
    }

    @Override
    public void validate() throws ValidationException
    {

    }

    @Override
    public void setValueSource(@Nullable ValueSource valueSource)
    {

    }

    @Nullable
    @Override
    public ValueSource getValueSource()
    {
        return null;
    }

    @Override
    public Collection<Validator<Order>> getValidators()
    {
        return null;
    }


}
