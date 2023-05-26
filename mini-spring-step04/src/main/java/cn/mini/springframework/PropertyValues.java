package cn.mini.springframework;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class PropertyValues {
    private final List<PropertyValue> propertyValues = new LinkedList<>();

    public void addPropertyValue(PropertyValue propertyValue) { this.propertyValues.add(propertyValue) ;}

    public PropertyValue getPropertyValue(String propertyName){
       Optional<PropertyValue> propertyValueOptional = propertyValues.stream().filter(propertyValue -> propertyValue.getName().equals(propertyName)).findAny();
       return propertyValueOptional.orElse(null);
    }

    public PropertyValue[] getPropertyValues(){
        return this.propertyValues.toArray(new PropertyValue[0]);
    }
}
