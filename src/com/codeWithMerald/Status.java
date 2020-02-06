package com.codeWithMerald;

public class Status {
    private Boolean pending;
    private Boolean inProgress;
    private Boolean completed;

    public Status() {
        this.pending = true;
        this.inProgress = false;
        this.completed = false;
    }

    public Boolean getPending() {
        return pending;
    }

    public void setPending(Boolean pending) {
        this.pending = pending;
    }

    public Boolean getInProgress() {
        return inProgress;
    }

    public void setInProgress(Boolean inProgress) {
        this.inProgress = inProgress;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
