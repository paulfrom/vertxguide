package com.paulliu.kotlin

import io.vertx.codegen.annotations.DataObject
import java.math.BigDecimal

/**
 * usage:
 * <p>
 * </p>
 * User:liusonglin; Date:2017/12/1;ProjectName:vertxguide;
 */
@DataObject
data class Demo(val id:Int?,val name:List<String>,val age:Int,val money:BigDecimal?)