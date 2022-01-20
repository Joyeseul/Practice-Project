package com.ysjo.section01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LocalDateTimeTest {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        Calendar gregorianCal = new GregorianCalendar();
        LocalDateTime localDate = LocalDateTime.now();

        System.out.println("calendar 사용 : " + cal);
        System.out.println("gregorian 사용 : " + gregorianCal);
        System.out.println("LocalDateTime 사용 : " + localDate);


        /* 오늘 날짜 */
        LocalDate currentDate = LocalDate.now();
        /* String 으로 만들고 싶다면 .format()을 사용한다. */
        String todayDate = currentDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        /* 이번주 월요일, 다음주 일요일 날짜 */
        LocalDate weekStartLoc
                = currentDate.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        LocalDate weekEndLoc
                = currentDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));

        System.out.println("오늘 날짜 : " + currentDate);
        System.out.println("이번주 월요일 날짜 : " + weekStartLoc);
        System.out.println("다음주 일요일 날짜 : " + weekEndLoc);

        /* 검색용 DTO 에 담아준다 */
        int memberNo = 001;
        int myWorkCode = 2; //유연근무제는 2번코드

        WorkInfoDTO todayWorkInfo = new WorkInfoDTO();
        todayWorkInfo.setMemberNo(memberNo);
        todayWorkInfo.setWorkCode(myWorkCode);
        todayWorkInfo.setToday(currentDate);
        todayWorkInfo.setWeekStartDate(weekStartLoc);
        todayWorkInfo.setWeekEndDate(weekEndLoc);

        /* 해당 workInfoDTO 를 가지고 service 로 넘어가서 근무기록을 가져오게 될 것 */
        //List<WorkingLogDTO> workingLogList = mainService.selectWorkingLogList(todayWorkInfo);

    }

}