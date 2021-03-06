/*
 * This file is generated by jOOQ.
*/
package com.paulliu.jooq.tables.records;


import com.paulliu.jooq.tables.TDemo;
import com.paulliu.jooq.tables.interfaces.ITDemo;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TDemoRecord extends UpdatableRecordImpl<TDemoRecord> implements Record5<Integer, String, Byte, BigDecimal, String>, ITDemo {

    private static final long serialVersionUID = 1537833702;

    /**
     * Setter for <code>test.t_demo.id</code>.
     */
    @Override
    public TDemoRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>test.t_demo.id</code>.
     */
    @Override
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>test.t_demo.name</code>.
     */
    @Override
    public TDemoRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>test.t_demo.name</code>.
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>test.t_demo.age</code>.
     */
    @Override
    public TDemoRecord setAge(Byte value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>test.t_demo.age</code>.
     */
    @Override
    public Byte getAge() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>test.t_demo.money</code>.
     */
    @Override
    public TDemoRecord setMoney(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>test.t_demo.money</code>.
     */
    @Override
    public BigDecimal getMoney() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>test.t_demo.catalog</code>.
     */
    @Override
    public TDemoRecord setCatalog(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>test.t_demo.catalog</code>.
     */
    @Override
    public String getCatalog() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Byte, BigDecimal, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Byte, BigDecimal, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TDemo.T_DEMO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TDemo.T_DEMO.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return TDemo.T_DEMO.AGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return TDemo.T_DEMO.MONEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TDemo.T_DEMO.CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component3() {
        return getAge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getAge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDemoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDemoRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDemoRecord value3(Byte value) {
        setAge(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDemoRecord value4(BigDecimal value) {
        setMoney(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDemoRecord value5(String value) {
        setCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDemoRecord values(Integer value1, String value2, Byte value3, BigDecimal value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ITDemo from) {
        setId(from.getId());
        setName(from.getName());
        setAge(from.getAge());
        setMoney(from.getMoney());
        setCatalog(from.getCatalog());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ITDemo> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TDemoRecord
     */
    public TDemoRecord() {
        super(TDemo.T_DEMO);
    }

    /**
     * Create a detached, initialised TDemoRecord
     */
    public TDemoRecord(Integer id, String name, Byte age, BigDecimal money, String catalog) {
        super(TDemo.T_DEMO);

        set(0, id);
        set(1, name);
        set(2, age);
        set(3, money);
        set(4, catalog);
    }

    public TDemoRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
