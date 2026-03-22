package com.backup.models;

import com.backup.marker.BackupSerializable;

    public class UserData implements BackupSerializable {

        private String name;

        public UserData(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

