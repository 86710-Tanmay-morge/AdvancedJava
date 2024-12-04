package com.sunbeam.pojo;

public class Marks {
    private String subject;
    private double marks;

    public Marks(String subject, double marks) {
        this.subject = subject;
        this.marks = marks;
    }

    public String getSubject() {
        return subject;
    }

    public double getMarks() {
        return marks;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}
