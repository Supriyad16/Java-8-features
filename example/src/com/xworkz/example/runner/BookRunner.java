package com.xworkz.example.runner;

import com.xworkz.example.dto.BookDTO;

import java.util.*;

//without comparable

public class BookRunner {

    public static void main(String[] args) {

//        Comparator<BookDTO> bookDTOComparator = new Comparator<BookDTO>() {
//            @Override
//            public int compare(BookDTO o1, BookDTO o2) {
//
//                if(o1.BookDTO >=o2.BookDTO) {
//                    return 1;
//                }
//                else if(o1.BookDTO >=o2.BookDTO){
//                    return 0;
//                }
//                else{
//                    return -1;
//                }
//            }
//        };

        Comparator<BookDTO> bookDTOComparator = ((p1,p2)->Integer.compare(p1.getPages(), p2.getPages()));

        List<BookDTO> list = new ArrayList<>();

        list.add(new BookDTO("Silent Patient",450));
        list.add(new BookDTO("Verity",280));
        list.add(new BookDTO("Something happened on the way to heaven", 860));

        Collections.sort(list,bookDTOComparator);

        list.forEach(n-> System.out.println(n));

    }
}
