/*
 * This file is generated by jOOQ.
*/
package com.paulliu.jooq.tables.records;


import com.paulliu.jooq.tables.TFianceTemp;
import com.paulliu.jooq.tables.interfaces.ITFianceTemp;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


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
public class TFianceTempRecord extends TableRecordImpl<TFianceTempRecord> implements Record7<String, String, Timestamp, String, String, String, Integer>, ITFianceTemp {

    private static final long serialVersionUID = 945983858;

    /**
     * Setter for <code>test.t_fiance_temp.prod_offer_name</code>.
     */
    @Override
    public TFianceTempRecord setProdOfferName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>test.t_fiance_temp.prod_offer_name</code>.
     */
    @Override
    public String getProdOfferName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>test.t_fiance_temp.prod_offer_id</code>.
     */
    @Override
    public TFianceTempRecord setProdOfferId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>test.t_fiance_temp.prod_offer_id</code>.
     */
    @Override
    public String getProdOfferId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>test.t_fiance_temp.finish_time</code>.
     */
    @Override
    public TFianceTempRecord setFinishTime(Timestamp value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>test.t_fiance_temp.finish_time</code>.
     */
    @Override
    public Timestamp getFinishTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>test.t_fiance_temp.acc_nbr</code>.
     */
    @Override
    public TFianceTempRecord setAccNbr(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>test.t_fiance_temp.acc_nbr</code>.
     */
    @Override
    public String getAccNbr() {
        return (String) get(3);
    }

    /**
     * Setter for <code>test.t_fiance_temp.cust_order_id</code>.
     */
    @Override
    public TFianceTempRecord setCustOrderId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>test.t_fiance_temp.cust_order_id</code>.
     */
    @Override
    public String getCustOrderId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>test.t_fiance_temp.order_item_id</code>.
     */
    @Override
    public TFianceTempRecord setOrderItemId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>test.t_fiance_temp.order_item_id</code>.
     */
    @Override
    public String getOrderItemId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>test.t_fiance_temp.rn</code>.
     */
    @Override
    public TFianceTempRecord setRn(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>test.t_fiance_temp.rn</code>.
     */
    @Override
    public Integer getRn() {
        return (Integer) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, Timestamp, String, String, String, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, Timestamp, String, String, String, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TFianceTemp.T_FIANCE_TEMP.PROD_OFFER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TFianceTemp.T_FIANCE_TEMP.PROD_OFFER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return TFianceTemp.T_FIANCE_TEMP.FINISH_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TFianceTemp.T_FIANCE_TEMP.ACC_NBR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TFianceTemp.T_FIANCE_TEMP.CUST_ORDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TFianceTemp.T_FIANCE_TEMP.ORDER_ITEM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return TFianceTemp.T_FIANCE_TEMP.RN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getProdOfferName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getProdOfferId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getFinishTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getAccNbr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCustOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getOrderItemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getRn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getProdOfferName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getProdOfferId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getFinishTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAccNbr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCustOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getOrderItemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getRn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFianceTempRecord value1(String value) {
        setProdOfferName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFianceTempRecord value2(String value) {
        setProdOfferId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFianceTempRecord value3(Timestamp value) {
        setFinishTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFianceTempRecord value4(String value) {
        setAccNbr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFianceTempRecord value5(String value) {
        setCustOrderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFianceTempRecord value6(String value) {
        setOrderItemId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFianceTempRecord value7(Integer value) {
        setRn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFianceTempRecord values(String value1, String value2, Timestamp value3, String value4, String value5, String value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ITFianceTemp from) {
        setProdOfferName(from.getProdOfferName());
        setProdOfferId(from.getProdOfferId());
        setFinishTime(from.getFinishTime());
        setAccNbr(from.getAccNbr());
        setCustOrderId(from.getCustOrderId());
        setOrderItemId(from.getOrderItemId());
        setRn(from.getRn());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ITFianceTemp> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TFianceTempRecord
     */
    public TFianceTempRecord() {
        super(TFianceTemp.T_FIANCE_TEMP);
    }

    /**
     * Create a detached, initialised TFianceTempRecord
     */
    public TFianceTempRecord(String prodOfferName, String prodOfferId, Timestamp finishTime, String accNbr, String custOrderId, String orderItemId, Integer rn) {
        super(TFianceTemp.T_FIANCE_TEMP);

        set(0, prodOfferName);
        set(1, prodOfferId);
        set(2, finishTime);
        set(3, accNbr);
        set(4, custOrderId);
        set(5, orderItemId);
        set(6, rn);
    }

    public TFianceTempRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}