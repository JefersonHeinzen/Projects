package com.DbLeas.controller;

import com.DbLeas.entity.Report;
import com.DbLeas.repositories.RepositoriesReport;
import com.DbLeas.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/report-api")
public class ControllerReport {
    private final ReportService service;

    @PostMapping( "/saveReport" )
    public ResponseEntity<Report> saveRport( @RequestBody Report report ) {
        service.saveReport( report );
        return new ResponseEntity<>( report, HttpStatus.OK );
    }
}
