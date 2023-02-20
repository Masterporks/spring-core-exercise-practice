package org.sda.beans;

import lombok.Setter;

/**
 * @author Joosep Korela
 * @Date 20.02.2023
 */

@Setter
public class MyBean {
    private String name;

    public String sayHello() {
        return "Hello! " + name;
    }
}