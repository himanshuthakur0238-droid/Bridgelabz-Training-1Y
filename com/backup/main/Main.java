package com.backup.main;

import com.backup.models.UserData;
import com.backup.models.TempData;

    public class Main {

        public static void main(String[] args) {

            UserData user = new UserData("Himanshu");
            TempData temp = new TempData("Cache");

            BackupProcessor.processBackup(user);
            BackupProcessor.processBackup(temp);
        }
    }

