package com.latrosoft.creativereview.Model;

public class SubjectModel {
    private  int subjectResid;
    private  String subjectName;

    public SubjectModel(int subjectResid, String subjectName) {
        this.subjectResid = subjectResid;
        this.subjectName = subjectName;
    }

    public int getSubjectResid() {
        return subjectResid;
    }

    public void setSubjectResid(int subjectResid) {
        this.subjectResid = subjectResid;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
