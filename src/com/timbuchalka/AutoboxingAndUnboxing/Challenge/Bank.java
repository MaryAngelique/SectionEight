package com.timbuchalka.AutoboxingAndUnboxing.Challenge;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
    }

    public boolean addBranch(String branchName) {

        if(findBranch(branchName) == null) {

            this.branches.add(new Branch(branchName));
            return true;

        }

        return false;
    }

}
