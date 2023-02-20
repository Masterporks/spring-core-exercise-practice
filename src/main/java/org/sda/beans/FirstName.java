package org.sda.beans;

import org.sda.interfaces.BeanName;
import org.springframework.stereotype.Component;

/**
 * @author Joosep Korela
 * @Date 20.02.2023
 */
@Component(value = "firstName")
public class FirstName implements BeanName {
    private String name;

    public FirstName() {
        this.name = "Vinod";
    }
    @Override
    public String getName() {
        return this.name;
    }
}