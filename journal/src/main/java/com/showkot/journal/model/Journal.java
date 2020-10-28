package com.showkot.journal.model;

public class Journal{
    private String journalId;
    private String journalName;
    private String journalAuthor;



    @Override
    public String toString() {
        return "Journal{" +
                "journalId=" + journalId +
                ", journalName='" + journalName + '\'' +
                ", journalAuthor='" + journalAuthor + '\'' +
                '}';
    }


    //Getter and Setters
    public String getJournalId() {
        return journalId;
    }

    public void setJournalId(String journalId) {
        this.journalId = journalId;
    }

    public String getJournalName() {
        return journalName;
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    public String getJournalAuthor() {
        return journalAuthor;
    }

    public void setJournalAuthor(String journalAuthor) {
        this.journalAuthor = journalAuthor;
    }

    public Journal(String journalId, String journalName, String journalAuthor) {
        this.journalId = journalId;
        this.journalName = journalName;
        this.journalAuthor = journalAuthor;
    }

}