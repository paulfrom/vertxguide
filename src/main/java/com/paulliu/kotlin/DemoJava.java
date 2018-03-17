package com.paulliu.kotlin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigDecimal;

/**
 * usage:
 * <p>
 * </p>
 * User:liusonglin; Date:2017/12/25;ProjectName:vertxguide;
 */
@Data
@JsonIgnoreProperties
public class DemoJava {

    private int id;

    private String name;

    private int age;

    private BigDecimal money;
}
