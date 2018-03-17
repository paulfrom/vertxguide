/*
 * This file is generated by jOOQ.
*/
package com.paulliu.jooq.tables;


import com.paulliu.jooq.Indexes;
import com.paulliu.jooq.Keys;
import com.paulliu.jooq.Test;
import com.paulliu.jooq.tables.records.TCapitalJobConfigRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 定时任务配置表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCapitalJobConfig extends TableImpl<TCapitalJobConfigRecord> {

    private static final long serialVersionUID = -1097929180;

    /**
     * The reference instance of <code>test.t_capital_job_config</code>
     */
    public static final TCapitalJobConfig T_CAPITAL_JOB_CONFIG = new TCapitalJobConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TCapitalJobConfigRecord> getRecordType() {
        return TCapitalJobConfigRecord.class;
    }

    /**
     * The column <code>test.t_capital_job_config.id</code>. ID
     */
    public final TableField<TCapitalJobConfigRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "ID");

    /**
     * The column <code>test.t_capital_job_config.job_name</code>. 任务名称（类名或者bean名）
     */
    public final TableField<TCapitalJobConfigRecord, String> JOB_NAME = createField("job_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "任务名称（类名或者bean名）");

    /**
     * The column <code>test.t_capital_job_config.job_env</code>. 任务运行环境:DEV:开发环境、TEST:综测环境、PRE_PRODUCE:准生产环境、PRODUCE:生产环境
     */
    public final TableField<TCapitalJobConfigRecord, String> JOB_ENV = createField("job_env", org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false), this, "任务运行环境:DEV:开发环境、TEST:综测环境、PRE_PRODUCE:准生产环境、PRODUCE:生产环境");

    /**
     * The column <code>test.t_capital_job_config.job_class</code>. 类名全路径
     */
    public final TableField<TCapitalJobConfigRecord, String> JOB_CLASS = createField("job_class", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "类名全路径");

    /**
     * The column <code>test.t_capital_job_config.status</code>. 状态:normal:有效
     */
    public final TableField<TCapitalJobConfigRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false), this, "状态:normal:有效");

    /**
     * The column <code>test.t_capital_job_config.is_loading</code>. 运行状态：loading:待运行,running:正在运行
     */
    public final TableField<TCapitalJobConfigRecord, String> IS_LOADING = createField("is_loading", org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false), this, "运行状态：loading:待运行,running:正在运行");

    /**
     * The column <code>test.t_capital_job_config.sharding_total_count</code>. 分片总数
     */
    public final TableField<TCapitalJobConfigRecord, Long> SHARDING_TOTAL_COUNT = createField("sharding_total_count", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "分片总数");

    /**
     * The column <code>test.t_capital_job_config.exec_count</code>. 单任务处理条数
     */
    public final TableField<TCapitalJobConfigRecord, Long> EXEC_COUNT = createField("exec_count", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "单任务处理条数");

    /**
     * The column <code>test.t_capital_job_config.job_desc</code>. 任务描述
     */
    public final TableField<TCapitalJobConfigRecord, String> JOB_DESC = createField("job_desc", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "任务描述");

    /**
     * The column <code>test.t_capital_job_config.created_at</code>. 创建时间
     */
    public final TableField<TCapitalJobConfigRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>test.t_capital_job_config.created_by</code>. 创建人
     */
    public final TableField<TCapitalJobConfigRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "创建人");

    /**
     * The column <code>test.t_capital_job_config.updated_at</code>. 修改时间
     */
    public final TableField<TCapitalJobConfigRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "修改时间");

    /**
     * The column <code>test.t_capital_job_config.updated_by</code>. 修改人
     */
    public final TableField<TCapitalJobConfigRecord, String> UPDATED_BY = createField("updated_by", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "修改人");

    /**
     * Create a <code>test.t_capital_job_config</code> table reference
     */
    public TCapitalJobConfig() {
        this(DSL.name("t_capital_job_config"), null);
    }

    /**
     * Create an aliased <code>test.t_capital_job_config</code> table reference
     */
    public TCapitalJobConfig(String alias) {
        this(DSL.name(alias), T_CAPITAL_JOB_CONFIG);
    }

    /**
     * Create an aliased <code>test.t_capital_job_config</code> table reference
     */
    public TCapitalJobConfig(Name alias) {
        this(alias, T_CAPITAL_JOB_CONFIG);
    }

    private TCapitalJobConfig(Name alias, Table<TCapitalJobConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private TCapitalJobConfig(Name alias, Table<TCapitalJobConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "定时任务配置表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Test.TEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.T_CAPITAL_JOB_CONFIG_IU_JOB_CONFIG_JOB_NAME, Indexes.T_CAPITAL_JOB_CONFIG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TCapitalJobConfigRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_CAPITAL_JOB_CONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TCapitalJobConfigRecord> getPrimaryKey() {
        return Keys.KEY_T_CAPITAL_JOB_CONFIG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TCapitalJobConfigRecord>> getKeys() {
        return Arrays.<UniqueKey<TCapitalJobConfigRecord>>asList(Keys.KEY_T_CAPITAL_JOB_CONFIG_PRIMARY, Keys.KEY_T_CAPITAL_JOB_CONFIG_IU_JOB_CONFIG_JOB_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCapitalJobConfig as(String alias) {
        return new TCapitalJobConfig(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCapitalJobConfig as(Name alias) {
        return new TCapitalJobConfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TCapitalJobConfig rename(String name) {
        return new TCapitalJobConfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TCapitalJobConfig rename(Name name) {
        return new TCapitalJobConfig(name, null);
    }
}
