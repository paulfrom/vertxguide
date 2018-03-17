/*
 * This file is generated by jOOQ.
*/
package com.paulliu.jooq;


import com.paulliu.jooq.tables.TBonuspackageInfo;
import com.paulliu.jooq.tables.TCapitalControl;
import com.paulliu.jooq.tables.TCapitalJobConfig;
import com.paulliu.jooq.tables.TCapitalJobLog;
import com.paulliu.jooq.tables.TDemo;
import com.paulliu.jooq.tables.TFianceTemp;
import com.paulliu.jooq.tables.TOther;
import com.paulliu.jooq.tables.TWithdrawOrder_201803;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in test
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * 红包套餐属性表
     */
    public static final TBonuspackageInfo T_BONUSPACKAGE_INFO = com.paulliu.jooq.tables.TBonuspackageInfo.T_BONUSPACKAGE_INFO;

    /**
     * 充转提控制表
     */
    public static final TCapitalControl T_CAPITAL_CONTROL = com.paulliu.jooq.tables.TCapitalControl.T_CAPITAL_CONTROL;

    /**
     * 定时任务配置表
     */
    public static final TCapitalJobConfig T_CAPITAL_JOB_CONFIG = com.paulliu.jooq.tables.TCapitalJobConfig.T_CAPITAL_JOB_CONFIG;

    /**
     * 定时任务日志表
     */
    public static final TCapitalJobLog T_CAPITAL_JOB_LOG = com.paulliu.jooq.tables.TCapitalJobLog.T_CAPITAL_JOB_LOG;

    /**
     * The table <code>test.t_demo</code>.
     */
    public static final TDemo T_DEMO = com.paulliu.jooq.tables.TDemo.T_DEMO;

    /**
     * The table <code>test.t_fiance_temp</code>.
     */
    public static final TFianceTemp T_FIANCE_TEMP = com.paulliu.jooq.tables.TFianceTemp.T_FIANCE_TEMP;

    /**
     * The table <code>test.t_other</code>.
     */
    public static final TOther T_OTHER = com.paulliu.jooq.tables.TOther.T_OTHER;

    /**
     * 提现订单表
     */
    public static final TWithdrawOrder_201803 T_WITHDRAW_ORDER_201803 = com.paulliu.jooq.tables.TWithdrawOrder_201803.T_WITHDRAW_ORDER_201803;
}
