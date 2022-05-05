package com.example.networking;

public class MyViewHolder {

    @SuppressWarnings("WeakerAccess")

        private String title;

        public MyViewHolder (String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
    }
}
