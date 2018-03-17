/*
 * This file is generated by jOOQ.
*/
package com.paulliu.jooq.tables.daos;


import com.paulliu.jooq.tables.TCapitalJobLog;
import com.paulliu.jooq.tables.records.TCapitalJobLogRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.async.AbstractAsyncVertxDAO;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;


import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.Optional;
import io.github.jklingsporn.vertx.jooq.rx.async.AsyncRXQueryExecutor;
/**
 * 定时任务日志表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCapitalJobLogDao extends AbstractAsyncVertxDAO<TCapitalJobLogRecord, com.paulliu.jooq.tables.pojos.TCapitalJobLog, Long, Single<List<com.paulliu.jooq.tables.pojos.TCapitalJobLog>>, Single<Optional<com.paulliu.jooq.tables.pojos.TCapitalJobLog>>, Single<Integer>, Single<Long>> implements io.github.jklingsporn.vertx.jooq.rx.VertxDAO<TCapitalJobLogRecord,com.paulliu.jooq.tables.pojos.TCapitalJobLog,Long> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the MYSQL types or POSTGRES.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public TCapitalJobLogDao(Configuration configuration,io.vertx.reactivex.ext.asyncsql.AsyncSQLClient delegate) {
        super(TCapitalJobLog.T_CAPITAL_JOB_LOG, com.paulliu.jooq.tables.pojos.TCapitalJobLog.class, new AsyncRXQueryExecutor<TCapitalJobLogRecord,com.paulliu.jooq.tables.pojos.TCapitalJobLog,Long>(delegate,com.paulliu.jooq.tables.pojos.TCapitalJobLog::new, TCapitalJobLog.T_CAPITAL_JOB_LOG), configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.paulliu.jooq.tables.pojos.TCapitalJobLog object) {
        return object.getId();
    }

    /**
     * Find records that have <code>job_id IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TCapitalJobLog>> findManyByJobId(List<Long> values) {
        return findManyByCondition(TCapitalJobLog.T_CAPITAL_JOB_LOG.JOB_ID.in(values));
    }

    /**
     * Find records that have <code>job_name IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TCapitalJobLog>> findManyByJobName(List<String> values) {
        return findManyByCondition(TCapitalJobLog.T_CAPITAL_JOB_LOG.JOB_NAME.in(values));
    }

    /**
     * Find records that have <code>machine_ip IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TCapitalJobLog>> findManyByMachineIp(List<String> values) {
        return findManyByCondition(TCapitalJobLog.T_CAPITAL_JOB_LOG.MACHINE_IP.in(values));
    }

    /**
     * Find records that have <code>status IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TCapitalJobLog>> findManyByStatus(List<String> values) {
        return findManyByCondition(TCapitalJobLog.T_CAPITAL_JOB_LOG.STATUS.in(values));
    }

    /**
     * Find records that have <code>error_msg IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TCapitalJobLog>> findManyByErrorMsg(List<String> values) {
        return findManyByCondition(TCapitalJobLog.T_CAPITAL_JOB_LOG.ERROR_MSG.in(values));
    }

    /**
     * Find records that have <code>start_date IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TCapitalJobLog>> findManyByStartDate(List<Timestamp> values) {
        return findManyByCondition(TCapitalJobLog.T_CAPITAL_JOB_LOG.START_DATE.in(values));
    }

    /**
     * Find records that have <code>end_date IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TCapitalJobLog>> findManyByEndDate(List<Timestamp> values) {
        return findManyByCondition(TCapitalJobLog.T_CAPITAL_JOB_LOG.END_DATE.in(values));
    }

    /**
     * Find records that have <code>sharding_item IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TCapitalJobLog>> findManyByShardingItem(List<Long> values) {
        return findManyByCondition(TCapitalJobLog.T_CAPITAL_JOB_LOG.SHARDING_ITEM.in(values));
    }

    /**
     * Find records that have <code>exec_count IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TCapitalJobLog>> findManyByExecCount(List<Long> values) {
        return findManyByCondition(TCapitalJobLog.T_CAPITAL_JOB_LOG.EXEC_COUNT.in(values));
    }

    /**
     * Find records that have <code>created_at IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TCapitalJobLog>> findManyByCreatedAt(List<Timestamp> values) {
        return findManyByCondition(TCapitalJobLog.T_CAPITAL_JOB_LOG.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>created_by IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TCapitalJobLog>> findManyByCreatedBy(List<String> values) {
        return findManyByCondition(TCapitalJobLog.T_CAPITAL_JOB_LOG.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>updated_at IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TCapitalJobLog>> findManyByUpdatedAt(List<Timestamp> values) {
        return findManyByCondition(TCapitalJobLog.T_CAPITAL_JOB_LOG.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>updated_by IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TCapitalJobLog>> findManyByUpdatedBy(List<String> values) {
        return findManyByCondition(TCapitalJobLog.T_CAPITAL_JOB_LOG.UPDATED_BY.in(values));
    }

    @Override
    protected java.util.function.Function<Object,Long> keyConverter(){
        return lastId -> Long.valueOf(((Long)lastId).longValue());
    }
}
