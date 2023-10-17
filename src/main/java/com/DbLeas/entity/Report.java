package com.DbLeas.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;


@Builder
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "Report")
public class Report {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(columnDefinition = "varchar(62)")
    private long id;

    @Lob
    @Column(name = "externalId", columnDefinition = "TEXT")
    private  String externalId;

    @Lob
    @Column(name = "reportCompVline", columnDefinition = "TEXT")
    private String reportCompVline;

    @Lob
    @Column(name = "reportCtrl3", columnDefinition = "TEXT")
    private String reportCtrl3;
    @Lob
    @Column(name = "reportSysimax", columnDefinition = "TEXT")
    private String reportSysimax;

    @Lob
    @Column(name = "reportWtime", columnDefinition = "TEXT")
    private String reportWtime;

    @Lob
    @Column(name = "reportPpre", columnDefinition = "TEXT")
    private String reportPpre;

    @Lob
    @Column(name = "reportPosfin", columnDefinition = "TEXT")
    private String reportPosfin;
    @Lob
    @Column(name = "reportDropVline", columnDefinition = "TEXT")
    private String reportDropVline;

    @Lob
    @Column(name = "reportNprog", columnDefinition = "TEXT")
    private String reportNprog;

    @Lob
    @Column(name = "reportForzaini", columnDefinition = "TEXT")
    private String reportForzaini;

    @Lob
    @Column(name = "reportCtrl2", columnDefinition = "TEXT")
    private String reportCtrl2;

    @Lob
    @Column(name = "reportCtrl1", columnDefinition = "TEXT")
    private String reportCtrl1;

    @Lob
    @Column(name = "reportIweld", columnDefinition = "TEXT")
    private String reportIweld;

    @Lob
    @Column(name = "reportPos", columnDefinition = "TEXT")
    private String reportPos;

    @Lob
    @Column(name = "reportPweld", columnDefinition = "TEXT")
    private String reportPweld;

    @Lob
    @Column(name = "reportKmode", columnDefinition = "TEXT")
    private String reportKmode;

    @Lob
    @Column(name = "reportWeldState", columnDefinition = "TEXT")
    private String reportWeldState;

    @Lob
    @Column(name = "reportPosini", columnDefinition = "TEXT")
    private String reportPosini;

    @Lob
    @Column(name = "reportRes", columnDefinition = "TEXT")
    private String reportRes;

    @Lob
    @Column(name = "reportForza", columnDefinition = "TEXT")
    private String reportForza;

    @Lob
    @Column(name = "reportForzafin", columnDefinition = "TEXT")
    private String reportForzafin;

    @Lob
    @Column(name = "reportEnergia", columnDefinition = "TEXT")
    private String reportEnergia;

    @Lob
    @Column(name = "reportResfin", columnDefinition = "TEXT")
    private String reportResfin;

    @Lob
    @Column(name = "reportAlarms", columnDefinition = "TEXT")
    private String reportAlarms;

    @Lob
    @Column(name = "reportWarnings", columnDefinition = "TEXT")
    private String reportWarnings;

    @Lob
    @Column(name = "reportAnwld", columnDefinition = "TEXT")
    private String reportAnwld;

    @Lob
    @Column(name = "reportPric", columnDefinition = "TEXT")
    private String reportPric;

    @Lob
    @Column(name = "reportImax", columnDefinition = "TEXT")
    private String reportImax;

    @Lob
    @Column(name = "reportIpre", columnDefinition = "TEXT")
    private String reportIpre;

    @Lob
    @Column(name = "reportCounter", columnDefinition = "TEXT")
    private String reportCounter;

    @Lob
    @Column(name = "reportWeldResult", columnDefinition = "TEXT")
    private String reportWeldResult;
    @Lob
    @Column(name = "reportVsec", columnDefinition = "TEXT")
    private String reportVsec;

    @Lob
    @Column(name = "reportDpmax", columnDefinition = "TEXT")
    private String reportDpmax;

    @Lob
    @Column(name = "reportNwld", columnDefinition = "TEXT")
    private String reportNwld;

    @Lob
    @Column(name = "reportIric", columnDefinition = "TEXT")
    private String reportIric;

    @Lob
    @Column(name = "reportDpmin", columnDefinition = "TEXT")
    private String reportDpmin;

    @Lob
    @Column(name = "reportPf", columnDefinition = "TEXT")
    private String reportPf;

    @Lob
    @Column(name = "reportId2", columnDefinition = "TEXT")
    private String reportId2;

    @Lob
    @Column(name = "reportId1", columnDefinition = "TEXT")
    private String reportId1;

    @Lob
    @Column(name = "reportImin", columnDefinition = "TEXT")
    private String reportImin;

    @Lob
    @Column(name = "reportId4", columnDefinition = "TEXT")
    private String reportId4;

    @Lob
    @Column(name = "reportId3", columnDefinition = "TEXT")
    private String reportId3;
    @Lob
    @Column(name = "reportResmin", columnDefinition = "TEXT")
    private String reportResmin;
    private String programCtrl3ERP;

    @Lob
    @Column(name = "programIemin", columnDefinition = "TEXT")
    private String programIemin;

    @Lob
    @Column(name = "programSlup", columnDefinition = "TEXT")
    private String programSlup;
    private String programBlank;

    @Lob
    @Column(name = "programSldwn", columnDefinition = "TEXT")
    private String programSldwn;

    @Lob
    @Column(name = "programEv2On", columnDefinition = "TEXT")
    private String programEv2On;

