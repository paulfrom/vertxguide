/*
 * This file is generated by jOOQ.
*/
package com.paulliu.jooq.tables.daos;


import com.paulliu.jooq.tables.TWithdrawOrder_201803;
import com.paulliu.jooq.tables.records.TWithdrawOrder_201803Record;

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
 * 提现订单表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TWithdrawOrder_201803Dao extends AbstractAsyncVertxDAO<TWithdrawOrder_201803Record, com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803, Long, Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>>, Single<Optional<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>>, Single<Integer>, Single<Long>> implements io.github.jklingsporn.vertx.jooq.rx.VertxDAO<TWithdrawOrder_201803Record,com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803,Long> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the MYSQL types or POSTGRES.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public TWithdrawOrder_201803Dao(Configuration configuration,io.vertx.reactivex.ext.asyncsql.AsyncSQLClient delegate) {
        super(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803, com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803.class, new AsyncRXQueryExecutor<TWithdrawOrder_201803Record,com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803,Long>(delegate,com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803::new, TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803), configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803 object) {
        return object.getId();
    }

    /**
     * Find records that have <code>request_order_no IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByRequestOrderNo(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.REQUEST_ORDER_NO.in(values));
    }

    /**
     * Find records that have <code>withdraw_order_no IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByWithdrawOrderNo(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.WITHDRAW_ORDER_NO.in(values));
    }

    /**
     * Find records that have <code>trade_no IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByTradeNo(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.TRADE_NO.in(values));
    }

    /**
     * Find records that have <code>trade_status IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByTradeStatus(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.TRADE_STATUS.in(values));
    }

    /**
     * Find records that have <code>trade_finished_date IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByTradeFinishedDate(List<Timestamp> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.TRADE_FINISHED_DATE.in(values));
    }

    /**
     * Find records that have <code>pay_amt IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByPayAmt(List<Long> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.PAY_AMT.in(values));
    }

    /**
     * Find records that have <code>discount_amt IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByDiscountAmt(List<Long> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.DISCOUNT_AMT.in(values));
    }

    /**
     * Find records that have <code>fee_amt IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByFeeAmt(List<Long> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.FEE_AMT.in(values));
    }

    /**
     * Find records that have <code>request_system IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByRequestSystem(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.REQUEST_SYSTEM.in(values));
    }

    /**
     * Find records that have <code>request_date IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByRequestDate(List<Timestamp> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.REQUEST_DATE.in(values));
    }

    /**
     * Find records that have <code>product_code IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByProductCode(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.PRODUCT_CODE.in(values));
    }

    /**
     * Find records that have <code>trade_channel IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByTradeChannel(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.TRADE_CHANNEL.in(values));
    }

    /**
     * Find records that have <code>customer_no IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByCustomerNo(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.CUSTOMER_NO.in(values));
    }

    /**
     * Find records that have <code>customer_type IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByCustomerType(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.CUSTOMER_TYPE.in(values));
    }

    /**
     * Find records that have <code>bank_card_no IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByBankCardNo(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.BANK_CARD_NO.in(values));
    }

    /**
     * Find records that have <code>mask_bank_card_no IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByMaskBankCardNo(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.MASK_BANK_CARD_NO.in(values));
    }

    /**
     * Find records that have <code>bank_org IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByBankOrg(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.BANK_ORG.in(values));
    }

    /**
     * Find records that have <code>bank_name IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByBankName(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.BANK_NAME.in(values));
    }

    /**
     * Find records that have <code>pub_pri_type IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByPubPriType(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.PUB_PRI_TYPE.in(values));
    }

    /**
     * Find records that have <code>customer_name IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByCustomerName(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.CUSTOMER_NAME.in(values));
    }

    /**
     * Find records that have <code>card_type IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByCardType(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.CARD_TYPE.in(values));
    }

    /**
     * Find records that have <code>amount IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByAmount(List<Integer> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.AMOUNT.in(values));
    }

    /**
     * Find records that have <code>ccy IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByCcy(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.CCY.in(values));
    }

    /**
     * Find records that have <code>trans_reason IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByTransReason(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.TRANS_REASON.in(values));
    }

    /**
     * Find records that have <code>operator IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByOperator(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.OPERATOR.in(values));
    }

    /**
     * Find records that have <code>memo IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByMemo(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.MEMO.in(values));
    }

    /**
     * Find records that have <code>result_code IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByResultCode(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.RESULT_CODE.in(values));
    }

    /**
     * Find records that have <code>result_msg IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByResultMsg(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.RESULT_MSG.in(values));
    }

    /**
     * Find records that have <code>created_at IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByCreatedAt(List<Timestamp> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>created_by IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByCreatedBy(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>updated_at IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByUpdatedAt(List<Timestamp> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>updated_by IN (values)</code> asynchronously
     */
    public Single<List<com.paulliu.jooq.tables.pojos.TWithdrawOrder_201803>> findManyByUpdatedBy(List<String> values) {
        return findManyByCondition(TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803.UPDATED_BY.in(values));
    }

    @Override
    protected java.util.function.Function<Object,Long> keyConverter(){
        return lastId -> Long.valueOf(((Long)lastId).longValue());
    }
}
