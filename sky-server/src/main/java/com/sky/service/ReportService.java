package com.sky.service;

import com.sky.vo.TurnoverReportVO;
import com.sky.vo.UserReportVO;

import java.time.LocalDate;

public interface ReportService {
    TurnoverReportVO getTurnoverStatistics(LocalDate startDate, LocalDate endDate);

    UserReportVO getUserStatistics(LocalDate startDate, LocalDate endDate);
}
