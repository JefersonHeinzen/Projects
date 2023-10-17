package com.DbLeas.jobs;

import com.DbLeas.service.ReportService;
import com.DbLeas.utility.ConstantUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
@RequiredArgsConstructor
@Profile("Report")
public class ReportJobs {

    private final ReportService service;
/*
    @Scheduled(cron = "0 45 6 * * ? ", zone = ConstantUtils.TIME_ZONE )
    public void getNewQuotations() {
        service.saveReport();
    }

 */
}

