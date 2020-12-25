package com.myringle;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateDemoTest {
    public static void main(String[] args) {

        //1.date Thu Dec 24 13:55:44 CST 2020
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:MM:ss");
        Date date = new Date();
        //date 时间戳
        long time = new Date().getTime();
        String format2 = dateFormat.format(time);
        String format = dateFormat.format(date);
        System.out.println("format = " + format);
        System.out.println("format2 = " + format2);
        System.out.println("date = " + date);
        //格林豪治 GMT
        System.out.println("dataGMT=" + date.toGMTString());
        System.out.println("时间差（GMT) =" + date.getTimezoneOffset());  //分钟  -8（-480）
        // 比较时间
        date.after(new Date());  //boolean
        date.before(new Date());    //boolean
        date.compareTo(new Date());  //-1 1 0

        //时间戳 System.currentTimeMillis    timestamp 2020-12-24 13:55:44.891
        long l = System.currentTimeMillis();
        String format1 = dateFormat.format(l);
        System.out.println("systemFormat1 = " + format1);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        long timestampTime = timestamp.getTime();
        Date timestamp2Date = new Date(timestampTime);
        String timestamp2 = dateFormat.format(timestamp2Date);
        System.out.println("timestamp = " + timestamp);
        System.out.println("timestamp2 = " + timestamp2);


        //Calendar   GregorianCalendar 存放多国日历
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        System.out.println("calendar = " + calendar);
        //返回一个data对象 calendar.getTime()
        System.out.println("calendar = " + calendar.getTime());


        //java8包新特性  --java.time包 时间处理类
        //LocalDate类 --本地日期
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);


        //LocalTime
        LocalTime now1 = LocalTime.now();
        System.out.println("now1 = " + now1);

        //LocalDateTime
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("now2 = " + now2);
        //  DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EE dd.MM.YYYY, HH:mm:ss | KK:mm:ss a");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String LDTNow2 = now2.format(dateTimeFormatter);
        System.out.println("LDTNow2 = " + LDTNow2);
        LocalDate localDate = LocalDate.of(2019, 2, 14);
        LocalDateTime of = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(localDate);
        System.out.println("of = " + of);


        // 一个时间戳    2020-12-24T05:55:44.968Z
        Instant instant = Instant.now();
        System.out.println("instant = " + instant);

        //Duration 类
        LocalDateTime of1 = LocalDateTime.of(2020, 12, 25, 0, 0, 0,0);
        System.out.println("LocalDateTime.now() = " + LocalDateTime.now());
        System.out.println("of1 = " + of1);
        Duration between = Duration.between(LocalDateTime.now(), LocalDateTime.of(2020,Month.DECEMBER,22,16,31));
        long toDays1 = between.toDays();
        long toMillis = between.toMillis();
        System.out.println("toDays1 :" + toDays1);
        System.out.println("toMillis :" + toMillis);

        //
        Duration between2 = Duration.of(5, ChronoUnit.DAYS);
        long l1 = between2.toDays();
        System.out.println("l1 = " + l1);

        Duration duration = Duration.ofMillis(-174602730);
        long l2 = duration.toDays();
        System.out.println("l2 = " + l2);


        //Duration类
        // 一个时间段
        Duration durationTest = Duration.between(LocalDateTime.now(),LocalDateTime.now());
        long toDays = duration.toDays(); // 这个时间段中有几天
        long toHours = duration.toHours(); // 这个时间段中有几个小时

        // 通过of创建时间段
        Duration duration1 = Duration.of(5, ChronoUnit.DAYS);


        //Period类
        // 以年月日来表示时间段
        Period period = Period.between(localDate, LocalDate.now());



        // 时间加减操作
        LocalDate LDdate = LocalDate.now();
        LocalDate localDate2 = LDdate.minusDays(5);
        LocalDate localDate3 = LDdate.plusYears(10);
        LDdate.plus(5, ChronoUnit.DAYS);
        System.out.println("localDate3 = " + localDate3);
        System.out.println("localDate2 = " + localDate2);
    }

}