    @Lob
    @Column(name = "programKmod", columnDefinition = "TEXT")
    private String programKmod;

    @Lob
    @Column(name = "programCtrl3ERM", columnDefinition = "TEXT")
    private String programCtrl3ERM;

    @Lob
    @Column(name = "programCtrlmo", columnDefinition = "TEXT")
    private String programCtrlmo;

    @Lob
    @Column(name = "programEnConst", columnDefinition = "TEXT")
    private String programEnConst;

    @Lob
    @Column(name = "programPwld", columnDefinition = "TEXT")
    private String programPwld;

    @Lob
    @Column(name = "programTwld1", columnDefinition = "TEXT")
    private String programTwld1;
    @Lob
    @Column(name = "programTwld", columnDefinition = "TEXT")
    private String programTwld;

    @Lob
    @Column(name = "programImp", columnDefinition = "TEXT")
    private String programImp;

    @Lob
    @Column(name = "programTwld2", columnDefinition = "TEXT")
    private String programTwld2;

    @Lob
    @Column(name = "programCtrl3Sel", columnDefinition = "TEXT")
    private String programCtrl3Sel;

    @Lob
    @Column(name = "programInt2", columnDefinition = "TEXT")
    private String programInt2;

    @Lob
    @Column(name = "programInt1", columnDefinition = "TEXT")
    private String programInt1;

    @Lob
    @Column(name = "programIwld", columnDefinition = "TEXT")
    private String programIwld;

    @Lob
    @Column(name = "programEv2Off", columnDefinition = "TEXT")
    private String programEv2Off;

    @Lob
    @Column(name = "programEnergy", columnDefinition = "TEXT")
    private String programEnergy;

    @Lob
    @Column(name = "programForceEnd", columnDefinition = "TEXT")
    private String programForceEnd;

    @Lob
    @Column(name = "programInitForce", columnDefinition = "TEXT")
    private String programInitForce;

    @Lob
    @Column(name = "programEv2", columnDefinition = "TEXT")
    private String programEv2;

    @Lob
    @Column(name = "programEv1", columnDefinition = "TEXT")
    private String programEv1;

    @Lob
    @Column(name = "programHld", columnDefinition = "TEXT")
    private String programHld;

    @Lob
    @Column(name = "programDltag", columnDefinition = "TEXT")
    private String programDltag;

    @Lob
    @Column(name = "programResist", columnDefinition = "TEXT")
    private String programResist;
    private String programCounter;

    @Lob
    @Column(name = "programStroke", columnDefinition = "TEXT")
    private String programStroke;

    @Lob
    @Column(name = "programInt", columnDefinition = "TEXT")
    private String programInt;

    @Lob
    @Column(name = "programPwld1", columnDefinition = "TEXT")
    private String programPwld1;

    @Lob
    @Column(name = "programPwld2", columnDefinition = "TEXT")
    private String programPwld2;
    private String programCtrl1Sel;

    @Lob
    @Column(name = "programDacval", columnDefinition = "TEXT")
    private String programDacval;

    @Lob
    @Column(name = "programIwld2", columnDefinition = "TEXT")
    private String programIwld2;

    @Lob
    @Column(name = "programIwld1", columnDefinition = "TEXT")
    private String programIwld1;
    private String programCtrl2ERP;

    @Lob
    @Column(name = "programVolt", columnDefinition = "TEXT")
    private String programVolt;
    private String programCtrl2ERM;
    private String programCtrl1ERM;

    @Lob
    @Column(name = "programRls", columnDefinition = "TEXT")
    private String programRls;

    @Lob
    @Column(name = "programStrokeEnd", columnDefinition = "TEXT")
    private String programStrokeEnd;
    private String programCtrl1ERP;

    @Lob
    @Column(name = "programForce", columnDefinition = "TEXT")
    private String programForce;
    private String programCtrl2Sel;
    @Lob
    @Column(name = "programIemax", columnDefinition = "TEXT")
    private String programIemax;
    private String generalImax21;
    private String generalIniacqd;
    private String generalTotwldtime111;
    private String generalAuthlev;
    private String generalTotwldtime71;
    private String generalImax61;
    private String generalVtrasd;
    private String generalForceOS;
    private String generalKafs;
    private String generalIntacqd;
    private String generalTotwldtime21;
    private String generalRep;
    private String generalAuth;
    private String generalSEC;
    private String generalImax71;
    private String generalImax11;
    private String generalTotwldtime91;
    private String generalCtrl2R;
    private String generalCtrl1R;
    private String generalTotwldtime31;
    private String generalWeldcount;
    private String generalVolts;
    private String generalCurr;
    private String generalImax31;
    private String generalImax41;
    private String generalImax51;
    private String generalTotwldtime51;
    private String generalTotwldtime81;
    private String generalKfast;
    private String generalActcurr;
    private String generalS1;
    private String generalS0;
    private String generalS3;
    private String generalS2;
    private String generalS5;
    private String generalS4;
    private String generalS7;
    private String generalS6;
    private String generalTotwldtime101;
    private String generalImax81;
    private String generalKfasts;
    private String generalImax91;
    private String generalImax101;
    private String generalTotwldtime41;
    private String generalIemax31;
    private String generalTotwldtime61;
    private String generalIemax41;
    private String generalIemax51;
    private String generalIemax61;
    private String generalIemax71;
    private String generalIemax81;
    private String generalIemax91;
    private String generalIemax101;
    private String generalIemax111;


}
