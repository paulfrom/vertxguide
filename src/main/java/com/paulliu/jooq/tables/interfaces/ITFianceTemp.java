/*
 * This file is generated by jOOQ.
*/
package com.paulliu.jooq.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITFianceTemp extends VertxPojo, Serializable {

    /**
     * Setter for <code>test.t_fiance_temp.prod_offer_name</code>.
     */
    public ITFianceTemp setProdOfferName(String value);

    /**
     * Getter for <code>test.t_fiance_temp.prod_offer_name</code>.
     */
    public String getProdOfferName();

    /**
     * Setter for <code>test.t_fiance_temp.prod_offer_id</code>.
     */
    public ITFianceTemp setProdOfferId(String value);

    /**
     * Getter for <code>test.t_fiance_temp.prod_offer_id</code>.
     */
    public String getProdOfferId();

    /**
     * Setter for <code>test.t_fiance_temp.finish_time</code>.
     */
    public ITFianceTemp setFinishTime(Timestamp value);

    /**
     * Getter for <code>test.t_fiance_temp.finish_time</code>.
     */
    public Timestamp getFinishTime();

    /**
     * Setter for <code>test.t_fiance_temp.acc_nbr</code>.
     */
    public ITFianceTemp setAccNbr(String value);

    /**
     * Getter for <code>test.t_fiance_temp.acc_nbr</code>.
     */
    public String getAccNbr();

    /**
     * Setter for <code>test.t_fiance_temp.cust_order_id</code>.
     */
    public ITFianceTemp setCustOrderId(String value);

    /**
     * Getter for <code>test.t_fiance_temp.cust_order_id</code>.
     */
    public String getCustOrderId();

    /**
     * Setter for <code>test.t_fiance_temp.order_item_id</code>.
     */
    public ITFianceTemp setOrderItemId(String value);

    /**
     * Getter for <code>test.t_fiance_temp.order_item_id</code>.
     */
    public String getOrderItemId();

    /**
     * Setter for <code>test.t_fiance_temp.rn</code>.
     */
    public ITFianceTemp setRn(Integer value);

    /**
     * Getter for <code>test.t_fiance_temp.rn</code>.
     */
    public Integer getRn();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ITFianceTemp
     */
    public void from(com.paulliu.jooq.tables.interfaces.ITFianceTemp from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ITFianceTemp
     */
    public <E extends com.paulliu.jooq.tables.interfaces.ITFianceTemp> E into(E into);

    @Override
    public default ITFianceTemp fromJson(io.vertx.core.json.JsonObject json) {
        setProdOfferName(json.getString("prod_offer_name"));
        setProdOfferId(json.getString("prod_offer_id"));
        // Omitting unrecognized type java.sql.Timestamp for column finish_time!
        setAccNbr(json.getString("acc_nbr"));
        setCustOrderId(json.getString("cust_order_id"));
        setOrderItemId(json.getString("order_item_id"));
        setRn(json.getInteger("rn"));
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("prod_offer_name",getProdOfferName());
        json.put("prod_offer_id",getProdOfferId());
        // Omitting unrecognized type java.sql.Timestamp for column finish_time!
        json.put("acc_nbr",getAccNbr());
        json.put("cust_order_id",getCustOrderId());
        json.put("order_item_id",getOrderItemId());
        json.put("rn",getRn());
        return json;
    }

}
