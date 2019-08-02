package com.mazanov.alexander.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Expense {
    private Long id;
    private String description;
    private Double spendingAmount;
    private String comment;
    private LocalDate date;
    private LocalTime time;
    private int version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getSpendingAmount() {
        return spendingAmount;
    }

    public void setSpendingAmount(Double spendingAmount) {
        this.spendingAmount = spendingAmount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", spendingAmount=" + spendingAmount +
                ", comment='" + comment + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", version=" + version +
                '}';
    }
}
