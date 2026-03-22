package com.backup.main;

import com.backup.marker.BackupSerializable;

    public class BackupProcessor {

        public static void processBackup(Object obj) {

            if (obj instanceof BackupSerializable) {
                System.out.println("Backing up object: " + obj.getClass().getSimpleName());
            } else {
                System.out.println("Backup not allowed for: " + obj.getClass().getSimpleName());
            }
        }
    }

