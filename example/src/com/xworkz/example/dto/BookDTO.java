package com.xworkz.example.dto;

    public class BookDTO   {
        private String title;
        private int pages;

        public BookDTO(String title, int pages) {
            this.title = title;
            this.pages = pages;
        }

        public int getPages() {
            return pages;
        }


        @Override
        public String toString() {
            return "BookDto{" + "title='" + title + '\'' + ", pages=" + pages + '}';
        }

    }

