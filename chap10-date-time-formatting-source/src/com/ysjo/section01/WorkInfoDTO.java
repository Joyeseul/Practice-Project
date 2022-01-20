package com.ysjo.section01;

import java.io.Serializable;
import java.time.LocalDate;

public class WorkInfoDTO implements Serializable {

    private int memberNo;               //회원번호
    private int workCode;               //근무제번호
    private LocalDate today;            //오늘날짜
    private LocalDate weekStartDate;    //이번주 시작일
    private LocalDate weekEndDate;      //이번주 종료일
    private String selectedDate;

    public WorkInfoDTO() {}

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public int getWorkCode() {
        return workCode;
    }

    public void setWorkCode(int workCode) {
        this.workCode = workCode;
    }

    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
    }

    public LocalDate getWeekStartDate() {
        return weekStartDate;
    }

    public void setWeekStartDate(LocalDate weekStartDate) {
        this.weekStartDate = weekStartDate;
    }

    public LocalDate getWeekEndDate() {
        return weekEndDate;
    }

    public void setWeekEndDate(LocalDate weekEndDate) {
        this.weekEndDate = weekEndDate;
    }

    public String getSelectedDate() {
        return selectedDate;
    }

    public void setSelectedDate(String selectedDate) {
        this.selectedDate = selectedDate;
    }

    @Override
    public String toString() {
        return "WorkInfoDTO{" +
                "memberNo=" + memberNo +
                ", workCode=" + workCode +
                ", today=" + today +
                ", weekStartDate=" + weekStartDate +
                ", weekEndDate=" + weekEndDate +
                ", selectedDate='" + selectedDate + '\'' +
                '}';
    }
}
