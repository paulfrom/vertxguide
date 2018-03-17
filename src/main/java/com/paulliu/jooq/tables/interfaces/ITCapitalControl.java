/*
 * This file is generated by jOOQ.
*/
package com.paulliu.jooq.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 充转提控制表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITCapitalControl extends VertxPojo, Serializable {

    /**
     * Setter for <code>test.t_capital_control.id</code>. ID
     */
    public ITCapitalControl setId(Long value);

    /**
     * Getter for <code>test.t_capital_control.id</code>. ID
     */
    public Long getId();

    /**
     * Setter for <code>test.t_capital_control.control_type</code>. 控制类型
     */
    public ITCapitalControl setControlType(String value);

    /**
     * Getter for <code>test.t_capital_control.control_type</code>. 控制类型
     */
    public String getControlType();

    /**
     * Setter for <code>test.t_capital_control.control_key</code>. KEY
     */
    public ITCapitalControl setControlKey(String value);

    /**
     * Getter for <code>test.t_capital_control.control_key</code>. KEY
     */
    public String getControlKey();

    /**
     * Setter for <code>test.t_capital_control.control_value</code>. VALUE
     */
    public ITCapitalControl setControlValue(String value);

    /**
     * Getter for <code>test.t_capital_control.control_value</code>. VALUE
     */
    public String getControlValue();

    /**
     * Setter for <code>test.t_capital_control.control_status</code>. 状态
     */
    public ITCapitalControl setControlStatus(String value);

    /**
     * Getter for <code>test.t_capital_control.control_status</code>. 状态
     */
    public String getControlStatus();

    /**
     * Setter for <code>test.t_capital_control.created_at</code>. 创建时间
     */
    public ITCapitalControl setCreatedAt(Timestamp value);

    /**
     * Getter for <code>test.t_capital_control.created_at</code>. 创建时间
     */
    public Timestamp getCreatedAt();

    /**
     * Setter for <code>test.t_capital_control.created_by</code>. 创建人
     */
    public ITCapitalControl setCreatedBy(String value);

    /**
     * Getter for <code>test.t_capital_control.created_by</code>. 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>test.t_capital_control.updated_at</code>. 修改时间
     */
    public ITCapitalControl setUpdatedAt(Timestamp value);

    /**
     * Getter for <code>test.t_capital_control.updated_at</code>. 修改时间
     */
    public Timestamp getUpdatedAt();

    /**
     * Setter for <code>test.t_capital_control.updated_by</code>. 修改人
     */
    public ITCapitalControl setUpdatedBy(String value);

    /**
     * Getter for <code>test.t_capital_control.updated_by</code>. 修改人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ITCapitalControl
     */
    public void from(com.paulliu.jooq.tables.interfaces.ITCapitalControl from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ITCapitalControl
     */
    public <E extends com.paulliu.jooq.tables.interfaces.ITCapitalControl> E into(E into);

    @Override
    public default ITCapitalControl fromJson(io.vertx.core.json.JsonObject json) {
        setId(json.getLong("id"));
        setControlType(json.getString("control_type"));
        setControlKey(json.getString("control_key"));
        setControlValue(json.getString("control_value"));
        setControlStatus(json.getString("control_status"));
        // Omitting unrecognized type java.sql.Timestamp for column created_at!
        setCreatedBy(json.getString("created_by"));
        // Omitting unrecognized type java.sql.Timestamp for column updated_at!
        setUpdatedBy(json.getString("updated_by"));
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("id",getId());
        json.put("control_type",getControlType());
        json.put("control_key",getControlKey());
        json.put("control_value",getControlValue());
        json.put("control_status",getControlStatus());
        // Omitting unrecognized type java.sql.Timestamp for column created_at!
        json.put("created_by",getCreatedBy());
        // Omitting unrecognized type java.sql.Timestamp for column updated_at!
        json.put("updated_by",getUpdatedBy());
        return json;
    }

}
