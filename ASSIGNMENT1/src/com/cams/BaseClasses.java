package com.cams;

import java.util.HashMap;
import com.cams.models.Account;

public abstract class BaseClasses {
    protected HashMap<Integer, Account> accounts = new HashMap<>();
    protected int accountCounter = 1000;

    public abstract void logout();
}
