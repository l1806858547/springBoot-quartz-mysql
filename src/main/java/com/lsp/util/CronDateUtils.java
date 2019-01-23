package com.lsp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lsp
 * @Title: CronDateUtils
 * @ProjectName lsp
 * @Description: cron表达式和Date之间相互转换工具类
 * @date 2018/12/25 14:03
 */
public class CronDateUtils {
    private static final String CRON_DATE_FORMAT = "ss mm HH dd MM ? yyyy";

    private static final String CRON_DATE_MINUTE ="00 mm HH 00 00 ? 0000";

    public static void main(String[] args) {
        String minuteCron = getMinuteCron(new Date());
        System.out.println(minuteCron);
    }

    /***
     *
     * @param date 时间
     * @return  cron类型的日期
     */
    public static String getMinuteCron(final Date date){
        SimpleDateFormat sdf = new SimpleDateFormat(CRON_DATE_MINUTE);
        String formatTimeStr = "";
        if (date != null) {
            formatTimeStr = sdf.format(date);
        }
        return formatTimeStr;
    }

    /***
     *
     * @param date 时间
     * @return  cron类型的日期
     */
    public static String getCron(final Date date){
        SimpleDateFormat sdf = new SimpleDateFormat(CRON_DATE_FORMAT);
        String formatTimeStr = "";
        if (date != null) {
            formatTimeStr = sdf.format(date);
        }
        return formatTimeStr;
    }

    /***
     *
     * @param cron Quartz cron的类型的日期
     * @return  Date日期
     */

    public static Date getDate(final String cron) {


        if(cron == null) {
            return null;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(CRON_DATE_FORMAT);
        Date date = null;
        try {
            date = sdf.parse(cron);
        } catch (ParseException e) {
            return null;// 此处缺少异常处理,自己根据需要添加
        }
        return date;
    }
}
