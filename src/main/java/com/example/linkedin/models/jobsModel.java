package com.example.linkedin.models;

public class jobsModel {

    String jobId;
    String jobTitle;
    String Location;
    String company;
    String Boss;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBoss() {
        return Boss;
    }

    public void setBoss(String boss) {
        Boss = boss;
    }


}
