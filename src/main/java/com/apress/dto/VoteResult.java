package com.apress.dto;

import java.util.Collection;

/**
 * Created by 310218599 on 1/10/2016.
 */
public class VoteResult {
    private int totalVotes;
    private Collection<OptionCount> results;

    public int getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(int totalVotes) {
        this.totalVotes = totalVotes;
    }

    public Collection<OptionCount> getResults() {
        return results;
    }

    public void setResults(Collection<OptionCount> results) {
        this.results = results;
    }
}
