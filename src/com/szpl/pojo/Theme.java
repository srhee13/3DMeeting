package com.szpl.pojo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by litao on 2017/12/29.
 */
@Entity
@Table(name = "meeting_theme")
public class Theme {
    @Id
    @GeneratedValue(generator="id")
    @GenericGenerator(name="id",strategy="uuid2")
    private String id;
    @Column(length = 255)
    private String meetingName;
    @Temporal(TemporalType.DATE)
    private Date meetingTime;
    @Column(length = 255)
    private String useLandInfo;

    private String others;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    public Date getMeetingTime() {
        return meetingTime;
    }

    public void setMeetingTime(Date meetingTime) {
        this.meetingTime = meetingTime;
    }

    public String getUseLandInfo() {
        return useLandInfo;
    }

    public void setUseLandInfo(String useLandInfo) {
        this.useLandInfo = useLandInfo;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public Theme() {
    }

    public Theme(String meetingName, Date meetingTime, String useLandInfo, String others) {
        this.meetingName = meetingName;
        this.meetingTime = meetingTime;
        this.useLandInfo = useLandInfo;
        this.others = others;
    }
}
