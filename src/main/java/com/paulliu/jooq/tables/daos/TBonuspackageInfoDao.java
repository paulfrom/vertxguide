/*
 * This file is generated by jOOQ.
*/
package com.paulliu.jooq.tables.daos;


import com.paulliu.jooq.tables.TBonuspackageInfo;
import com.paulliu.jooq.tables.records.TBonuspackageInfoRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.async.AbstractAsyncVertxDAO;

import java.sql.Date;
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
 * 红包套餐属性表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBonuspackageInfoDao extends AbstractAsyncVertxDAO<TBonuspackageInfoRecord, com.paulliu.jooq.tables.pojos.TBonuspackageInfo, Long, Single<List<com.paulliu.jooq.tables.pojos.TBonuspackageInfo>>, Single<Optional<com.paulliu.jooq.tables.pojos.TBonuspackageInfo>>, Single<Integer>, Single<Long>> implements io.github.jklingsporn.vertx.jooq.rx.VertxDAO<TBonuspackageInfoRecord,com.paulliu.jooq.tables.pojos.TBonuspackageInfo,Long> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the MYSQL types or POSTGRES.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public TBonuspackageInfoDao(Configuration configuration,io.vertx.reactivex.ext.asyncsql.AsyncSQLClient delegate) {
        super(TBonuspackageInfo.T_BONUSPACKAGE_INFO, com.paulliu.jooq.tables.pojos.TBonuspackageInfo.class, new AsyncRXQueryExecutor<TBonuspackageInfoRecord,com.paulliu.jooq.tables.pojos.TBonuspackageInfo,Long>(delegate,com.paulliu.jooq.tables.pojos.TBonuspackageInfo::new, TBonuspackageInfo.T_BONUSPACKAGE_INFO), configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.paulliu.jooq.tables.pojos.TBonuspackageInfo object) {
        return object.getId();
    }

    /**
     * Find records that have <code>PRODUCT_NO IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TBonuspackageInfo>> findManyByProductNo(List<String> values) {
        return findManyByCondition(TBonuspackageInfo.T_BONUSPACKAGE_INFO.PRODUCT_NO.in(values));
    }

    /**
     * Find records that have <code>CONTRACT_NO IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TBonuspackageInfo>> findManyByContractNo(List<String> values) {
        return findManyByCondition(TBonuspackageInfo.T_BONUSPACKAGE_INFO.CONTRACT_NO.in(values));
    }

    /**
     * Find records that have <code>PROMPT_CODE IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TBonuspackageInfo>> findManyByPromptCode(List<String> values) {
        return findManyByCondition(TBonuspackageInfo.T_BONUSPACKAGE_INFO.PROMPT_CODE.in(values));
    }

    /**
     * Find records that have <code>PROTOCOL_VERSION IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TBonuspackageInfo>> findManyByProtocolVersion(List<String> values) {
        return findManyByCondition(TBonuspackageInfo.T_BONUSPACKAGE_INFO.PROTOCOL_VERSION.in(values));
    }

    /**
     * Find records that have <code>PROTOCOL_BEGIN_AT IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TBonuspackageInfo>> findManyByProtocolBeginAt(List<Date> values) {
        return findManyByCondition(TBonuspackageInfo.T_BONUSPACKAGE_INFO.PROTOCOL_BEGIN_AT.in(values));
    }

    /**
     * Find records that have <code>PROTOCOL_END_AT IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TBonuspackageInfo>> findManyByProtocolEndAt(List<Date> values) {
        return findManyByCondition(TBonuspackageInfo.T_BONUSPACKAGE_INFO.PROTOCOL_END_AT.in(values));
    }

    /**
     * Find records that have <code>REBATE_CYCLE IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TBonuspackageInfo>> findManyByRebateCycle(List<String> values) {
        return findManyByCondition(TBonuspackageInfo.T_BONUSPACKAGE_INFO.REBATE_CYCLE.in(values));
    }

    /**
     * Find records that have <code>FIRST_REBATE_AT IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TBonuspackageInfo>> findManyByFirstRebateAt(List<Date> values) {
        return findManyByCondition(TBonuspackageInfo.T_BONUSPACKAGE_INFO.FIRST_REBATE_AT.in(values));
    }

    /**
     * Find records that have <code>PROTOCOL_STATUS IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TBonuspackageInfo>> findManyByProtocolStatus(List<String> values) {
        return findManyByCondition(TBonuspackageInfo.T_BONUSPACKAGE_INFO.PROTOCOL_STATUS.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TBonuspackageInfo>> findManyByCreatedAt(List<Timestamp> values) {
        return findManyByCondition(TBonuspackageInfo.T_BONUSPACKAGE_INFO.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TBonuspackageInfo>> findManyByCreatedBy(List<String> values) {
        return findManyByCondition(TBonuspackageInfo.T_BONUSPACKAGE_INFO.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TBonuspackageInfo>> findManyByUpdatedAt(List<Timestamp> values) {
        return findManyByCondition(TBonuspackageInfo.T_BONUSPACKAGE_INFO.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TBonuspackageInfo>> findManyByUpdatedBy(List<String> values) {
        return findManyByCondition(TBonuspackageInfo.T_BONUSPACKAGE_INFO.UPDATED_BY.in(values));
    }

    @Override
    protected java.util.function.Function<Object,Long> keyConverter(){
        return lastId -> Long.valueOf(((Long)lastId).longValue());
    }
}
