package com.xworkz.system.runner;

import com.xworkz.system.dto.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        WardDTO wardDTO1 = new WardDTO(1, "Rajajinagar", "Ravi", 1);
        WardDTO wardDTO2 = new WardDTO(2, "Jayanagar", "Anita", 1.2F);
        WardDTO wardDTO3 = new WardDTO(3, "Malleshwaram", "Kiran", 0.9F);
        WardDTO wardDTO4 = new WardDTO(4, "Basavanagudi", "Suma", 1.5F);
        WardDTO wardDTO5 = new WardDTO(5, "Indiranagar", "Rahul", 1.1F);
        WardDTO wardDTO6 = new WardDTO(6, "Koramangala", "Divya", 1.8F);
        WardDTO wardDTO7 = new WardDTO(7, "BTM Layout", "Suresh", 1.3F);
        WardDTO wardDTO8 = new WardDTO(8, "Banashankari", "Meena", 2.0F);
        WardDTO wardDTO9 = new WardDTO(9, "Vijayanagar", "Ramesh", 1.4F);
        WardDTO wardDTO10 = new WardDTO(10, "Hebbal", "Priya", 1.6F);
        WardDTO wardDTO11 = new WardDTO(11, "Yelahanka", "Sunil", 1.7F);
        WardDTO wardDTO12 = new WardDTO(12, "Whitefield", "Anjali", 2.1F);
        WardDTO wardDTO13 = new WardDTO(13, "Marathahalli", "Girish", 1.9F);
        WardDTO wardDTO14 = new WardDTO(14, "HSR Layout", "Lakshmi", 1.2F);
        WardDTO wardDTO15 = new WardDTO(15, "KR Puram", "Naveen", 2.3F);
        WardDTO wardDTO16 = new WardDTO(16, "Electronic City", "Pooja", 2.0F);
        WardDTO wardDTO17 = new WardDTO(17, "RT Nagar", "Deepak", 1.1F);
        WardDTO wardDTO18 = new WardDTO(18, "JP Nagar", "Neha", 1.5F);
        WardDTO wardDTO19 = new WardDTO(19, "Peenya", "Harish", 2.2F);
        WardDTO wardDTO20 = new WardDTO(20, "Nagawara", "Shilpa", 1.8F);
        WardDTO wardDTO21 = new WardDTO(21, "Kengeri", "Manoj", 1.3F);
        WardDTO wardDTO22 = new WardDTO(22, "Hulimavu", "Sneha", 1.6F);
        WardDTO wardDTO23 = new WardDTO(23, "Bagalagunte", "Rohit", 1.2F);
        WardDTO wardDTO24 = new WardDTO(24, "Yeshwanthpur", "Asha", 1.9F);
        WardDTO wardDTO25 = new WardDTO(25, "Nagarbhavi", "Vikram", 1.5F);
        WardDTO wardDTO26 = new WardDTO(26, "Magadi Road", "Lavanya", 1.4F);
        WardDTO wardDTO27 = new WardDTO(27, "Kadugodi", "Arjun", 1.7F);
        WardDTO wardDTO28 = new WardDTO(28, "Hoodi", "Kavya", 2.0F);
        WardDTO wardDTO29 = new WardDTO(29, "Bellandur", "Santosh", 2.4F);
        WardDTO wardDTO30 = new WardDTO(30, "Sarjapur", "Ritika", 2.2F);
        WardDTO wardDTO31 = new WardDTO(31, "Brookefield", "Sameer", 1.8F);
        WardDTO wardDTO32 = new WardDTO(32, "Ramamurthy Nagar", "Bhavana", 1.3F);
        WardDTO wardDTO33 = new WardDTO(33, "Sanjaynagar", "Dinesh", 1.6F);
        WardDTO wardDTO34 = new WardDTO(34, "Nagavara", "Nisha", 1.9F);
        WardDTO wardDTO35 = new WardDTO(35, "Kaval Byrasandra", "Ajay", 1.5F);
        WardDTO wardDTO36 = new WardDTO(36, "HBR Layout", "Radhika", 2.1F);
        WardDTO wardDTO37 = new WardDTO(37, "Bannerghatta Road", "Yogesh", 2.3F);
        WardDTO wardDTO38 = new WardDTO(38, "Varthur", "Preeti", 2.0F);
        WardDTO wardDTO39 = new WardDTO(39, "Girinagar", "Sanjay", 1.4F);
        WardDTO wardDTO40 = new WardDTO(40, "Mysore Road", "Chitra", 1.7F);
        WardDTO wardDTO41 = new WardDTO(41, "Pune", "Aravind", 2.1F);
        WardDTO wardDTO42 = new WardDTO(42, "Hyderabad", "Fatima", 2.5F);
        WardDTO wardDTO43 = new WardDTO(43, "Chennai", "Vignesh", 2.3F);
        WardDTO wardDTO44 = new WardDTO(44, "Mumbai", "Rekha", 3.0F);
        WardDTO wardDTO45 = new WardDTO(45, "Ahmedabad", "Jignesh", 2.0F);
        WardDTO wardDTO46 = new WardDTO(46, "Kolkata", "Madhuri", 2.6F);
        WardDTO wardDTO47 = new WardDTO(47, "Delhi", "Tarun", 3.2F);
        WardDTO wardDTO48 = new WardDTO(48, "Lucknow", "Nandini", 1.8F);
        WardDTO wardDTO49 = new WardDTO(49, "Jaipur", "Rameshwar", 2.4F);
        WardDTO wardDTO50 = new WardDTO(50, "Bhopal", "Kusum", 1.9F);
        WardDTO wardDTO51 = new WardDTO(51, "New York", "Michael", 4.5F);
        WardDTO wardDTO52 = new WardDTO(52, "London", "Emily", 3.8F);
        WardDTO wardDTO53 = new WardDTO(53, "Tokyo", "Hiroshi", 5.0F);
        WardDTO wardDTO54 = new WardDTO(54, "Sydney", "Olivia", 3.2F);
        WardDTO wardDTO55 = new WardDTO(55, "Toronto", "Liam", 2.7F);
        WardDTO wardDTO56 = new WardDTO(56, "Berlin", "Greta", 2.9F);
        WardDTO wardDTO57 = new WardDTO(57, "Paris", "Jean", 3.6F);
        WardDTO wardDTO58 = new WardDTO(58, "Cape Town", "Zola", 2.3F);
        WardDTO wardDTO59 = new WardDTO(59, "Dubai", "Noura", 3.1F);
        WardDTO wardDTO60 = new WardDTO(60, "Singapore", "Wei Ling", 3.7F);
        WardDTO wardDTO61 = new WardDTO(61, "Shillong", "RoshanI", 1.5F);
        WardDTO wardDTO62 = new WardDTO(62, "Amritsar", "Harpreet", 1.9F);
        WardDTO wardDTO63 = new WardDTO(63, "Thiruvananthapuram", "Arya", 2.2F);
        WardDTO wardDTO64 = new WardDTO(64, "Vancouver", "Sophie", 3.4F);
        WardDTO wardDTO65 = new WardDTO(65, "Madrid", "Carlos", 3.0F);
        WardDTO wardDTO66 = new WardDTO(66, "Auckland", "Mia", 2.8F);
        WardDTO wardDTO67 = new WardDTO(67, "Oslo", "Lars", 2.6F);


        ConstituencyDTO constituencyDTO1 = new ConstituencyDTO("Bengaluru", 001, "TejasviSurya", "Karnataka", wardDTO1);
        ConstituencyDTO constituencyDTO2 = new ConstituencyDTO("Chennai", 002, "Stalin", "Tamil Ndu", wardDTO2);
        ConstituencyDTO constituencyDTO3 = new ConstituencyDTO("Mumbai", 003, "Narendra Modi", "Maharashtra", wardDTO3);
        ConstituencyDTO constituencyDTO4 = new ConstituencyDTO("Kolkata", 004, "Amit Shah", "West Bengal", wardDTO4);
        ConstituencyDTO constituencyDTO5 = new ConstituencyDTO("Delhi", 005, "Arvind Kejriwal", "Delhi", wardDTO5);
        ConstituencyDTO constituencyDTO6 = new ConstituencyDTO("Pune", 006, "Sonia Gandhi", "Gujarat", wardDTO6);
        ConstituencyDTO constituencyDTO7 = new ConstituencyDTO("Ahmedabad", 007, "Shashi Tharoor", "Uttar Pradesh", wardDTO7);
        ConstituencyDTO constituencyDTO8 = new ConstituencyDTO("Lucknow", 8, "Smriti Irani", "Rajasthan", wardDTO8);
        ConstituencyDTO constituencyDTO9 = new ConstituencyDTO("Jaipur", 9, "Piyush Goyal", "Madhya Pradesh", wardDTO9);
        ConstituencyDTO constituencyDTO10 = new ConstituencyDTO("Bhopal", 010, "Nirmala Sitharaman", "Bihar", wardDTO10);
        ConstituencyDTO constituencyDTO11 = new ConstituencyDTO("Patna", 011, "Yogi Adityanath", "Jharkhand", wardDTO11);
        ConstituencyDTO constituencyDTO12 = new ConstituencyDTO("Ranchi", 012, "K Chandrashekar Rao", "Assam", wardDTO12);
        ConstituencyDTO constituencyDTO13 = new ConstituencyDTO("Guwahati", 013, "Devendra Fadnavis", "Punjab", wardDTO13);
        ConstituencyDTO constituencyDTO14 = new ConstituencyDTO("Chandigarh", 014, "Uddhav Thackeray", "Himachal Pradesh", wardDTO14);
        ConstituencyDTO constituencyDTO15 = new ConstituencyDTO("Shimla", 015, "Mamata Banerjee", "Uttarakhand", wardDTO15);
        ConstituencyDTO constituencyDTO16 = new ConstituencyDTO("Dehradun", 016, "Nitish Kumar", "Jammu and Kashmir", wardDTO16);
        ConstituencyDTO constituencyDTO17 = new ConstituencyDTO("Srinagar", 017, "Hemant Soren", "Goa", wardDTO17);
        ConstituencyDTO constituencyDTO18 = new ConstituencyDTO("Panaji", 18, "MK Stalin", "Kerala", wardDTO18);
        ConstituencyDTO constituencyDTO19 = new ConstituencyDTO("Thiruvananthapuram", 19, "Manohar Lal Khattar", "USA", wardDTO19);
        ConstituencyDTO constituencyDTO20 = new ConstituencyDTO("New York", 020, "Justin Trudeau", "UK", wardDTO20);
        ConstituencyDTO constituencyDTO21 = new ConstituencyDTO("London", 021, "Boris Johnson", "Japan", wardDTO21);
        ConstituencyDTO constituencyDTO22 = new ConstituencyDTO("Tokyo", 022, "Fumio Kishida", "Australia", wardDTO22);
        ConstituencyDTO constituencyDTO23 = new ConstituencyDTO("Sydney", 023, "Anthony Albanese", "Canada", wardDTO23);
        ConstituencyDTO constituencyDTO24 = new ConstituencyDTO("Toronto", 024, "Olaf Scholz", "Germany", wardDTO24);
        ConstituencyDTO constituencyDTO25 = new ConstituencyDTO("Berlin", 025, "Emmanuel Macron", "France", wardDTO25);
        ConstituencyDTO constituencyDTO26 = new ConstituencyDTO("Paris", 026, "Lee Hsien Loong", "UAE", wardDTO26);
        ConstituencyDTO constituencyDTO27 = new ConstituencyDTO("Dubai", 027, "Joe Biden", "Singapore", wardDTO27);
        ConstituencyDTO constituencyDTO28 = new ConstituencyDTO("Singapore", 28, "Kamala Harris", "South Africa", wardDTO28);
        ConstituencyDTO constituencyDTO29 = new ConstituencyDTO("Cape Town", 29, "Rishi Sunak", "Spain", wardDTO29);
        ConstituencyDTO constituencyDTO30 = new ConstituencyDTO("Madrid", 030, "Pedro Sánchez", "New Zealand", wardDTO30);
        ConstituencyDTO constituencyDTO31 = new ConstituencyDTO("Auckland", 031, "Jacinda Ardern", "Norway", wardDTO31);
        ConstituencyDTO constituencyDTO32 = new ConstituencyDTO("Oslo", 032, "Erna Solberg", "Russia", wardDTO32);
        ConstituencyDTO constituencyDTO33 = new ConstituencyDTO("Moscow", 033, "Vladimir Putin", "South Korea", wardDTO33);
        ConstituencyDTO constituencyDTO34 = new ConstituencyDTO("Seoul", 034, "Yoon Suk-yeol", "China", wardDTO34);
        ConstituencyDTO constituencyDTO35 = new ConstituencyDTO("Beijing", 035, "Xi Jinping", "Thailand", wardDTO35);
        ConstituencyDTO constituencyDTO36 = new ConstituencyDTO("Bangkok", 036, "Prayut Chan-o-cha", "Kenya", wardDTO36);
        ConstituencyDTO constituencyDTO37 = new ConstituencyDTO("Nairobi", 037, "William Ruto", "Nigeria", wardDTO37);
        ConstituencyDTO constituencyDTO38 = new ConstituencyDTO("Lagos", 38, "Bola Tinubu", "Austria", wardDTO38);
        ConstituencyDTO constituencyDTO39 = new ConstituencyDTO("Melbourne", 39, "Gavin Newsom", "Poland", wardDTO39);
        ConstituencyDTO constituencyDTO40 = new ConstituencyDTO("Chicago", 040, "Michelle Wu", "Switzerland", wardDTO40);
        ConstituencyDTO constituencyDTO41 = new ConstituencyDTO("San Francisco", 041, "Eric Adams", "Belgium", wardDTO41);
        ConstituencyDTO constituencyDTO42 = new ConstituencyDTO("Los Angeles", 042, "Sadiq Khan", "Portugal", wardDTO42);
        ConstituencyDTO constituencyDTO43 = new ConstituencyDTO("Houston", 043, "Lori Lightfoot", "Denmark", wardDTO43);
        ConstituencyDTO constituencyDTO44 = new ConstituencyDTO("Seattle", 044, "Andy Burnham", "Sweden", wardDTO44);
        ConstituencyDTO constituencyDTO45 = new ConstituencyDTO("Boston", 045, "Ada Colau", "Finland", wardDTO45);
        ConstituencyDTO constituencyDTO46 = new ConstituencyDTO("Barcelona", 046, "Virginia Raggi", "Ireland", wardDTO46);
        ConstituencyDTO constituencyDTO47 = new ConstituencyDTO("Rome", 047, "Karl Nehammer", "Iceland", wardDTO47);
        ConstituencyDTO constituencyDTO48 = new ConstituencyDTO("Vienna", 48, "Mateusz Morawiecki", "Qatar", wardDTO48);
        ConstituencyDTO constituencyDTO49 = new ConstituencyDTO("Warsaw", 49, "Simonetta Sommaruga", "Philippines", wardDTO49);
        ConstituencyDTO constituencyDTO50 = new ConstituencyDTO("Zurich", 050, "Alexander De Croo", "Indonesia", wardDTO50);
        ConstituencyDTO constituencyDTO51 = new ConstituencyDTO("Brussels", 051, "António Costa", "Malaysia", wardDTO51);
        ConstituencyDTO constituencyDTO52 = new ConstituencyDTO("Lisbon", 052, "Mette Frederiksen", "Vietnam", wardDTO52);
        ConstituencyDTO constituencyDTO53 = new ConstituencyDTO("Copenhagen", 053, "Magdalena Andersson", "Iran", wardDTO53);
        ConstituencyDTO constituencyDTO54 = new ConstituencyDTO("Stockholm", 054, "Sanna Marin", "Iraq", wardDTO54);
        ConstituencyDTO constituencyDTO55 = new ConstituencyDTO("Helsinki", 055, "Leo Varadkar", "Turkey", wardDTO55);
        ConstituencyDTO constituencyDTO56 = new ConstituencyDTO("Dublin", 056, "Katrín Jakobsdóttir", "Tamil Nadu", wardDTO56);
        ConstituencyDTO constituencyDTO57 = new ConstituencyDTO("Reykjavik", 057, "Sheikh Tamim", "Telangana", wardDTO57);
        ConstituencyDTO constituencyDTO58 = new ConstituencyDTO("Doha", 58, "Ferdinand Marcos Jr.", "Maharashtra", wardDTO58);
        ConstituencyDTO constituencyDTO59 = new ConstituencyDTO("Manila", 59, "Joko Widodo", "West Bengal", wardDTO59);
        ConstituencyDTO constituencyDTO60 = new ConstituencyDTO("Jakarta", 060, "Anwar Ibrahim", "Delhi", wardDTO60);
        ConstituencyDTO constituencyDTO61 = new ConstituencyDTO("Kuala Lumpur", 061, "Pham Minh Chinh", "Gujarat", wardDTO61);
        ConstituencyDTO constituencyDTO62 = new ConstituencyDTO("Hanoi", 062, "Ebrahim Raisi", "Uttar Pradesh", wardDTO62);
        ConstituencyDTO constituencyDTO63 = new ConstituencyDTO("Tehran", 063, "Mohammed Shia' Al Sudani", "Rajasthan", wardDTO63);
        ConstituencyDTO constituencyDTO64 = new ConstituencyDTO("Baghdad", 064, "Recep Tayyip Erdoğan", "Madhya Pradesh", wardDTO64);
        ConstituencyDTO constituencyDTO65 = new ConstituencyDTO("Ankara", 065, "Tejasvi Surya", "Bihar", wardDTO65);
        ConstituencyDTO constituencyDTO66 = new ConstituencyDTO("Bengaluru", 066, "Stalin", "Jharkhand", wardDTO66);
        ConstituencyDTO constituencyDTO67 = new ConstituencyDTO("Rajkot", 067, "Rahul Gandhi", "Assam", wardDTO67);


        PrimeMinisterDTO primeMinisterDTO1 = new PrimeMinisterDTO("Narendra Modi", 75, "BJP", 15, constituencyDTO1);
        PrimeMinisterDTO primeMinisterDTO2 = new PrimeMinisterDTO("Arvind Kejriwal", 62, "AAP", 13, constituencyDTO2);
        PrimeMinisterDTO primeMinisterDTO3 = new PrimeMinisterDTO("Mamata Banerjee", 65, "TMC", 7, constituencyDTO3);
        PrimeMinisterDTO primeMinisterDTO4 = new PrimeMinisterDTO("Yogi Adityanath", 82, "JD(U)", 13, constituencyDTO4);
        PrimeMinisterDTO primeMinisterDTO5 = new PrimeMinisterDTO("Nitish Kumar", 66, "CPI(M)", 17, constituencyDTO5);
        PrimeMinisterDTO primeMinisterDTO6 = new PrimeMinisterDTO("Pinarayi Vijayan", 59, "SS", 14, constituencyDTO6);
        PrimeMinisterDTO primeMinisterDTO7 = new PrimeMinisterDTO("Uddhav Thackeray", 50, "DMK", 6, constituencyDTO7);
        PrimeMinisterDTO primeMinisterDTO8 = new PrimeMinisterDTO("MK Stalin", 61, "RJD", 8, constituencyDTO8);
        PrimeMinisterDTO primeMinisterDTO9 = new PrimeMinisterDTO("Amit Shah", 57, "NCP", 11, constituencyDTO9);
        PrimeMinisterDTO primeMinisterDTO10 = new PrimeMinisterDTO("Sonia Gandhi", 71, "SP", 17, constituencyDTO10);
        PrimeMinisterDTO primeMinisterDTO11 = new PrimeMinisterDTO("Sharad Pawar", 68, "BSP", 6, constituencyDTO11);
        PrimeMinisterDTO primeMinisterDTO12 = new PrimeMinisterDTO("Mayawati", 79, "AIADMK", 15, constituencyDTO12);
        PrimeMinisterDTO primeMinisterDTO13 = new PrimeMinisterDTO("Jayalalithaa", 60, "TRS", 14, constituencyDTO13);
        PrimeMinisterDTO primeMinisterDTO14 = new PrimeMinisterDTO("KCR", 72, "Congress", 5, constituencyDTO14);
        PrimeMinisterDTO primeMinisterDTO15 = new PrimeMinisterDTO("Lalu Prasad Yadav", 80, "Independent", 12, constituencyDTO15);
        PrimeMinisterDTO primeMinisterDTO16 = new PrimeMinisterDTO("Manmohan Singh", 73, "Democratic", 11, constituencyDTO16);
        PrimeMinisterDTO primeMinisterDTO17 = new PrimeMinisterDTO("Atal Bihari Vajpayee", 63, "Republican", 6, constituencyDTO17);
        PrimeMinisterDTO primeMinisterDTO18 = new PrimeMinisterDTO("Chandrababu Naidu", 77, "Conservative", 15, constituencyDTO18);
        PrimeMinisterDTO primeMinisterDTO19 = new PrimeMinisterDTO("Mulayam Singh Yadav", 76, "Labour", 6, constituencyDTO19);
        PrimeMinisterDTO primeMinisterDTO20 = new PrimeMinisterDTO("George Bush", 80, "Liberal", 9, constituencyDTO20);
        PrimeMinisterDTO primeMinisterDTO21 = new PrimeMinisterDTO("Barack Obama", 63, "Greens", 13, constituencyDTO21);
        PrimeMinisterDTO primeMinisterDTO22 = new PrimeMinisterDTO("Joe Biden", 85, "Christian Democrats", 19, constituencyDTO22);
        PrimeMinisterDTO primeMinisterDTO23 = new PrimeMinisterDTO("Donald Trump", 77, "Socialists", 12, constituencyDTO23);
        PrimeMinisterDTO primeMinisterDTO24 = new PrimeMinisterDTO("Justin Trudeau", 58, "BJP", 9, constituencyDTO24);
        PrimeMinisterDTO primeMinisterDTO25 = new PrimeMinisterDTO("Boris Johnson", 55, "INC", 5, constituencyDTO25);
        PrimeMinisterDTO primeMinisterDTO26 = new PrimeMinisterDTO("Rishi Sunak", 49, "AAP", 14, constituencyDTO26);
        PrimeMinisterDTO primeMinisterDTO27 = new PrimeMinisterDTO("Fumio Kishida", 67, "TMC", 20, constituencyDTO27);
        PrimeMinisterDTO primeMinisterDTO28 = new PrimeMinisterDTO("Emmanuel Macron", 51, "JD(U)", 10, constituencyDTO28);
        PrimeMinisterDTO primeMinisterDTO29 = new PrimeMinisterDTO("Angela Merkel", 69, "CPI(M)", 6, constituencyDTO29);
        PrimeMinisterDTO primeMinisterDTO30 = new PrimeMinisterDTO("Pedro Sánchez", 56, "SS", 13, constituencyDTO30);
        PrimeMinisterDTO primeMinisterDTO31 = new PrimeMinisterDTO("Anthony Albanese", 60, "DMK", 18, constituencyDTO31);
        PrimeMinisterDTO primeMinisterDTO32 = new PrimeMinisterDTO("Olaf Scholz", 64, "RJD", 15, constituencyDTO32);
        PrimeMinisterDTO primeMinisterDTO33 = new PrimeMinisterDTO("Lee Hsien Loong", 71, "NCP", 16, constituencyDTO33);
        PrimeMinisterDTO primeMinisterDTO34 = new PrimeMinisterDTO("Jacinda Ardern", 48, "SP", 10, constituencyDTO34);
        PrimeMinisterDTO primeMinisterDTO35 = new PrimeMinisterDTO("Recep Tayyip Erdoğan", 74, "BSP", 11, constituencyDTO35);
        PrimeMinisterDTO primeMinisterDTO36 = new PrimeMinisterDTO("Vladimir Putin", 72, "AIADMK", 19, constituencyDTO36);
        PrimeMinisterDTO primeMinisterDTO37 = new PrimeMinisterDTO("Xi Jinping", 71, "TRS", 13, constituencyDTO37);
        PrimeMinisterDTO primeMinisterDTO38 = new PrimeMinisterDTO("Yoon Suk-yeol", 65, "Congress", 8, constituencyDTO38);
        PrimeMinisterDTO primeMinisterDTO39 = new PrimeMinisterDTO("Sheikh Hasina", 77, "Independent", 12, constituencyDTO39);
        PrimeMinisterDTO primeMinisterDTO40 = new PrimeMinisterDTO("Mahathir Mohamad", 85, "Democratic", 7, constituencyDTO40);
        PrimeMinisterDTO primeMinisterDTO41 = new PrimeMinisterDTO("Anwar Ibrahim", 67, "Republican", 5, constituencyDTO41);
        PrimeMinisterDTO primeMinisterDTO42 = new PrimeMinisterDTO("Joko Widodo", 64, "Conservative", 14, constituencyDTO42);
        PrimeMinisterDTO primeMinisterDTO43 = new PrimeMinisterDTO("Sanna Marin", 48, "Labour", 9, constituencyDTO43);
        PrimeMinisterDTO primeMinisterDTO44 = new PrimeMinisterDTO("Leo Varadkar", 55, "Liberal", 10, constituencyDTO44);
        PrimeMinisterDTO primeMinisterDTO45 = new PrimeMinisterDTO("Scott Morrison", 59, "Greens", 13, constituencyDTO45);
        PrimeMinisterDTO primeMinisterDTO46 = new PrimeMinisterDTO("Erna Solberg", 66, "Christian Democrats", 15, constituencyDTO46);
        PrimeMinisterDTO primeMinisterDTO47 = new PrimeMinisterDTO("Benjamin Netanyahu", 74, "Socialists", 18, constituencyDTO47);
        PrimeMinisterDTO primeMinisterDTO48 = new PrimeMinisterDTO("Naftali Bennett", 53, "BJP", 17, constituencyDTO48);
        PrimeMinisterDTO primeMinisterDTO49 = new PrimeMinisterDTO("Sergey Lavrov", 72, "INC", 6, constituencyDTO49);
        PrimeMinisterDTO primeMinisterDTO50 = new PrimeMinisterDTO("John Major", 81, "AAP", 8, constituencyDTO50);
        PrimeMinisterDTO primeMinisterDTO51 = new PrimeMinisterDTO("David Cameron", 59, "TMC", 9, constituencyDTO51);
        PrimeMinisterDTO primeMinisterDTO52 = new PrimeMinisterDTO("Theresa May", 68, "JD(U)", 7, constituencyDTO52);
        PrimeMinisterDTO primeMinisterDTO53 = new PrimeMinisterDTO("Liz Truss", 48, "CPI(M)", 14, constituencyDTO53);
        PrimeMinisterDTO primeMinisterDTO54 = new PrimeMinisterDTO("Helle Thorning-Schmidt", 61, "SS", 16, constituencyDTO54);
        PrimeMinisterDTO primeMinisterDTO55 = new PrimeMinisterDTO("Lars Løkke Rasmussen", 60, "DMK", 6, constituencyDTO55);
        PrimeMinisterDTO primeMinisterDTO56 = new PrimeMinisterDTO("Mette Frederiksen", 50, "RJD", 9, constituencyDTO56);
        PrimeMinisterDTO primeMinisterDTO57 = new PrimeMinisterDTO("Giorgia Meloni", 47, "NCP", 8, constituencyDTO57);
        PrimeMinisterDTO primeMinisterDTO58 = new PrimeMinisterDTO("Mario Draghi", 67, "SP", 15, constituencyDTO58);
        PrimeMinisterDTO primeMinisterDTO59 = new PrimeMinisterDTO("Luiz Inácio Lula", 79, "BSP", 17, constituencyDTO59);
        PrimeMinisterDTO primeMinisterDTO60 = new PrimeMinisterDTO("Dilma Rousseff", 76, "AIADMK", 19, constituencyDTO60);
        PrimeMinisterDTO primeMinisterDTO61 = new PrimeMinisterDTO("Jair Bolsonaro", 70, "TRS", 10, constituencyDTO61);
        PrimeMinisterDTO primeMinisterDTO62 = new PrimeMinisterDTO("Andrés Manuel López Obrador", 71, "Congress", 20, constituencyDTO62);
        PrimeMinisterDTO primeMinisterDTO63 = new PrimeMinisterDTO("Gabriel Boric", 39, "Independent", 6, constituencyDTO63);
        PrimeMinisterDTO primeMinisterDTO64 = new PrimeMinisterDTO("Nayib Bukele", 43, "Democratic", 8, constituencyDTO64);
        PrimeMinisterDTO primeMinisterDTO65 = new PrimeMinisterDTO("Daniel Ortega", 78, "Republican", 11, constituencyDTO65);
        PrimeMinisterDTO primeMinisterDTO66 = new PrimeMinisterDTO("Nicolás Maduro", 62, "Conservative", 12, constituencyDTO66);
        PrimeMinisterDTO primeMinisterDTO67 = new PrimeMinisterDTO("Narendra Modi", 75, "Labour", 15, constituencyDTO67);

        GovernmentDTO governmentDTO1 = new GovernmentDTO("Democratic", "India", 1947, "New Delhi", primeMinisterDTO1);
        GovernmentDTO governmentDTO2 = new GovernmentDTO("Republic", "UK", 1855, "London", primeMinisterDTO2);
        GovernmentDTO governmentDTO3 = new GovernmentDTO("Monarchy", "Germany", 2009, "Berlin", primeMinisterDTO3);
        GovernmentDTO governmentDTO4 = new GovernmentDTO("Parliamentary", "France", 1955, "Paris", primeMinisterDTO4);
        GovernmentDTO governmentDTO5 = new GovernmentDTO("Presidential", "Japan", 1899, "Tokyo", primeMinisterDTO5);
        GovernmentDTO governmentDTO6 = new GovernmentDTO("Democratic", "Australia", 1855, "Canberra", primeMinisterDTO6);
        GovernmentDTO governmentDTO7 = new GovernmentDTO("Federal", "Canada", 1896, "Ottawa", primeMinisterDTO7);
        GovernmentDTO governmentDTO8 = new GovernmentDTO("Republic", "Brazil", 1878, "Brasília", primeMinisterDTO8);
        GovernmentDTO governmentDTO9 = new GovernmentDTO("Monarchy", "Russia", 1896, "Moscow", primeMinisterDTO9);
        GovernmentDTO governmentDTO10 = new GovernmentDTO("Parliamentary", "South Korea", 1838, "Seoul", primeMinisterDTO10);
        GovernmentDTO governmentDTO11 = new GovernmentDTO("Presidential", "China", 1953, "Beijing", primeMinisterDTO11);
        GovernmentDTO governmentDTO12 = new GovernmentDTO("Democratic", "Mexico", 1865, "Mexico City", primeMinisterDTO12);
        GovernmentDTO governmentDTO13 = new GovernmentDTO("Federal", "Spain", 1850, "Madrid", primeMinisterDTO13);
        GovernmentDTO governmentDTO14 = new GovernmentDTO("Republic", "Italy", 1954, "Rome", primeMinisterDTO14);
        GovernmentDTO governmentDTO15 = new GovernmentDTO("Monarchy", "Norway", 1944, "Oslo", primeMinisterDTO15);
        GovernmentDTO governmentDTO16 = new GovernmentDTO("Parliamentary", "Sweden", 1839, "Stockholm", primeMinisterDTO16);
        GovernmentDTO governmentDTO17 = new GovernmentDTO("Presidential", "Finland", 1926, "Helsinki", primeMinisterDTO17);
        GovernmentDTO governmentDTO18 = new GovernmentDTO("Democratic", "Denmark", 1850, "Copenhagen", primeMinisterDTO18);
        GovernmentDTO governmentDTO19 = new GovernmentDTO("Federal", "Switzerland", 1906, "Bern", primeMinisterDTO19);
        GovernmentDTO governmentDTO20 = new GovernmentDTO("Republic", "Singapore", 2022, "Singapore", primeMinisterDTO20);
        GovernmentDTO governmentDTO21 = new GovernmentDTO("Monarchy", "Malaysia", 1965, "Kuala Lumpur", primeMinisterDTO21);
        GovernmentDTO governmentDTO22 = new GovernmentDTO("Parliamentary", "Indonesia", 1964, "Jakarta", primeMinisterDTO22);
        GovernmentDTO governmentDTO23 = new GovernmentDTO("Presidential", "Vietnam", 1857, "Hanoi", primeMinisterDTO23);
        GovernmentDTO governmentDTO24 = new GovernmentDTO("Democratic", "Thailand", 2002, "Bangkok", primeMinisterDTO24);
        GovernmentDTO governmentDTO25 = new GovernmentDTO("Federal", "Turkey", 1917, "Ankara", primeMinisterDTO25);
        GovernmentDTO governmentDTO26 = new GovernmentDTO("Republic", "Argentina", 1942, "Buenos Aires", primeMinisterDTO26);
        GovernmentDTO governmentDTO27 = new GovernmentDTO("Monarchy", "South Africa", 1957, "Cape Town", primeMinisterDTO27);
        GovernmentDTO governmentDTO28 = new GovernmentDTO("Parliamentary", "Netherlands", 1891, "Amsterdam", primeMinisterDTO28);
        GovernmentDTO governmentDTO29 = new GovernmentDTO("Presidential", "Belgium", 1836, "Brussels", primeMinisterDTO29);
        GovernmentDTO governmentDTO30 = new GovernmentDTO("Democratic", "Portugal", 1912, "Lisbon", primeMinisterDTO30);
        GovernmentDTO governmentDTO31 = new GovernmentDTO("Federal", "Ireland", 1887, "Dublin", primeMinisterDTO31);
        GovernmentDTO governmentDTO32 = new GovernmentDTO("Republic", "New Zealand", 1906, "Wellington", primeMinisterDTO32);
        GovernmentDTO governmentDTO33 = new GovernmentDTO("Monarchy", "Austria", 1845, "Vienna", primeMinisterDTO33);
        GovernmentDTO governmentDTO34 = new GovernmentDTO("Parliamentary", "Poland", 1964, "Warsaw", primeMinisterDTO34);
        GovernmentDTO governmentDTO35 = new GovernmentDTO("Presidential", "Philippines", 1909, "Manila", primeMinisterDTO35);
        GovernmentDTO governmentDTO36 = new GovernmentDTO("Democratic", "Israel", 1978, "Jerusalem", primeMinisterDTO36);
        GovernmentDTO governmentDTO37 = new GovernmentDTO("Federal", "Iran", 1900, "Tehran", primeMinisterDTO37);
        GovernmentDTO governmentDTO38 = new GovernmentDTO("Republic", "Iraq", 1831, "Baghdad", primeMinisterDTO38);
        GovernmentDTO governmentDTO39 = new GovernmentDTO("Monarchy", "Qatar", 1999, "Doha", primeMinisterDTO39);
        GovernmentDTO governmentDTO40 = new GovernmentDTO("Parliamentary", "UAE", 1966, "Abu Dhabi", primeMinisterDTO40);
        GovernmentDTO governmentDTO41 = new GovernmentDTO("Presidential", "Saudi Arabia", 1943, "Riyadh", primeMinisterDTO41);
        GovernmentDTO governmentDTO42 = new GovernmentDTO("Democratic", "Bangladesh", 1966, "Dhaka", primeMinisterDTO42);
        GovernmentDTO governmentDTO43 = new GovernmentDTO("Federal", "Pakistan", 1924, "Islamabad", primeMinisterDTO43);
        GovernmentDTO governmentDTO44 = new GovernmentDTO("Republic", "Sri Lanka", 2007, "Colombo", primeMinisterDTO44);
        GovernmentDTO governmentDTO45 = new GovernmentDTO("Monarchy", "Nepal", 2023, "Kathmandu", primeMinisterDTO45);
        GovernmentDTO governmentDTO46 = new GovernmentDTO("Parliamentary", "Bhutan", 1865, "Thimphu", primeMinisterDTO46);
        GovernmentDTO governmentDTO47 = new GovernmentDTO("Presidential", "Maldives", 1932, "Malé", primeMinisterDTO47);
        GovernmentDTO governmentDTO48 = new GovernmentDTO("Democratic", "Czech Republic", 1893, "Prague", primeMinisterDTO48);
        GovernmentDTO governmentDTO49 = new GovernmentDTO("Federal", "Hungary", 1853, "Budapest", primeMinisterDTO49);
        GovernmentDTO governmentDTO50 = new GovernmentDTO("Republic", "Romania", 1934, "Bucharest", primeMinisterDTO50);
        GovernmentDTO governmentDTO51 = new GovernmentDTO("Monarchy", "Greece", 1962, "Athens", primeMinisterDTO51);
        GovernmentDTO governmentDTO52 = new GovernmentDTO("Parliamentary", "Chile", 1903, "Santiago", primeMinisterDTO52);
        GovernmentDTO governmentDTO53 = new GovernmentDTO("Presidential", "Colombia", 1831, "Bogotá", primeMinisterDTO53);
        GovernmentDTO governmentDTO54 = new GovernmentDTO("Democratic", "Peru", 1987, "Lima", primeMinisterDTO54);
        GovernmentDTO governmentDTO55 = new GovernmentDTO("Federal", "Ecuador", 1926, "Quito", primeMinisterDTO55);
        GovernmentDTO governmentDTO56 = new GovernmentDTO("Republic", "Venezuela", 1967, "Caracas", primeMinisterDTO56);
        GovernmentDTO governmentDTO57 = new GovernmentDTO("Monarchy", "Cuba", 1956, "Havana", primeMinisterDTO57);
        GovernmentDTO governmentDTO58 = new GovernmentDTO("Parliamentary", "Bolivia", 1915, "La Paz", primeMinisterDTO58);
        GovernmentDTO governmentDTO59 = new GovernmentDTO("Presidential", "Panama", 1886, "Panama City", primeMinisterDTO59);
        GovernmentDTO governmentDTO60 = new GovernmentDTO("Democratic", "Costa Rica", 1927, "San José", primeMinisterDTO60);
        GovernmentDTO governmentDTO61 = new GovernmentDTO("Federal", "El Salvador", 1945, "San Salvador", primeMinisterDTO61);
        GovernmentDTO governmentDTO62 = new GovernmentDTO("Republic", "Honduras", 1993, "Tegucigalpa", primeMinisterDTO62);
        GovernmentDTO governmentDTO63 = new GovernmentDTO("Monarchy", "Paraguay", 1842, "Asunción", primeMinisterDTO63);
        GovernmentDTO governmentDTO64 = new GovernmentDTO("Parliamentary", "Uruguay", 1897, "Montevideo", primeMinisterDTO64);
        GovernmentDTO governmentDTO65 = new GovernmentDTO("Presidential", "Morocco", 2020, "Rabat", primeMinisterDTO65);
        GovernmentDTO governmentDTO66 = new GovernmentDTO("Democratic", "Kenya", 1954, "Nairobi", primeMinisterDTO66);
        GovernmentDTO governmentDTO67 = new GovernmentDTO("Federal", "Nigeria", 1836, "Abuja", primeMinisterDTO67);


        TaxDTO taxDTO1 = new TaxDTO("Direct", 5, "Business", "Income Tax", governmentDTO1);
        TaxDTO taxDTO2 = new TaxDTO("Wealth", 26.46, "Property", "GST", governmentDTO2);
        TaxDTO taxDTO3 = new TaxDTO("Corporate", 9.14, "Imports", "Service Tax", governmentDTO3);
        TaxDTO taxDTO4 = new TaxDTO("Excise", 17.34, "Exports", "Custom Duty", governmentDTO4);
        TaxDTO taxDTO5 = new TaxDTO("Sales", 12.97, "Corporates", "Capital Gains", governmentDTO5);
        TaxDTO taxDTO6 = new TaxDTO("Direct", 1.92, "Business", "Income Tax", governmentDTO6);
        TaxDTO taxDTO7 = new TaxDTO("Indirect", 24.66, "Individual", "VAT", governmentDTO7);
        TaxDTO taxDTO8 = new TaxDTO("Wealth", 9.69, "Property", "GST", governmentDTO8);
        TaxDTO taxDTO9 = new TaxDTO("Corporate", 10.89, "Imports", "Service Tax", governmentDTO9);
        TaxDTO taxDTO10 = new TaxDTO("Excise", 12.48, "Exports", "Custom Duty", governmentDTO10);
        TaxDTO taxDTO11 = new TaxDTO("Sales", 5.83, "Corporates", "Capital Gains", governmentDTO11);
        TaxDTO taxDTO12 = new TaxDTO("Direct", 14.5, "Business", "Income Tax", governmentDTO12);
        TaxDTO taxDTO13 = new TaxDTO("Indirect", 22.76, "Individual", "VAT", governmentDTO13);
        TaxDTO taxDTO14 = new TaxDTO("Wealth", 11.17, "Property", "GST", governmentDTO14);
        TaxDTO taxDTO15 = new TaxDTO("Corporate", 15.33, "Imports", "Service Tax", governmentDTO15);
        TaxDTO taxDTO16 = new TaxDTO("Excise", 8.91, "Exports", "Custom Duty", governmentDTO16);
        TaxDTO taxDTO17 = new TaxDTO("Sales", 6.4, "Corporates", "Capital Gains", governmentDTO17);
        TaxDTO taxDTO18 = new TaxDTO("Direct", 19.28, "Business", "Income Tax", governmentDTO18);
        TaxDTO taxDTO19 = new TaxDTO("Indirect", 17.61, "Individual", "VAT", governmentDTO19);
        TaxDTO taxDTO20 = new TaxDTO("Wealth", 13.77, "Property", "GST", governmentDTO20);
        TaxDTO taxDTO21 = new TaxDTO("Corporate", 7.23, "Imports", "Service Tax", governmentDTO21);
        TaxDTO taxDTO22 = new TaxDTO("Excise", 21.88, "Exports", "Custom Duty", governmentDTO22);
        TaxDTO taxDTO23 = new TaxDTO("Sales", 3.97, "Corporates", "Capital Gains", governmentDTO23);
        TaxDTO taxDTO24 = new TaxDTO("Direct", 16.58, "Business", "Income Tax", governmentDTO24);
        TaxDTO taxDTO25 = new TaxDTO("Indirect", 11.34, "Individual", "VAT", governmentDTO25);
        TaxDTO taxDTO26 = new TaxDTO("Wealth", 14.12, "Property", "GST", governmentDTO26);
        TaxDTO taxDTO27 = new TaxDTO("Corporate", 20.55, "Imports", "Service Tax", governmentDTO27);
        TaxDTO taxDTO28 = new TaxDTO("Excise", 9.66, "Exports", "Custom Duty", governmentDTO28);
        TaxDTO taxDTO29 = new TaxDTO("Sales", 18.77, "Corporates", "Capital Gains", governmentDTO29);
        TaxDTO taxDTO30 = new TaxDTO("Direct", 7.5, "Business", "Income Tax", governmentDTO30);
        TaxDTO taxDTO31 = new TaxDTO("Indirect", 6.14, "Individual", "VAT", governmentDTO31);
        TaxDTO taxDTO32 = new TaxDTO("Wealth", 8.35, "Property", "GST", governmentDTO32);
        TaxDTO taxDTO33 = new TaxDTO("Corporate", 25.74, "Imports", "Service Tax", governmentDTO33);
        TaxDTO taxDTO34 = new TaxDTO("Excise", 10.93, "Exports", "Custom Duty", governmentDTO34);
        TaxDTO taxDTO35 = new TaxDTO("Sales", 12.48, "Corporates", "Capital Gains", governmentDTO35);
        TaxDTO taxDTO36 = new TaxDTO("Direct", 4.22, "Business", "Income Tax", governmentDTO36);
        TaxDTO taxDTO37 = new TaxDTO("Indirect", 23.59, "Individual", "VAT", governmentDTO37);
        TaxDTO taxDTO38 = new TaxDTO("Wealth", 2.6, "Property", "GST", governmentDTO38);
        TaxDTO taxDTO39 = new TaxDTO("Corporate", 14.88, "Imports", "Service Tax", governmentDTO39);
        TaxDTO taxDTO40 = new TaxDTO("Excise", 6.78, "Exports", "Custom Duty", governmentDTO40);
        TaxDTO taxDTO41 = new TaxDTO("Sales", 27.3, "Corporates", "Capital Gains", governmentDTO41);
        TaxDTO taxDTO42 = new TaxDTO("Direct", 8.99, "Business", "Income Tax", governmentDTO42);
        TaxDTO taxDTO43 = new TaxDTO("Indirect", 5.47, "Individual", "VAT", governmentDTO43);
        TaxDTO taxDTO44 = new TaxDTO("Wealth", 22.2, "Property", "GST", governmentDTO44);
        TaxDTO taxDTO45 = new TaxDTO("Corporate", 9.16, "Imports", "Service Tax", governmentDTO45);
        TaxDTO taxDTO46 = new TaxDTO("Excise", 13.04, "Exports", "Custom Duty", governmentDTO46);
        TaxDTO taxDTO47 = new TaxDTO("Sales", 16.63, "Corporates", "Capital Gains", governmentDTO47);
        TaxDTO taxDTO48 = new TaxDTO("Direct", 12.91, "Business", "Income Tax", governmentDTO48);
        TaxDTO taxDTO49 = new TaxDTO("Indirect", 19.88, "Individual", "VAT", governmentDTO49);
        TaxDTO taxDTO50 = new TaxDTO("Wealth", 10.05, "Property", "GST", governmentDTO50);
        TaxDTO taxDTO51 = new TaxDTO("Corporate", 6.79, "Imports", "Service Tax", governmentDTO51);
        TaxDTO taxDTO52 = new TaxDTO("Excise", 14.44, "Exports", "Custom Duty", governmentDTO52);
        TaxDTO taxDTO53 = new TaxDTO("Sales", 11.95, "Corporates", "Capital Gains", governmentDTO53);
        TaxDTO taxDTO54 = new TaxDTO("Direct", 15.17, "Business", "Income Tax", governmentDTO54);
        TaxDTO taxDTO55 = new TaxDTO("Indirect", 7.64, "Individual", "VAT", governmentDTO55);
        TaxDTO taxDTO56 = new TaxDTO("Wealth", 20.11, "Property", "GST", governmentDTO56);
        TaxDTO taxDTO57 = new TaxDTO("Corporate", 13.57, "Imports", "Service Tax", governmentDTO57);
        TaxDTO taxDTO58 = new TaxDTO("Excise", 10.68, "Exports", "Custom Duty", governmentDTO58);
        TaxDTO taxDTO59 = new TaxDTO("Sales", 6.35, "Corporates", "Capital Gains", governmentDTO59);
        TaxDTO taxDTO60 = new TaxDTO("Direct", 21.24, "Business", "Income Tax", governmentDTO60);
        TaxDTO taxDTO61 = new TaxDTO("Indirect", 18.95, "Individual", "VAT", governmentDTO61);
        TaxDTO taxDTO62 = new TaxDTO("Wealth", 7.83, "Property", "GST", governmentDTO62);
        TaxDTO taxDTO63 = new TaxDTO("Corporate", 9.6, "Imports", "Service Tax", governmentDTO63);
        TaxDTO taxDTO64 = new TaxDTO("Excise", 5.22, "Exports", "Custom Duty", governmentDTO64);
        TaxDTO taxDTO65 = new TaxDTO("Sales", 8.11, "Corporates", "Capital Gains", governmentDTO65);
        TaxDTO taxDTO66 = new TaxDTO("Direct", 17.34, "Business", "Income Tax", governmentDTO66);
        TaxDTO taxDTO67 = new TaxDTO("Indirect", 13.21, "Individual", "VAT", governmentDTO67);


        VariablePayDTO variablePayDTO1 = new VariablePayDTO(10, 20, "Monthly", "Profit-Sharing", taxDTO1);
        VariablePayDTO variablePayDTO2 = new VariablePayDTO(12, 18, "Quarterly", "Commission", taxDTO2);
        VariablePayDTO variablePayDTO3 = new VariablePayDTO(15, 22, "Annually", "Bonus", taxDTO3);
        VariablePayDTO variablePayDTO4 = new VariablePayDTO(9, 16, "Bi-Annually", "Sales Incentive", taxDTO4);
        VariablePayDTO variablePayDTO5 = new VariablePayDTO(14, 25, "Monthly", "Performance-Based", taxDTO5);
        VariablePayDTO variablePayDTO6 = new VariablePayDTO(11, 19, "Quarterly", "Equity-Based", taxDTO6);
        VariablePayDTO variablePayDTO7 = new VariablePayDTO(13, 21, "Annually", "Profit-Sharing", taxDTO7);
        VariablePayDTO variablePayDTO8 = new VariablePayDTO(10, 20, "Bi-Annually", "Commission", taxDTO8);
        VariablePayDTO variablePayDTO9 = new VariablePayDTO(8, 18, "Monthly", "Bonus", taxDTO9);
        VariablePayDTO variablePayDTO10 = new VariablePayDTO(16, 23, "Quarterly", "Sales Incentive", taxDTO10);
        VariablePayDTO variablePayDTO11 = new VariablePayDTO(10, 17, "Annually", "Performance-Based", taxDTO11);
        VariablePayDTO variablePayDTO12 = new VariablePayDTO(14, 28, "Bi-Annually", "Equity-Based", taxDTO12);
        VariablePayDTO variablePayDTO13 = new VariablePayDTO(9, 19, "Monthly", "Profit-Sharing", taxDTO13);
        VariablePayDTO variablePayDTO14 = new VariablePayDTO(11, 26, "Quarterly", "Commission", taxDTO14);
        VariablePayDTO variablePayDTO15 = new VariablePayDTO(13, 22, "Annually", "Bonus", taxDTO15);
        VariablePayDTO variablePayDTO16 = new VariablePayDTO(10, 15, "Bi-Annually", "Sales Incentive", taxDTO16);
        VariablePayDTO variablePayDTO17 = new VariablePayDTO(12, 24, "Monthly", "Performance-Based", taxDTO17);
        VariablePayDTO variablePayDTO18 = new VariablePayDTO(15, 20, "Quarterly", "Equity-Based", taxDTO18);
        VariablePayDTO variablePayDTO19 = new VariablePayDTO(9, 18, "Annually", "Profit-Sharing", taxDTO19);
        VariablePayDTO variablePayDTO20 = new VariablePayDTO(14, 27, "Bi-Annually", "Commission", taxDTO20);
        VariablePayDTO variablePayDTO21 = new VariablePayDTO(11, 21, "Monthly", "Bonus", taxDTO21);
        VariablePayDTO variablePayDTO22 = new VariablePayDTO(13, 19, "Quarterly", "Sales Incentive", taxDTO22);
        VariablePayDTO variablePayDTO23 = new VariablePayDTO(10, 23, "Annually", "Performance-Based", taxDTO23);
        VariablePayDTO variablePayDTO24 = new VariablePayDTO(12, 17, "Bi-Annually", "Equity-Based", taxDTO24);
        VariablePayDTO variablePayDTO25 = new VariablePayDTO(14, 22, "Monthly", "Profit-Sharing", taxDTO25);
        VariablePayDTO variablePayDTO26 = new VariablePayDTO(9, 26, "Quarterly", "Commission", taxDTO26);
        VariablePayDTO variablePayDTO27 = new VariablePayDTO(13, 20, "Annually", "Bonus", taxDTO27);
        VariablePayDTO variablePayDTO28 = new VariablePayDTO(11, 18, "Bi-Annually", "Sales Incentive", taxDTO28);
        VariablePayDTO variablePayDTO29 = new VariablePayDTO(15, 25, "Monthly", "Performance-Based", taxDTO29);
        VariablePayDTO variablePayDTO30 = new VariablePayDTO(10, 19, "Quarterly", "Equity-Based", taxDTO30);
        VariablePayDTO variablePayDTO31 = new VariablePayDTO(12, 21, "Annually", "Profit-Sharing", taxDTO31);
        VariablePayDTO variablePayDTO32 = new VariablePayDTO(14, 24, "Bi-Annually", "Commission", taxDTO32);
        VariablePayDTO variablePayDTO33 = new VariablePayDTO(13, 17, "Monthly", "Bonus", taxDTO33);
        VariablePayDTO variablePayDTO34 = new VariablePayDTO(11, 20, "Quarterly", "Sales Incentive", taxDTO34);
        VariablePayDTO variablePayDTO35 = new VariablePayDTO(9, 22, "Annually", "Performance-Based", taxDTO35);
        VariablePayDTO variablePayDTO36 = new VariablePayDTO(15, 26, "Bi-Annually", "Equity-Based", taxDTO36);
        VariablePayDTO variablePayDTO37 = new VariablePayDTO(10, 23, "Monthly", "Profit-Sharing", taxDTO37);
        VariablePayDTO variablePayDTO38 = new VariablePayDTO(12, 19, "Quarterly", "Commission", taxDTO38);
        VariablePayDTO variablePayDTO39 = new VariablePayDTO(14, 25, "Annually", "Bonus", taxDTO39);
        VariablePayDTO variablePayDTO40 = new VariablePayDTO(11, 21, "Bi-Annually", "Sales Incentive", taxDTO40);
        VariablePayDTO variablePayDTO41 = new VariablePayDTO(13, 18, "Monthly", "Performance-Based", taxDTO41);
        VariablePayDTO variablePayDTO42 = new VariablePayDTO(9, 24, "Quarterly", "Equity-Based", taxDTO42);
        VariablePayDTO variablePayDTO43 = new VariablePayDTO(15, 22, "Annually", "Profit-Sharing", taxDTO43);
        VariablePayDTO variablePayDTO44 = new VariablePayDTO(10, 20, "Bi-Annually", "Commission", taxDTO44);
        VariablePayDTO variablePayDTO45 = new VariablePayDTO(12, 26, "Monthly", "Bonus", taxDTO45);
        VariablePayDTO variablePayDTO46 = new VariablePayDTO(14, 23, "Quarterly", "Sales Incentive", taxDTO46);
        VariablePayDTO variablePayDTO47 = new VariablePayDTO(11, 17, "Annually", "Performance-Based", taxDTO47);
        VariablePayDTO variablePayDTO48 = new VariablePayDTO(13, 25, "Bi-Annually", "Equity-Based", taxDTO48);
        VariablePayDTO variablePayDTO49 = new VariablePayDTO(9, 21, "Monthly", "Profit-Sharing", taxDTO49);
        VariablePayDTO variablePayDTO50 = new VariablePayDTO(15, 24, "Quarterly", "Commission", taxDTO50);
        VariablePayDTO variablePayDTO51 = new VariablePayDTO(10, 18, "Annually", "Bonus", taxDTO51);
        VariablePayDTO variablePayDTO52 = new VariablePayDTO(12, 22, "Bi-Annually", "Sales Incentive", taxDTO52);
        VariablePayDTO variablePayDTO53 = new VariablePayDTO(14, 19, "Monthly", "Performance-Based", taxDTO53);
        VariablePayDTO variablePayDTO54 = new VariablePayDTO(11, 26, "Quarterly", "Equity-Based", taxDTO54);
        VariablePayDTO variablePayDTO55 = new VariablePayDTO(13, 23, "Annually", "Profit-Sharing", taxDTO55);
        VariablePayDTO variablePayDTO56 = new VariablePayDTO(9, 17, "Bi-Annually", "Commission", taxDTO56);
        VariablePayDTO variablePayDTO57 = new VariablePayDTO(15, 20, "Monthly", "Bonus", taxDTO57);
        VariablePayDTO variablePayDTO58 = new VariablePayDTO(10, 21, "Quarterly", "Sales Incentive", taxDTO58);
        VariablePayDTO variablePayDTO59 = new VariablePayDTO(12, 24, "Annually", "Performance-Based", taxDTO59);
        VariablePayDTO variablePayDTO60 = new VariablePayDTO(14, 18, "Bi-Annually", "Equity-Based", taxDTO60);
        VariablePayDTO variablePayDTO61 = new VariablePayDTO(11, 22, "Monthly", "Profit-Sharing", taxDTO61);
        VariablePayDTO variablePayDTO62 = new VariablePayDTO(13, 26, "Quarterly", "Commission", taxDTO62);
        VariablePayDTO variablePayDTO63 = new VariablePayDTO(9, 25, "Annually", "Bonus", taxDTO63);
        VariablePayDTO variablePayDTO64 = new VariablePayDTO(15, 19, "Bi-Annually", "Sales Incentive", taxDTO64);
        VariablePayDTO variablePayDTO65 = new VariablePayDTO(10, 20, "Monthly", "Performance-Based", taxDTO65);
        VariablePayDTO variablePayDTO66 = new VariablePayDTO(12, 24, "Quarterly", "Equity-Based", taxDTO66);
        VariablePayDTO variablePayDTO67 = new VariablePayDTO(14, 23, "Annually", "Profit-Sharing", taxDTO67);


        BonousDTO bonousDTO1 = new BonousDTO("Annual Bonous", 5000, "Owner", "Festival", variablePayDTO1);
        BonousDTO bonousDTO2 = new BonousDTO("Performance Bonus", 4500, "Manager", "Quarter End", variablePayDTO2);
        BonousDTO bonousDTO3 = new BonousDTO("Referral Bonus", 3000, "HR", "Referral", variablePayDTO3);
        BonousDTO bonousDTO4 = new BonousDTO("Holiday Bonus", 4000, "CEO", "New Year", variablePayDTO4);
        BonousDTO bonousDTO5 = new BonousDTO("Joining Bonus", 6000, "HR", "Onboarding", variablePayDTO5);
        BonousDTO bonousDTO6 = new BonousDTO("Project Completion", 3500, "PM", "Project Delivery", variablePayDTO6);
        BonousDTO bonousDTO7 = new BonousDTO("Sales Bonus", 7000, "Sales Head", "Target Achievement", variablePayDTO7);
        BonousDTO bonousDTO8 = new BonousDTO("Retention Bonus", 8000, "HR", "Year Completion", variablePayDTO8);
        BonousDTO bonousDTO9 = new BonousDTO("Spot Bonus", 1000, "Team Lead", "Instant Recognition", variablePayDTO9);
        BonousDTO bonousDTO10 = new BonousDTO("Appreciation Bonus", 2000, "Manager", "Performance", variablePayDTO10);
        BonousDTO bonousDTO11 = new BonousDTO("Client Appreciation", 2500, "Client", "Special Occasion", variablePayDTO11);
        BonousDTO bonousDTO12 = new BonousDTO("Festival Bonus", 3000, "HR", "Diwali", variablePayDTO12);
        BonousDTO bonousDTO13 = new BonousDTO("Year End Bonus", 5500, "CEO", "Year End", variablePayDTO13);
        BonousDTO bonousDTO14 = new BonousDTO("Incentive Bonus", 3200, "Manager", "KPI Met", variablePayDTO14);
        BonousDTO bonousDTO15 = new BonousDTO("Loyalty Bonus", 6000, "HR", "5 Years", variablePayDTO15);
        BonousDTO bonousDTO16 = new BonousDTO("Innovation Bonus", 4800, "R&D", "Patent Filed", variablePayDTO16);
        BonousDTO bonousDTO17 = new BonousDTO("Overtime Bonus", 2700, "Supervisor", "Extra Hours", variablePayDTO17);
        BonousDTO bonousDTO18 = new BonousDTO("Shift Bonus", 1200, "HR", "Night Shift", variablePayDTO18);
        BonousDTO bonousDTO19 = new BonousDTO("Training Bonus", 2300, "Trainer", "Skill Completion", variablePayDTO19);
        BonousDTO bonousDTO20 = new BonousDTO("Special Bonus", 5100, "Director", "Special Project", variablePayDTO20);
        BonousDTO bonousDTO21 = new BonousDTO("Leadership Bonus", 5200, "CEO", "Team Growth", variablePayDTO21);
        BonousDTO bonousDTO22 = new BonousDTO("Performance Excellence", 6000, "Manager", "High Rating", variablePayDTO22);
        BonousDTO bonousDTO23 = new BonousDTO("Teamwork Bonus", 3000, "Team Lead", "Collaboration", variablePayDTO23);
        BonousDTO bonousDTO24 = new BonousDTO("Attendance Bonus", 1500, "HR", "Full Attendance", variablePayDTO24);
        BonousDTO bonousDTO25 = new BonousDTO("Cultural Bonus", 1800, "Organizer", "Annual Day", variablePayDTO25);
        BonousDTO bonousDTO26 = new BonousDTO("CSR Bonus", 4000, "CSR Head", "Volunteering", variablePayDTO26);
        BonousDTO bonousDTO27 = new BonousDTO("Startup Bonus", 7000, "Founder", "Launch", variablePayDTO27);
        BonousDTO bonousDTO28 = new BonousDTO("Onsite Bonus", 9000, "Manager", "Foreign Posting", variablePayDTO28);
        BonousDTO bonousDTO29 = new BonousDTO("Research Bonus", 4500, "Lab Head", "New Findings", variablePayDTO29);
        BonousDTO bonousDTO30 = new BonousDTO("Conference Bonus", 2000, "Speaker", "Event Talk", variablePayDTO30);
        BonousDTO bonousDTO31 = new BonousDTO("Volunteer Bonus", 1700, "HR", "NGO Work", variablePayDTO31);
        BonousDTO bonousDTO32 = new BonousDTO("Coding Bonus", 3600, "Tech Lead", "Hackathon", variablePayDTO32);
        BonousDTO bonousDTO33 = new BonousDTO("Design Bonus", 3200, "Creative Head", "Product Launch", variablePayDTO33);
        BonousDTO bonousDTO34 = new BonousDTO("Tech Bonus", 4300, "CTO", "Innovation", variablePayDTO34);
        BonousDTO bonousDTO35 = new BonousDTO("Knowledge Sharing", 1800, "Mentor", "Sessions", variablePayDTO35);
        BonousDTO bonousDTO36 = new BonousDTO("Writing Bonus", 1400, "Editor", "Article", variablePayDTO36);
        BonousDTO bonousDTO37 = new BonousDTO("Support Bonus", 2500, "Admin", "Help Desk", variablePayDTO37);
        BonousDTO bonousDTO38 = new BonousDTO("Safety Bonus", 2200, "Safety Officer", "Zero Accidents", variablePayDTO38);
        BonousDTO bonousDTO39 = new BonousDTO("Cleanliness Bonus", 1600, "Housekeeping", "Sanitation", variablePayDTO39);
        BonousDTO bonousDTO40 = new BonousDTO("Maintenance Bonus", 2900, "Engineer", "Zero Downtime", variablePayDTO40);
        BonousDTO bonousDTO41 = new BonousDTO("Fitness Bonus", 3300, "Wellness Coach", "Health Program", variablePayDTO41);
        BonousDTO bonousDTO42 = new BonousDTO("Mentoring Bonus", 3700, "Mentor", "Guidance", variablePayDTO42);
        BonousDTO bonousDTO43 = new BonousDTO("Sustainability Bonus", 4200, "Green Officer", "Eco Drive", variablePayDTO43);
        BonousDTO bonousDTO44 = new BonousDTO("Digital Bonus", 3500, "IT", "Transformation", variablePayDTO44);
        BonousDTO bonousDTO45 = new BonousDTO("Automation Bonus", 4700, "Tech Lead", "Automation Project", variablePayDTO45);
        BonousDTO bonousDTO46 = new BonousDTO("AI Bonus", 4900, "AI Lead", "Model Deployment", variablePayDTO46);
        BonousDTO bonousDTO47 = new BonousDTO("Cloud Bonus", 5100, "Cloud Head", "Migration", variablePayDTO47);
        BonousDTO bonousDTO48 = new BonousDTO("Cybersecurity Bonus", 5300, "CISO", "Risk Mitigation", variablePayDTO48);
        BonousDTO bonousDTO49 = new BonousDTO("Backup Bonus", 2100, "SysAdmin", "Recovery", variablePayDTO49);
        BonousDTO bonousDTO50 = new BonousDTO("Compliance Bonus", 2400, "Compliance Head", "Audit", variablePayDTO50);
        BonousDTO bonousDTO51 = new BonousDTO("Legal Bonus", 2600, "Legal Advisor", "Case Win", variablePayDTO51);
        BonousDTO bonousDTO52 = new BonousDTO("Documentation Bonus", 2800, "Clerk", "File Accuracy", variablePayDTO52);
        BonousDTO bonousDTO53 = new BonousDTO("Finance Bonus", 3000, "CFO", "Budget Saving", variablePayDTO53);
        BonousDTO bonousDTO54 = new BonousDTO("Inventory Bonus", 3400, "Inventory Manager", "Stock Check", variablePayDTO54);
        BonousDTO bonousDTO55 = new BonousDTO("Logistics Bonus", 3700, "Logistics Head", "Timely Delivery", variablePayDTO55);
        BonousDTO bonousDTO56 = new BonousDTO("Procurement Bonus", 3900, "Procurement Head", "Cost Reduction", variablePayDTO56);
        BonousDTO bonousDTO57 = new BonousDTO("Quality Bonus", 4100, "QA Lead", "Zero Defects", variablePayDTO57);
        BonousDTO bonousDTO58 = new BonousDTO("Testing Bonus", 4300, "QA Engineer", "Bug Free", variablePayDTO58);
        BonousDTO bonousDTO59 = new BonousDTO("Deployment Bonus", 4500, "DevOps", "Zero Downtime", variablePayDTO59);
        BonousDTO bonousDTO60 = new BonousDTO("Migration Bonus", 4700, "IT", "Data Move", variablePayDTO60);
        BonousDTO bonousDTO61 = new BonousDTO("Integration Bonus", 4900, "Dev Lead", "System Merge", variablePayDTO61);
        BonousDTO bonousDTO62 = new BonousDTO("Debugging Bonus", 5100, "Developer", "Critical Fix", variablePayDTO62);
        BonousDTO bonousDTO63 = new BonousDTO("Remote Bonus", 5300, "HR", "WFH", variablePayDTO63);
        BonousDTO bonousDTO64 = new BonousDTO("Relocation Bonus", 5500, "HR", "Transfer", variablePayDTO64);
        BonousDTO bonousDTO65 = new BonousDTO("Startup Equity", 7000, "Founder", "Shareholding", variablePayDTO65);
        BonousDTO bonousDTO66 = new BonousDTO("Overseas Bonus", 8500, "Manager", "International", variablePayDTO66);
        BonousDTO bonousDTO67 = new BonousDTO("Volunteer Leadership", 1800, "NGO", "Social Event", variablePayDTO67);


        SalaryExpectationDTO salaryExpectationDTO1 = new SalaryExpectationDTO(8, "Rupees", "Fresher", true, bonousDTO1);
        SalaryExpectationDTO salaryExpectationDTO2 = new SalaryExpectationDTO(10, "Rupees", "Junior", false, bonousDTO2);
        SalaryExpectationDTO salaryExpectationDTO3 = new SalaryExpectationDTO(12, "Rupees", "Mid", true, bonousDTO3);
        SalaryExpectationDTO salaryExpectationDTO4 = new SalaryExpectationDTO(15, "Rupees", "Senior", false, bonousDTO4);
        SalaryExpectationDTO salaryExpectationDTO5 = new SalaryExpectationDTO(20, "Rupees", "Lead", true, bonousDTO5);
        SalaryExpectationDTO salaryExpectationDTO6 = new SalaryExpectationDTO(25, "Rupees", "Manager", false, bonousDTO6);
        SalaryExpectationDTO salaryExpectationDTO7 = new SalaryExpectationDTO(30, "Rupees", "Director", true, bonousDTO7);
        SalaryExpectationDTO salaryExpectationDTO8 = new SalaryExpectationDTO(35, "Rupees", "VP", false, bonousDTO8);
        SalaryExpectationDTO salaryExpectationDTO9 = new SalaryExpectationDTO(40, "Rupees", "CEO", true, bonousDTO9);
        SalaryExpectationDTO salaryExpectationDTO10 = new SalaryExpectationDTO(6, "USD", "Fresher", true, bonousDTO10);
        SalaryExpectationDTO salaryExpectationDTO11 = new SalaryExpectationDTO(9, "USD", "Junior", false, bonousDTO11);
        SalaryExpectationDTO salaryExpectationDTO12 = new SalaryExpectationDTO(14, "USD", "Mid", true, bonousDTO12);
        SalaryExpectationDTO salaryExpectationDTO13 = new SalaryExpectationDTO(18, "USD", "Senior", false, bonousDTO13);
        SalaryExpectationDTO salaryExpectationDTO14 = new SalaryExpectationDTO(22, "USD", "Lead", true, bonousDTO14);
        SalaryExpectationDTO salaryExpectationDTO15 = new SalaryExpectationDTO(28, "USD", "Manager", false, bonousDTO15);
        SalaryExpectationDTO salaryExpectationDTO16 = new SalaryExpectationDTO(33, "USD", "Director", true, bonousDTO16);
        SalaryExpectationDTO salaryExpectationDTO17 = new SalaryExpectationDTO(38, "USD", "VP", false, bonousDTO17);
        SalaryExpectationDTO salaryExpectationDTO18 = new SalaryExpectationDTO(45, "USD", "CEO", true, bonousDTO18);
        SalaryExpectationDTO salaryExpectationDTO19 = new SalaryExpectationDTO(7, "INR", "Fresher", false, bonousDTO19);
        SalaryExpectationDTO salaryExpectationDTO20 = new SalaryExpectationDTO(11, "INR", "Junior", true, bonousDTO20);
        SalaryExpectationDTO salaryExpectationDTO21 = new SalaryExpectationDTO(13, "INR", "Mid", false, bonousDTO21);
        SalaryExpectationDTO salaryExpectationDTO22 = new SalaryExpectationDTO(17, "INR", "Senior", true, bonousDTO22);
        SalaryExpectationDTO salaryExpectationDTO23 = new SalaryExpectationDTO(19, "INR", "Lead", false, bonousDTO23);
        SalaryExpectationDTO salaryExpectationDTO24 = new SalaryExpectationDTO(24, "INR", "Manager", true, bonousDTO24);
        SalaryExpectationDTO salaryExpectationDTO25 = new SalaryExpectationDTO(27, "INR", "Director", false, bonousDTO25);
        SalaryExpectationDTO salaryExpectationDTO26 = new SalaryExpectationDTO(31, "INR", "VP", true, bonousDTO26);
        SalaryExpectationDTO salaryExpectationDTO27 = new SalaryExpectationDTO(36, "INR", "CEO", false, bonousDTO27);
        SalaryExpectationDTO salaryExpectationDTO28 = new SalaryExpectationDTO(5, "Rupees", "Intern", true, bonousDTO28);
        SalaryExpectationDTO salaryExpectationDTO29 = new SalaryExpectationDTO(6, "Rupees", "Trainee", false, bonousDTO29);
        SalaryExpectationDTO salaryExpectationDTO30 = new SalaryExpectationDTO(9, "USD", "Intern", true, bonousDTO30);
        SalaryExpectationDTO salaryExpectationDTO31 = new SalaryExpectationDTO(10, "USD", "Trainee", false, bonousDTO31);
        SalaryExpectationDTO salaryExpectationDTO32 = new SalaryExpectationDTO(8, "EUR", "Fresher", true, bonousDTO32);
        SalaryExpectationDTO salaryExpectationDTO33 = new SalaryExpectationDTO(12, "EUR", "Junior", false, bonousDTO33);
        SalaryExpectationDTO salaryExpectationDTO34 = new SalaryExpectationDTO(16, "EUR", "Mid", true, bonousDTO34);
        SalaryExpectationDTO salaryExpectationDTO35 = new SalaryExpectationDTO(21, "EUR", "Senior", false, bonousDTO35);
        SalaryExpectationDTO salaryExpectationDTO36 = new SalaryExpectationDTO(26, "EUR", "Lead", true, bonousDTO36);
        SalaryExpectationDTO salaryExpectationDTO37 = new SalaryExpectationDTO(32, "EUR", "Manager", false, bonousDTO37);
        SalaryExpectationDTO salaryExpectationDTO38 = new SalaryExpectationDTO(39, "EUR", "Director", true, bonousDTO38);
        SalaryExpectationDTO salaryExpectationDTO39 = new SalaryExpectationDTO(44, "EUR", "VP", false, bonousDTO39);
        SalaryExpectationDTO salaryExpectationDTO40 = new SalaryExpectationDTO(50, "EUR", "CEO", true, bonousDTO40);
        SalaryExpectationDTO salaryExpectationDTO41 = new SalaryExpectationDTO(7, "GBP", "Fresher", false, bonousDTO41);
        SalaryExpectationDTO salaryExpectationDTO42 = new SalaryExpectationDTO(13, "GBP", "Junior", true, bonousDTO42);
        SalaryExpectationDTO salaryExpectationDTO43 = new SalaryExpectationDTO(19, "GBP", "Mid", false, bonousDTO43);
        SalaryExpectationDTO salaryExpectationDTO44 = new SalaryExpectationDTO(23, "GBP", "Senior", true, bonousDTO44);
        SalaryExpectationDTO salaryExpectationDTO45 = new SalaryExpectationDTO(29, "GBP", "Lead", false, bonousDTO45);
        SalaryExpectationDTO salaryExpectationDTO46 = new SalaryExpectationDTO(34, "GBP", "Manager", true, bonousDTO46);
        SalaryExpectationDTO salaryExpectationDTO47 = new SalaryExpectationDTO(41, "GBP", "Director", false, bonousDTO47);
        SalaryExpectationDTO salaryExpectationDTO48 = new SalaryExpectationDTO(46, "GBP", "VP", true, bonousDTO48);
        SalaryExpectationDTO salaryExpectationDTO49 = new SalaryExpectationDTO(52, "GBP", "CEO", false, bonousDTO49);
        SalaryExpectationDTO salaryExpectationDTO50 = new SalaryExpectationDTO(6, "Yen", "Fresher", true, bonousDTO50);
        SalaryExpectationDTO salaryExpectationDTO51 = new SalaryExpectationDTO(11, "Yen", "Junior", false, bonousDTO51);
        SalaryExpectationDTO salaryExpectationDTO52 = new SalaryExpectationDTO(15, "Yen", "Mid", true, bonousDTO52);
        SalaryExpectationDTO salaryExpectationDTO53 = new SalaryExpectationDTO(20, "Yen", "Senior", false, bonousDTO53);
        SalaryExpectationDTO salaryExpectationDTO54 = new SalaryExpectationDTO(26, "Yen", "Lead", true, bonousDTO54);
        SalaryExpectationDTO salaryExpectationDTO55 = new SalaryExpectationDTO(31, "Yen", "Manager", false, bonousDTO55);
        SalaryExpectationDTO salaryExpectationDTO56 = new SalaryExpectationDTO(37, "Yen", "Director", true, bonousDTO56);
        SalaryExpectationDTO salaryExpectationDTO57 = new SalaryExpectationDTO(43, "Yen", "VP", false, bonousDTO57);
        SalaryExpectationDTO salaryExpectationDTO58 = new SalaryExpectationDTO(49, "Yen", "CEO", true, bonousDTO58);
        SalaryExpectationDTO salaryExpectationDTO59 = new SalaryExpectationDTO(5, "AUD", "Intern", true, bonousDTO59);
        SalaryExpectationDTO salaryExpectationDTO60 = new SalaryExpectationDTO(8, "AUD", "Fresher", false, bonousDTO60);
        SalaryExpectationDTO salaryExpectationDTO61 = new SalaryExpectationDTO(14, "AUD", "Junior", true, bonousDTO61);
        SalaryExpectationDTO salaryExpectationDTO62 = new SalaryExpectationDTO(18, "AUD", "Mid", false, bonousDTO62);
        SalaryExpectationDTO salaryExpectationDTO63 = new SalaryExpectationDTO(24, "AUD", "Senior", true, bonousDTO63);
        SalaryExpectationDTO salaryExpectationDTO64 = new SalaryExpectationDTO(30, "AUD", "Lead", false, bonousDTO64);
        SalaryExpectationDTO salaryExpectationDTO65 = new SalaryExpectationDTO(36, "AUD", "Manager", true, bonousDTO65);
        SalaryExpectationDTO salaryExpectationDTO66 = new SalaryExpectationDTO(42, "AUD", "Director", false, bonousDTO66);
        SalaryExpectationDTO salaryExpectationDTO67 = new SalaryExpectationDTO(48, "AUD", "VP", true, bonousDTO67);

        CriteriaDTO criteriaDTO1a = new CriteriaDTO("B.E", 2, "Java", "Offline", salaryExpectationDTO1);
        CriteriaDTO criteriaDTO1b = new CriteriaDTO("M.Tech", 3, "Cyber Security", "Remote", salaryExpectationDTO1);
        List<CriteriaDTO> criteriaDTO1 = new ArrayList<>();
        criteriaDTO1.add(criteriaDTO1a);
        criteriaDTO1.add(criteriaDTO1b);

        CriteriaDTO criteriaDTO02a = new CriteriaDTO("B.Sc", 1, "Python", "Hybrid", salaryExpectationDTO2);
        CriteriaDTO criteriaDTO02b = new CriteriaDTO("M.Sc", 2, "Data Science", "Remote", salaryExpectationDTO2);
        List<CriteriaDTO> criteriaDTOList2 = new ArrayList<>();
        criteriaDTOList2.add(criteriaDTO02a);
        criteriaDTOList2.add(criteriaDTO02b);

        CriteriaDTO criteriaDTO03a = new CriteriaDTO("Diploma", 1, "Networking", "Onsite", salaryExpectationDTO3);
        CriteriaDTO criteriaDTO03b = new CriteriaDTO("BCA", 2, "Cloud", "Remote", salaryExpectationDTO3);
        List<CriteriaDTO> criteriaDTOList3 = new ArrayList<>();
        criteriaDTOList3.add(criteriaDTO03a);
        criteriaDTOList3.add(criteriaDTO03b);

        CriteriaDTO criteriaDTO04a = new CriteriaDTO("B.Com", 1, "Excel", "Offline", salaryExpectationDTO4);
        CriteriaDTO criteriaDTO04b = new CriteriaDTO("M.Com", 3, "Power BI", "Hybrid", salaryExpectationDTO4);
        List<CriteriaDTO> criteriaDTOList4 = new ArrayList<>();
        criteriaDTOList4.add(criteriaDTO04a);
        criteriaDTOList4.add(criteriaDTO04b);

        CriteriaDTO criteriaDTO05a = new CriteriaDTO("B.E", 2, "C++", "Onsite", salaryExpectationDTO5);
        CriteriaDTO criteriaDTO05b = new CriteriaDTO("M.Tech", 4, "AI/ML", "Remote", salaryExpectationDTO5);
        List<CriteriaDTO> criteriaDTOList5 = new ArrayList<>();
        criteriaDTOList5.add(criteriaDTO05a);
        criteriaDTOList5.add(criteriaDTO05b);

        CriteriaDTO criteriaDTO06a = new CriteriaDTO("BBA", 2, "Marketing", "Hybrid", salaryExpectationDTO6);
        CriteriaDTO criteriaDTO06b = new CriteriaDTO("MBA", 5, "Digital Strategy", "Remote", salaryExpectationDTO6);
        List<CriteriaDTO> criteriaDTOList6 = new ArrayList<>();
        criteriaDTOList6.add(criteriaDTO06a);
        criteriaDTOList6.add(criteriaDTO06b);

        CriteriaDTO criteriaDTO07a = new CriteriaDTO("B.Sc", 1, "Biotech", "Offline", salaryExpectationDTO7);
        CriteriaDTO criteriaDTO07b = new CriteriaDTO("Ph.D", 6, "Genomics", "Remote", salaryExpectationDTO7);
        List<CriteriaDTO> criteriaDTOList7 = new ArrayList<>();
        criteriaDTOList7.add(criteriaDTO07a);
        criteriaDTOList7.add(criteriaDTO07b);

        CriteriaDTO criteriaDTO08a = new CriteriaDTO("BFA", 2, "Animation", "Hybrid", salaryExpectationDTO8);
        CriteriaDTO criteriaDTO08b = new CriteriaDTO("MFA", 3, "3D Design", "Onsite", salaryExpectationDTO8);
        List<CriteriaDTO> criteriaDTOList8 = new ArrayList<>();
        criteriaDTOList8.add(criteriaDTO08a);
        criteriaDTOList8.add(criteriaDTO08b);

        CriteriaDTO criteriaDTO09a = new CriteriaDTO("B.E", 2, "Embedded Systems", "Offline", salaryExpectationDTO9);
        CriteriaDTO criteriaDTO09b = new CriteriaDTO("M.Tech", 4, "Robotics", "Remote", salaryExpectationDTO9);
        List<CriteriaDTO> criteriaDTOList9 = new ArrayList<>();
        criteriaDTOList9.add(criteriaDTO09a);
        criteriaDTOList9.add(criteriaDTO09b);

        CriteriaDTO criteriaDTO10a = new CriteriaDTO("BCA", 2, "Web Dev", "Remote", salaryExpectationDTO10);
        CriteriaDTO criteriaDTO10b = new CriteriaDTO("MCA", 3, "Full Stack", "Onsite", salaryExpectationDTO10);
        List<CriteriaDTO> criteriaDTOList10 = new ArrayList<>();
        criteriaDTOList10.add(criteriaDTO10a);
        criteriaDTOList10.add(criteriaDTO10b);

        CriteriaDTO criteriaDTO11a = new CriteriaDTO("B.E", 3, "Microservices", "Remote", salaryExpectationDTO11);
        CriteriaDTO criteriaDTO11b = new CriteriaDTO("M.Tech", 5, "Spring Boot", "Hybrid", salaryExpectationDTO11);
        List<CriteriaDTO> criteriaDTOList11 = new ArrayList<>();
        criteriaDTOList11.add(criteriaDTO11a);
        criteriaDTOList11.add(criteriaDTO11b);

        CriteriaDTO criteriaDTO12a = new CriteriaDTO("B.Sc", 1, "Cyber Law", "Onsite", salaryExpectationDTO12);
        CriteriaDTO criteriaDTO12b = new CriteriaDTO("M.Sc", 2, "Information Security", "Remote", salaryExpectationDTO12);
        List<CriteriaDTO> criteriaDTOList12 = new ArrayList<>();
        criteriaDTOList12.add(criteriaDTO12a);
        criteriaDTOList12.add(criteriaDTO12b);

        CriteriaDTO criteriaDTO13a = new CriteriaDTO("B.Com", 2, "Tally", "Offline", salaryExpectationDTO13);
        CriteriaDTO criteriaDTO13b = new CriteriaDTO("M.Com", 3, "SAP FICO", "Remote", salaryExpectationDTO13);
        List<CriteriaDTO> criteriaDTOList13 = new ArrayList<>();
        criteriaDTOList13.add(criteriaDTO13a);
        criteriaDTOList13.add(criteriaDTO13b);

        CriteriaDTO criteriaDTO14a = new CriteriaDTO("B.A", 2, "Journalism", "Hybrid", salaryExpectationDTO14);
        CriteriaDTO criteriaDTO14b = new CriteriaDTO("M.A", 3, "Mass Comm", "Remote", salaryExpectationDTO14);
        List<CriteriaDTO> criteriaDTOList14 = new ArrayList<>();
        criteriaDTOList14.add(criteriaDTO14a);
        criteriaDTOList14.add(criteriaDTO14b);

        CriteriaDTO criteriaDTO15a = new CriteriaDTO("Diploma", 1, "Mechanical CAD", "Onsite", salaryExpectationDTO15);
        CriteriaDTO criteriaDTO15b = new CriteriaDTO("B.Tech", 3, "AutoCAD", "Remote", salaryExpectationDTO15);
        List<CriteriaDTO> criteriaDTOList15 = new ArrayList<>();
        criteriaDTOList15.add(criteriaDTO15a);
        criteriaDTOList15.add(criteriaDTO15b);

        CriteriaDTO criteriaDTO16a = new CriteriaDTO("B.Sc", 2, "Pharmaceuticals", "Offline", salaryExpectationDTO16);
        CriteriaDTO criteriaDTO16b = new CriteriaDTO("M.Sc", 4, "Bioinformatics", "Remote", salaryExpectationDTO16);
        List<CriteriaDTO> criteriaDTOList16 = new ArrayList<>();
        criteriaDTOList16.add(criteriaDTO16a);
        criteriaDTOList16.add(criteriaDTO16b);

        CriteriaDTO criteriaDTO17a = new CriteriaDTO("BCA", 1, "Mobile App Dev", "Remote", salaryExpectationDTO17);
        CriteriaDTO criteriaDTO17b = new CriteriaDTO("MCA", 3, "Flutter", "Hybrid", salaryExpectationDTO17);
        List<CriteriaDTO> criteriaDTOList17 = new ArrayList<>();
        criteriaDTOList17.add(criteriaDTO17a);
        criteriaDTOList17.add(criteriaDTO17b);

        CriteriaDTO criteriaDTO18a = new CriteriaDTO("B.E", 2, "Game Dev", "Onsite", salaryExpectationDTO18);
        CriteriaDTO criteriaDTO18b = new CriteriaDTO("M.Tech", 4, "Unity", "Remote", salaryExpectationDTO18);
        List<CriteriaDTO> criteriaDTOList18 = new ArrayList<>();
        criteriaDTOList18.add(criteriaDTO18a);
        criteriaDTOList18.add(criteriaDTO18b);

        CriteriaDTO criteriaDTO19a = new CriteriaDTO("B.Sc", 1, "Math Modelling", "Offline", salaryExpectationDTO19);
        CriteriaDTO criteriaDTO19b = new CriteriaDTO("Ph.D", 6, "Simulation", "Remote", salaryExpectationDTO19);
        List<CriteriaDTO> criteriaDTOList19 = new ArrayList<>();
        criteriaDTOList19.add(criteriaDTO19a);
        criteriaDTOList19.add(criteriaDTO19b);

        CriteriaDTO criteriaDTO20a = new CriteriaDTO("BBA", 2, "Sales", "Hybrid", salaryExpectationDTO20);
        CriteriaDTO criteriaDTO20b = new CriteriaDTO("MBA", 4, "Business Analytics", "Remote", salaryExpectationDTO20);
        List<CriteriaDTO> criteriaDTOList20 = new ArrayList<>();
        criteriaDTOList20.add(criteriaDTO20a);
        criteriaDTOList20.add(criteriaDTO20b);

        CriteriaDTO criteriaDTO21a = new CriteriaDTO("BCA", 1, "HTML/CSS", "Remote", salaryExpectationDTO21);
        CriteriaDTO criteriaDTO21b = new CriteriaDTO("MCA", 2, "JavaScript", "Hybrid", salaryExpectationDTO21);
        List<CriteriaDTO> criteriaDTOList21 = new ArrayList<>();
        criteriaDTOList21.add(criteriaDTO21a);
        criteriaDTOList21.add(criteriaDTO21b);

        CriteriaDTO criteriaDTO22a = new CriteriaDTO("B.Tech", 2, "DevOps", "Onsite", salaryExpectationDTO22);
        CriteriaDTO criteriaDTO22b = new CriteriaDTO("M.Tech", 4, "Kubernetes", "Remote", salaryExpectationDTO22);
        List<CriteriaDTO> criteriaDTOList22 = new ArrayList<>();
        criteriaDTOList22.add(criteriaDTO22a);
        criteriaDTOList22.add(criteriaDTO22b);

        CriteriaDTO criteriaDTO23a = new CriteriaDTO("B.E", 2, "AI", "Remote", salaryExpectationDTO23);
        CriteriaDTO criteriaDTO23b = new CriteriaDTO("M.Tech", 3, "Deep Learning", "Remote", salaryExpectationDTO23);
        List<CriteriaDTO> criteriaDTOList23 = new ArrayList<>();
        criteriaDTOList23.add(criteriaDTO23a);
        criteriaDTOList23.add(criteriaDTO23b);

        CriteriaDTO criteriaDTO24a = new CriteriaDTO("B.Sc", 1, "Statistics", "Hybrid", salaryExpectationDTO24);
        CriteriaDTO criteriaDTO24b = new CriteriaDTO("M.Sc", 2, "Data Analytics", "Remote", salaryExpectationDTO24);
        List<CriteriaDTO> criteriaDTOList24 = new ArrayList<>();
        criteriaDTOList24.add(criteriaDTO24a);
        criteriaDTOList24.add(criteriaDTO24b);

        CriteriaDTO criteriaDTO25a = new CriteriaDTO("B.Com", 2, "Finance", "Onsite", salaryExpectationDTO25);
        CriteriaDTO criteriaDTO25b = new CriteriaDTO("CA", 5, "Taxation", "Remote", salaryExpectationDTO25);
        List<CriteriaDTO> criteriaDTOList25 = new ArrayList<>();
        criteriaDTOList25.add(criteriaDTO25a);
        criteriaDTOList25.add(criteriaDTO25b);

        CriteriaDTO criteriaDTO26a = new CriteriaDTO("B.Arch", 3, "Interior Design", "Offline", salaryExpectationDTO26);
        CriteriaDTO criteriaDTO26b = new CriteriaDTO("M.Arch", 4, "3D Rendering", "Remote", salaryExpectationDTO26);
        List<CriteriaDTO> criteriaDTOList26 = new ArrayList<>();
        criteriaDTOList26.add(criteriaDTO26a);
        criteriaDTOList26.add(criteriaDTO26b);

        CriteriaDTO criteriaDTO27a = new CriteriaDTO("B.Ed", 1, "Classroom Teaching", "Onsite", salaryExpectationDTO27);
        CriteriaDTO criteriaDTO27b = new CriteriaDTO("M.Ed", 3, "Curriculum Dev", "Remote", salaryExpectationDTO27);
        List<CriteriaDTO> criteriaDTOList27 = new ArrayList<>();
        criteriaDTOList27.add(criteriaDTO27a);
        criteriaDTOList27.add(criteriaDTO27b);

        CriteriaDTO criteriaDTO28a = new CriteriaDTO("B.E", 2, "Testing", "Hybrid", salaryExpectationDTO28);
        CriteriaDTO criteriaDTO28b = new CriteriaDTO("M.Tech", 3, "Automation", "Remote", salaryExpectationDTO28);
        List<CriteriaDTO> criteriaDTOList28 = new ArrayList<>();
        criteriaDTOList28.add(criteriaDTO28a);
        criteriaDTOList28.add(criteriaDTO28b);

        CriteriaDTO criteriaDTO29a = new CriteriaDTO("B.Sc", 1, "Zoology", "Offline", salaryExpectationDTO29);
        CriteriaDTO criteriaDTO29b = new CriteriaDTO("M.Sc", 2, "Wildlife Research", "Remote", salaryExpectationDTO29);
        List<CriteriaDTO> criteriaDTOList29 = new ArrayList<>();
        criteriaDTOList29.add(criteriaDTO29a);
        criteriaDTOList29.add(criteriaDTO29b);

        CriteriaDTO criteriaDTO30a = new CriteriaDTO("BFA", 2, "Illustration", "Onsite", salaryExpectationDTO30);
        CriteriaDTO criteriaDTO30b = new CriteriaDTO("MFA", 4, "Creative Direction", "Remote", salaryExpectationDTO30);
        List<CriteriaDTO> criteriaDTOList30 = new ArrayList<>();
        criteriaDTOList30.add(criteriaDTO30a);
        criteriaDTOList30.add(criteriaDTO30b);

        CriteriaDTO criteriaDTO31a = new CriteriaDTO("BCA", 1, "UI/UX", "Remote", salaryExpectationDTO31);
        CriteriaDTO criteriaDTO31b = new CriteriaDTO("MCA", 2, "Frontend Dev", "Hybrid", salaryExpectationDTO31);
        List<CriteriaDTO> criteriaDTOList31 = new ArrayList<>();
        criteriaDTOList31.add(criteriaDTO31a);
        criteriaDTOList31.add(criteriaDTO31b);

        CriteriaDTO criteriaDTO32a = new CriteriaDTO("B.Tech", 3, "Backend Dev", "Onsite", salaryExpectationDTO32);
        CriteriaDTO criteriaDTO32b = new CriteriaDTO("M.Tech", 5, "System Design", "Remote", salaryExpectationDTO32);
        List<CriteriaDTO> criteriaDTOList32 = new ArrayList<>();
        criteriaDTOList32.add(criteriaDTO32a);
        criteriaDTOList32.add(criteriaDTO32b);

        CriteriaDTO criteriaDTO33a = new CriteriaDTO("B.E", 2, "AR/VR", "Hybrid", salaryExpectationDTO33);
        CriteriaDTO criteriaDTO33b = new CriteriaDTO("M.Tech", 3, "Mixed Reality", "Remote", salaryExpectationDTO33);
        List<CriteriaDTO> criteriaDTOList33 = new ArrayList<>();
        criteriaDTOList33.add(criteriaDTO33a);
        criteriaDTOList33.add(criteriaDTO33b);

        CriteriaDTO criteriaDTO34a = new CriteriaDTO("BFA", 2, "2D Art", "Offline", salaryExpectationDTO34);
        CriteriaDTO criteriaDTO34b = new CriteriaDTO("MFA", 4, "Concept Art", "Remote", salaryExpectationDTO34);
        List<CriteriaDTO> criteriaDTOList34 = new ArrayList<>();
        criteriaDTOList34.add(criteriaDTO34a);
        criteriaDTOList34.add(criteriaDTO34b);

        CriteriaDTO criteriaDTO35a = new CriteriaDTO("BBA", 1, "Operations", "Onsite", salaryExpectationDTO35);
        CriteriaDTO criteriaDTO35b = new CriteriaDTO("MBA", 3, "Logistics", "Hybrid", salaryExpectationDTO35);
        List<CriteriaDTO> criteriaDTOList35 = new ArrayList<>();
        criteriaDTOList35.add(criteriaDTO35a);
        criteriaDTOList35.add(criteriaDTO35b);

        CriteriaDTO criteriaDTO36a = new CriteriaDTO("B.E", 2, "IoT", "Remote", salaryExpectationDTO36);
        CriteriaDTO criteriaDTO36b = new CriteriaDTO("M.Tech", 4, "Embedded Systems", "Onsite", salaryExpectationDTO36);
        List<CriteriaDTO> criteriaDTOList36 = new ArrayList<>();
        criteriaDTOList36.add(criteriaDTO36a);
        criteriaDTOList36.add(criteriaDTO36b);

        CriteriaDTO criteriaDTO37a = new CriteriaDTO("B.Sc", 2, "Astronomy", "Offline", salaryExpectationDTO37);
        CriteriaDTO criteriaDTO37b = new CriteriaDTO("M.Sc", 5, "Astrophysics", "Remote", salaryExpectationDTO37);
        List<CriteriaDTO> criteriaDTOList37 = new ArrayList<>();
        criteriaDTOList37.add(criteriaDTO37a);
        criteriaDTOList37.add(criteriaDTO37b);

        CriteriaDTO criteriaDTO38a = new CriteriaDTO("B.Com", 1, "Auditing", "Onsite", salaryExpectationDTO38);
        CriteriaDTO criteriaDTO38b = new CriteriaDTO("M.Com", 3, "Forensic Accounting", "Remote", salaryExpectationDTO38);
        List<CriteriaDTO> criteriaDTOList38 = new ArrayList<>();
        criteriaDTOList38.add(criteriaDTO38a);
        criteriaDTOList38.add(criteriaDTO38b);

        CriteriaDTO criteriaDTO39a = new CriteriaDTO("B.Ed", 1, "Virtual Teaching", "Remote", salaryExpectationDTO39);
        CriteriaDTO criteriaDTO39b = new CriteriaDTO("M.Ed", 3, "EdTech", "Hybrid", salaryExpectationDTO39);
        List<CriteriaDTO> criteriaDTOList39 = new ArrayList<>();
        criteriaDTOList39.add(criteriaDTO39a);
        criteriaDTOList39.add(criteriaDTO39b);

        CriteriaDTO criteriaDTO40a = new CriteriaDTO("Diploma", 1, "Automobile", "Onsite", salaryExpectationDTO40);
        CriteriaDTO criteriaDTO40b = new CriteriaDTO("B.Tech", 3, "Vehicle Design", "Remote", salaryExpectationDTO40);
        List<CriteriaDTO> criteriaDTOList40 = new ArrayList<>();
        criteriaDTOList40.add(criteriaDTO40a);
        criteriaDTOList40.add(criteriaDTO40b);

        CriteriaDTO criteriaDTO41a = new CriteriaDTO("B.Sc", 1, "Food Technology", "Hybrid", salaryExpectationDTO41);
        CriteriaDTO criteriaDTO41b = new CriteriaDTO("M.Sc", 2, "Nutrition", "Remote", salaryExpectationDTO41);
        List<CriteriaDTO> criteriaDTOList41 = new ArrayList<>();
        criteriaDTOList41.add(criteriaDTO41a);
        criteriaDTOList41.add(criteriaDTO41b);

        CriteriaDTO criteriaDTO42a = new CriteriaDTO("B.E", 2, "Big Data", "Remote", salaryExpectationDTO42);
        CriteriaDTO criteriaDTO42b = new CriteriaDTO("M.Tech", 4, "Hadoop", "Onsite", salaryExpectationDTO42);
        List<CriteriaDTO> criteriaDTOList42 = new ArrayList<>();
        criteriaDTOList42.add(criteriaDTO42a);
        criteriaDTOList42.add(criteriaDTO42b);

        CriteriaDTO criteriaDTO43a = new CriteriaDTO("BCA", 1, "PHP", "Offline", salaryExpectationDTO43);
        CriteriaDTO criteriaDTO43b = new CriteriaDTO("MCA", 2, "Laravel", "Remote", salaryExpectationDTO43);
        List<CriteriaDTO> criteriaDTOList43 = new ArrayList<>();
        criteriaDTOList43.add(criteriaDTO43a);
        criteriaDTOList43.add(criteriaDTO43b);

        CriteriaDTO criteriaDTO44a = new CriteriaDTO("BBA", 2, "CRM", "Hybrid", salaryExpectationDTO44);
        CriteriaDTO criteriaDTO44b = new CriteriaDTO("MBA", 3, "Customer Success", "Remote", salaryExpectationDTO44);
        List<CriteriaDTO> criteriaDTOList44 = new ArrayList<>();
        criteriaDTOList44.add(criteriaDTO44a);
        criteriaDTOList44.add(criteriaDTO44b);

        CriteriaDTO criteriaDTO45a = new CriteriaDTO("BFA", 1, "Video Editing", "Onsite", salaryExpectationDTO45);
        CriteriaDTO criteriaDTO45b = new CriteriaDTO("MFA", 3, "Motion Graphics", "Remote", salaryExpectationDTO45);
        List<CriteriaDTO> criteriaDTOList45 = new ArrayList<>();
        criteriaDTOList45.add(criteriaDTO45a);
        criteriaDTOList45.add(criteriaDTO45b);

        CriteriaDTO criteriaDTO46a = new CriteriaDTO("B.Tech", 2, "Ethical Hacking", "Remote", salaryExpectationDTO46);
        CriteriaDTO criteriaDTO46b = new CriteriaDTO("M.Tech", 5, "Penetration Testing", "Hybrid", salaryExpectationDTO46);
        List<CriteriaDTO> criteriaDTOList46 = new ArrayList<>();
        criteriaDTOList46.add(criteriaDTO46a);
        criteriaDTOList46.add(criteriaDTO46b);

        CriteriaDTO criteriaDTO47a = new CriteriaDTO("B.E", 2, "Software Testing", "Onsite", salaryExpectationDTO47);
        CriteriaDTO criteriaDTO47b = new CriteriaDTO("M.Tech", 3, "Test Automation", "Remote", salaryExpectationDTO47);
        List<CriteriaDTO> criteriaDTOList47 = new ArrayList<>();
        criteriaDTOList47.add(criteriaDTO47a);
        criteriaDTOList47.add(criteriaDTO47b);

        CriteriaDTO criteriaDTO48a = new CriteriaDTO("B.Sc", 1, "Genetics", "Offline", salaryExpectationDTO48);
        CriteriaDTO criteriaDTO48b = new CriteriaDTO("M.Sc", 3, "Molecular Biology", "Remote", salaryExpectationDTO48);
        List<CriteriaDTO> criteriaDTOList48 = new ArrayList<>();
        criteriaDTOList48.add(criteriaDTO48a);
        criteriaDTOList48.add(criteriaDTO48b);

        CriteriaDTO criteriaDTO49a = new CriteriaDTO("B.Com", 2, "E-Commerce", "Hybrid", salaryExpectationDTO49);
        CriteriaDTO criteriaDTO49b = new CriteriaDTO("MBA", 4, "Digital Sales", "Remote", salaryExpectationDTO49);
        List<CriteriaDTO> criteriaDTOList49 = new ArrayList<>();
        criteriaDTOList49.add(criteriaDTO49a);
        criteriaDTOList49.add(criteriaDTO49b);

        CriteriaDTO criteriaDTO50a = new CriteriaDTO("B.E", 3, "Cloud Security", "Remote", salaryExpectationDTO50);
        CriteriaDTO criteriaDTO50b = new CriteriaDTO("M.Tech", 6, "DevSecOps", "Hybrid", salaryExpectationDTO50);
        List<CriteriaDTO> criteriaDTOList50 = new ArrayList<>();
        criteriaDTOList50.add(criteriaDTO50a);
        criteriaDTOList50.add(criteriaDTO50b);

        CriteriaDTO criteriaDTO51a = new CriteriaDTO("B.Sc", 2, "Healthcare Analytics", "Onsite", salaryExpectationDTO51);
        CriteriaDTO criteriaDTO51b = new CriteriaDTO("M.Sc", 4, "Medical Informatics", "Remote", salaryExpectationDTO51);
        List<CriteriaDTO> criteriaDTOList51 = new ArrayList<>();
        criteriaDTOList51.add(criteriaDTO51a);
        criteriaDTOList51.add(criteriaDTO51b);

        CriteriaDTO criteriaDTO52a = new CriteriaDTO("BCA", 1, "ReactJS", "Remote", salaryExpectationDTO52);
        CriteriaDTO criteriaDTO52b = new CriteriaDTO("MCA", 2, "Next.js", "Hybrid", salaryExpectationDTO52);
        List<CriteriaDTO> criteriaDTOList52 = new ArrayList<>();
        criteriaDTOList52.add(criteriaDTO52a);
        criteriaDTOList52.add(criteriaDTO52b);

        CriteriaDTO criteriaDTO53a = new CriteriaDTO("BBA", 2, "Finance Operations", "Offline", salaryExpectationDTO53);
        CriteriaDTO criteriaDTO53b = new CriteriaDTO("MBA", 3, "Wealth Management", "Remote", salaryExpectationDTO53);
        List<CriteriaDTO> criteriaDTOList53 = new ArrayList<>();
        criteriaDTOList53.add(criteriaDTO53a);
        criteriaDTOList53.add(criteriaDTO53b);

        CriteriaDTO criteriaDTO54a = new CriteriaDTO("B.E", 2, "Blockchain", "Onsite", salaryExpectationDTO54);
        CriteriaDTO criteriaDTO54b = new CriteriaDTO("M.Tech", 4, "Web3", "Remote", salaryExpectationDTO54);
        List<CriteriaDTO> criteriaDTOList54 = new ArrayList<>();
        criteriaDTOList54.add(criteriaDTO54a);
        criteriaDTOList54.add(criteriaDTO54b);

        CriteriaDTO criteriaDTO55a = new CriteriaDTO("BFA", 2, "Photography", "Remote", salaryExpectationDTO55);
        CriteriaDTO criteriaDTO55b = new CriteriaDTO("MFA", 4, "Visual Arts", "Hybrid", salaryExpectationDTO55);
        List<CriteriaDTO> criteriaDTOList55 = new ArrayList<>();
        criteriaDTOList55.add(criteriaDTO55a);
        criteriaDTOList55.add(criteriaDTO55b);

        CriteriaDTO criteriaDTO56a = new CriteriaDTO("B.Tech", 3, "Site Reliability", "Remote", salaryExpectationDTO56);
        CriteriaDTO criteriaDTO56b = new CriteriaDTO("M.Tech", 6, "Infrastructure", "Onsite", salaryExpectationDTO56);
        List<CriteriaDTO> criteriaDTOList56 = new ArrayList<>();
        criteriaDTOList56.add(criteriaDTO56a);
        criteriaDTOList56.add(criteriaDTO56b);

        CriteriaDTO criteriaDTO57a = new CriteriaDTO("BCA", 1, "Software Support", "Hybrid", salaryExpectationDTO57);
        CriteriaDTO criteriaDTO57b = new CriteriaDTO("MCA", 3, "Customer Engineering", "Remote", salaryExpectationDTO57);
        List<CriteriaDTO> criteriaDTOList57 = new ArrayList<>();
        criteriaDTOList57.add(criteriaDTO57a);
        criteriaDTOList57.add(criteriaDTO57b);

        CriteriaDTO criteriaDTO58a = new CriteriaDTO("B.Sc", 2, "Environment Science", "Onsite", salaryExpectationDTO58);
        CriteriaDTO criteriaDTO58b = new CriteriaDTO("M.Sc", 4, "Climate Modeling", "Remote", salaryExpectationDTO58);
        List<CriteriaDTO> criteriaDTOList58 = new ArrayList<>();
        criteriaDTOList58.add(criteriaDTO58a);
        criteriaDTOList58.add(criteriaDTO58b);

        CriteriaDTO criteriaDTO59a = new CriteriaDTO("B.E", 3, "Control Systems", "Hybrid", salaryExpectationDTO59);
        CriteriaDTO criteriaDTO59b = new CriteriaDTO("M.Tech", 5, "Automation Engineering", "Remote", salaryExpectationDTO59);
        List<CriteriaDTO> criteriaDTOList59 = new ArrayList<>();
        criteriaDTOList59.add(criteriaDTO59a);
        criteriaDTOList59.add(criteriaDTO59b);

        CriteriaDTO criteriaDTO60a = new CriteriaDTO("B.Com", 2, "Risk Analysis", "Remote", salaryExpectationDTO60);
        CriteriaDTO criteriaDTO60b = new CriteriaDTO("CA", 5, "Enterprise Risk", "Onsite", salaryExpectationDTO60);
        List<CriteriaDTO> criteriaDTOList60 = new ArrayList<>();
        criteriaDTOList60.add(criteriaDTO60a);
        criteriaDTOList60.add(criteriaDTO60b);

        CriteriaDTO criteriaDTO61a = new CriteriaDTO("B.Sc", 1, "Marine Biology", "Onsite", salaryExpectationDTO61);
        CriteriaDTO criteriaDTO61b = new CriteriaDTO("M.Sc", 3, "Oceanography", "Remote", salaryExpectationDTO61);
        List<CriteriaDTO> criteriaDTOList61 = new ArrayList<>();
        criteriaDTOList61.add(criteriaDTO61a);
        criteriaDTOList61.add(criteriaDTO61b);

        CriteriaDTO criteriaDTO62a = new CriteriaDTO("B.E", 2, "AI Ethics", "Hybrid", salaryExpectationDTO62);
        CriteriaDTO criteriaDTO62b = new CriteriaDTO("M.Tech", 4, "Responsible AI", "Remote", salaryExpectationDTO62);
        List<CriteriaDTO> criteriaDTOList62 = new ArrayList<>();
        criteriaDTOList62.add(criteriaDTO62a);
        criteriaDTOList62.add(criteriaDTO62b);

        CriteriaDTO criteriaDTO63a = new CriteriaDTO("BBA", 1, "Retail Management", "Onsite", salaryExpectationDTO63);
        CriteriaDTO criteriaDTO63b = new CriteriaDTO("MBA", 3, "Merchandising", "Remote", salaryExpectationDTO63);
        List<CriteriaDTO> criteriaDTOList63 = new ArrayList<>();
        criteriaDTOList63.add(criteriaDTO63a);
        criteriaDTOList63.add(criteriaDTO63b);

        CriteriaDTO criteriaDTO64a = new CriteriaDTO("BCA", 2, "Game Testing", "Remote", salaryExpectationDTO64);
        CriteriaDTO criteriaDTO64b = new CriteriaDTO("MCA", 4, "Level Design", "Hybrid", salaryExpectationDTO64);
        List<CriteriaDTO> criteriaDTOList64 = new ArrayList<>();
        criteriaDTOList64.add(criteriaDTO64a);
        criteriaDTOList64.add(criteriaDTO64b);

        CriteriaDTO criteriaDTO65a = new CriteriaDTO("B.Tech", 3, "VLSI", "Onsite", salaryExpectationDTO65);
        CriteriaDTO criteriaDTO65b = new CriteriaDTO("M.Tech", 5, "Chip Design", "Remote", salaryExpectationDTO65);
        List<CriteriaDTO> criteriaDTOList65 = new ArrayList<>();
        criteriaDTOList65.add(criteriaDTO65a);
        criteriaDTOList65.add(criteriaDTO65b);

        CriteriaDTO criteriaDTO66a = new CriteriaDTO("B.Sc", 1, "Psychology", "Offline", salaryExpectationDTO66);
        CriteriaDTO criteriaDTO66b = new CriteriaDTO("M.Sc", 4, "Clinical Psych", "Remote", salaryExpectationDTO66);
        List<CriteriaDTO> criteriaDTOList66 = new ArrayList<>();
        criteriaDTOList66.add(criteriaDTO66a);
        criteriaDTOList66.add(criteriaDTO66b);

        CriteriaDTO criteriaDTO67a = new CriteriaDTO("BFA", 2, "Creative Writing", "Remote", salaryExpectationDTO67);
        CriteriaDTO criteriaDTO67b = new CriteriaDTO("MFA", 3, "Screenplay", "Onsite", salaryExpectationDTO67);
        List<CriteriaDTO> criteriaDTOList67 = new ArrayList<>();
        criteriaDTOList67.add(criteriaDTO67a);
        criteriaDTOList67.add(criteriaDTO67b);







        RoleDTO roleDTO = new RoleDTO("Developer", "IT", "Develop code", true, criteriaDTO1);
        RoleDTO roleDTO1 = new RoleDTO("Software Developer", "Engineering", "Handles responsibilities of a software developer", true, criteriaDTO1);
        RoleDTO roleDTO2 = new RoleDTO("Product Manager", "Marketing", "Handles responsibilities of a product manager", false, criteriaDTOList2);
        RoleDTO roleDTO3 = new RoleDTO("HR Executive", "HR", "Handles responsibilities of a hr executive", true, criteriaDTOList3);
        RoleDTO roleDTO4 = new RoleDTO("Accountant", "Finance", "Handles responsibilities of a accountant", false, criteriaDTOList4);
        RoleDTO roleDTO5 = new RoleDTO("UI/UX Designer", "Design", "Handles responsibilities of a ui/ux designer", true, criteriaDTOList5);
        RoleDTO roleDTO6 = new RoleDTO("Operations Manager", "Operations", "Handles responsibilities of a operations manager", false, criteriaDTOList6);
        RoleDTO roleDTO7 = new RoleDTO("QA Analyst", "QA", "Handles responsibilities of a qa analyst", true, criteriaDTOList7);
        RoleDTO roleDTO8 = new RoleDTO("Technical Support", "Support", "Handles responsibilities of a technical support", false, criteriaDTOList8);
        RoleDTO roleDTO9 = new RoleDTO("Data Scientist", "R&D", "Handles responsibilities of a data scientist", true, criteriaDTOList9);
        RoleDTO roleDTO10 = new RoleDTO("Cybersecurity Analyst", "Security", "Handles responsibilities of a cybersecurity analyst", false, criteriaDTOList10);
        RoleDTO roleDTO11 = new RoleDTO("DevOps Engineer", "Engineering", "Handles responsibilities of a devops engineer", true, criteriaDTOList11);
        RoleDTO roleDTO12 = new RoleDTO("Content Strategist", "Marketing", "Handles responsibilities of a content strategist", false, criteriaDTOList12);
        RoleDTO roleDTO13 = new RoleDTO("Recruiter", "HR", "Handles responsibilities of a recruiter", true, criteriaDTOList13);
        RoleDTO roleDTO14 = new RoleDTO("Financial Analyst", "Finance", "Handles responsibilities of a financial analyst", false, criteriaDTOList14);
        RoleDTO roleDTO15 = new RoleDTO("Graphic Designer", "Design", "Handles responsibilities of a graphic designer", true, criteriaDTOList15);
        RoleDTO roleDTO16 = new RoleDTO("Logistics Coordinator", "Operations", "Handles responsibilities of a logistics coordinator", false, criteriaDTOList16);
        RoleDTO roleDTO17 = new RoleDTO("Test Engineer", "QA", "Handles responsibilities of a test engineer", true, criteriaDTOList17);
        RoleDTO roleDTO18 = new RoleDTO("Customer Service", "Support", "Handles responsibilities of a customer service representative", false, criteriaDTOList18);
        RoleDTO roleDTO19 = new RoleDTO("ML Engineer", "R&D", "Handles responsibilities of a ml engineer", true, criteriaDTOList19);
        RoleDTO roleDTO20 = new RoleDTO("Network Security Officer", "Security", "Handles responsibilities of a network security officer", false, criteriaDTOList20);
        RoleDTO roleDTO21 = new RoleDTO("Frontend Developer", "Engineering", "Handles responsibilities of a frontend developer", true, criteriaDTOList21);
        RoleDTO roleDTO22 = new RoleDTO("SEO Specialist", "Marketing", "Handles responsibilities of a seo specialist", false, criteriaDTOList22);
        RoleDTO roleDTO23 = new RoleDTO("HR Manager", "HR", "Handles responsibilities of a hr manager", true, criteriaDTOList23);
        RoleDTO roleDTO24 = new RoleDTO("Auditor", "Finance", "Handles responsibilities of a auditor", false, criteriaDTOList24);
        RoleDTO roleDTO25 = new RoleDTO("Visual Designer", "Design", "Handles responsibilities of a visual designer", true, criteriaDTOList25);
        RoleDTO roleDTO26 = new RoleDTO("Inventory Manager", "Operations", "Handles responsibilities of a inventory manager", false, criteriaDTOList26);
        RoleDTO roleDTO27 = new RoleDTO("QA Lead", "QA", "Handles responsibilities of a qa lead", true, criteriaDTOList27);
        RoleDTO roleDTO28 = new RoleDTO("Helpdesk Technician", "Support", "Handles responsibilities of a helpdesk technician", false, criteriaDTOList28);
        RoleDTO roleDTO29 = new RoleDTO("AI Researcher", "R&D", "Handles responsibilities of a ai researcher", true, criteriaDTOList29);
        RoleDTO roleDTO30 = new RoleDTO("Ethical Hacker", "Security", "Handles responsibilities of a ethical hacker", false, criteriaDTOList30);
        RoleDTO roleDTO31 = new RoleDTO("Backend Developer", "Engineering", "Handles responsibilities of a backend developer", true, criteriaDTOList31);
        RoleDTO roleDTO32 = new RoleDTO("Email Marketer", "Marketing", "Handles responsibilities of a email marketer", false, criteriaDTOList32);
        RoleDTO roleDTO33 = new RoleDTO("Training Specialist", "HR", "Handles responsibilities of a training specialist", true, criteriaDTOList33);
        RoleDTO roleDTO34 = new RoleDTO("Payroll Officer", "Finance", "Handles responsibilities of a payroll officer", false, criteriaDTOList34);
        RoleDTO roleDTO35 = new RoleDTO("Design Researcher", "Design", "Handles responsibilities of a design researcher", true, criteriaDTOList35);
        RoleDTO roleDTO36 = new RoleDTO("Facilities Manager", "Operations", "Handles responsibilities of a facilities manager", false, criteriaDTOList36);
        RoleDTO roleDTO37 = new RoleDTO("Automation Tester", "QA", "Handles responsibilities of a automation tester", true, criteriaDTOList37);
        RoleDTO roleDTO38 = new RoleDTO("Client Success Executive", "Support", "Handles responsibilities of a client success executive", false, criteriaDTOList38);
        RoleDTO roleDTO39 = new RoleDTO("Big Data Engineer", "R&D", "Handles responsibilities of a big data engineer", true, criteriaDTOList39);
        RoleDTO roleDTO40 = new RoleDTO("IT Compliance Officer", "Security", "Handles responsibilities of a it compliance officer", false, criteriaDTOList40);
        RoleDTO roleDTO41 = new RoleDTO("Full Stack Developer", "Engineering", "Handles responsibilities of a full stack developer", true, criteriaDTOList41);
        RoleDTO roleDTO42 = new RoleDTO("Digital Marketer", "Marketing", "Handles responsibilities of a digital marketer", false, criteriaDTOList42);
        RoleDTO roleDTO43 = new RoleDTO("Talent Acquisition", "HR", "Handles responsibilities of a talent acquisition specialist", true, criteriaDTOList43);
        RoleDTO roleDTO44 = new RoleDTO("Budget Analyst", "Finance", "Handles responsibilities of a budget analyst", false, criteriaDTOList44);
        RoleDTO roleDTO45 = new RoleDTO("Creative Director", "Design", "Handles responsibilities of a creative director", true, criteriaDTOList45);
        RoleDTO roleDTO46 = new RoleDTO("Warehouse Manager", "Operations", "Handles responsibilities of a warehouse manager", false, criteriaDTOList46);
        RoleDTO roleDTO47 = new RoleDTO("Test Architect", "QA", "Handles responsibilities of a test architect", true, criteriaDTOList47);
        RoleDTO roleDTO48 = new RoleDTO("CRM Executive", "Support", "Handles responsibilities of a crm executive", false, criteriaDTOList48);
        RoleDTO roleDTO49 = new RoleDTO("BI Developer", "R&D", "Handles responsibilities of a bi developer", true, criteriaDTOList49);
        RoleDTO roleDTO50 = new RoleDTO("InfoSec Specialist", "Security", "Handles responsibilities of a infosec specialist", false, criteriaDTOList50);
        RoleDTO roleDTO51 = new RoleDTO("Mobile App Developer", "Engineering", "Handles responsibilities of a mobile app developer", true, criteriaDTOList51);
        RoleDTO roleDTO52 = new RoleDTO("Brand Manager", "Marketing", "Handles responsibilities of a brand manager", false, criteriaDTOList52);
        RoleDTO roleDTO53 = new RoleDTO("HR Business Partner", "HR", "Handles responsibilities of a hr business partner", true, criteriaDTOList53);
        RoleDTO roleDTO54 = new RoleDTO("Cost Accountant", "Finance", "Handles responsibilities of a cost accountant", false, criteriaDTOList54);
        RoleDTO roleDTO55 = new RoleDTO("3D Modeler", "Design", "Handles responsibilities of a 3d modeler", true, criteriaDTOList55);
        RoleDTO roleDTO56 = new RoleDTO("Field Ops Manager", "Operations", "Handles responsibilities of a field ops manager", false, criteriaDTOList56);
        RoleDTO roleDTO57 = new RoleDTO("Regression Tester", "QA", "Handles responsibilities of a regression tester", true, criteriaDTOList57);
        RoleDTO roleDTO58 = new RoleDTO("Tech Support Lead", "Support", "Handles responsibilities of a tech support lead", false, criteriaDTOList58);
        RoleDTO roleDTO59 = new RoleDTO("Data Engineer", "R&D", "Handles responsibilities of a data engineer", true, criteriaDTOList59);
        RoleDTO roleDTO60 = new RoleDTO("Risk Assessor", "Security", "Handles responsibilities of a risk assessor", false, criteriaDTOList60);
        RoleDTO roleDTO61 = new RoleDTO("Game Developer", "Engineering", "Handles responsibilities of a game developer", true, criteriaDTOList61);
        RoleDTO roleDTO62 = new RoleDTO("PR Specialist", "Marketing", "Handles responsibilities of a pr specialist", false, criteriaDTOList62);
        RoleDTO roleDTO63 = new RoleDTO("Learning & Dev Exec", "HR", "Handles responsibilities of a learning & development executive", true, criteriaDTOList63);
        RoleDTO roleDTO64 = new RoleDTO("Finance Controller", "Finance", "Handles responsibilities of a finance controller", false, criteriaDTOList64);
        RoleDTO roleDTO65 = new RoleDTO("Motion Graphic Designer", "Design", "Handles responsibilities of a motion graphic designer", true, criteriaDTOList65);
        RoleDTO roleDTO66 = new RoleDTO("Supply Chain Exec", "Operations", "Handles responsibilities of a supply chain executive", false, criteriaDTOList66);
        RoleDTO roleDTO67 = new RoleDTO("NLP Engineer", "R&D", "Handles responsibilities of a nlp engineer", true, criteriaDTOList67);


        DesignationDTO designationDTO1 = new DesignationDTO("Principal", 1, "CSE", "A", roleDTO1);
        DesignationDTO designationDTO2 = new DesignationDTO("Associate Professor", 2, "ECE", "B", roleDTO2);
        DesignationDTO designationDTO3 = new DesignationDTO("Assistant Professor", 3, "EEE", "C", roleDTO3);
        DesignationDTO designationDTO4 = new DesignationDTO("Lecturer", 4, "ME", "D", roleDTO4);
        DesignationDTO designationDTO5 = new DesignationDTO("Head of Department", 5, "CE", "E", roleDTO5);
        DesignationDTO designationDTO6 = new DesignationDTO("Dean", 1, "IT", "A", roleDTO6);
        DesignationDTO designationDTO7 = new DesignationDTO("Academic Coordinator", 2, "AIML", "B", roleDTO7);
        DesignationDTO designationDTO8 = new DesignationDTO("Course Instructor", 3, "CyberSec", "C", roleDTO8);
        DesignationDTO designationDTO9 = new DesignationDTO("Program Chair", 4, "DS", "D", roleDTO9);
        DesignationDTO designationDTO10 = new DesignationDTO("Visiting Professor", 5, "BioTech", "E", roleDTO10);
        DesignationDTO designationDTO11 = new DesignationDTO("Principal", 1, "CSE", "A", roleDTO11);
        DesignationDTO designationDTO12 = new DesignationDTO("Associate Professor", 2, "ECE", "B", roleDTO12);
        DesignationDTO designationDTO13 = new DesignationDTO("Assistant Professor", 3, "EEE", "C", roleDTO13);
        DesignationDTO designationDTO14 = new DesignationDTO("Lecturer", 4, "ME", "D", roleDTO14);
        DesignationDTO designationDTO15 = new DesignationDTO("Head of Department", 5, "CE", "E", roleDTO15);
        DesignationDTO designationDTO16 = new DesignationDTO("Dean", 1, "IT", "A", roleDTO16);
        DesignationDTO designationDTO17 = new DesignationDTO("Academic Coordinator", 2, "AIML", "B", roleDTO17);
        DesignationDTO designationDTO18 = new DesignationDTO("Course Instructor", 3, "CyberSec", "C", roleDTO18);
        DesignationDTO designationDTO19 = new DesignationDTO("Program Chair", 4, "DS", "D", roleDTO19);
        DesignationDTO designationDTO20 = new DesignationDTO("Visiting Professor", 5, "BioTech", "E", roleDTO20);
        DesignationDTO designationDTO21 = new DesignationDTO("Principal", 1, "CSE", "A", roleDTO21);
        DesignationDTO designationDTO22 = new DesignationDTO("Associate Professor", 2, "ECE", "B", roleDTO22);
        DesignationDTO designationDTO23 = new DesignationDTO("Assistant Professor", 3, "EEE", "C", roleDTO23);
        DesignationDTO designationDTO24 = new DesignationDTO("Lecturer", 4, "ME", "D", roleDTO24);
        DesignationDTO designationDTO25 = new DesignationDTO("Head of Department", 5, "CE", "E", roleDTO25);
        DesignationDTO designationDTO26 = new DesignationDTO("Dean", 1, "IT", "A", roleDTO26);
        DesignationDTO designationDTO27 = new DesignationDTO("Academic Coordinator", 2, "AIML", "B", roleDTO27);
        DesignationDTO designationDTO28 = new DesignationDTO("Course Instructor", 3, "CyberSec", "C", roleDTO28);
        DesignationDTO designationDTO29 = new DesignationDTO("Program Chair", 4, "DS", "D", roleDTO29);
        DesignationDTO designationDTO30 = new DesignationDTO("Visiting Professor", 5, "BioTech", "E", roleDTO30);
        DesignationDTO designationDTO31 = new DesignationDTO("Principal", 1, "CSE", "A", roleDTO31);
        DesignationDTO designationDTO32 = new DesignationDTO("Associate Professor", 2, "ECE", "B", roleDTO32);
        DesignationDTO designationDTO33 = new DesignationDTO("Assistant Professor", 3, "EEE", "C", roleDTO33);
        DesignationDTO designationDTO34 = new DesignationDTO("Lecturer", 4, "ME", "D", roleDTO34);
        DesignationDTO designationDTO35 = new DesignationDTO("Head of Department", 5, "CE", "E", roleDTO35);
        DesignationDTO designationDTO36 = new DesignationDTO("Dean", 1, "IT", "A", roleDTO36);
        DesignationDTO designationDTO37 = new DesignationDTO("Academic Coordinator", 2, "AIML", "B", roleDTO37);
        DesignationDTO designationDTO38 = new DesignationDTO("Course Instructor", 3, "CyberSec", "C", roleDTO38);
        DesignationDTO designationDTO39 = new DesignationDTO("Program Chair", 4, "DS", "D", roleDTO39);
        DesignationDTO designationDTO40 = new DesignationDTO("Visiting Professor", 5, "BioTech", "E", roleDTO40);
        DesignationDTO designationDTO41 = new DesignationDTO("Principal", 1, "CSE", "A", roleDTO41);
        DesignationDTO designationDTO42 = new DesignationDTO("Associate Professor", 2, "ECE", "B", roleDTO42);
        DesignationDTO designationDTO43 = new DesignationDTO("Assistant Professor", 3, "EEE", "C", roleDTO43);
        DesignationDTO designationDTO44 = new DesignationDTO("Lecturer", 4, "ME", "D", roleDTO44);
        DesignationDTO designationDTO45 = new DesignationDTO("Head of Department", 5, "CE", "E", roleDTO45);
        DesignationDTO designationDTO46 = new DesignationDTO("Dean", 1, "IT", "A", roleDTO46);
        DesignationDTO designationDTO47 = new DesignationDTO("Academic Coordinator", 2, "AIML", "B", roleDTO47);
        DesignationDTO designationDTO48 = new DesignationDTO("Course Instructor", 3, "CyberSec", "C", roleDTO48);
        DesignationDTO designationDTO49 = new DesignationDTO("Program Chair", 4, "DS", "D", roleDTO49);
        DesignationDTO designationDTO50 = new DesignationDTO("Visiting Professor", 5, "BioTech", "E", roleDTO50);
        DesignationDTO designationDTO51 = new DesignationDTO("Principal", 1, "CSE", "A", roleDTO51);
        DesignationDTO designationDTO52 = new DesignationDTO("Associate Professor", 2, "ECE", "B", roleDTO52);
        DesignationDTO designationDTO53 = new DesignationDTO("Assistant Professor", 3, "EEE", "C", roleDTO53);
        DesignationDTO designationDTO54 = new DesignationDTO("Lecturer", 4, "ME", "D", roleDTO54);
        DesignationDTO designationDTO55 = new DesignationDTO("Head of Department", 5, "CE", "E", roleDTO55);
        DesignationDTO designationDTO56 = new DesignationDTO("Dean", 1, "IT", "A", roleDTO56);
        DesignationDTO designationDTO57 = new DesignationDTO("Academic Coordinator", 2, "AIML", "B", roleDTO57);
        DesignationDTO designationDTO58 = new DesignationDTO("Course Instructor", 3, "CyberSec", "C", roleDTO58);
        DesignationDTO designationDTO59 = new DesignationDTO("Program Chair", 4, "DS", "D", roleDTO59);
        DesignationDTO designationDTO60 = new DesignationDTO("Visiting Professor", 5, "BioTech", "E", roleDTO60);
        DesignationDTO designationDTO61 = new DesignationDTO("Principal", 1, "CSE", "A", roleDTO61);
        DesignationDTO designationDTO62 = new DesignationDTO("Associate Professor", 2, "ECE", "B", roleDTO62);
        DesignationDTO designationDTO63 = new DesignationDTO("Assistant Professor", 3, "EEE", "C", roleDTO63);
        DesignationDTO designationDTO64 = new DesignationDTO("Lecturer", 4, "ME", "D", roleDTO64);
        DesignationDTO designationDTO65 = new DesignationDTO("Head of Department", 5, "CE", "E", roleDTO65);
        DesignationDTO designationDTO66 = new DesignationDTO("Dean", 1, "IT", "A", roleDTO66);
        DesignationDTO designationDTO67 = new DesignationDTO("Academic Coordinator", 2, "AIML", "B", roleDTO67);


        PresidentDTO presidentDTO1 = new PresidentDTO("Murmu", 60, 5, "India", designationDTO1);
        PresidentDTO presidentDTO2 = new PresidentDTO("Biden", 81, 4, "USA", designationDTO2);
        PresidentDTO presidentDTO3 = new PresidentDTO("Macron", 46, 5, "France", designationDTO3);
        PresidentDTO presidentDTO4 = new PresidentDTO("Scholz", 65, 4, "Germany", designationDTO4);
        PresidentDTO presidentDTO5 = new PresidentDTO("Sunak", 43, 3, "UK", designationDTO5);
        PresidentDTO presidentDTO6 = new PresidentDTO("Trudeau", 52, 4, "Canada", designationDTO6);
        PresidentDTO presidentDTO7 = new PresidentDTO("Al-Sisi", 69, 6, "Egypt", designationDTO7);
        PresidentDTO presidentDTO8 = new PresidentDTO("Obrador", 70, 6, "Mexico", designationDTO8);
        PresidentDTO presidentDTO9 = new PresidentDTO("Zelenskyy", 46, 5, "Ukraine", designationDTO9);
        PresidentDTO presidentDTO10 = new PresidentDTO("Putin", 71, 6, "Russia", designationDTO10);
        PresidentDTO presidentDTO11 = new PresidentDTO("Xi Jinping", 70, 5, "China", designationDTO11);
        PresidentDTO presidentDTO12 = new PresidentDTO("Yoon", 62, 5, "South Korea", designationDTO12);
        PresidentDTO presidentDTO13 = new PresidentDTO("Alvi", 74, 5, "Pakistan", designationDTO13);
        PresidentDTO presidentDTO14 = new PresidentDTO("Ibrahim", 64, 5, "Maldives", designationDTO14);
        PresidentDTO presidentDTO15 = new PresidentDTO("Hasina", 76, 5, "Bangladesh", designationDTO15);
        PresidentDTO presidentDTO16 = new PresidentDTO("Wickremesinghe", 75, 5, "Sri Lanka", designationDTO16);
        PresidentDTO presidentDTO17 = new PresidentDTO("Jokowi", 63, 5, "Indonesia", designationDTO17);
        PresidentDTO presidentDTO18 = new PresidentDTO("Marcos", 66, 6, "Philippines", designationDTO18);
        PresidentDTO presidentDTO19 = new PresidentDTO("Widodo", 62, 5, "Indonesia", designationDTO19);
        PresidentDTO presidentDTO20 = new PresidentDTO("Tokayev", 70, 5, "Kazakhstan", designationDTO20);
        PresidentDTO presidentDTO21 = new PresidentDTO("Nguyễn Phú Trọng", 79, 5, "Vietnam", designationDTO21);
        PresidentDTO presidentDTO22 = new PresidentDTO("Kishida", 66, 4, "Japan", designationDTO22);
        PresidentDTO presidentDTO23 = new PresidentDTO("Herzog", 63, 5, "Israel", designationDTO23);
        PresidentDTO presidentDTO24 = new PresidentDTO("Lula", 78, 4, "Brazil", designationDTO24);
        PresidentDTO presidentDTO25 = new PresidentDTO("Fernández", 65, 4, "Argentina", designationDTO25);
        PresidentDTO presidentDTO26 = new PresidentDTO("Boric", 38, 4, "Chile", designationDTO26);
        PresidentDTO presidentDTO27 = new PresidentDTO("Petro", 63, 4, "Colombia", designationDTO27);
        PresidentDTO presidentDTO28 = new PresidentDTO("Arévalo", 65, 4, "Guatemala", designationDTO28);
        PresidentDTO presidentDTO29 = new PresidentDTO("Bukele", 42, 5, "El Salvador", designationDTO29);
        PresidentDTO presidentDTO30 = new PresidentDTO("Chakwera", 68, 5, "Malawi", designationDTO30);
        PresidentDTO presidentDTO31 = new PresidentDTO("Ramaphosa", 71, 5, "South Africa", designationDTO31);
        PresidentDTO presidentDTO32 = new PresidentDTO("Bongo", 64, 7, "Gabon", designationDTO32);
        PresidentDTO presidentDTO33 = new PresidentDTO("Tinubu", 72, 4, "Nigeria", designationDTO33);
        PresidentDTO presidentDTO34 = new PresidentDTO("Kagame", 66, 5, "Rwanda", designationDTO34);
        PresidentDTO presidentDTO35 = new PresidentDTO("Museveni", 79, 5, "Uganda", designationDTO35);
        PresidentDTO presidentDTO36 = new PresidentDTO("Ruto", 56, 5, "Kenya", designationDTO36);
        PresidentDTO presidentDTO37 = new PresidentDTO("Samia", 64, 5, "Tanzania", designationDTO37);
        PresidentDTO presidentDTO38 = new PresidentDTO("Mnangagwa", 81, 5, "Zimbabwe", designationDTO38);
        PresidentDTO presidentDTO39 = new PresidentDTO("Weah", 57, 6, "Liberia", designationDTO39);
        PresidentDTO presidentDTO40 = new PresidentDTO("Sissoco", 63, 5, "Guinea-Bissau", designationDTO40);
        PresidentDTO presidentDTO41 = new PresidentDTO("Biden 2", 81, 4, "USA", designationDTO41);
        PresidentDTO presidentDTO42 = new PresidentDTO("Biden 3", 81, 4, "USA", designationDTO42);
        PresidentDTO presidentDTO43 = new PresidentDTO("Biden 4", 81, 4, "USA", designationDTO43);
        PresidentDTO presidentDTO44 = new PresidentDTO("Biden 5", 81, 4, "USA", designationDTO44);
        PresidentDTO presidentDTO45 = new PresidentDTO("Biden 6", 81, 4, "USA", designationDTO45);
        PresidentDTO presidentDTO46 = new PresidentDTO("Biden 7", 81, 4, "USA", designationDTO46);
        PresidentDTO presidentDTO47 = new PresidentDTO("Biden 8", 81, 4, "USA", designationDTO47);
        PresidentDTO presidentDTO48 = new PresidentDTO("Biden 9", 81, 4, "USA", designationDTO48);
        PresidentDTO presidentDTO49 = new PresidentDTO("Biden 10", 81, 4, "USA", designationDTO49);
        PresidentDTO presidentDTO50 = new PresidentDTO("Biden 11", 81, 4, "USA", designationDTO50);
        PresidentDTO presidentDTO51 = new PresidentDTO("Biden 12", 81, 4, "USA", designationDTO51);
        PresidentDTO presidentDTO52 = new PresidentDTO("Biden 13", 81, 4, "USA", designationDTO52);
        PresidentDTO presidentDTO53 = new PresidentDTO("Biden 14", 81, 4, "USA", designationDTO53);
        PresidentDTO presidentDTO54 = new PresidentDTO("Biden 15", 81, 4, "USA", designationDTO54);
        PresidentDTO presidentDTO55 = new PresidentDTO("Biden 16", 81, 4, "USA", designationDTO55);
        PresidentDTO presidentDTO56 = new PresidentDTO("Biden 17", 81, 4, "USA", designationDTO56);
        PresidentDTO presidentDTO57 = new PresidentDTO("Biden 18", 81, 4, "USA", designationDTO57);
        PresidentDTO presidentDTO58 = new PresidentDTO("Biden 19", 81, 4, "USA", designationDTO58);
        PresidentDTO presidentDTO59 = new PresidentDTO("Biden 20", 81, 4, "USA", designationDTO59);
        PresidentDTO presidentDTO60 = new PresidentDTO("Biden 21", 81, 4, "USA", designationDTO60);
        PresidentDTO presidentDTO61 = new PresidentDTO("Biden 22", 81, 4, "USA", designationDTO61);
        PresidentDTO presidentDTO62 = new PresidentDTO("Biden 23", 81, 4, "USA", designationDTO62);
        PresidentDTO presidentDTO63 = new PresidentDTO("Biden 24", 81, 4, "USA", designationDTO63);
        PresidentDTO presidentDTO64 = new PresidentDTO("Biden 25", 81, 4, "USA", designationDTO64);
        PresidentDTO presidentDTO65 = new PresidentDTO("Biden 26", 81, 4, "USA", designationDTO65);
        PresidentDTO presidentDTO66 = new PresidentDTO("Biden 27", 81, 4, "USA", designationDTO66);
        PresidentDTO presidentDTO67 = new PresidentDTO("Biden 28", 81, 4, "USA", designationDTO67);


        UniversityDTO universityDTO1 = new UniversityDTO("Oxford", "London", 1950, "BABCP", presidentDTO1);
        UniversityDTO universityDTO2 = new UniversityDTO("Harvard", "Cambridge", 1636, "NEASC", presidentDTO2);
        UniversityDTO universityDTO3 = new UniversityDTO("Stanford", "California", 1885, "WASC", presidentDTO3);
        UniversityDTO universityDTO4 = new UniversityDTO("MIT", "Massachusetts", 1861, "ABET", presidentDTO4);
        UniversityDTO universityDTO5 = new UniversityDTO("Cambridge", "Cambridge", 1209, "QAA", presidentDTO5);
        UniversityDTO universityDTO6 = new UniversityDTO("Yale", "Connecticut", 1701, "NEASC", presidentDTO6);
        UniversityDTO universityDTO7 = new UniversityDTO("Princeton", "New Jersey", 1746, "MSCHE", presidentDTO7);
        UniversityDTO universityDTO8 = new UniversityDTO("Columbia", "New York", 1754, "MSCHE", presidentDTO8);
        UniversityDTO universityDTO9 = new UniversityDTO("Chicago", "Illinois", 1890, "HLC", presidentDTO9);
        UniversityDTO universityDTO10 = new UniversityDTO("Cornell", "New York", 1865, "MSCHE", presidentDTO10);
        UniversityDTO universityDTO11 = new UniversityDTO("UPenn", "Philadelphia", 1740, "MSCHE", presidentDTO11);
        UniversityDTO universityDTO12 = new UniversityDTO("Caltech", "California", 1891, "WASC", presidentDTO12);
        UniversityDTO universityDTO13 = new UniversityDTO("UCLA", "California", 1919, "WASC", presidentDTO13);
        UniversityDTO universityDTO14 = new UniversityDTO("UCBerkeley", "California", 1868, "WASC", presidentDTO14);
        UniversityDTO universityDTO15 = new UniversityDTO("ETH Zurich", "Zurich", 1855, "Swiss Accreditation", presidentDTO15);
        UniversityDTO universityDTO16 = new UniversityDTO("Imperial", "London", 1907, "QAA", presidentDTO16);
        UniversityDTO universityDTO17 = new UniversityDTO("University of Tokyo", "Tokyo", 1877, "NIAD-QE", presidentDTO17);
        UniversityDTO universityDTO18 = new UniversityDTO("Tsinghua", "Beijing", 1911, "MOE China", presidentDTO18);
        UniversityDTO universityDTO19 = new UniversityDTO("Peking", "Beijing", 1898, "MOE China", presidentDTO19);
        UniversityDTO universityDTO20 = new UniversityDTO("National University of Singapore", "Singapore", 1905, "AACSB", presidentDTO20);
        UniversityDTO universityDTO21 = new UniversityDTO("Seoul National University", "Seoul", 1946, "KABONE", presidentDTO21);
        UniversityDTO universityDTO22 = new UniversityDTO("Melbourne", "Melbourne", 1853, "TEQSA", presidentDTO22);
        UniversityDTO universityDTO23 = new UniversityDTO("Toronto", "Toronto", 1827, "AUCC", presidentDTO23);
        UniversityDTO universityDTO24 = new UniversityDTO("McGill", "Montreal", 1821, "AUCC", presidentDTO24);
        UniversityDTO universityDTO25 = new UniversityDTO("Heidelberg", "Heidelberg", 1386, "German Council", presidentDTO25);
        UniversityDTO universityDTO26 = new UniversityDTO("Copenhagen", "Copenhagen", 1479, "Danish Accreditation", presidentDTO26);
        UniversityDTO universityDTO27 = new UniversityDTO("Edinburgh", "Edinburgh", 1582, "QAA", presidentDTO27);
        UniversityDTO universityDTO28 = new UniversityDTO("Manchester", "Manchester", 1824, "QAA", presidentDTO28);
        UniversityDTO universityDTO29 = new UniversityDTO("Karolinska Institute", "Stockholm", 1810, "Swedish Council", presidentDTO29);
        UniversityDTO universityDTO30 = new UniversityDTO("University of Oslo", "Oslo", 1811, "NOKUT", presidentDTO30);
        UniversityDTO universityDTO31 = new UniversityDTO("Cape Town", "Cape Town", 1829, "CHE", presidentDTO31);
        UniversityDTO universityDTO32 = new UniversityDTO("Witwatersrand", "Johannesburg", 1896, "CHE", presidentDTO32);
        UniversityDTO universityDTO33 = new UniversityDTO("Makerere", "Kampala", 1922, "NCHE Uganda", presidentDTO33);
        UniversityDTO universityDTO34 = new UniversityDTO("Addis Ababa", "Addis Ababa", 1950, "HERQA", presidentDTO34);
        UniversityDTO universityDTO35 = new UniversityDTO("Nairobi", "Nairobi", 1970, "CUE", presidentDTO35);
        UniversityDTO universityDTO36 = new UniversityDTO("Zhejiang", "Hangzhou", 1897, "MOE China", presidentDTO36);
        UniversityDTO universityDTO37 = new UniversityDTO("Indian Institute of Science", "Bangalore", 1909, "NAAC", presidentDTO37);
        UniversityDTO universityDTO38 = new UniversityDTO("IIT Bombay", "Mumbai", 1958, "NBA", presidentDTO38);
        UniversityDTO universityDTO39 = new UniversityDTO("IIT Delhi", "New Delhi", 1961, "NBA", presidentDTO39);
        UniversityDTO universityDTO40 = new UniversityDTO("IIT Madras", "Chennai", 1959, "NBA", presidentDTO40);
        UniversityDTO universityDTO41 = new UniversityDTO("IIT Kanpur", "Kanpur", 1959, "NBA", presidentDTO41);
        UniversityDTO universityDTO42 = new UniversityDTO("IIT Kharagpur", "Kharagpur", 1951, "NBA", presidentDTO42);
        UniversityDTO universityDTO43 = new UniversityDTO("IIT Roorkee", "Roorkee", 1847, "NBA", presidentDTO43);
        UniversityDTO universityDTO44 = new UniversityDTO("Anna University", "Chennai", 1978, "NAAC", presidentDTO44);
        UniversityDTO universityDTO45 = new UniversityDTO("BITS Pilani", "Pilani", 1964, "NAAC", presidentDTO45);
        UniversityDTO universityDTO46 = new UniversityDTO("Jadavpur University", "Kolkata", 1955, "NAAC", presidentDTO46);
        UniversityDTO universityDTO47 = new UniversityDTO("University of Hyderabad", "Hyderabad", 1974, "NAAC", presidentDTO47);
        UniversityDTO universityDTO48 = new UniversityDTO("AMU", "Aligarh", 1875, "NAAC", presidentDTO48);
        UniversityDTO universityDTO49 = new UniversityDTO("Banaras Hindu University", "Varanasi", 1916, "NAAC", presidentDTO49);
        UniversityDTO universityDTO50 = new UniversityDTO("Pune University", "Pune", 1949, "NAAC", presidentDTO50);
        UniversityDTO universityDTO51 = new UniversityDTO("Savitribai Phule Pune University", "Pune", 1949, "NAAC", presidentDTO51);
        UniversityDTO universityDTO52 = new UniversityDTO("Osmania University", "Hyderabad", 1918, "NAAC", presidentDTO52);
        UniversityDTO universityDTO53 = new UniversityDTO("Delhi University", "New Delhi", 1922, "NAAC", presidentDTO53);
        UniversityDTO universityDTO54 = new UniversityDTO("Mumbai University", "Mumbai", 1857, "NAAC", presidentDTO54);
        UniversityDTO universityDTO55 = new UniversityDTO("GNDU", "Amritsar", 1969, "NAAC", presidentDTO55);
        UniversityDTO universityDTO56 = new UniversityDTO("Punjabi University", "Patiala", 1962, "NAAC", presidentDTO56);
        UniversityDTO universityDTO57 = new UniversityDTO("Kurukshetra University", "Kurukshetra", 1956, "NAAC", presidentDTO57);
        UniversityDTO universityDTO58 = new UniversityDTO("University of Rajasthan", "Jaipur", 1947, "NAAC", presidentDTO58);
        UniversityDTO universityDTO59 = new UniversityDTO("IIT BHU", "Varanasi", 1919, "NBA", presidentDTO59);
        UniversityDTO universityDTO60 = new UniversityDTO("Shiv Nadar University", "Noida", 2011, "UGC", presidentDTO60);
        UniversityDTO universityDTO61 = new UniversityDTO("Ashoka University", "Sonipat", 2014, "UGC", presidentDTO61);
        UniversityDTO universityDTO62 = new UniversityDTO("Azim Premji University", "Bangalore", 2010, "UGC", presidentDTO62);
        UniversityDTO universityDTO63 = new UniversityDTO("OP Jindal Global University", "Sonipat", 2009, "UGC", presidentDTO63);
        UniversityDTO universityDTO64 = new UniversityDTO("SRM University", "Chennai", 1985, "NAAC", presidentDTO64);
        UniversityDTO universityDTO65 = new UniversityDTO("VIT", "Vellore", 1984, "NAAC", presidentDTO65);
        UniversityDTO universityDTO66 = new UniversityDTO("Amity University", "Noida", 2005, "UGC", presidentDTO66);
        UniversityDTO universityDTO67 = new UniversityDTO("Christ University", "Bangalore", 1969, "NAAC", presidentDTO67);


        EducationDTO educationDTO1 = new EducationDTO("B.E", "ISE", 2025, "PES", universityDTO1);
        EducationDTO educationDTO2 = new EducationDTO("B.Com", "Commerce", 2019, "JNNCE", universityDTO2);
        EducationDTO educationDTO3 = new EducationDTO("B.Tech", "CSE", 2024, "RVCE", universityDTO3);
        EducationDTO educationDTO4 = new EducationDTO("B.Sc", "Physics", 2022, "Christ", universityDTO4);
        EducationDTO educationDTO5 = new EducationDTO("M.Tech", "ECE", 2023, "MSRIT", universityDTO5);
        EducationDTO educationDTO6 = new EducationDTO("M.Com", "Finance", 2020, "Jain", universityDTO6);
        EducationDTO educationDTO7 = new EducationDTO("BBA", "Management", 2021, "Alliance", universityDTO7);
        EducationDTO educationDTO8 = new EducationDTO("BCA", "Computer Applications", 2022, "REVA", universityDTO8);
        EducationDTO educationDTO9 = new EducationDTO("MBA", "Marketing", 2023, "PESU", universityDTO9);
        EducationDTO educationDTO10 = new EducationDTO("B.Arch", "Architecture", 2024, "BIT", universityDTO10);
        EducationDTO educationDTO11 = new EducationDTO("BA", "English", 2020, "Mount Carmel", universityDTO11);
        EducationDTO educationDTO12 = new EducationDTO("M.Sc", "Mathematics", 2021, "St. Joseph's", universityDTO12);
        EducationDTO educationDTO13 = new EducationDTO("B.Tech", "IT", 2025, "SIT", universityDTO13);
        EducationDTO educationDTO14 = new EducationDTO("B.Com", "Accounting", 2020, "CMS", universityDTO14);
        EducationDTO educationDTO15 = new EducationDTO("MCA", "Software", 2024, "Oxford", universityDTO15);
        EducationDTO educationDTO16 = new EducationDTO("B.Sc", "Biotechnology", 2022, "Garden City", universityDTO16);
        EducationDTO educationDTO17 = new EducationDTO("B.E", "Mechanical", 2023, "SJCE", universityDTO17);
        EducationDTO educationDTO18 = new EducationDTO("M.Tech", "CS", 2025, "RVIT", universityDTO18);
        EducationDTO educationDTO19 = new EducationDTO("B.Sc", "Chemistry", 2021, "KLE", universityDTO19);
        EducationDTO educationDTO20 = new EducationDTO("B.A", "Psychology", 2023, "NMKRV", universityDTO20);
        EducationDTO educationDTO21 = new EducationDTO("M.Com", "Taxation", 2022, "BNM", universityDTO21);
        EducationDTO educationDTO22 = new EducationDTO("B.Ed", "Education", 2020, "MES", universityDTO22);
        EducationDTO educationDTO23 = new EducationDTO("M.A", "Economics", 2021, "Acharya", universityDTO23);
        EducationDTO educationDTO24 = new EducationDTO("B.Sc", "Zoology", 2022, "Oxford", universityDTO24);
        EducationDTO educationDTO25 = new EducationDTO("B.Tech", "EEE", 2023, "MVJCE", universityDTO25);
        EducationDTO educationDTO26 = new EducationDTO("M.Sc", "Botany", 2025, "Kristu Jayanti", universityDTO26);
        EducationDTO educationDTO27 = new EducationDTO("B.Com", "Banking", 2019, "Seshadripuram", universityDTO27);
        EducationDTO educationDTO28 = new EducationDTO("BBA", "Finance", 2024, "GIBS", universityDTO28);
        EducationDTO educationDTO29 = new EducationDTO("MBA", "HR", 2023, "ISBR", universityDTO29);
        EducationDTO educationDTO30 = new EducationDTO("M.Sc", "Microbiology", 2021, "Reva", universityDTO30);
        EducationDTO educationDTO31 = new EducationDTO("B.A", "History", 2020, "NMKRV", universityDTO31);
        EducationDTO educationDTO32 = new EducationDTO("M.Tech", "VLSI", 2024, "BIT", universityDTO32);
        EducationDTO educationDTO33 = new EducationDTO("B.Sc", "Geology", 2022, "MS Ramaiah", universityDTO33);
        EducationDTO educationDTO34 = new EducationDTO("BCA", "Cloud Computing", 2025, "Jain", universityDTO34);
        EducationDTO educationDTO35 = new EducationDTO("M.A", "English", 2020, "Christ", universityDTO35);
        EducationDTO educationDTO36 = new EducationDTO("B.Tech", "Robotics", 2023, "SJBIT", universityDTO36);
        EducationDTO educationDTO37 = new EducationDTO("B.Com", "Statistics", 2022, "Vidyavardhaka", universityDTO37);
        EducationDTO educationDTO38 = new EducationDTO("BBA", "International Business", 2024, "Presidency", universityDTO38);
        EducationDTO educationDTO39 = new EducationDTO("MBA", "Operations", 2021, "GITAM", universityDTO39);
        EducationDTO educationDTO40 = new EducationDTO("M.Sc", "Statistics", 2020, "SIT", universityDTO40);
        EducationDTO educationDTO41 = new EducationDTO("B.Ed", "Special Education", 2025, "Al-Ameen", universityDTO41);
        EducationDTO educationDTO42 = new EducationDTO("M.Tech", "Embedded Systems", 2023, "NMIT", universityDTO42);
        EducationDTO educationDTO43 = new EducationDTO("B.Sc", "Agriculture", 2022, "RAU", universityDTO43);
        EducationDTO educationDTO44 = new EducationDTO("M.A", "Political Science", 2024, "Oxford", universityDTO44);
        EducationDTO educationDTO45 = new EducationDTO("BCA", "Cybersecurity", 2025, "HKBK", universityDTO45);
        EducationDTO educationDTO46 = new EducationDTO("B.Tech", "Aerospace", 2023, "MVIT", universityDTO46);
        EducationDTO educationDTO47 = new EducationDTO("B.Com", "Cost Accounting", 2021, "KLE", universityDTO47);
        EducationDTO educationDTO48 = new EducationDTO("MBA", "Finance", 2022, "Presidency", universityDTO48);
        EducationDTO educationDTO49 = new EducationDTO("B.A", "Sociology", 2020, "NMKRV", universityDTO49);
        EducationDTO educationDTO50 = new EducationDTO("MCA", "Networking", 2024, "GIT", universityDTO50);
        EducationDTO educationDTO51 = new EducationDTO("B.E", "Civil", 2023, "RVCE", universityDTO51);
        EducationDTO educationDTO52 = new EducationDTO("M.Tech", "AI", 2025, "IIIT-B", universityDTO52);
        EducationDTO educationDTO53 = new EducationDTO("B.Sc", "Nutrition", 2021, "Christ", universityDTO53);
        EducationDTO educationDTO54 = new EducationDTO("B.Com", "Auditing", 2022, "Jain", universityDTO54);
        EducationDTO educationDTO55 = new EducationDTO("MBA", "Business Analytics", 2023, "PES", universityDTO55);
        EducationDTO educationDTO56 = new EducationDTO("M.A", "Journalism", 2020, "Mount Carmel", universityDTO56);
        EducationDTO educationDTO57 = new EducationDTO("B.Tech", "Data Science", 2024, "CMRIT", universityDTO57);
        EducationDTO educationDTO58 = new EducationDTO("B.Sc", "Food Science", 2021, "Garden City", universityDTO58);
        EducationDTO educationDTO59 = new EducationDTO("BCA", "AI & ML", 2025, "PES", universityDTO59);
        EducationDTO educationDTO60 = new EducationDTO("M.Sc", "Physics", 2022, "Oxford", universityDTO60);
        EducationDTO educationDTO61 = new EducationDTO("B.E", "Electronics", 2023, "BMSCE", universityDTO61);
        EducationDTO educationDTO62 = new EducationDTO("B.Com", "Corporate Law", 2020, "SJC", universityDTO62);
        EducationDTO educationDTO63 = new EducationDTO("BBA", "Logistics", 2021, "Reva", universityDTO63);
        EducationDTO educationDTO64 = new EducationDTO("M.A", "Philosophy", 2024, "Christ", universityDTO64);
        EducationDTO educationDTO65 = new EducationDTO("MBA", "Entrepreneurship", 2023, "SJIM", universityDTO65);
        EducationDTO educationDTO66 = new EducationDTO("MCA", "Application Development", 2025, "RVU", universityDTO66);
        EducationDTO educationDTO67 = new EducationDTO("B.Sc", "Forensic Science", 2022, "Jain", universityDTO67);



        ExperienceDTO experienceDTO1a = new ExperienceDTO("Google", "Developer", 2, "Backend", educationDTO1);
        ExperienceDTO experienceDTO1b = new ExperienceDTO("Microsoft", "Tester", 1, "Tester", educationDTO1);
        List<ExperienceDTO> experienceDTO1 = new ArrayList<>();
        experienceDTO1.add(experienceDTO1a);
        experienceDTO1.add(experienceDTO1b);

        ExperienceDTO experienceDTO2a = new ExperienceDTO("Amazon", "Cloud Engineer", 3, "Cloud", educationDTO2);
        ExperienceDTO experienceDTO2b = new ExperienceDTO("Netflix", "Frontend Developer", 2, "Frontend", educationDTO2);
        List<ExperienceDTO> experienceDTO2 = new ArrayList<>();
        experienceDTO2.add(experienceDTO2a);
        experienceDTO2.add(experienceDTO2b);

        ExperienceDTO experienceDTO3a = new ExperienceDTO("Apple", "iOS Developer", 4, "Mobile", educationDTO3);
        ExperienceDTO experienceDTO3b = new ExperienceDTO("Facebook", "Full Stack Developer", 3, "Fullstack", educationDTO3);
        List<ExperienceDTO> experienceDTO3 = new ArrayList<>();
        experienceDTO3.add(experienceDTO3a);
        experienceDTO3.add(experienceDTO3b);

        ExperienceDTO experienceDTO4a = new ExperienceDTO("TCS", "Support Engineer", 2, "Support", educationDTO4);
        ExperienceDTO experienceDTO4b = new ExperienceDTO("Infosys", "Data Analyst", 1, "Data", educationDTO4);
        List<ExperienceDTO> experienceDTO4 = new ArrayList<>();
        experienceDTO4.add(experienceDTO4a);
        experienceDTO4.add(experienceDTO4b);

        ExperienceDTO experienceDTO5a = new ExperienceDTO("IBM", "Security Analyst", 2, "Security", educationDTO5);
        ExperienceDTO experienceDTO5b = new ExperienceDTO("Wipro", "DevOps Engineer", 3, "DevOps", educationDTO5);
        List<ExperienceDTO> experienceDTO5 = new ArrayList<>();
        experienceDTO5.add(experienceDTO5a);
        experienceDTO5.add(experienceDTO5b);

        ExperienceDTO experienceDTO6a = new ExperienceDTO("Oracle", "Database Admin", 4, "Database", educationDTO6);
        ExperienceDTO experienceDTO6b = new ExperienceDTO("Salesforce", "CRM Developer", 3, "CRM", educationDTO6);
        List<ExperienceDTO> experienceDTO6 = new ArrayList<>();
        experienceDTO6.add(experienceDTO6a);
        experienceDTO6.add(experienceDTO6b);

        ExperienceDTO experienceDTO7a = new ExperienceDTO("Adobe", "UI/UX Designer", 2, "Design", educationDTO7);
        ExperienceDTO experienceDTO7b = new ExperienceDTO("Capgemini", "Automation Tester", 1, "Testing", educationDTO7);
        List<ExperienceDTO> experienceDTO7 = new ArrayList<>();
        experienceDTO7.add(experienceDTO7a);
        experienceDTO7.add(experienceDTO7b);

        ExperienceDTO experienceDTO8a = new ExperienceDTO("Cognizant", "Backend Developer", 2, "Backend", educationDTO8);
        ExperienceDTO experienceDTO8b = new ExperienceDTO("HCL", "System Engineer", 2, "System", educationDTO8);
        List<ExperienceDTO> experienceDTO8 = new ArrayList<>();
        experienceDTO8.add(experienceDTO8a);
        experienceDTO8.add(experienceDTO8b);

        ExperienceDTO experienceDTO9a = new ExperienceDTO("Dell", "Network Engineer", 3, "Network", educationDTO9);
        ExperienceDTO experienceDTO9b = new ExperienceDTO("HP", "Hardware Specialist", 2, "Hardware", educationDTO9);
        List<ExperienceDTO> experienceDTO9 = new ArrayList<>();
        experienceDTO9.add(experienceDTO9a);
        experienceDTO9.add(experienceDTO9b);

        ExperienceDTO experienceDTO10a = new ExperienceDTO("Paytm", "Android Developer", 1, "Mobile", educationDTO10);
        ExperienceDTO experienceDTO10b = new ExperienceDTO("Zomato", "Software Engineer", 2, "Development", educationDTO10);
        List<ExperienceDTO> experienceDTO10 = new ArrayList<>();
        experienceDTO10.add(experienceDTO10a);
        experienceDTO10.add(experienceDTO10b);

        ExperienceDTO experienceDTO11a = new ExperienceDTO("Flipkart", "Product Manager", 3, "Management", educationDTO11);
        ExperienceDTO experienceDTO11b = new ExperienceDTO("Snapdeal", "Support Analyst", 1, "Customer Support", educationDTO11);
        List<ExperienceDTO> experienceDTO11 = new ArrayList<>();
        experienceDTO11.add(experienceDTO11a);
        experienceDTO11.add(experienceDTO11b);

        ExperienceDTO experienceDTO12a = new ExperienceDTO("Swiggy", "QA Engineer", 2, "Testing", educationDTO12);
        ExperienceDTO experienceDTO12b = new ExperienceDTO("Ola", "Backend Developer", 3, "Backend", educationDTO12);
        List<ExperienceDTO> experienceDTO12 = new ArrayList<>();
        experienceDTO12.add(experienceDTO12a);
        experienceDTO12.add(experienceDTO12b);

        ExperienceDTO experienceDTO13a = new ExperienceDTO("Uber", "Data Engineer", 2, "Data", educationDTO13);
        ExperienceDTO experienceDTO13b = new ExperienceDTO("CRED", "Android Engineer", 1, "Mobile", educationDTO13);
        List<ExperienceDTO> experienceDTO13 = new ArrayList<>();
        experienceDTO13.add(experienceDTO13a);
        experienceDTO13.add(experienceDTO13b);

        ExperienceDTO experienceDTO14a = new ExperienceDTO("Byju's", "Learning Consultant", 2, "Education", educationDTO14);
        ExperienceDTO experienceDTO14b = new ExperienceDTO("Unacademy", "Video Editor", 1, "Media", educationDTO14);
        List<ExperienceDTO> experienceDTO14 = new ArrayList<>();
        experienceDTO14.add(experienceDTO14a);
        experienceDTO14.add(experienceDTO14b);

        ExperienceDTO experienceDTO15a = new ExperienceDTO("Meesho", "Web Developer", 2, "Frontend", educationDTO15);
        ExperienceDTO experienceDTO15b = new ExperienceDTO("Nykaa", "Marketing Analyst", 3, "Marketing", educationDTO15);
        List<ExperienceDTO> experienceDTO15 = new ArrayList<>();
        experienceDTO15.add(experienceDTO15a);
        experienceDTO15.add(experienceDTO15b);

        ExperienceDTO experienceDTO16a = new ExperienceDTO("Freshworks", "Customer Success Engineer", 2, "Support", educationDTO16);
        ExperienceDTO experienceDTO16b = new ExperienceDTO("Zoho", "Software Developer", 3, "Development", educationDTO16);
        List<ExperienceDTO> experienceDTO16 = new ArrayList<>();
        experienceDTO16.add(experienceDTO16a);
        experienceDTO16.add(experienceDTO16b);

        ExperienceDTO experienceDTO17a = new ExperienceDTO("MakeMyTrip", "Travel Analyst", 1, "Travel", educationDTO17);
        ExperienceDTO experienceDTO17b = new ExperienceDTO("Cleartrip", "Java Developer", 2, "Backend", educationDTO17);
        List<ExperienceDTO> experienceDTO17 = new ArrayList<>();
        experienceDTO17.add(experienceDTO17a);
        experienceDTO17.add(experienceDTO17b);

        ExperienceDTO experienceDTO18a = new ExperienceDTO("Yatra", "UI Developer", 2, "Frontend", educationDTO18);
        ExperienceDTO experienceDTO18b = new ExperienceDTO("Ixigo", "QA Tester", 1, "Testing", educationDTO18);
        List<ExperienceDTO> experienceDTO18 = new ArrayList<>();
        experienceDTO18.add(experienceDTO18a);
        experienceDTO18.add(experienceDTO18b);

        ExperienceDTO experienceDTO19a = new ExperienceDTO("Redbus", "NodeJS Developer", 2, "Backend", educationDTO19);
        ExperienceDTO experienceDTO19b = new ExperienceDTO("BookMyShow", "DevOps Engineer", 3, "DevOps", educationDTO19);
        List<ExperienceDTO> experienceDTO19 = new ArrayList<>();
        experienceDTO19.add(experienceDTO19a);
        experienceDTO19.add(experienceDTO19b);

        ExperienceDTO experienceDTO20a = new ExperienceDTO("BigBasket", "Data Analyst", 1, "Data", educationDTO20);
        ExperienceDTO experienceDTO20b = new ExperienceDTO("Grofers", "Cloud Engineer", 2, "Cloud", educationDTO20);
        List<ExperienceDTO> experienceDTO20 = new ArrayList<>();
        experienceDTO20.add(experienceDTO20a);
        experienceDTO20.add(experienceDTO20b);

        ExperienceDTO experienceDTO21a = new ExperienceDTO("Reliance Jio", "Network Engineer", 3, "Telecom", educationDTO21);
        ExperienceDTO experienceDTO21b = new ExperienceDTO("Airtel", "System Analyst", 2, "Network", educationDTO21);
        List<ExperienceDTO> experienceDTO21 = new ArrayList<>();
        experienceDTO21.add(experienceDTO21a);
        experienceDTO21.add(experienceDTO21b);

        ExperienceDTO experienceDTO22a = new ExperienceDTO("Tata Steel", "Mechanical Engineer", 4, "Industrial", educationDTO22);
        ExperienceDTO experienceDTO22b = new ExperienceDTO("L&T", "Site Engineer", 2, "Construction", educationDTO22);
        List<ExperienceDTO> experienceDTO22 = new ArrayList<>();
        experienceDTO22.add(experienceDTO22a);
        experienceDTO22.add(experienceDTO22b);

        ExperienceDTO experienceDTO23a = new ExperienceDTO("Siemens", "Embedded Engineer", 3, "Electronics", educationDTO23);
        ExperienceDTO experienceDTO23b = new ExperienceDTO("Bosch", "Control Systems Engineer", 2, "Automation", educationDTO23);
        List<ExperienceDTO> experienceDTO23 = new ArrayList<>();
        experienceDTO23.add(experienceDTO23a);
        experienceDTO23.add(experienceDTO23b);

        ExperienceDTO experienceDTO24a = new ExperienceDTO("Intel", "Hardware Engineer", 4, "Hardware", educationDTO24);
        ExperienceDTO experienceDTO24b = new ExperienceDTO("AMD", "Chip Design Engineer", 3, "Semiconductors", educationDTO24);
        List<ExperienceDTO> experienceDTO24 = new ArrayList<>();
        experienceDTO24.add(experienceDTO24a);
        experienceDTO24.add(experienceDTO24b);

        ExperienceDTO experienceDTO25a = new ExperienceDTO("Nvidia", "AI Researcher", 2, "AI", educationDTO25);
        ExperienceDTO experienceDTO25b = new ExperienceDTO("Qualcomm", "Firmware Engineer", 3, "Embedded", educationDTO25);
        List<ExperienceDTO> experienceDTO25 = new ArrayList<>();
        experienceDTO25.add(experienceDTO25a);
        experienceDTO25.add(experienceDTO25b);

        ExperienceDTO experienceDTO26a = new ExperienceDTO("SpaceX", "Aerospace Engineer", 3, "Aerospace", educationDTO26);
        ExperienceDTO experienceDTO26b = new ExperienceDTO("ISRO", "Satellite Designer", 4, "Research", educationDTO26);
        List<ExperienceDTO> experienceDTO26 = new ArrayList<>();
        experienceDTO26.add(experienceDTO26a);
        experienceDTO26.add(experienceDTO26b);

        ExperienceDTO experienceDTO27a = new ExperienceDTO("NASA", "Mission Specialist", 5, "Space", educationDTO27);
        ExperienceDTO experienceDTO27b = new ExperienceDTO("DRDO", "Defense Engineer", 3, "Defense", educationDTO27);
        List<ExperienceDTO> experienceDTO27 = new ArrayList<>();
        experienceDTO27.add(experienceDTO27a);
        experienceDTO27.add(experienceDTO27b);

        ExperienceDTO experienceDTO28a = new ExperienceDTO("OYO", "Business Analyst", 2, "Operations", educationDTO28);
        ExperienceDTO experienceDTO28b = new ExperienceDTO("Treebo", "Sales Manager", 3, "Sales", educationDTO28);
        List<ExperienceDTO> experienceDTO28 = new ArrayList<>();
        experienceDTO28.add(experienceDTO28a);
        experienceDTO28.add(experienceDTO28b);

        ExperienceDTO experienceDTO29a = new ExperienceDTO("PepsiCo", "Logistics Executive", 2, "Supply Chain", educationDTO29);
        ExperienceDTO experienceDTO29b = new ExperienceDTO("Coca-Cola", "Quality Analyst", 1, "Manufacturing", educationDTO29);
        List<ExperienceDTO> experienceDTO29 = new ArrayList<>();
        experienceDTO29.add(experienceDTO29a);
        experienceDTO29.add(experienceDTO29b);

        ExperienceDTO experienceDTO30a = new ExperienceDTO("BharatPe", "Backend Developer", 2, "Fintech", educationDTO30);
        ExperienceDTO experienceDTO30b = new ExperienceDTO("PhonePe", "Full Stack Engineer", 3, "Payments", educationDTO30);
        List<ExperienceDTO> experienceDTO30 = new ArrayList<>();
        experienceDTO30.add(experienceDTO30a);
        experienceDTO30.add(experienceDTO30b);


        ExperienceDTO experienceDTO31a = new ExperienceDTO("Razorpay", "Security Engineer", 2, "Fintech", educationDTO31);
        ExperienceDTO experienceDTO31b = new ExperienceDTO("PayPal", "Technical Lead", 4, "Payments", educationDTO31);
        List<ExperienceDTO> experienceDTO31 = new ArrayList<>();
        experienceDTO31.add(experienceDTO31a);
        experienceDTO31.add(experienceDTO31b);

        ExperienceDTO experienceDTO32a = new ExperienceDTO("Stripe", "Software Engineer", 3, "Finance", educationDTO32);
        ExperienceDTO experienceDTO32b = new ExperienceDTO("Coinbase", "Blockchain Developer", 2, "Crypto", educationDTO32);
        List<ExperienceDTO> experienceDTO32 = new ArrayList<>();
        experienceDTO32.add(experienceDTO32a);
        experienceDTO32.add(experienceDTO32b);

        ExperienceDTO experienceDTO33a = new ExperienceDTO("Binance", "Security Analyst", 2, "Blockchain", educationDTO33);
        ExperienceDTO experienceDTO33b = new ExperienceDTO("Upstox", "Frontend Developer", 3, "Trading", educationDTO33);
        List<ExperienceDTO> experienceDTO33 = new ArrayList<>();
        experienceDTO33.add(experienceDTO33a);
        experienceDTO33.add(experienceDTO33b);

        ExperienceDTO experienceDTO34a = new ExperienceDTO("Groww", "React Developer", 2, "Investment", educationDTO34);
        ExperienceDTO experienceDTO34b = new ExperienceDTO("Zerodha", "Technical Analyst", 3, "Trading", educationDTO34);
        List<ExperienceDTO> experienceDTO34 = new ArrayList<>();
        experienceDTO34.add(experienceDTO34a);
        experienceDTO34.add(experienceDTO34b);

        ExperienceDTO experienceDTO35a = new ExperienceDTO("Netflix", "Media Analyst", 3, "Streaming", educationDTO35);
        ExperienceDTO experienceDTO35b = new ExperienceDTO("Hotstar", "Java Developer", 2, "OTT", educationDTO35);
        List<ExperienceDTO> experienceDTO35 = new ArrayList<>();
        experienceDTO35.add(experienceDTO35a);
        experienceDTO35.add(experienceDTO35b);

        ExperienceDTO experienceDTO36a = new ExperienceDTO("SonyLiv", "DevOps Intern", 1, "Infrastructure", educationDTO36);
        ExperienceDTO experienceDTO36b = new ExperienceDTO("Voot", "Cloud Support Engineer", 2, "Cloud", educationDTO36);
        List<ExperienceDTO> experienceDTO36 = new ArrayList<>();
        experienceDTO36.add(experienceDTO36a);
        experienceDTO36.add(experienceDTO36b);

        ExperienceDTO experienceDTO37a = new ExperienceDTO("JioCinema", "Flutter Developer", 2, "Mobile", educationDTO37);
        ExperienceDTO experienceDTO37b = new ExperienceDTO("MX Player", "UI Developer", 2, "Frontend", educationDTO37);
        List<ExperienceDTO> experienceDTO37 = new ArrayList<>();
        experienceDTO37.add(experienceDTO37a);
        experienceDTO37.add(experienceDTO37b);

        ExperienceDTO experienceDTO38a = new ExperienceDTO("Gaana", "Python Developer", 2, "Backend", educationDTO38);
        ExperienceDTO experienceDTO38b = new ExperienceDTO("Spotify", "Data Scientist", 3, "ML", educationDTO38);
        List<ExperienceDTO> experienceDTO38 = new ArrayList<>();
        experienceDTO38.add(experienceDTO38a);
        experienceDTO38.add(experienceDTO38b);

        ExperienceDTO experienceDTO39a = new ExperienceDTO("Wynk", "NodeJS Developer", 1, "Backend", educationDTO39);
        ExperienceDTO experienceDTO39b = new ExperienceDTO("Saavn", "AI Engineer", 2, "AI", educationDTO39);
        List<ExperienceDTO> experienceDTO39 = new ArrayList<>();
        experienceDTO39.add(experienceDTO39a);
        experienceDTO39.add(experienceDTO39b);

        ExperienceDTO experienceDTO40a = new ExperienceDTO("YouTube", "Content Analyst", 2, "Media", educationDTO40);
        ExperienceDTO experienceDTO40b = new ExperienceDTO("Instagram", "Digital Marketer", 3, "Marketing", educationDTO40);
        List<ExperienceDTO> experienceDTO40 = new ArrayList<>();
        experienceDTO40.add(experienceDTO40a);
        experienceDTO40.add(experienceDTO40b);


        ExperienceDTO experienceDTO41a = new ExperienceDTO("LinkedIn", "Data Analyst", 2, "Analytics", educationDTO41);
        ExperienceDTO experienceDTO41b = new ExperienceDTO("Twitter", "Backend Engineer", 3, "Social", educationDTO41);
        List<ExperienceDTO> experienceDTO41 = new ArrayList<>();
        experienceDTO41.add(experienceDTO41a);
        experienceDTO41.add(experienceDTO41b);

        ExperienceDTO experienceDTO42a = new ExperienceDTO("Snapchat", "AR Developer", 2, "AR", educationDTO42);
        ExperienceDTO experienceDTO42b = new ExperienceDTO("Pinterest", "UI Tester", 1, "Testing", educationDTO42);
        List<ExperienceDTO> experienceDTO42 = new ArrayList<>();
        experienceDTO42.add(experienceDTO42a);
        experienceDTO42.add(experienceDTO42b);

        ExperienceDTO experienceDTO43a = new ExperienceDTO("Quora", "Content Manager", 2, "Publishing", educationDTO43);
        ExperienceDTO experienceDTO43b = new ExperienceDTO("Reddit", "Moderator Analyst", 2, "Community", educationDTO43);
        List<ExperienceDTO> experienceDTO43 = new ArrayList<>();
        experienceDTO43.add(experienceDTO43a);
        experienceDTO43.add(experienceDTO43b);

        ExperienceDTO experienceDTO44a = new ExperienceDTO("Dropbox", "Cloud Architect", 4, "Cloud", educationDTO44);
        ExperienceDTO experienceDTO44b = new ExperienceDTO("Box", "Platform Engineer", 3, "Storage", educationDTO44);
        List<ExperienceDTO> experienceDTO44 = new ArrayList<>();
        experienceDTO44.add(experienceDTO44a);
        experienceDTO44.add(experienceDTO44b);

        ExperienceDTO experienceDTO45a = new ExperienceDTO("Slack", "Integration Developer", 2, "Communication", educationDTO45);
        ExperienceDTO experienceDTO45b = new ExperienceDTO("Zoom", "Media Specialist", 2, "Video", educationDTO45);
        List<ExperienceDTO> experienceDTO45 = new ArrayList<>();
        experienceDTO45.add(experienceDTO45a);
        experienceDTO45.add(experienceDTO45b);

        ExperienceDTO experienceDTO46a = new ExperienceDTO("Microsoft Teams", "Collab Engineer", 3, "Tools", educationDTO46);
        ExperienceDTO experienceDTO46b = new ExperienceDTO("Google Meet", "Infrastructure Engineer", 3, "Video Conferencing", educationDTO46);
        List<ExperienceDTO> experienceDTO46 = new ArrayList<>();
        experienceDTO46.add(experienceDTO46a);
        experienceDTO46.add(experienceDTO46b);

        ExperienceDTO experienceDTO47a = new ExperienceDTO("Cisco", "Network Security Engineer", 4, "Security", educationDTO47);
        ExperienceDTO experienceDTO47b = new ExperienceDTO("Juniper", "Firewall Specialist", 3, "Network", educationDTO47);
        List<ExperienceDTO> experienceDTO47 = new ArrayList<>();
        experienceDTO47.add(experienceDTO47a);
        experienceDTO47.add(experienceDTO47b);

        ExperienceDTO experienceDTO48a = new ExperienceDTO("VMware", "Virtualization Expert", 3, "Infra", educationDTO48);
        ExperienceDTO experienceDTO48b = new ExperienceDTO("Red Hat", "Linux Admin", 2, "System", educationDTO48);
        List<ExperienceDTO> experienceDTO48 = new ArrayList<>();
        experienceDTO48.add(experienceDTO48a);
        experienceDTO48.add(experienceDTO48b);

        ExperienceDTO experienceDTO49a = new ExperienceDTO("GitHub", "DevOps Specialist", 2, "Tools", educationDTO49);
        ExperienceDTO experienceDTO49b = new ExperienceDTO("Bitbucket", "CI/CD Engineer", 2, "Automation", educationDTO49);
        List<ExperienceDTO> experienceDTO49 = new ArrayList<>();
        experienceDTO49.add(experienceDTO49a);
        experienceDTO49.add(experienceDTO49b);

        ExperienceDTO experienceDTO50a = new ExperienceDTO("Atlassian", "Product Designer", 3, "Design", educationDTO50);
        ExperienceDTO experienceDTO50b = new ExperienceDTO("Notion", "Frontend Engineer", 2, "Productivity", educationDTO50);
        List<ExperienceDTO> experienceDTO50 = new ArrayList<>();
        experienceDTO50.add(experienceDTO50a);
        experienceDTO50.add(experienceDTO50b);

        ExperienceDTO experienceDTO51a = new ExperienceDTO("Figma", "UX Researcher", 2, "Design", educationDTO51);
        ExperienceDTO experienceDTO51b = new ExperienceDTO("Canva", "Graphics Developer", 2, "Design", educationDTO51);
        List<ExperienceDTO> experienceDTO51 = new ArrayList<>();
        experienceDTO51.add(experienceDTO51a);
        experienceDTO51.add(experienceDTO51b);

        ExperienceDTO experienceDTO52a = new ExperienceDTO("Behance", "Creative Strategist", 2, "Media", educationDTO52);
        ExperienceDTO experienceDTO52b = new ExperienceDTO("Dribbble", "Illustrator", 1, "Art", educationDTO52);
        List<ExperienceDTO> experienceDTO52 = new ArrayList<>();
        experienceDTO52.add(experienceDTO52a);
        experienceDTO52.add(experienceDTO52b);

        ExperienceDTO experienceDTO53a = new ExperienceDTO("Coursera", "Instructional Designer", 2, "Education", educationDTO53);
        ExperienceDTO experienceDTO53b = new ExperienceDTO("edX", "Content Curator", 1, "Learning", educationDTO53);
        List<ExperienceDTO> experienceDTO53 = new ArrayList<>();
        experienceDTO53.add(experienceDTO53a);
        experienceDTO53.add(experienceDTO53b);

        ExperienceDTO experienceDTO54a = new ExperienceDTO("Khan Academy", "Learning Engineer", 3, "Education", educationDTO54);
        ExperienceDTO experienceDTO54b = new ExperienceDTO("Udemy", "Course Developer", 2, "Teaching", educationDTO54);
        List<ExperienceDTO> experienceDTO54 = new ArrayList<>();
        experienceDTO54.add(experienceDTO54a);
        experienceDTO54.add(experienceDTO54b);

        ExperienceDTO experienceDTO55a = new ExperienceDTO("Pluralsight", "Skill Analyst", 2, "Learning", educationDTO55);
        ExperienceDTO experienceDTO55b = new ExperienceDTO("Skillshare", "Video Instructor", 1, "Art", educationDTO55);
        List<ExperienceDTO> experienceDTO55 = new ArrayList<>();
        experienceDTO55.add(experienceDTO55a);
        experienceDTO55.add(experienceDTO55b);

        ExperienceDTO experienceDTO56a = new ExperienceDTO("Duolingo", "Language Coach", 2, "Education", educationDTO56);
        ExperienceDTO experienceDTO56b = new ExperienceDTO("Rosetta Stone", "Translation Specialist", 1, "Linguistics", educationDTO56);
        List<ExperienceDTO> experienceDTO56 = new ArrayList<>();
        experienceDTO56.add(experienceDTO56a);
        experienceDTO56.add(experienceDTO56b);

        ExperienceDTO experienceDTO57a = new ExperienceDTO("Koo", "Community Manager", 2, "Social", educationDTO57);
        ExperienceDTO experienceDTO57b = new ExperienceDTO("Mastodon", "Open Source Contributor", 3, "Decentralized", educationDTO57);
        List<ExperienceDTO> experienceDTO57 = new ArrayList<>();
        experienceDTO57.add(experienceDTO57a);
        experienceDTO57.add(experienceDTO57b);

        ExperienceDTO experienceDTO58a = new ExperienceDTO("Telegram", "Bot Developer", 2, "Automation", educationDTO58);
        ExperienceDTO experienceDTO58b = new ExperienceDTO("Signal", "Privacy Engineer", 2, "Security", educationDTO58);
        List<ExperienceDTO> experienceDTO58 = new ArrayList<>();
        experienceDTO58.add(experienceDTO58a);
        experienceDTO58.add(experienceDTO58b);

        ExperienceDTO experienceDTO59a = new ExperienceDTO("Opera", "Web Developer", 2, "Browser", educationDTO59);
        ExperienceDTO experienceDTO59b = new ExperienceDTO("Brave", "Security Tester", 2, "Privacy", educationDTO59);
        List<ExperienceDTO> experienceDTO59 = new ArrayList<>();
        experienceDTO59.add(experienceDTO59a);
        experienceDTO59.add(experienceDTO59b);

        ExperienceDTO experienceDTO60a = new ExperienceDTO("DuckDuckGo", "Search Engineer", 3, "Privacy", educationDTO60);
        ExperienceDTO experienceDTO60b = new ExperienceDTO("Ecosia", "Green Tech Developer", 2, "EcoTech", educationDTO60);
        List<ExperienceDTO> experienceDTO60 = new ArrayList<>();
        experienceDTO60.add(experienceDTO60a);
        experienceDTO60.add(experienceDTO60b);


        ExperienceDTO experienceDTO61a = new ExperienceDTO("Bing", "Search Analyst", 2, "Search Engine", educationDTO61);
        ExperienceDTO experienceDTO61b = new ExperienceDTO("Yahoo", "Content Curator", 1, "Media", educationDTO61);
        List<ExperienceDTO> experienceDTO61 = new ArrayList<>();
        experienceDTO61.add(experienceDTO61a);
        experienceDTO61.add(experienceDTO61b);

        ExperienceDTO experienceDTO62a = new ExperienceDTO("Alibaba", "Business Strategist", 3, "E-Commerce", educationDTO62);
        ExperienceDTO experienceDTO62b = new ExperienceDTO("JD.com", "Operations Manager", 2, "Logistics", educationDTO62);
        List<ExperienceDTO> experienceDTO62 = new ArrayList<>();
        experienceDTO62.add(experienceDTO62a);
        experienceDTO62.add(experienceDTO62b);

        ExperienceDTO experienceDTO63a = new ExperienceDTO("Tencent", "Gaming Developer", 3, "GameDev", educationDTO63);
        ExperienceDTO experienceDTO63b = new ExperienceDTO("Garena", "Server Engineer", 2, "Gaming", educationDTO63);
        List<ExperienceDTO> experienceDTO63 = new ArrayList<>();
        experienceDTO63.add(experienceDTO63a);
        experienceDTO63.add(experienceDTO63b);

        ExperienceDTO experienceDTO64a = new ExperienceDTO("Supercell", "Game Designer", 2, "Mobile Games", educationDTO64);
        ExperienceDTO experienceDTO64b = new ExperienceDTO("Riot Games", "Backend Engineer", 3, "Gaming", educationDTO64);
        List<ExperienceDTO> experienceDTO64 = new ArrayList<>();
        experienceDTO64.add(experienceDTO64a);
        experienceDTO64.add(experienceDTO64b);

        ExperienceDTO experienceDTO65a = new ExperienceDTO("Epic Games", "Unreal Developer", 3, "Game Engine", educationDTO65);
        ExperienceDTO experienceDTO65b = new ExperienceDTO("Unity", "Graphics Programmer", 2, "Game Engine", educationDTO65);
        List<ExperienceDTO> experienceDTO65 = new ArrayList<>();
        experienceDTO65.add(experienceDTO65a);
        experienceDTO65.add(experienceDTO65b);

        ExperienceDTO experienceDTO66a = new ExperienceDTO("FlipHTML5", "Animation Developer", 2, "Publishing", educationDTO66);
        ExperienceDTO experienceDTO66b = new ExperienceDTO("Animaker", "Motion Graphic Designer", 2, "Media", educationDTO66);
        List<ExperienceDTO> experienceDTO66 = new ArrayList<>();
        experienceDTO66.add(experienceDTO66a);
        experienceDTO66.add(experienceDTO66b);

        ExperienceDTO experienceDTO67a = new ExperienceDTO("Blender", "3D Artist", 3, "Modeling", educationDTO67);
        ExperienceDTO experienceDTO67b = new ExperienceDTO("Autodesk", "CAD Engineer", 4, "Design", educationDTO67);
        List<ExperienceDTO> experienceDTO67 = new ArrayList<>();
        experienceDTO67.add(experienceDTO67a);
        experienceDTO67.add(experienceDTO67b);


        InspectorDTO inspectorDTO1 = new InspectorDTO("Singam", 1, "IPS", 5, experienceDTO1);
        InspectorDTO inspectorDTO2 = new InspectorDTO("Raj", 2, "CBI", 10, experienceDTO2);
        InspectorDTO inspectorDTO3 = new InspectorDTO("Kumar", 3, "CID", 7, experienceDTO3);
        InspectorDTO inspectorDTO4 = new InspectorDTO("Vikram", 4, "ATS", 12, experienceDTO4);
        InspectorDTO inspectorDTO5 = new InspectorDTO("Ravi", 5, "Crime", 8, experienceDTO5);
        InspectorDTO inspectorDTO6 = new InspectorDTO("Ajay", 6, "CB-CID", 4, experienceDTO6);
        InspectorDTO inspectorDTO7 = new InspectorDTO("Arjun", 7, "NIA", 9, experienceDTO7);
        InspectorDTO inspectorDTO8 = new InspectorDTO("Sameer", 8, "Cyber", 6, experienceDTO8);
        InspectorDTO inspectorDTO9 = new InspectorDTO("Shiv", 9, "Forensics", 11, experienceDTO9);
        InspectorDTO inspectorDTO10 = new InspectorDTO("Irfan", 10, "Narcotics", 3, experienceDTO10);
        InspectorDTO inspectorDTO11 = new InspectorDTO("Rakesh", 11, "Traffic", 2, experienceDTO11);
        InspectorDTO inspectorDTO12 = new InspectorDTO("Vijay", 12, "Railway", 7, experienceDTO12);
        InspectorDTO inspectorDTO13 = new InspectorDTO("Naveen", 13, "WomenCell", 6, experienceDTO13);
        InspectorDTO inspectorDTO14 = new InspectorDTO("Surya", 14, "Juvenile", 8, experienceDTO14);
        InspectorDTO inspectorDTO15 = new InspectorDTO("Ganesh", 15, "AntiTerror", 10, experienceDTO15);
        InspectorDTO inspectorDTO16 = new InspectorDTO("Prasad", 16, "CID", 5, experienceDTO16);
        InspectorDTO inspectorDTO17 = new InspectorDTO("Manoj", 17, "ATS", 11, experienceDTO17);
        InspectorDTO inspectorDTO18 = new InspectorDTO("Raghu", 18, "CBI", 4, experienceDTO18);
        InspectorDTO inspectorDTO19 = new InspectorDTO("Harsha", 19, "Crime", 6, experienceDTO19);
        InspectorDTO inspectorDTO20 = new InspectorDTO("Varun", 20, "NIA", 3, experienceDTO20);
        InspectorDTO inspectorDTO21 = new InspectorDTO("Dinesh", 21, "Cyber", 9, experienceDTO21);
        InspectorDTO inspectorDTO22 = new InspectorDTO("Lokesh", 22, "Traffic", 7, experienceDTO22);
        InspectorDTO inspectorDTO23 = new InspectorDTO("Jai", 23, "Railway", 10, experienceDTO23);
        InspectorDTO inspectorDTO24 = new InspectorDTO("Keshav", 24, "CB-CID", 8, experienceDTO24);
        InspectorDTO inspectorDTO25 = new InspectorDTO("Anil", 25, "CID", 12, experienceDTO25);
        InspectorDTO inspectorDTO26 = new InspectorDTO("Suresh", 26, "Narcotics", 4, experienceDTO26);
        InspectorDTO inspectorDTO27 = new InspectorDTO("Mahesh", 27, "Forensics", 5, experienceDTO27);
        InspectorDTO inspectorDTO28 = new InspectorDTO("Yash", 28, "Cyber", 2, experienceDTO28);
        InspectorDTO inspectorDTO29 = new InspectorDTO("Deepak", 29, "Juvenile", 6, experienceDTO29);
        InspectorDTO inspectorDTO30 = new InspectorDTO("Kapil", 30, "WomenCell", 3, experienceDTO30);
        InspectorDTO inspectorDTO31 = new InspectorDTO("Amit", 31, "IPS", 9, experienceDTO31);
        InspectorDTO inspectorDTO32 = new InspectorDTO("Bhavesh", 32, "CBI", 5, experienceDTO32);
        InspectorDTO inspectorDTO33 = new InspectorDTO("Naresh", 33, "ATS", 8, experienceDTO33);
        InspectorDTO inspectorDTO34 = new InspectorDTO("Kiran", 34, "Crime", 7, experienceDTO34);
        InspectorDTO inspectorDTO35 = new InspectorDTO("Prem", 35, "CB-CID", 10, experienceDTO35);
        InspectorDTO inspectorDTO36 = new InspectorDTO("Nitin", 36, "CID", 6, experienceDTO36);
        InspectorDTO inspectorDTO37 = new InspectorDTO("Sharath", 37, "NIA", 4, experienceDTO37);
        InspectorDTO inspectorDTO38 = new InspectorDTO("Arvind", 38, "Traffic", 2, experienceDTO38);
        InspectorDTO inspectorDTO39 = new InspectorDTO("Sanjay", 39, "Railway", 5, experienceDTO39);
        InspectorDTO inspectorDTO40 = new InspectorDTO("Shankar", 40, "AntiTerror", 11, experienceDTO40);
        InspectorDTO inspectorDTO41 = new InspectorDTO("Raman", 41, "Forensics", 9, experienceDTO41);
        InspectorDTO inspectorDTO42 = new InspectorDTO("Ankit", 42, "Cyber", 12, experienceDTO42);
        InspectorDTO inspectorDTO43 = new InspectorDTO("Umesh", 43, "CID", 7, experienceDTO43);
        InspectorDTO inspectorDTO44 = new InspectorDTO("Tejas", 44, "Narcotics", 6, experienceDTO44);
        InspectorDTO inspectorDTO45 = new InspectorDTO("Rohan", 45, "IPS", 8, experienceDTO45);
        InspectorDTO inspectorDTO46 = new InspectorDTO("Tarun", 46, "CBI", 10, experienceDTO46);
        InspectorDTO inspectorDTO47 = new InspectorDTO("Sahil", 47, "WomenCell", 5, experienceDTO47);
        InspectorDTO inspectorDTO48 = new InspectorDTO("Mehul", 48, "CB-CID", 4, experienceDTO48);
        InspectorDTO inspectorDTO49 = new InspectorDTO("Aditya", 49, "CID", 6, experienceDTO49);
        InspectorDTO inspectorDTO50 = new InspectorDTO("Krishna", 50, "Traffic", 3, experienceDTO50);
        InspectorDTO inspectorDTO51 = new InspectorDTO("Ashok", 51, "Railway", 9, experienceDTO51);
        InspectorDTO inspectorDTO52 = new InspectorDTO("Dev", 52, "Cyber", 7, experienceDTO52);
        InspectorDTO inspectorDTO53 = new InspectorDTO("Mithun", 53, "NIA", 10, experienceDTO53);
        InspectorDTO inspectorDTO54 = new InspectorDTO("Nandan", 54, "Forensics", 5, experienceDTO54);
        InspectorDTO inspectorDTO55 = new InspectorDTO("Rajeev", 55, "CBI", 2, experienceDTO55);
        InspectorDTO inspectorDTO56 = new InspectorDTO("Om", 56, "Crime", 3, experienceDTO56);
        InspectorDTO inspectorDTO57 = new InspectorDTO("Karthik", 57, "CB-CID", 7, experienceDTO57);
        InspectorDTO inspectorDTO58 = new InspectorDTO("Sudhir", 58, "Narcotics", 6, experienceDTO58);
        InspectorDTO inspectorDTO59 = new InspectorDTO("Ritesh", 59, "Juvenile", 4, experienceDTO59);
        InspectorDTO inspectorDTO60 = new InspectorDTO("Pranav", 60, "AntiTerror", 8, experienceDTO60);
        InspectorDTO inspectorDTO61 = new InspectorDTO("Arav", 61, "CID", 5, experienceDTO61);
        InspectorDTO inspectorDTO62 = new InspectorDTO("Chirag", 62, "CBI", 9, experienceDTO62);
        InspectorDTO inspectorDTO63 = new InspectorDTO("Neeraj", 63, "WomenCell", 3, experienceDTO63);
        InspectorDTO inspectorDTO64 = new InspectorDTO("Shubham", 64, "IPS", 6, experienceDTO64);
        InspectorDTO inspectorDTO65 = new InspectorDTO("Tanmay", 65, "Cyber", 11, experienceDTO65);
        InspectorDTO inspectorDTO66 = new InspectorDTO("Harshit", 66, "CB-CID", 10, experienceDTO66);
        InspectorDTO inspectorDTO67 = new InspectorDTO("Yuvraj", 67, "CID", 7, experienceDTO67);


        RTODTO rtodto1 = new RTODTO(12526, "Tamil Nadu", "Chennai", 4578962541L, inspectorDTO1);
        RTODTO rtodto2 = new RTODTO(89631, "Karnataka", "Bengaluru", 8925436710L, inspectorDTO2);
        RTODTO rtodto3 = new RTODTO(12527, "Kerala", "Kochi", 7812345678L, inspectorDTO3);
        RTODTO rtodto4 = new RTODTO(12528, "Maharashtra", "Mumbai", 9812345670L, inspectorDTO4);
        RTODTO rtodto5 = new RTODTO(12529, "Telangana", "Hyderabad", 9123456780L, inspectorDTO5);
        RTODTO rtodto6 = new RTODTO(12530, "Andhra Pradesh", "Vijayawada", 9988776655L, inspectorDTO6);
        RTODTO rtodto7 = new RTODTO(12531, "Gujarat", "Ahmedabad", 8877665544L, inspectorDTO7);
        RTODTO rtodto8 = new RTODTO(12532, "Rajasthan", "Jaipur", 7766554433L, inspectorDTO8);
        RTODTO rtodto9 = new RTODTO(12533, "Punjab", "Amritsar", 6655443322L, inspectorDTO9);
        RTODTO rtodto10 = new RTODTO(12534, "Haryana", "Gurgaon", 5544332211L, inspectorDTO10);
        RTODTO rtodto11 = new RTODTO(12535, "Bihar", "Patna", 9988112233L, inspectorDTO11);
        RTODTO rtodto12 = new RTODTO(12536, "West Bengal", "Kolkata", 8877223344L, inspectorDTO12);
        RTODTO rtodto13 = new RTODTO(12537, "Odisha", "Bhubaneswar", 7766334455L, inspectorDTO13);
        RTODTO rtodto14 = new RTODTO(12538, "Assam", "Guwahati", 6655442233L, inspectorDTO14);
        RTODTO rtodto15 = new RTODTO(12539, "Jharkhand", "Ranchi", 5544331122L, inspectorDTO15);
        RTODTO rtodto16 = new RTODTO(12540, "Chhattisgarh", "Raipur", 9988001122L, inspectorDTO16);
        RTODTO rtodto17 = new RTODTO(12541, "Madhya Pradesh", "Bhopal", 8877002233L, inspectorDTO17);
        RTODTO rtodto18 = new RTODTO(12542, "Uttar Pradesh", "Lucknow", 7766003344L, inspectorDTO18);
        RTODTO rtodto19 = new RTODTO(12543, "Uttarakhand", "Dehradun", 6655004455L, inspectorDTO19);
        RTODTO rtodto20 = new RTODTO(12544, "Himachal Pradesh", "Shimla", 5544005566L, inspectorDTO20);
        RTODTO rtodto21 = new RTODTO(12545, "Goa", "Panaji", 9988113344L, inspectorDTO21);
        RTODTO rtodto22 = new RTODTO(12546, "Delhi", "New Delhi", 8877224455L, inspectorDTO22);
        RTODTO rtodto23 = new RTODTO(12547, "Jammu and Kashmir", "Srinagar", 7766335566L, inspectorDTO23);
        RTODTO rtodto24 = new RTODTO(12548, "Ladakh", "Leh", 6655446677L, inspectorDTO24);
        RTODTO rtodto25 = new RTODTO(12549, "Tripura", "Agartala", 5544337788L, inspectorDTO25);
        RTODTO rtodto26 = new RTODTO(12550, "Meghalaya", "Shillong", 9988008899L, inspectorDTO26);
        RTODTO rtodto27 = new RTODTO(12551, "Mizoram", "Aizawl", 8877009900L, inspectorDTO27);
        RTODTO rtodto28 = new RTODTO(12552, "Manipur", "Imphal", 7766001010L, inspectorDTO28);
        RTODTO rtodto29 = new RTODTO(12553, "Sikkim", "Gangtok", 6655002020L, inspectorDTO29);
        RTODTO rtodto30 = new RTODTO(12554, "Nagaland", "Kohima", 5544003030L, inspectorDTO30);
        RTODTO rtodto31 = new RTODTO(12555, "Puducherry", "Puducherry", 9988114141L, inspectorDTO31);
        RTODTO rtodto32 = new RTODTO(12556, "Chandigarh", "Chandigarh", 8877225252L, inspectorDTO32);
        RTODTO rtodto33 = new RTODTO(12557, "Daman and Diu", "Daman", 7766336363L, inspectorDTO33);
        RTODTO rtodto34 = new RTODTO(12558, "Dadra and Nagar Haveli", "Silvassa", 6655447474L, inspectorDTO34);
        RTODTO rtodto35 = new RTODTO(12559, "Lakshadweep", "Kavaratti", 5544338585L, inspectorDTO35);
        RTODTO rtodto36 = new RTODTO(12560, "Andaman and Nicobar", "Port Blair", 9988009696L, inspectorDTO36);
        RTODTO rtodto37 = new RTODTO(12561, "Tamil Nadu", "Madurai", 8877001234L, inspectorDTO37);
        RTODTO rtodto38 = new RTODTO(12562, "Karnataka", "Mysuru", 7766002345L, inspectorDTO38);
        RTODTO rtodto39 = new RTODTO(12563, "Kerala", "Thiruvananthapuram", 6655003456L, inspectorDTO39);
        RTODTO rtodto40 = new RTODTO(12564, "Maharashtra", "Pune", 5544004567L, inspectorDTO40);
        RTODTO rtodto41 = new RTODTO(12565, "Telangana", "Warangal", 9988115678L, inspectorDTO41);
        RTODTO rtodto42 = new RTODTO(12566, "Andhra Pradesh", "Vizag", 8877226789L, inspectorDTO42);
        RTODTO rtodto43 = new RTODTO(12567, "Gujarat", "Surat", 7766337890L, inspectorDTO43);
        RTODTO rtodto44 = new RTODTO(12568, "Rajasthan", "Udaipur", 6655448901L, inspectorDTO44);
        RTODTO rtodto45 = new RTODTO(12569, "Punjab", "Ludhiana", 5544339012L, inspectorDTO45);
        RTODTO rtodto46 = new RTODTO(12570, "Haryana", "Faridabad", 9988001235L, inspectorDTO46);
        RTODTO rtodto47 = new RTODTO(12571, "Bihar", "Gaya", 8877002346L, inspectorDTO47);
        RTODTO rtodto48 = new RTODTO(12572, "West Bengal", "Howrah", 7766003457L, inspectorDTO48);
        RTODTO rtodto49 = new RTODTO(12573, "Odisha", "Cuttack", 6655004568L, inspectorDTO49);
        RTODTO rtodto50 = new RTODTO(12574, "Assam", "Silchar", 5544005679L, inspectorDTO50);
        RTODTO rtodto51 = new RTODTO(12575, "Jharkhand", "Jamshedpur", 9988116780L, inspectorDTO51);
        RTODTO rtodto52 = new RTODTO(12576, "Chhattisgarh", "Bilaspur", 8877227891L, inspectorDTO52);
        RTODTO rtodto53 = new RTODTO(12577, "Madhya Pradesh", "Indore", 7766338902L, inspectorDTO53);
        RTODTO rtodto54 = new RTODTO(12578, "Uttar Pradesh", "Kanpur", 6655449013L, inspectorDTO54);
        RTODTO rtodto55 = new RTODTO(12579, "Uttarakhand", "Haridwar", 5544330124L, inspectorDTO55);
        RTODTO rtodto56 = new RTODTO(12580, "Himachal Pradesh", "Manali", 9988001236L, inspectorDTO56);
        RTODTO rtodto57 = new RTODTO(12581, "Goa", "Margao", 8877002347L, inspectorDTO57);
        RTODTO rtodto58 = new RTODTO(12582, "Delhi", "Dwarka", 7766003458L, inspectorDTO58);
        RTODTO rtodto59 = new RTODTO(12583, "Jammu and Kashmir", "Jammu", 6655004569L, inspectorDTO59);
        RTODTO rtodto60 = new RTODTO(12584, "Ladakh", "Kargil", 5544005670L, inspectorDTO60);
        RTODTO rtodto61 = new RTODTO(12585, "Tripura", "Dharmanagar", 9988116781L, inspectorDTO61);
        RTODTO rtodto62 = new RTODTO(12586, "Meghalaya", "Tura", 8877227892L, inspectorDTO62);
        RTODTO rtodto63 = new RTODTO(12587, "Mizoram", "Lunglei", 7766338903L, inspectorDTO63);
        RTODTO rtodto64 = new RTODTO(12588, "Manipur", "Churachandpur", 6655449014L, inspectorDTO64);
        RTODTO rtodto65 = new RTODTO(12589, "Sikkim", "Namchi", 5544330125L, inspectorDTO65);
        RTODTO rtodto66 = new RTODTO(12590, "Nagaland", "Dimapur", 9988001237L, inspectorDTO66);
        RTODTO rtodto67 = new RTODTO(12591, "Puducherry", "Karaikal", 8877002348L, inspectorDTO67);


        RegistrationDTO registrationDTO1 = new RegistrationDTO(7001, 2021, "Car", "Owner1", rtodto1);
        RegistrationDTO registrationDTO2 = new RegistrationDTO(7002, 2022, "Truck", "Owner2", rtodto2);
        RegistrationDTO registrationDTO3 = new RegistrationDTO(7003, 2023, "SUV", "Owner3", rtodto3);
        RegistrationDTO registrationDTO4 = new RegistrationDTO(7004, 2024, "Scooter", "Owner4", rtodto4);
        RegistrationDTO registrationDTO5 = new RegistrationDTO(7005, 2020, "Bike", "Owner5", rtodto5);
        RegistrationDTO registrationDTO6 = new RegistrationDTO(7006, 2021, "Car", "Owner6", rtodto6);
        RegistrationDTO registrationDTO7 = new RegistrationDTO(7007, 2022, "Truck", "Owner7", rtodto7);
        RegistrationDTO registrationDTO8 = new RegistrationDTO(7008, 2023, "SUV", "Owner8", rtodto8);
        RegistrationDTO registrationDTO9 = new RegistrationDTO(7009, 2024, "Scooter", "Owner9", rtodto9);
        RegistrationDTO registrationDTO10 = new RegistrationDTO(7010, 2020, "Bike", "Owner10", rtodto10);
        RegistrationDTO registrationDTO11 = new RegistrationDTO(7011, 2021, "Car", "Owner11", rtodto11);
        RegistrationDTO registrationDTO12 = new RegistrationDTO(7012, 2022, "Truck", "Owner12", rtodto12);
        RegistrationDTO registrationDTO13 = new RegistrationDTO(7013, 2023, "SUV", "Owner13", rtodto13);
        RegistrationDTO registrationDTO14 = new RegistrationDTO(7014, 2024, "Scooter", "Owner14", rtodto14);
        RegistrationDTO registrationDTO15 = new RegistrationDTO(7015, 2020, "Bike", "Owner15", rtodto15);
        RegistrationDTO registrationDTO16 = new RegistrationDTO(7016, 2021, "Car", "Owner16", rtodto16);
        RegistrationDTO registrationDTO17 = new RegistrationDTO(7017, 2022, "Truck", "Owner17", rtodto17);
        RegistrationDTO registrationDTO18 = new RegistrationDTO(7018, 2023, "SUV", "Owner18", rtodto18);
        RegistrationDTO registrationDTO19 = new RegistrationDTO(7019, 2024, "Scooter", "Owner19", rtodto19);
        RegistrationDTO registrationDTO20 = new RegistrationDTO(7020, 2020, "Bike", "Owner20", rtodto20);
        RegistrationDTO registrationDTO21 = new RegistrationDTO(7021, 2021, "Car", "Owner21", rtodto21);
        RegistrationDTO registrationDTO22 = new RegistrationDTO(7022, 2022, "Truck", "Owner22", rtodto22);
        RegistrationDTO registrationDTO23 = new RegistrationDTO(7023, 2023, "SUV", "Owner23", rtodto23);
        RegistrationDTO registrationDTO24 = new RegistrationDTO(7024, 2024, "Scooter", "Owner24", rtodto24);
        RegistrationDTO registrationDTO25 = new RegistrationDTO(7025, 2020, "Bike", "Owner25", rtodto25);
        RegistrationDTO registrationDTO26 = new RegistrationDTO(7026, 2021, "Car", "Owner26", rtodto26);
        RegistrationDTO registrationDTO27 = new RegistrationDTO(7027, 2022, "Truck", "Owner27", rtodto27);
        RegistrationDTO registrationDTO28 = new RegistrationDTO(7028, 2023, "SUV", "Owner28", rtodto28);
        RegistrationDTO registrationDTO29 = new RegistrationDTO(7029, 2024, "Scooter", "Owner29", rtodto29);
        RegistrationDTO registrationDTO30 = new RegistrationDTO(7030, 2020, "Bike", "Owner30", rtodto30);
        RegistrationDTO registrationDTO31 = new RegistrationDTO(7031, 2021, "Car", "Owner31", rtodto31);
        RegistrationDTO registrationDTO32 = new RegistrationDTO(7032, 2022, "Truck", "Owner32", rtodto32);
        RegistrationDTO registrationDTO33 = new RegistrationDTO(7033, 2023, "SUV", "Owner33", rtodto33);
        RegistrationDTO registrationDTO34 = new RegistrationDTO(7034, 2024, "Scooter", "Owner34", rtodto34);
        RegistrationDTO registrationDTO35 = new RegistrationDTO(7035, 2020, "Bike", "Owner35", rtodto35);
        RegistrationDTO registrationDTO36 = new RegistrationDTO(7036, 2021, "Car", "Owner36", rtodto36);
        RegistrationDTO registrationDTO37 = new RegistrationDTO(7037, 2022, "Truck", "Owner37", rtodto37);
        RegistrationDTO registrationDTO38 = new RegistrationDTO(7038, 2023, "SUV", "Owner38", rtodto38);
        RegistrationDTO registrationDTO39 = new RegistrationDTO(7039, 2024, "Scooter", "Owner39", rtodto39);
        RegistrationDTO registrationDTO40 = new RegistrationDTO(7040, 2020, "Bike", "Owner40", rtodto40);
        RegistrationDTO registrationDTO41 = new RegistrationDTO(7041, 2021, "Car", "Owner41", rtodto41);
        RegistrationDTO registrationDTO42 = new RegistrationDTO(7042, 2022, "Truck", "Owner42", rtodto42);
        RegistrationDTO registrationDTO43 = new RegistrationDTO(7043, 2023, "SUV", "Owner43", rtodto43);
        RegistrationDTO registrationDTO44 = new RegistrationDTO(7044, 2024, "Scooter", "Owner44", rtodto44);
        RegistrationDTO registrationDTO45 = new RegistrationDTO(7045, 2020, "Bike", "Owner45", rtodto45);
        RegistrationDTO registrationDTO46 = new RegistrationDTO(7046, 2021, "Car", "Owner46", rtodto46);
        RegistrationDTO registrationDTO47 = new RegistrationDTO(7047, 2022, "Truck", "Owner47", rtodto47);
        RegistrationDTO registrationDTO48 = new RegistrationDTO(7048, 2023, "SUV", "Owner48", rtodto48);
        RegistrationDTO registrationDTO49 = new RegistrationDTO(7049, 2024, "Scooter", "Owner49", rtodto49);
        RegistrationDTO registrationDTO50 = new RegistrationDTO(7050, 2020, "Bike", "Owner50", rtodto50);
        RegistrationDTO registrationDTO51 = new RegistrationDTO(7051, 2021, "Car", "Owner51", rtodto51);
        RegistrationDTO registrationDTO52 = new RegistrationDTO(7052, 2022, "Truck", "Owner52", rtodto52);
        RegistrationDTO registrationDTO53 = new RegistrationDTO(7053, 2023, "SUV", "Owner53", rtodto53);
        RegistrationDTO registrationDTO54 = new RegistrationDTO(7054, 2024, "Scooter", "Owner54", rtodto54);
        RegistrationDTO registrationDTO55 = new RegistrationDTO(7055, 2020, "Bike", "Owner55", rtodto55);
        RegistrationDTO registrationDTO56 = new RegistrationDTO(7056, 2021, "Car", "Owner56", rtodto56);
        RegistrationDTO registrationDTO57 = new RegistrationDTO(7057, 2022, "Truck", "Owner57", rtodto57);
        RegistrationDTO registrationDTO58 = new RegistrationDTO(7058, 2023, "SUV", "Owner58", rtodto58);
        RegistrationDTO registrationDTO59 = new RegistrationDTO(7059, 2024, "Scooter", "Owner59", rtodto59);
        RegistrationDTO registrationDTO60 = new RegistrationDTO(7060, 2020, "Bike", "Owner60", rtodto60);
        RegistrationDTO registrationDTO61 = new RegistrationDTO(7061, 2021, "Car", "Owner61", rtodto61);
        RegistrationDTO registrationDTO62 = new RegistrationDTO(7062, 2022, "Truck", "Owner62", rtodto62);
        RegistrationDTO registrationDTO63 = new RegistrationDTO(7063, 2023, "SUV", "Owner63", rtodto63);
        RegistrationDTO registrationDTO64 = new RegistrationDTO(7064, 2024, "Scooter", "Owner64", rtodto64);
        RegistrationDTO registrationDTO65 = new RegistrationDTO(7065, 2020, "Bike", "Owner65", rtodto65);
        RegistrationDTO registrationDTO66 = new RegistrationDTO(7066, 2021, "Car", "Owner66", rtodto66);
        RegistrationDTO registrationDTO67 = new RegistrationDTO(7067, 2022, "Truck", "Owner67", rtodto67);


        VehicleDTO vehicleDTO1 = new VehicleDTO(1234, "Honda", "Hero", "Petrol", registrationDTO1);
        VehicleDTO vehicleDTO2 = new VehicleDTO(6720, "Maruti", "Suzuki", "Diesel", registrationDTO2);
        VehicleDTO vehicleDTO3 = new VehicleDTO(8745, "Toyota", "Fortuner", "Diesel", registrationDTO3);
        VehicleDTO vehicleDTO4 = new VehicleDTO(5623, "Hyundai", "i20", "Petrol", registrationDTO4);
        VehicleDTO vehicleDTO5 = new VehicleDTO(3845, "Tata", "Nexon", "Electric", registrationDTO5);
        VehicleDTO vehicleDTO6 = new VehicleDTO(9981, "Mahindra", "Scorpio", "Diesel", registrationDTO6);
        VehicleDTO vehicleDTO7 = new VehicleDTO(1023, "Ford", "Figo", "Petrol", registrationDTO7);
        VehicleDTO vehicleDTO8 = new VehicleDTO(4390, "Kia", "Seltos", "Diesel", registrationDTO8);
        VehicleDTO vehicleDTO9 = new VehicleDTO(7781, "Renault", "Kwid", "Petrol", registrationDTO9);
        VehicleDTO vehicleDTO10 = new VehicleDTO(3352, "Volkswagen", "Polo", "Diesel", registrationDTO10);
        VehicleDTO vehicleDTO11 = new VehicleDTO(5621, "Nissan", "Magnite", "Petrol", registrationDTO11);
        VehicleDTO vehicleDTO12 = new VehicleDTO(8840, "Skoda", "Rapid", "Diesel", registrationDTO12);
        VehicleDTO vehicleDTO13 = new VehicleDTO(2291, "Jeep", "Compass", "Diesel", registrationDTO13);
        VehicleDTO vehicleDTO14 = new VehicleDTO(4655, "BMW", "X1", "Petrol", registrationDTO14);
        VehicleDTO vehicleDTO15 = new VehicleDTO(9988, "Mercedes", "GLA", "Diesel", registrationDTO15);
        VehicleDTO vehicleDTO16 = new VehicleDTO(7421, "Audi", "Q3", "Petrol", registrationDTO16);
        VehicleDTO vehicleDTO17 = new VehicleDTO(6710, "MG", "Hector", "Petrol", registrationDTO17);
        VehicleDTO vehicleDTO18 = new VehicleDTO(3155, "Lexus", "RX", "Hybrid", registrationDTO18);
        VehicleDTO vehicleDTO19 = new VehicleDTO(4182, "Volvo", "XC40", "Diesel", registrationDTO19);
        VehicleDTO vehicleDTO20 = new VehicleDTO(9012, "Jaguar", "XE", "Petrol", registrationDTO20);
        VehicleDTO vehicleDTO21 = new VehicleDTO(1177, "Ferrari", "Roma", "Petrol", registrationDTO21);
        VehicleDTO vehicleDTO22 = new VehicleDTO(2288, "Lamborghini", "Huracan", "Petrol", registrationDTO22);
        VehicleDTO vehicleDTO23 = new VehicleDTO(3344, "Porsche", "Cayenne", "Diesel", registrationDTO23);
        VehicleDTO vehicleDTO24 = new VehicleDTO(8899, "Maserati", "Levante", "Petrol", registrationDTO24);
        VehicleDTO vehicleDTO25 = new VehicleDTO(4433, "Mini", "Cooper", "Petrol", registrationDTO25);
        VehicleDTO vehicleDTO26 = new VehicleDTO(5566, "Fiat", "Punto", "Diesel", registrationDTO26);
        VehicleDTO vehicleDTO27 = new VehicleDTO(6677, "Isuzu", "D-Max", "Diesel", registrationDTO27);
        VehicleDTO vehicleDTO28 = new VehicleDTO(7788, "Datsun", "Redi-GO", "Petrol", registrationDTO28);
        VehicleDTO vehicleDTO29 = new VehicleDTO(8890, "Chevrolet", "Cruze", "Diesel", registrationDTO29);
        VehicleDTO vehicleDTO30 = new VehicleDTO(9900, "Peugeot", "2008", "Petrol", registrationDTO30);
        VehicleDTO vehicleDTO31 = new VehicleDTO(1111, "Citroen", "C3", "Petrol", registrationDTO31);
        VehicleDTO vehicleDTO32 = new VehicleDTO(2222, "BYD", "E6", "Electric", registrationDTO32);
        VehicleDTO vehicleDTO33 = new VehicleDTO(3333, "Tesla", "Model 3", "Electric", registrationDTO33);
        VehicleDTO vehicleDTO34 = new VehicleDTO(4444, "Rivian", "R1T", "Electric", registrationDTO34);
        VehicleDTO vehicleDTO35 = new VehicleDTO(5555, "Lucid", "Air", "Electric", registrationDTO35);
        VehicleDTO vehicleDTO36 = new VehicleDTO(6666, "Ola", "S1", "Electric", registrationDTO36);
        VehicleDTO vehicleDTO37 = new VehicleDTO(7777, "Ather", "450X", "Electric", registrationDTO37);
        VehicleDTO vehicleDTO38 = new VehicleDTO(8888, "TVS", "iQube", "Electric", registrationDTO38);
        VehicleDTO vehicleDTO39 = new VehicleDTO(9999, "Bajaj", "Chetak", "Electric", registrationDTO39);
        VehicleDTO vehicleDTO40 = new VehicleDTO(1010, "Yamaha", "FZ", "Petrol", registrationDTO40);
        VehicleDTO vehicleDTO41 = new VehicleDTO(2020, "Royal Enfield", "Classic 350", "Petrol", registrationDTO41);
        VehicleDTO vehicleDTO42 = new VehicleDTO(3030, "Suzuki", "Access", "Petrol", registrationDTO42);
        VehicleDTO vehicleDTO43 = new VehicleDTO(4040, "Hero", "Splendor", "Petrol", registrationDTO43);
        VehicleDTO vehicleDTO44 = new VehicleDTO(5050, "TVS", "Apache", "Petrol", registrationDTO44);
        VehicleDTO vehicleDTO45 = new VehicleDTO(6060, "Bajaj", "Pulsar", "Petrol", registrationDTO45);
        VehicleDTO vehicleDTO46 = new VehicleDTO(7070, "Mahindra", "Thar", "Diesel", registrationDTO46);
        VehicleDTO vehicleDTO47 = new VehicleDTO(8080, "Force", "Gurkha", "Diesel", registrationDTO47);
        VehicleDTO vehicleDTO48 = new VehicleDTO(9090, "Ashok Leyland", "Dost", "Diesel", registrationDTO48);
        VehicleDTO vehicleDTO49 = new VehicleDTO(1122, "Eicher", "Pro 2049", "Diesel", registrationDTO49);
        VehicleDTO vehicleDTO50 = new VehicleDTO(2233, "Tata", "Ace", "Diesel", registrationDTO50);
        VehicleDTO vehicleDTO51 = new VehicleDTO(3344, "Piaggio", "Ape", "Diesel", registrationDTO51);
        VehicleDTO vehicleDTO52 = new VehicleDTO(4455, "Scania", "R-Series", "Diesel", registrationDTO52);
        VehicleDTO vehicleDTO53 = new VehicleDTO(5566, "MAN", "CLA", "Diesel", registrationDTO53);
        VehicleDTO vehicleDTO54 = new VehicleDTO(6677, "BharatBenz", "1217C", "Diesel", registrationDTO54);
        VehicleDTO vehicleDTO55 = new VehicleDTO(7788, "Volvo", "FMX", "Diesel", registrationDTO55);
        VehicleDTO vehicleDTO56 = new VehicleDTO(8899, "Mercedes-Benz", "Actros", "Diesel", registrationDTO56);
        VehicleDTO vehicleDTO57 = new VehicleDTO(9900, "Honda", "City Hybrid", "Hybrid", registrationDTO57);
        VehicleDTO vehicleDTO58 = new VehicleDTO(1011, "Hyundai", "Verna", "Petrol", registrationDTO58);
        VehicleDTO vehicleDTO59 = new VehicleDTO(2022, "Toyota", "Camry Hybrid", "Hybrid", registrationDTO59);
        VehicleDTO vehicleDTO60 = new VehicleDTO(3033, "Skoda", "Slavia", "Petrol", registrationDTO60);
        VehicleDTO vehicleDTO61 = new VehicleDTO(4044, "Maruti", "Ciaz", "Petrol", registrationDTO61);
        VehicleDTO vehicleDTO62 = new VehicleDTO(5055, "Volkswagen", "Virtus", "Petrol", registrationDTO62);
        VehicleDTO vehicleDTO63 = new VehicleDTO(6066, "MG", "Astor", "Petrol", registrationDTO63);
        VehicleDTO vehicleDTO64 = new VehicleDTO(7077, "Kia", "Carens", "Petrol", registrationDTO64);
        VehicleDTO vehicleDTO65 = new VehicleDTO(8088, "Renault", "Triber", "Petrol", registrationDTO65);
        VehicleDTO vehicleDTO66 = new VehicleDTO(9099, "Tata", "Punch", "Petrol", registrationDTO66);
        VehicleDTO vehicleDTO67 = new VehicleDTO(1112, "Mahindra", "XUV700", "Diesel", registrationDTO67);


        MayorDTO mayorDTO1 = new MayorDTO("Ramesh", 50, "Bengaluru", 10, vehicleDTO1);
        MayorDTO mayorDTO2 = new MayorDTO("Suresh", 45, "Chennai", 6, vehicleDTO2);
        MayorDTO mayorDTO3 = new MayorDTO("Mahesh", 52, "Mumbai", 8, vehicleDTO3);
        MayorDTO mayorDTO4 = new MayorDTO("Rajesh", 47, "Delhi", 5, vehicleDTO4);
        MayorDTO mayorDTO5 = new MayorDTO("Ganesh", 54, "Hyderabad", 12, vehicleDTO5);
        MayorDTO mayorDTO6 = new MayorDTO("Ravi", 43, "Ahmedabad", 7, vehicleDTO6);
        MayorDTO mayorDTO7 = new MayorDTO("Satish", 49, "Pune", 9, vehicleDTO7);
        MayorDTO mayorDTO8 = new MayorDTO("Kiran", 44, "Kolkata", 6, vehicleDTO8);
        MayorDTO mayorDTO9 = new MayorDTO("Naresh", 46, "Jaipur", 4, vehicleDTO9);
        MayorDTO mayorDTO10 = new MayorDTO("Dinesh", 48, "Lucknow", 7, vehicleDTO10);
        MayorDTO mayorDTO11 = new MayorDTO("Vijay", 50, "Kanpur", 11, vehicleDTO11);
        MayorDTO mayorDTO12 = new MayorDTO("Anil", 42, "Nagpur", 5, vehicleDTO12);
        MayorDTO mayorDTO13 = new MayorDTO("Sunil", 53, "Indore", 9, vehicleDTO13);
        MayorDTO mayorDTO14 = new MayorDTO("Harish", 51, "Bhopal", 8, vehicleDTO14);
        MayorDTO mayorDTO15 = new MayorDTO("Deepak", 45, "Patna", 6, vehicleDTO15);
        MayorDTO mayorDTO16 = new MayorDTO("Manoj", 46, "Vadodara", 7, vehicleDTO16);
        MayorDTO mayorDTO17 = new MayorDTO("Ajay", 50, "Ludhiana", 10, vehicleDTO17);
        MayorDTO mayorDTO18 = new MayorDTO("Kamal", 52, "Agra", 9, vehicleDTO18);
        MayorDTO mayorDTO19 = new MayorDTO("Yogesh", 47, "Nashik", 5, vehicleDTO19);
        MayorDTO mayorDTO20 = new MayorDTO("Bhavesh", 44, "Faridabad", 4, vehicleDTO20);
        MayorDTO mayorDTO21 = new MayorDTO("Jitendra", 49, "Meerut", 6, vehicleDTO21);
        MayorDTO mayorDTO22 = new MayorDTO("Umesh", 43, "Rajkot", 5, vehicleDTO22);
        MayorDTO mayorDTO23 = new MayorDTO("Nilesh", 55, "Kalyan", 12, vehicleDTO23);
        MayorDTO mayorDTO24 = new MayorDTO("Pankaj", 48, "Vasai", 7, vehicleDTO24);
        MayorDTO mayorDTO25 = new MayorDTO("Ashok", 50, "Varanasi", 8, vehicleDTO25);
        MayorDTO mayorDTO26 = new MayorDTO("Prakash", 41, "Srinagar", 3, vehicleDTO26);
        MayorDTO mayorDTO27 = new MayorDTO("Naveen", 53, "Aurangabad", 9, vehicleDTO27);
        MayorDTO mayorDTO28 = new MayorDTO("Sharad", 47, "Dhanbad", 5, vehicleDTO28);
        MayorDTO mayorDTO29 = new MayorDTO("Rajiv", 46, "Amritsar", 6, vehicleDTO29);
        MayorDTO mayorDTO30 = new MayorDTO("Prem", 45, "Allahabad", 7, vehicleDTO30);
        MayorDTO mayorDTO31 = new MayorDTO("Chandan", 49, "Jabalpur", 8, vehicleDTO31);
        MayorDTO mayorDTO32 = new MayorDTO("Arvind", 52, "Gwalior", 9, vehicleDTO32);
        MayorDTO mayorDTO33 = new MayorDTO("Sanjay", 44, "Vijayawada", 6, vehicleDTO33);
        MayorDTO mayorDTO34 = new MayorDTO("Raghu", 50, "Madurai", 7, vehicleDTO34);
        MayorDTO mayorDTO35 = new MayorDTO("Suraj", 46, "Raipur", 6, vehicleDTO35);
        MayorDTO mayorDTO36 = new MayorDTO("Lokesh", 48, "Kota", 7, vehicleDTO36);
        MayorDTO mayorDTO37 = new MayorDTO("Vinay", 53, "Chandrapur", 8, vehicleDTO37);
        MayorDTO mayorDTO38 = new MayorDTO("Hemant", 45, "Bilaspur", 6, vehicleDTO38);
        MayorDTO mayorDTO39 = new MayorDTO("Abhishek", 43, "Thane", 5, vehicleDTO39);
        MayorDTO mayorDTO40 = new MayorDTO("Tejas", 50, "Noida", 7, vehicleDTO40);
        MayorDTO mayorDTO41 = new MayorDTO("Akshay", 47, "Gurgaon", 8, vehicleDTO41);
        MayorDTO mayorDTO42 = new MayorDTO("Kunal", 49, "Howrah", 9, vehicleDTO42);
        MayorDTO mayorDTO43 = new MayorDTO("Omkar", 51, "Ranchi", 10, vehicleDTO43);
        MayorDTO mayorDTO44 = new MayorDTO("Rakesh", 46, "Asansol", 5, vehicleDTO44);
        MayorDTO mayorDTO45 = new MayorDTO("Siddharth", 48, "Jamshedpur", 6, vehicleDTO45);
        MayorDTO mayorDTO46 = new MayorDTO("Amit", 52, "Hubli", 9, vehicleDTO46);
        MayorDTO mayorDTO47 = new MayorDTO("Tushar", 45, "Solapur", 7, vehicleDTO47);
        MayorDTO mayorDTO48 = new MayorDTO("Dev", 53, "Tiruppur", 8, vehicleDTO48);
        MayorDTO mayorDTO49 = new MayorDTO("Girish", 44, "Amravati", 6, vehicleDTO49);
        MayorDTO mayorDTO50 = new MayorDTO("Nikhil", 49, "Mysuru", 7, vehicleDTO50);
        MayorDTO mayorDTO51 = new MayorDTO("Swapnil", 50, "Salem", 6, vehicleDTO51);
        MayorDTO mayorDTO52 = new MayorDTO("Vikas", 47, "Tirunelveli", 5, vehicleDTO52);
        MayorDTO mayorDTO53 = new MayorDTO("Rahul", 46, "Udaipur", 6, vehicleDTO53);
        MayorDTO mayorDTO54 = new MayorDTO("Devendra", 48, "Malegaon", 7, vehicleDTO54);
        MayorDTO mayorDTO55 = new MayorDTO("Chetan", 49, "Guntur", 8, vehicleDTO55);
        MayorDTO mayorDTO56 = new MayorDTO("Shivam", 45, "Nanded", 6, vehicleDTO56);
        MayorDTO mayorDTO57 = new MayorDTO("Aditya", 44, "Ajmer", 5, vehicleDTO57);
        MayorDTO mayorDTO58 = new MayorDTO("Yash", 46, "Kolhapur", 6, vehicleDTO58);
        MayorDTO mayorDTO59 = new MayorDTO("Parth", 47, "Bokaro", 7, vehicleDTO59);
        MayorDTO mayorDTO60 = new MayorDTO("Harshal", 52, "Jhansi", 9, vehicleDTO60);
        MayorDTO mayorDTO61 = new MayorDTO("Nirav", 50, "Panipat", 8, vehicleDTO61);
        MayorDTO mayorDTO62 = new MayorDTO("Alok", 48, "Loni", 7, vehicleDTO62);
        MayorDTO mayorDTO63 = new MayorDTO("Neeraj", 46, "Shillong", 6, vehicleDTO63);
        MayorDTO mayorDTO64 = new MayorDTO("Ishaan", 49, "Sangli", 7, vehicleDTO64);
        MayorDTO mayorDTO65 = new MayorDTO("Tanmay", 45, "Nellore", 5, vehicleDTO65);
        MayorDTO mayorDTO66 = new MayorDTO("Mayank", 43, "Belgaum", 6, vehicleDTO66);
        MayorDTO mayorDTO67 = new MayorDTO("Harsh", 47, "Jalandhar", 7, vehicleDTO67);


        InformationDTO informationDTO1 = new InformationDTO("Wikipedia", "Pdf", "Photosynthesis", 2016, mayorDTO1);
        InformationDTO informationDTO2 = new InformationDTO("Britannica", "Article", "Newton's Laws", 2017, mayorDTO2);
        InformationDTO informationDTO3 = new InformationDTO("ScienceDaily", "Web", "Climate Change", 2018, mayorDTO3);
        InformationDTO informationDTO4 = new InformationDTO("National Geographic", "Magazine", "Volcanoes", 2019, mayorDTO4);
        InformationDTO informationDTO5 = new InformationDTO("NASA", "Report", "Mars Exploration", 2020, mayorDTO5);
        InformationDTO informationDTO6 = new InformationDTO("Nature", "Journal", "Quantum Physics", 2015, mayorDTO6);
        InformationDTO informationDTO7 = new InformationDTO("Google Scholar", "Abstract", "AI Research", 2021, mayorDTO7);
        InformationDTO informationDTO8 = new InformationDTO("JSTOR", "Paper", "Ancient Civilizations", 2013, mayorDTO8);
        InformationDTO informationDTO9 = new InformationDTO("Springer", "Book", "Genetic Engineering", 2022, mayorDTO9);
        InformationDTO informationDTO10 = new InformationDTO("IEEE", "Conference", "Robotics", 2023, mayorDTO10);
        InformationDTO informationDTO11 = new InformationDTO("Wikipedia", "Pdf", "Algebra", 2014, mayorDTO11);
        InformationDTO informationDTO12 = new InformationDTO("Coursera", "Video", "Data Science", 2022, mayorDTO12);
        InformationDTO informationDTO13 = new InformationDTO("edX", "Course", "Microbiology", 2017, mayorDTO13);
        InformationDTO informationDTO14 = new InformationDTO("Khan Academy", "Slides", "Calculus", 2016, mayorDTO14);
        InformationDTO informationDTO15 = new InformationDTO("MIT OCW", "Lecture Notes", "Physics", 2019, mayorDTO15);
        InformationDTO informationDTO16 = new InformationDTO("YouTube", "Video", "Organic Chemistry", 2020, mayorDTO16);
        InformationDTO informationDTO17 = new InformationDTO("TED", "Talk", "Innovation", 2021, mayorDTO17);
        InformationDTO informationDTO18 = new InformationDTO("Reddit", "Post", "Neuroscience", 2018, mayorDTO18);
        InformationDTO informationDTO19 = new InformationDTO("StackOverflow", "Answer", "Java Programming", 2015, mayorDTO19);
        InformationDTO informationDTO20 = new InformationDTO("Quora", "Thread", "Philosophy", 2014, mayorDTO20);
        InformationDTO informationDTO21 = new InformationDTO("ResearchGate", "Study", "Biotech", 2023, mayorDTO21);
        InformationDTO informationDTO22 = new InformationDTO("LinkedIn", "SlideShare", "Startup Culture", 2020, mayorDTO22);
        InformationDTO informationDTO23 = new InformationDTO("Academia.edu", "Paper", "Machine Learning", 2019, mayorDTO23);
        InformationDTO informationDTO24 = new InformationDTO("The Hindu", "Article", "Indian Economy", 2018, mayorDTO24);
        InformationDTO informationDTO25 = new InformationDTO("BBC", "News", "Space Missions", 2017, mayorDTO25);
        InformationDTO informationDTO26 = new InformationDTO("NDTV", "Interview", "Election Analysis", 2021, mayorDTO26);
        InformationDTO informationDTO27 = new InformationDTO("TOI", "Report", "Urban Development", 2016, mayorDTO27);
        InformationDTO informationDTO28 = new InformationDTO("Hindustan Times", "Feature", "Smart Cities", 2022, mayorDTO28);
        InformationDTO informationDTO29 = new InformationDTO("Deccan Herald", "Column", "Social Reforms", 2023, mayorDTO29);
        InformationDTO informationDTO30 = new InformationDTO("The Wire", "Debate", "Digital Privacy", 2015, mayorDTO30);
        InformationDTO informationDTO31 = new InformationDTO("Firstpost", "Article", "Cyber Security", 2017, mayorDTO31);
        InformationDTO informationDTO32 = new InformationDTO("Medium", "Post", "UI/UX Trends", 2019, mayorDTO32);
        InformationDTO informationDTO33 = new InformationDTO("Smashing Magazine", "Guide", "Web Design", 2020, mayorDTO33);
        InformationDTO informationDTO34 = new InformationDTO("MDN", "Docs", "HTML5", 2016, mayorDTO34);
        InformationDTO informationDTO35 = new InformationDTO("CSS Tricks", "Tutorial", "Responsive Layout", 2021, mayorDTO35);
        InformationDTO informationDTO36 = new InformationDTO("Dev.to", "Post", "Docker", 2022, mayorDTO36);
        InformationDTO informationDTO37 = new InformationDTO("Hashnode", "Blog", "JavaScript", 2023, mayorDTO37);
        InformationDTO informationDTO38 = new InformationDTO("LogRocket", "Case Study", "React Performance", 2020, mayorDTO38);
        InformationDTO informationDTO39 = new InformationDTO("FreeCodeCamp", "Lesson", "Python Basics", 2019, mayorDTO39);
        InformationDTO informationDTO40 = new InformationDTO("GeeksForGeeks", "Explanation", "DSA", 2018, mayorDTO40);
        InformationDTO informationDTO41 = new InformationDTO("Hackerrank", "Challenge", "Coding Practice", 2021, mayorDTO41);
        InformationDTO informationDTO42 = new InformationDTO("Leetcode", "Problem", "Dynamic Programming", 2022, mayorDTO42);
        InformationDTO informationDTO43 = new InformationDTO("Codeforces", "Contest", "Algorithms", 2023, mayorDTO43);
        InformationDTO informationDTO44 = new InformationDTO("TopCoder", "Problem", "Combinatorics", 2020, mayorDTO44);
        InformationDTO informationDTO45 = new InformationDTO("AtCoder", "Practice", "Graphs", 2021, mayorDTO45);
        InformationDTO informationDTO46 = new InformationDTO("SPOJ", "Judge", "Maths", 2019, mayorDTO46);
        InformationDTO informationDTO47 = new InformationDTO("Project Euler", "Puzzle", "Logic", 2017, mayorDTO47);
        InformationDTO informationDTO48 = new InformationDTO("Kaggle", "Notebook", "Data Cleaning", 2018, mayorDTO48);
        InformationDTO informationDTO49 = new InformationDTO("GitHub", "Repo", "Open Source", 2022, mayorDTO49);
        InformationDTO informationDTO50 = new InformationDTO("Bitbucket", "Project", "CI/CD", 2021, mayorDTO50);
        InformationDTO informationDTO51 = new InformationDTO("GitLab", "Guide", "Version Control", 2018, mayorDTO51);
        InformationDTO informationDTO52 = new InformationDTO("Azure Docs", "Manual", "Cloud Architecture", 2020, mayorDTO52);
        InformationDTO informationDTO53 = new InformationDTO("AWS Whitepaper", "Pdf", "Serverless", 2023, mayorDTO53);
        InformationDTO informationDTO54 = new InformationDTO("Google Cloud", "eBook", "Kubernetes", 2021, mayorDTO54);
        InformationDTO informationDTO55 = new InformationDTO("Oracle Docs", "Reference", "SQL", 2019, mayorDTO55);
        InformationDTO informationDTO56 = new InformationDTO("W3Schools", "Lesson", "Web Fundamentals", 2020, mayorDTO56);
        InformationDTO informationDTO57 = new InformationDTO("TutorialsPoint", "Tutorial", "Java", 2018, mayorDTO57);
        InformationDTO informationDTO58 = new InformationDTO("Programiz", "Interactive", "Python", 2021, mayorDTO58);
        InformationDTO informationDTO59 = new InformationDTO("Sciencedirect", "Research", "Medical Imaging", 2022, mayorDTO59);
        InformationDTO informationDTO60 = new InformationDTO("Harvard Gazette", "Feature", "Education", 2017, mayorDTO60);
        InformationDTO informationDTO61 = new InformationDTO("Oxford Journals", "Research", "Sociology", 2019, mayorDTO61);
        InformationDTO informationDTO62 = new InformationDTO("Cambridge Core", "Paper", "History", 2020, mayorDTO62);
        InformationDTO informationDTO63 = new InformationDTO("PubMed", "Medical", "Vaccination", 2023, mayorDTO63);
        InformationDTO informationDTO64 = new InformationDTO("Lancet", "Study", "Pandemic Analysis", 2021, mayorDTO64);
        InformationDTO informationDTO65 = new InformationDTO("WHO", "Bulletin", "Global Health", 2022, mayorDTO65);
        InformationDTO informationDTO66 = new InformationDTO("UNESCO", "Document", "Literacy Reports", 2018, mayorDTO66);
        InformationDTO informationDTO67 = new InformationDTO("UNDP", "Insight", "Sustainable Development", 2020, mayorDTO67);


        CityDTO cityDTO1 = new CityDTO("Bengaluru", "Karnataka", 7, "Siddarammaiah", informationDTO1);
        CityDTO cityDTO2 = new CityDTO("Chennai", "Tamil Nadu", 5, "M.K. Stalin", informationDTO2);
        CityDTO cityDTO3 = new CityDTO("Mumbai", "Maharashtra", 8, "Eknath Shinde", informationDTO3);
        CityDTO cityDTO4 = new CityDTO("Delhi", "Delhi", 10, "Arvind Kejriwal", informationDTO4);
        CityDTO cityDTO5 = new CityDTO("Kolkata", "West Bengal", 6, "Mamata Banerjee", informationDTO5);
        CityDTO cityDTO6 = new CityDTO("Hyderabad", "Telangana", 9, "Revanth Reddy", informationDTO6);
        CityDTO cityDTO7 = new CityDTO("Ahmedabad", "Gujarat", 8, "Bhupendra Patel", informationDTO7);
        CityDTO cityDTO8 = new CityDTO("Pune", "Maharashtra", 7, "Ajit Pawar", informationDTO8);
        CityDTO cityDTO9 = new CityDTO("Jaipur", "Rajasthan", 6, "Bhajan Lal Sharma", informationDTO9);
        CityDTO cityDTO10 = new CityDTO("Lucknow", "Uttar Pradesh", 10, "Yogi Adityanath", informationDTO10);
        CityDTO cityDTO11 = new CityDTO("Indore", "Madhya Pradesh", 5, "Mohan Yadav", informationDTO11);
        CityDTO cityDTO12 = new CityDTO("Nagpur", "Maharashtra", 7, "Devendra Fadnavis", informationDTO12);
        CityDTO cityDTO13 = new CityDTO("Visakhapatnam", "Andhra Pradesh", 6, "Chandrababu Naidu", informationDTO13);
        CityDTO cityDTO14 = new CityDTO("Thiruvananthapuram", "Kerala", 8, "Pinarayi Vijayan", informationDTO14);
        CityDTO cityDTO15 = new CityDTO("Bhopal", "Madhya Pradesh", 5, "Mohan Yadav", informationDTO15);
        CityDTO cityDTO16 = new CityDTO("Patna", "Bihar", 6, "Nitish Kumar", informationDTO16);
        CityDTO cityDTO17 = new CityDTO("Ranchi", "Jharkhand", 7, "Hemant Soren", informationDTO17);
        CityDTO cityDTO18 = new CityDTO("Raipur", "Chhattisgarh", 5, "Vishnu Deo Sai", informationDTO18);
        CityDTO cityDTO19 = new CityDTO("Dehradun", "Uttarakhand", 4, "Pushkar Dhami", informationDTO19);
        CityDTO cityDTO20 = new CityDTO("Panaji", "Goa", 6, "Pramod Sawant", informationDTO20);
        CityDTO cityDTO21 = new CityDTO("Shimla", "Himachal Pradesh", 3, "Sukhvinder Sukhu", informationDTO21);
        CityDTO cityDTO22 = new CityDTO("Itanagar", "Arunachal Pradesh", 5, "Pema Khandu", informationDTO22);
        CityDTO cityDTO23 = new CityDTO("Dispur", "Assam", 8, "Himanta Biswa Sarma", informationDTO23);
        CityDTO cityDTO24 = new CityDTO("Gangtok", "Sikkim", 2, "Prem Singh Tamang", informationDTO24);
        CityDTO cityDTO25 = new CityDTO("Kohima", "Nagaland", 4, "Neiphiu Rio", informationDTO25);
        CityDTO cityDTO26 = new CityDTO("Aizawl", "Mizoram", 4, "Lalduhoma", informationDTO26);
        CityDTO cityDTO27 = new CityDTO("Imphal", "Manipur", 5, "N. Biren Singh", informationDTO27);
        CityDTO cityDTO28 = new CityDTO("Shillong", "Meghalaya", 4, "Conrad Sangma", informationDTO28);
        CityDTO cityDTO29 = new CityDTO("Agartala", "Tripura", 4, "Manik Saha", informationDTO29);
        CityDTO cityDTO30 = new CityDTO("Port Blair", "Andaman & Nicobar", 3, "Admiral D.K. Joshi", informationDTO30);
        CityDTO cityDTO31 = new CityDTO("Chandigarh", "Punjab", 6, "Bhagwant Mann", informationDTO31);
        CityDTO cityDTO32 = new CityDTO("Gandhinagar", "Gujarat", 7, "Bhupendra Patel", informationDTO32);
        CityDTO cityDTO33 = new CityDTO("Daman", "Daman & Diu", 3, "Prajapati Trivedi", informationDTO33);
        CityDTO cityDTO34 = new CityDTO("Silvassa", "Dadra & Nagar Haveli", 3, "Mishra Govind", informationDTO34);
        CityDTO cityDTO35 = new CityDTO("Srinagar", "Jammu & Kashmir", 7, "Manoj Sinha", informationDTO35);
        CityDTO cityDTO36 = new CityDTO("Leh", "Ladakh", 3, "R.K. Mathur", informationDTO36);
        CityDTO cityDTO37 = new CityDTO("Faridabad", "Haryana", 5, "Nayab Singh", informationDTO37);
        CityDTO cityDTO38 = new CityDTO("Noida", "Uttar Pradesh", 6, "Yogi Adityanath", informationDTO38);
        CityDTO cityDTO39 = new CityDTO("Varanasi", "Uttar Pradesh", 7, "Yogi Adityanath", informationDTO39);
        CityDTO cityDTO40 = new CityDTO("Surat", "Gujarat", 8, "Bhupendra Patel", informationDTO40);
        CityDTO cityDTO41 = new CityDTO("Vadodara", "Gujarat", 7, "Bhupendra Patel", informationDTO41);
        CityDTO cityDTO42 = new CityDTO("Amritsar", "Punjab", 6, "Bhagwant Mann", informationDTO42);
        CityDTO cityDTO43 = new CityDTO("Jalandhar", "Punjab", 5, "Bhagwant Mann", informationDTO43);
        CityDTO cityDTO44 = new CityDTO("Kanpur", "Uttar Pradesh", 6, "Yogi Adityanath", informationDTO44);
        CityDTO cityDTO45 = new CityDTO("Gwalior", "Madhya Pradesh", 5, "Mohan Yadav", informationDTO45);
        CityDTO cityDTO46 = new CityDTO("Udaipur", "Rajasthan", 4, "Bhajan Lal Sharma", informationDTO46);
        CityDTO cityDTO47 = new CityDTO("Aligarh", "Uttar Pradesh", 4, "Yogi Adityanath", informationDTO47);
        CityDTO cityDTO48 = new CityDTO("Ajmer", "Rajasthan", 5, "Bhajan Lal Sharma", informationDTO48);
        CityDTO cityDTO49 = new CityDTO("Nashik", "Maharashtra", 6, "Eknath Shinde", informationDTO49);
        CityDTO cityDTO50 = new CityDTO("Aurangabad", "Maharashtra", 6, "Eknath Shinde", informationDTO50);
        CityDTO cityDTO51 = new CityDTO("Hubli", "Karnataka", 4, "Siddarammaiah", informationDTO51);
        CityDTO cityDTO52 = new CityDTO("Belgaum", "Karnataka", 5, "Siddarammaiah", informationDTO52);
        CityDTO cityDTO53 = new CityDTO("Dharwad", "Karnataka", 3, "Siddarammaiah", informationDTO53);
        CityDTO cityDTO54 = new CityDTO("Tirupati", "Andhra Pradesh", 5, "Chandrababu Naidu", informationDTO54);
        CityDTO cityDTO55 = new CityDTO("Guntur", "Andhra Pradesh", 6, "Chandrababu Naidu", informationDTO55);
        CityDTO cityDTO56 = new CityDTO("Warangal", "Telangana", 4, "Revanth Reddy", informationDTO56);
        CityDTO cityDTO57 = new CityDTO("Nizamabad", "Telangana", 4, "Revanth Reddy", informationDTO57);
        CityDTO cityDTO58 = new CityDTO("Rajkot", "Gujarat", 6, "Bhupendra Patel", informationDTO58);
        CityDTO cityDTO59 = new CityDTO("Bhavnagar", "Gujarat", 5, "Bhupendra Patel", informationDTO59);
        CityDTO cityDTO60 = new CityDTO("Bilaspur", "Chhattisgarh", 4, "Vishnu Deo Sai", informationDTO60);
        CityDTO cityDTO61 = new CityDTO("Durgapur", "West Bengal", 5, "Mamata Banerjee", informationDTO61);
        CityDTO cityDTO62 = new CityDTO("Howrah", "West Bengal", 6, "Mamata Banerjee", informationDTO62);
        CityDTO cityDTO63 = new CityDTO("Asansol", "West Bengal", 5, "Mamata Banerjee", informationDTO63);
        CityDTO cityDTO64 = new CityDTO("Bokaro", "Jharkhand", 4, "Hemant Soren", informationDTO64);
        CityDTO cityDTO65 = new CityDTO("Jamshedpur", "Jharkhand", 6, "Hemant Soren", informationDTO65);
        CityDTO cityDTO66 = new CityDTO("Dhanbad", "Jharkhand", 5, "Hemant Soren", informationDTO66);
        CityDTO cityDTO67 = new CityDTO("Muzaffarpur", "Bihar", 4, "Nitish Kumar", informationDTO67);

        AddressDTO addressDTO1 = new AddressDTO("Church Street", "MG Road", "Bengaluru", 12586, cityDTO1);
        AddressDTO addressDTO2 = new AddressDTO("Anna Salai", "T Nagar", "Chennai", 22001, cityDTO2);
        AddressDTO addressDTO3 = new AddressDTO("Marine Drive", "Colaba", "Mumbai", 33045, cityDTO3);
        AddressDTO addressDTO4 = new AddressDTO("Rajpath", "Chanakyapuri", "Delhi", 41011, cityDTO4);
        AddressDTO addressDTO5 = new AddressDTO("Park Street", "Salt Lake", "Kolkata", 52009, cityDTO5);
        AddressDTO addressDTO6 = new AddressDTO("Banjara Hills", "Hitech City", "Hyderabad", 64000, cityDTO6);
        AddressDTO addressDTO7 = new AddressDTO("C.G. Road", "Navrangpura", "Ahmedabad", 75012, cityDTO7);
        AddressDTO addressDTO8 = new AddressDTO("FC Road", "Shivaji Nagar", "Pune", 86023, cityDTO8);
        AddressDTO addressDTO9 = new AddressDTO("MI Road", "Malviya Nagar", "Jaipur", 97005, cityDTO9);
        AddressDTO addressDTO10 = new AddressDTO("Hazratganj", "Aliganj", "Lucknow", 10981, cityDTO10);
        AddressDTO addressDTO11 = new AddressDTO("Rajwada", "MG Road", "Indore", 11021, cityDTO11);
        AddressDTO addressDTO12 = new AddressDTO("Sitabuldi", "Dharampeth", "Nagpur", 12044, cityDTO12);
        AddressDTO addressDTO13 = new AddressDTO("RK Beach Road", "MVP Colony", "Visakhapatnam", 13007, cityDTO13);
        AddressDTO addressDTO14 = new AddressDTO("MG Road", "Pattom", "Thiruvananthapuram", 14019, cityDTO14);
        AddressDTO addressDTO15 = new AddressDTO("New Market", "TT Nagar", "Bhopal", 15065, cityDTO15);
        AddressDTO addressDTO16 = new AddressDTO("Fraser Road", "Rajendra Nagar", "Patna", 16001, cityDTO16);
        AddressDTO addressDTO17 = new AddressDTO("Main Road", "Hinoo", "Ranchi", 17080, cityDTO17);
        AddressDTO addressDTO18 = new AddressDTO("GE Road", "Devendra Nagar", "Raipur", 18014, cityDTO18);
        AddressDTO addressDTO19 = new AddressDTO("Rajpur Road", "Ballupur", "Dehradun", 19073, cityDTO19);
        AddressDTO addressDTO20 = new AddressDTO("Church Road", "Panjim Market", "Panaji", 20090, cityDTO20);
        AddressDTO addressDTO21 = new AddressDTO("The Mall", "Lakkar Bazar", "Shimla", 21022, cityDTO21);
        AddressDTO addressDTO22 = new AddressDTO("Ganga Market", "VIP Road", "Itanagar", 22013, cityDTO22);
        AddressDTO addressDTO23 = new AddressDTO("GS Road", "Paltan Bazaar", "Dispur", 23088, cityDTO23);
        AddressDTO addressDTO24 = new AddressDTO("MG Marg", "Deorali", "Gangtok", 24064, cityDTO24);
        AddressDTO addressDTO25 = new AddressDTO("Main Bazaar", "High School", "Kohima", 25045, cityDTO25);
        AddressDTO addressDTO26 = new AddressDTO("Zarkawt", "Bawngkawn", "Aizawl", 26014, cityDTO26);
        AddressDTO addressDTO27 = new AddressDTO("Thangal Bazar", "Lamphelpat", "Imphal", 27027, cityDTO27);
        AddressDTO addressDTO28 = new AddressDTO("Police Bazar", "Laitumkhrah", "Shillong", 28066, cityDTO28);
        AddressDTO addressDTO29 = new AddressDTO("Melarmath", "Kunjaban", "Agartala", 29012, cityDTO29);
        AddressDTO addressDTO30 = new AddressDTO("Aberdeen Bazar", "Phoenix Bay", "Port Blair", 30011, cityDTO30);
        AddressDTO addressDTO31 = new AddressDTO("Sector 17", "Manimajra", "Chandigarh", 31051, cityDTO31);
        AddressDTO addressDTO32 = new AddressDTO("Sector 11", "Infocity", "Gandhinagar", 32077, cityDTO32);
        AddressDTO addressDTO33 = new AddressDTO("Nani Daman", "Jetty", "Daman", 33008, cityDTO33);
        AddressDTO addressDTO34 = new AddressDTO("Tokarkhada", "Vanganga", "Silvassa", 34084, cityDTO34);
        AddressDTO addressDTO35 = new AddressDTO("Lal Chowk", "Rajbagh", "Srinagar", 35040, cityDTO35);
        AddressDTO addressDTO36 = new AddressDTO("Choglamsar", "Skalzangling", "Leh", 36039, cityDTO36);
        AddressDTO addressDTO37 = new AddressDTO("NIT", "Sector 15", "Faridabad", 37021, cityDTO37);
        AddressDTO addressDTO38 = new AddressDTO("Sector 18", "Atta Market", "Noida", 38041, cityDTO38);
        AddressDTO addressDTO39 = new AddressDTO("Godowlia", "Dashashwamedh", "Varanasi", 39017, cityDTO39);
        AddressDTO addressDTO40 = new AddressDTO("Ring Road", "Adajan", "Surat", 40005, cityDTO40);
        AddressDTO addressDTO41 = new AddressDTO("Alkapuri", "Sayajigunj", "Vadodara", 41001, cityDTO41);
        AddressDTO addressDTO42 = new AddressDTO("Lawrence Road", "GT Road", "Amritsar", 42023, cityDTO42);
        AddressDTO addressDTO43 = new AddressDTO("Ladowali Road", "Model Town", "Jalandhar", 43066, cityDTO43);
        AddressDTO addressDTO44 = new AddressDTO("Mall Road", "Swaroop Nagar", "Kanpur", 44077, cityDTO44);
        AddressDTO addressDTO45 = new AddressDTO("Jayendra Ganj", "Morar", "Gwalior", 45038, cityDTO45);
        AddressDTO addressDTO46 = new AddressDTO("Chetak Circle", "Udaipur City", "Udaipur", 46000, cityDTO46);
        AddressDTO addressDTO47 = new AddressDTO("Center Point", "Ramghat Road", "Aligarh", 47012, cityDTO47);
        AddressDTO addressDTO48 = new AddressDTO("Naya Bazar", "Kaiserganj", "Ajmer", 48006, cityDTO48);
        AddressDTO addressDTO49 = new AddressDTO("College Road", "Panchavati", "Nashik", 49001, cityDTO49);
        AddressDTO addressDTO50 = new AddressDTO("CIDCO", "Kranti Chowk", "Aurangabad", 50043, cityDTO50);
        AddressDTO addressDTO51 = new AddressDTO("Koppikar Road", "Deshpande Nagar", "Hubli", 51022, cityDTO51);
        AddressDTO addressDTO52 = new AddressDTO("College Road", "Tilakwadi", "Belgaum", 52011, cityDTO52);
        AddressDTO addressDTO53 = new AddressDTO("Subhash Road", "Malamaruti", "Dharwad", 53018, cityDTO53);
        AddressDTO addressDTO54 = new AddressDTO("Kapilatheertham Road", "KT Road", "Tirupati", 54026, cityDTO54);
        AddressDTO addressDTO55 = new AddressDTO("Arundelpet", "Brodipet", "Guntur", 55005, cityDTO55);
        AddressDTO addressDTO56 = new AddressDTO("Kakatiya Road", "Subedari", "Warangal", 56067, cityDTO56);
        AddressDTO addressDTO57 = new AddressDTO("Bodhan Road", "Gandhi Chowk", "Nizamabad", 57034, cityDTO57);
        AddressDTO addressDTO58 = new AddressDTO("Kalawad Road", "Raiya Circle", "Rajkot", 58044, cityDTO58);
        AddressDTO addressDTO59 = new AddressDTO("Ghogha Circle", "Panwadi", "Bhavnagar", 59027, cityDTO59);
        AddressDTO addressDTO60 = new AddressDTO("Link Road", "Telibandha", "Bilaspur", 60013, cityDTO60);
        AddressDTO addressDTO61 = new AddressDTO("Steel Township", "Benachity", "Durgapur", 61066, cityDTO61);
        AddressDTO addressDTO62 = new AddressDTO("Howrah Bridge Road", "Kadamtala", "Howrah", 62035, cityDTO62);
        AddressDTO addressDTO63 = new AddressDTO("Burnpur Road", "Hutton Road", "Asansol", 63001, cityDTO63);
        AddressDTO addressDTO64 = new AddressDTO("Main Road", "Sector 4", "Bokaro", 64000, cityDTO64);
        AddressDTO addressDTO65 = new AddressDTO("Bistupur", "Sakchi", "Jamshedpur", 65042, cityDTO65);
        AddressDTO addressDTO66 = new AddressDTO("Bank More", "Bartand", "Dhanbad", 66019, cityDTO66);
        AddressDTO addressDTO67 = new AddressDTO("Maripur", "Company Bagh", "Muzaffarpur", 67087, cityDTO67);


        DetailsDTO detailsDTO1 = new DetailsDTO("Supriya", "Duplex", 15, true, addressDTO1);
        DetailsDTO detailsDTO2 = new DetailsDTO("Ravi", "Apartment", 12, false, addressDTO2);
        DetailsDTO detailsDTO3 = new DetailsDTO("Meena", "Villa", 10, true, addressDTO3);
        DetailsDTO detailsDTO4 = new DetailsDTO("Kiran", "Studio", 8, false, addressDTO4);
        DetailsDTO detailsDTO5 = new DetailsDTO("Arjun", "Penthouse", 18, true, addressDTO5);
        DetailsDTO detailsDTO6 = new DetailsDTO("Pooja", "Flat", 7, false, addressDTO6);
        DetailsDTO detailsDTO7 = new DetailsDTO("Rahul", "Bungalow", 20, true, addressDTO7);
        DetailsDTO detailsDTO8 = new DetailsDTO("Sneha", "Row House", 6, false, addressDTO8);
        DetailsDTO detailsDTO9 = new DetailsDTO("Nikhil", "Condo", 11, true, addressDTO9);
        DetailsDTO detailsDTO10 = new DetailsDTO("Divya", "Cottage", 9, false, addressDTO10);
        DetailsDTO detailsDTO11 = new DetailsDTO("Ankit", "Mansion", 14, true, addressDTO11);
        DetailsDTO detailsDTO12 = new DetailsDTO("Reshma", "Shared Room", 5, false, addressDTO12);
        DetailsDTO detailsDTO13 = new DetailsDTO("Manoj", "Independent House", 13, true, addressDTO13);
        DetailsDTO detailsDTO14 = new DetailsDTO("Deepa", "Service Apartment", 16, false, addressDTO14);
        DetailsDTO detailsDTO15 = new DetailsDTO("Gaurav", "Luxury Villa", 17, true, addressDTO15);
        DetailsDTO detailsDTO16 = new DetailsDTO("Lakshmi", "Rented Flat", 4, false, addressDTO16);
        DetailsDTO detailsDTO17 = new DetailsDTO("Aman", "PG", 3, false, addressDTO17);
        DetailsDTO detailsDTO18 = new DetailsDTO("Sanjana", "Farmhouse", 25, true, addressDTO18);
        DetailsDTO detailsDTO19 = new DetailsDTO("Kunal", "Treehouse", 2, false, addressDTO19);
        DetailsDTO detailsDTO20 = new DetailsDTO("Harsha", "Container Home", 1, false, addressDTO20);
        DetailsDTO detailsDTO21 = new DetailsDTO("Bhavana", "Beach House", 19, true, addressDTO21);
        DetailsDTO detailsDTO22 = new DetailsDTO("Sameer", "Mountain Cabin", 22, true, addressDTO22);
        DetailsDTO detailsDTO23 = new DetailsDTO("Lavanya", "Floating Home", 21, true, addressDTO23);
        DetailsDTO detailsDTO24 = new DetailsDTO("Roshan", "Mobile Home", 23, false, addressDTO24);
        DetailsDTO detailsDTO25 = new DetailsDTO("Tanvi", "Sky Villa", 26, true, addressDTO25);
        DetailsDTO detailsDTO26 = new DetailsDTO("Varun", "Terrace House", 27, false, addressDTO26);
        DetailsDTO detailsDTO27 = new DetailsDTO("Ritika", "Eco Home", 28, true, addressDTO27);
        DetailsDTO detailsDTO28 = new DetailsDTO("Vishal", "Capsule Home", 30, false, addressDTO28);
        DetailsDTO detailsDTO29 = new DetailsDTO("Neha", "Studio Flat", 32, false, addressDTO29);
        DetailsDTO detailsDTO30 = new DetailsDTO("Suresh", "Urban Loft", 34, true, addressDTO30);
        DetailsDTO detailsDTO31 = new DetailsDTO("Snehal", "Antique Home", 36, true, addressDTO31);
        DetailsDTO detailsDTO32 = new DetailsDTO("Rajeev", "Hut", 38, false, addressDTO32);
        DetailsDTO detailsDTO33 = new DetailsDTO("Karuna", "Wooden Cottage", 40, true, addressDTO33);
        DetailsDTO detailsDTO34 = new DetailsDTO("Ajay", "Prefab House", 42, false, addressDTO34);
        DetailsDTO detailsDTO35 = new DetailsDTO("Kavya", "Tent Stay", 44, false, addressDTO35);
        DetailsDTO detailsDTO36 = new DetailsDTO("Vikram", "Snow Cabin", 46, true, addressDTO36);
        DetailsDTO detailsDTO37 = new DetailsDTO("Nikita", "Marble Home", 48, true, addressDTO37);
        DetailsDTO detailsDTO38 = new DetailsDTO("Dhruv", "Mini Bungalow", 50, false, addressDTO38);
        DetailsDTO detailsDTO39 = new DetailsDTO("Sheetal", "Rustic Villa", 52, true, addressDTO39);
        DetailsDTO detailsDTO40 = new DetailsDTO("Kishore", "Hill House", 54, true, addressDTO40);
        DetailsDTO detailsDTO41 = new DetailsDTO("Preeti", "Desert Villa", 56, false, addressDTO41);
        DetailsDTO detailsDTO42 = new DetailsDTO("Ashwin", "Container Pod", 58, false, addressDTO42);
        DetailsDTO detailsDTO43 = new DetailsDTO("Komal", "Basement Suite", 60, true, addressDTO43);
        DetailsDTO detailsDTO44 = new DetailsDTO("Tanya", "Sunset Cottage", 62, true, addressDTO44);
        DetailsDTO detailsDTO45 = new DetailsDTO("Siddharth", "Cliff House", 64, false, addressDTO45);
        DetailsDTO detailsDTO46 = new DetailsDTO("Ramya", "Lakehouse", 66, true, addressDTO46);
        DetailsDTO detailsDTO47 = new DetailsDTO("Aravind", "Smart Home", 68, false, addressDTO47);
        DetailsDTO detailsDTO48 = new DetailsDTO("Bhaskar", "Luxury Bungalow", 70, true, addressDTO48);
        DetailsDTO detailsDTO49 = new DetailsDTO("Maya", "Compact Flat", 72, false, addressDTO49);
        DetailsDTO detailsDTO50 = new DetailsDTO("Yash", "Countryside Home", 74, true, addressDTO50);
        DetailsDTO detailsDTO51 = new DetailsDTO("Rhea", "Modern Duplex", 76, false, addressDTO51);
        DetailsDTO detailsDTO52 = new DetailsDTO("Kabir", "Terrace Duplex", 78, true, addressDTO52);
        DetailsDTO detailsDTO53 = new DetailsDTO("Anjali", "Luxury Apartment", 80, true, addressDTO53);
        DetailsDTO detailsDTO54 = new DetailsDTO("Dev", "Semi-detached House", 82, false, addressDTO54);
        DetailsDTO detailsDTO55 = new DetailsDTO("Shreya", "Row Bungalow", 84, true, addressDTO55);
        DetailsDTO detailsDTO56 = new DetailsDTO("Naresh", "Townhouse", 86, false, addressDTO56);
        DetailsDTO detailsDTO57 = new DetailsDTO("Chitra", "Courtyard House", 88, true, addressDTO57);
        DetailsDTO detailsDTO58 = new DetailsDTO("Sanjay", "Duplex Flat", 90, true, addressDTO58);
        DetailsDTO detailsDTO59 = new DetailsDTO("Gayathri", "Urban Cottage", 92, false, addressDTO59);
        DetailsDTO detailsDTO60 = new DetailsDTO("Tejas", "Luxury Pod", 94, false, addressDTO60);
        DetailsDTO detailsDTO61 = new DetailsDTO("Anu", "Studio Loft", 96, true, addressDTO61);
        DetailsDTO detailsDTO62 = new DetailsDTO("Rohit", "Premium Flat", 98, true, addressDTO62);
        DetailsDTO detailsDTO63 = new DetailsDTO("Indira", "Wood Cottage", 100, false, addressDTO63);
        DetailsDTO detailsDTO64 = new DetailsDTO("Karthik", "Backyard House", 102, true, addressDTO64);
        DetailsDTO detailsDTO65 = new DetailsDTO("Bindu", "Open Terrace House", 104, false, addressDTO65);
        DetailsDTO detailsDTO66 = new DetailsDTO("Abhay", "Island Cottage", 106, true, addressDTO66);
        DetailsDTO detailsDTO67 = new DetailsDTO("Ragini", "Floating Cabin", 108, true, addressDTO67);

        HouseDTO houseDTO1a = new HouseDTO(89, "Lakshmi Nilaya", 2, "Duplex", detailsDTO1);
        HouseDTO houseDTO1b = new HouseDTO(63, "Kaveri Home", 3, "FarmHouse", detailsDTO2);
        List<HouseDTO> houseDTO1 = new ArrayList<>();
        houseDTO1.add(houseDTO1a);
        houseDTO1.add(houseDTO1b);

        HouseDTO houseDTO2a = new HouseDTO(45, "Vishnu Villa", 1, "Bungalow", detailsDTO2);
        HouseDTO houseDTO2b = new HouseDTO(102, "Sai Krupa", 4, "Cottage", detailsDTO2);
        List<HouseDTO> houseDTO2 = new ArrayList<>();
        houseDTO2.add(houseDTO2a);
        houseDTO2.add(houseDTO2b);

        HouseDTO houseDTO3a = new HouseDTO(77, "Shanthi Nivasa", 2, "Duplex", detailsDTO3);
        HouseDTO houseDTO3b = new HouseDTO(56, "Green Residency", 5, "Villa", detailsDTO3);
        List<HouseDTO> houseDTO3 = new ArrayList<>();
        houseDTO3.add(houseDTO3a);
        houseDTO3.add(houseDTO3b);

        HouseDTO houseDTO4a = new HouseDTO(34, "Annapurna House", 3, "FarmHouse", detailsDTO4);
        HouseDTO houseDTO4b = new HouseDTO(91, "RiverSide Cottage", 2, "Cottage", detailsDTO4);
        List<HouseDTO> houseDTO4 = new ArrayList<>();
        houseDTO4.add(houseDTO4a);
        houseDTO4.add(houseDTO4b);

        HouseDTO houseDTO5a = new HouseDTO(68, "Rose Villa", 4, "Bungalow", detailsDTO5);
        HouseDTO houseDTO5b = new HouseDTO(87, "Sunset Home", 3, "Duplex", detailsDTO5);
        List<HouseDTO> houseDTO5 = new ArrayList<>();
        houseDTO5.add(houseDTO5a);
        houseDTO5.add(houseDTO5b);

        HouseDTO houseDTO6a = new HouseDTO(101, "Hilltop Haven", 2, "Cottage", detailsDTO6);
        HouseDTO houseDTO6b = new HouseDTO(112, "Ocean Breeze", 3, "FarmHouse", detailsDTO6);
        List<HouseDTO> houseDTO6 = new ArrayList<>();
        houseDTO6.add(houseDTO6a);
        houseDTO6.add(houseDTO6b);

        HouseDTO houseDTO7a = new HouseDTO(58, "Royal Enclave", 1, "Villa", detailsDTO7);
        HouseDTO houseDTO7b = new HouseDTO(93, "Tranquil Nest", 4, "Bungalow", detailsDTO7);
        List<HouseDTO> houseDTO7 = new ArrayList<>();
        houseDTO7.add(houseDTO7a);
        houseDTO7.add(houseDTO7b);

        HouseDTO houseDTO8a = new HouseDTO(36, "Paradise Point", 5, "Duplex", detailsDTO8);
        HouseDTO houseDTO8b = new HouseDTO(72, "Skyline View", 2, "Cottage", detailsDTO8);
        List<HouseDTO> houseDTO8 = new ArrayList<>();
        houseDTO8.add(houseDTO8a);
        houseDTO8.add(houseDTO8b);

        HouseDTO houseDTO9a = new HouseDTO(60, "Forest Edge", 3, "FarmHouse", detailsDTO9);
        HouseDTO houseDTO9b = new HouseDTO(84, "Lakeview Retreat", 2, "Villa", detailsDTO9);
        List<HouseDTO> houseDTO9 = new ArrayList<>();
        houseDTO9.add(houseDTO9a);
        houseDTO9.add(houseDTO9b);

        HouseDTO houseDTO10a = new HouseDTO(95, "Coral Casa", 4, "Bungalow", detailsDTO10);
        HouseDTO houseDTO10b = new HouseDTO(79, "Mountain Mist", 3, "Duplex", detailsDTO10);
        List<HouseDTO> houseDTO10 = new ArrayList<>();
        houseDTO10.add(houseDTO10a);
        houseDTO10.add(houseDTO10b);

        HouseDTO houseDTO11a = new HouseDTO(110, "Silver Oak", 2, "Duplex", detailsDTO11);
        HouseDTO houseDTO11b = new HouseDTO(111, "Golden Nest", 3, "FarmHouse", detailsDTO11);
        List<HouseDTO> houseDTO11 = new ArrayList<>();
        houseDTO11.add(houseDTO11a);
        houseDTO11.add(houseDTO11b);

        HouseDTO houseDTO12a = new HouseDTO(112, "Meadow Hills", 4, "Cottage", detailsDTO12);
        HouseDTO houseDTO12b = new HouseDTO(113, "Serenity Villa", 5, "Bungalow", detailsDTO12);
        List<HouseDTO> houseDTO12 = new ArrayList<>();
        houseDTO12.add(houseDTO12a);
        houseDTO12.add(houseDTO12b);

        HouseDTO houseDTO13a = new HouseDTO(114, "Whispering Winds", 3, "Villa", detailsDTO13);
        HouseDTO houseDTO13b = new HouseDTO(115, "Palm Grove", 2, "Duplex", detailsDTO13);
        List<HouseDTO> houseDTO13 = new ArrayList<>();
        houseDTO13.add(houseDTO13a);
        houseDTO13.add(houseDTO13b);

        HouseDTO houseDTO14a = new HouseDTO(116, "Crystal Heights", 4, "Cottage", detailsDTO14);
        HouseDTO houseDTO14b = new HouseDTO(117, "Sundar Nivas", 3, "FarmHouse", detailsDTO14);
        List<HouseDTO> houseDTO14 = new ArrayList<>();
        houseDTO14.add(houseDTO14a);
        houseDTO14.add(houseDTO14b);

        HouseDTO houseDTO15a = new HouseDTO(118, "Bluebell Residency", 2, "Bungalow", detailsDTO15);
        HouseDTO houseDTO15b = new HouseDTO(119, "Starview Manor", 4, "Villa", detailsDTO15);
        List<HouseDTO> houseDTO15 = new ArrayList<>();
        houseDTO15.add(houseDTO15a);
        houseDTO15.add(houseDTO15b);

        HouseDTO houseDTO16a = new HouseDTO(120, "Heavenly Stay", 5, "Cottage", detailsDTO16);
        HouseDTO houseDTO16b = new HouseDTO(121, "RainTree Retreat", 3, "Duplex", detailsDTO16);
        List<HouseDTO> houseDTO16 = new ArrayList<>();
        houseDTO16.add(houseDTO16a);
        houseDTO16.add(houseDTO16b);

        HouseDTO houseDTO17a = new HouseDTO(122, "Woodland Home", 2, "FarmHouse", detailsDTO17);
        HouseDTO houseDTO17b = new HouseDTO(123, "Moonlight Villa", 1, "Villa", detailsDTO17);
        List<HouseDTO> houseDTO17 = new ArrayList<>();
        houseDTO17.add(houseDTO17a);
        houseDTO17.add(houseDTO17b);

        HouseDTO houseDTO18a = new HouseDTO(124, "Harmony House", 3, "Bungalow", detailsDTO18);
        HouseDTO houseDTO18b = new HouseDTO(125, "Windchime Residency", 4, "Duplex", detailsDTO18);
        List<HouseDTO> houseDTO18 = new ArrayList<>();
        houseDTO18.add(houseDTO18a);
        houseDTO18.add(houseDTO18b);

        HouseDTO houseDTO19a = new HouseDTO(126, "RiverRock Villa", 2, "Cottage", detailsDTO19);
        HouseDTO houseDTO19b = new HouseDTO(127, "Golden Leaf", 3, "FarmHouse", detailsDTO19);
        List<HouseDTO> houseDTO19 = new ArrayList<>();
        houseDTO19.add(houseDTO19a);
        houseDTO19.add(houseDTO19b);

        HouseDTO houseDTO20a = new HouseDTO(128, "Sunrise Meadows", 4, "Villa", detailsDTO20);
        HouseDTO houseDTO20b = new HouseDTO(129, "Twilight Nest", 2, "Bungalow", detailsDTO20);
        List<HouseDTO> houseDTO20 = new ArrayList<>();
        houseDTO20.add(houseDTO20a);
        houseDTO20.add(houseDTO20b);

        HouseDTO houseDTO21a = new HouseDTO(130, "Maple Mansion", 3, "Duplex", detailsDTO21);
        HouseDTO houseDTO21b = new HouseDTO(131, "Ivory Cottage", 2, "Cottage", detailsDTO21);
        List<HouseDTO> houseDTO21 = new ArrayList<>();
        houseDTO21.add(houseDTO21a);
        houseDTO21.add(houseDTO21b);

        HouseDTO houseDTO22a = new HouseDTO(132, "Crescent Villa", 4, "FarmHouse", detailsDTO22);
        HouseDTO houseDTO22b = new HouseDTO(133, "Coral Enclave", 3, "Bungalow", detailsDTO22);
        List<HouseDTO> houseDTO22 = new ArrayList<>();
        houseDTO22.add(houseDTO22a);
        houseDTO22.add(houseDTO22b);

        HouseDTO houseDTO23a = new HouseDTO(134, "Amber Heights", 5, "Villa", detailsDTO23);
        HouseDTO houseDTO23b = new HouseDTO(135, "Jade Residency", 2, "Duplex", detailsDTO23);
        List<HouseDTO> houseDTO23 = new ArrayList<>();
        houseDTO23.add(houseDTO23a);
        houseDTO23.add(houseDTO23b);

        HouseDTO houseDTO24a = new HouseDTO(136, "Sunset Paradise", 3, "FarmHouse", detailsDTO24);
        HouseDTO houseDTO24b = new HouseDTO(137, "Ruby Nest", 2, "Cottage", detailsDTO24);
        List<HouseDTO> houseDTO24 = new ArrayList<>();
        houseDTO24.add(houseDTO24a);
        houseDTO24.add(houseDTO24b);

        HouseDTO houseDTO25a = new HouseDTO(138, "Pine Valley", 4, "Bungalow", detailsDTO25);
        HouseDTO houseDTO25b = new HouseDTO(139, "Mystic Falls", 5, "Villa", detailsDTO25);
        List<HouseDTO> houseDTO25 = new ArrayList<>();
        houseDTO25.add(houseDTO25a);
        houseDTO25.add(houseDTO25b);

        HouseDTO houseDTO26a = new HouseDTO(140, "Velvet Greens", 2, "Duplex", detailsDTO26);
        HouseDTO houseDTO26b = new HouseDTO(141, "Azure Nest", 3, "Cottage", detailsDTO26);
        List<HouseDTO> houseDTO26 = new ArrayList<>();
        houseDTO26.add(houseDTO26a);
        houseDTO26.add(houseDTO26b);

        HouseDTO houseDTO27a = new HouseDTO(142, "Golden Horizon", 4, "FarmHouse", detailsDTO27);
        HouseDTO houseDTO27b = new HouseDTO(143, "Willow Creek", 2, "Bungalow", detailsDTO27);
        List<HouseDTO> houseDTO27 = new ArrayList<>();
        houseDTO27.add(houseDTO27a);
        houseDTO27.add(houseDTO27b);

        HouseDTO houseDTO28a = new HouseDTO(144, "Amber Grove", 5, "Villa", detailsDTO28);
        HouseDTO houseDTO28b = new HouseDTO(145, "Crystal Springs", 3, "Cottage", detailsDTO28);
        List<HouseDTO> houseDTO28 = new ArrayList<>();
        houseDTO28.add(houseDTO28a);
        houseDTO28.add(houseDTO28b);

        HouseDTO houseDTO29a = new HouseDTO(146, "Emerald Nest", 2, "Duplex", detailsDTO29);
        HouseDTO houseDTO29b = new HouseDTO(147, "Moonview Villa", 4, "Bungalow", detailsDTO29);
        List<HouseDTO> houseDTO29 = new ArrayList<>();
        houseDTO29.add(houseDTO29a);
        houseDTO29.add(houseDTO29b);

        HouseDTO houseDTO30a = new HouseDTO(148, "Pearl Residency", 3, "FarmHouse", detailsDTO30);
        HouseDTO houseDTO30b = new HouseDTO(149, "Forest Breeze", 2, "Villa", detailsDTO30);
        List<HouseDTO> houseDTO30 = new ArrayList<>();
        houseDTO30.add(houseDTO30a);
        houseDTO30.add(houseDTO30b);

        HouseDTO houseDTO31a = new HouseDTO(150, "Shree Nivas", 4, "Bungalow", detailsDTO31);
        HouseDTO houseDTO31b = new HouseDTO(151, "Tranquil Garden", 3, "Cottage", detailsDTO31);
        List<HouseDTO> houseDTO31 = new ArrayList<>();
        houseDTO31.add(houseDTO31a);
        houseDTO31.add(houseDTO31b);

        HouseDTO houseDTO32a = new HouseDTO(152, "Ocean Mist", 5, "Villa", detailsDTO32);
        HouseDTO houseDTO32b = new HouseDTO(153, "Dew Drops", 2, "Duplex", detailsDTO32);
        List<HouseDTO> houseDTO32 = new ArrayList<>();
        houseDTO32.add(houseDTO32a);
        houseDTO32.add(houseDTO32b);

        HouseDTO houseDTO33a = new HouseDTO(154, "Golden Roof", 3, "FarmHouse", detailsDTO33);
        HouseDTO houseDTO33b = new HouseDTO(155, "Lotus Mansion", 4, "Bungalow", detailsDTO33);
        List<HouseDTO> houseDTO33 = new ArrayList<>();
        houseDTO33.add(houseDTO33a);
        houseDTO33.add(houseDTO33b);

        HouseDTO houseDTO34a = new HouseDTO(156, "Divine Enclave", 2, "Villa", detailsDTO34);
        HouseDTO houseDTO34b = new HouseDTO(157, "Maple Retreat", 5, "Cottage", detailsDTO34);
        List<HouseDTO> houseDTO34 = new ArrayList<>();
        houseDTO34.add(houseDTO34a);
        houseDTO34.add(houseDTO34b);

        HouseDTO houseDTO35a = new HouseDTO(158, "Floral Nest", 4, "Duplex", detailsDTO35);
        HouseDTO houseDTO35b = new HouseDTO(159, "Eden Greens", 3, "FarmHouse", detailsDTO35);
        List<HouseDTO> houseDTO35 = new ArrayList<>();
        houseDTO35.add(houseDTO35a);
        houseDTO35.add(houseDTO35b);

        HouseDTO houseDTO36a = new HouseDTO(160, "Gardenia", 2, "Cottage", detailsDTO36);
        HouseDTO houseDTO36b = new HouseDTO(161, "Zenith Villa", 4, "Bungalow", detailsDTO36);
        List<HouseDTO> houseDTO36 = new ArrayList<>();
        houseDTO36.add(houseDTO36a);
        houseDTO36.add(houseDTO36b);

        HouseDTO houseDTO37a = new HouseDTO(162, "Shubham Residency", 3, "Villa", detailsDTO37);
        HouseDTO houseDTO37b = new HouseDTO(163, "Lavender Heights", 5, "Duplex", detailsDTO37);
        List<HouseDTO> houseDTO37 = new ArrayList<>();
        houseDTO37.add(houseDTO37a);
        houseDTO37.add(houseDTO37b);

        HouseDTO houseDTO38a = new HouseDTO(164, "Rainfall Cottage", 4, "FarmHouse", detailsDTO38);
        HouseDTO houseDTO38b = new HouseDTO(165, "Sunbeam Home", 2, "Cottage", detailsDTO38);
        List<HouseDTO> houseDTO38 = new ArrayList<>();
        houseDTO38.add(houseDTO38a);
        houseDTO38.add(houseDTO38b);

        HouseDTO houseDTO39a = new HouseDTO(166, "Riverbend Villa", 3, "Bungalow", detailsDTO39);
        HouseDTO houseDTO39b = new HouseDTO(167, "Megha Nivas", 2, "Villa", detailsDTO39);
        List<HouseDTO> houseDTO39 = new ArrayList<>();
        houseDTO39.add(houseDTO39a);
        houseDTO39.add(houseDTO39b);

        HouseDTO houseDTO40a = new HouseDTO(168, "Palm Heights", 4, "Duplex", detailsDTO40);
        HouseDTO houseDTO40b = new HouseDTO(169, "Greenwood Farm", 5, "FarmHouse", detailsDTO40);
        List<HouseDTO> houseDTO40 = new ArrayList<>();
        houseDTO40.add(houseDTO40a);
        houseDTO40.add(houseDTO40b);

        HouseDTO houseDTO41a = new HouseDTO(170, "Silver Springs", 3, "Cottage", detailsDTO41);
        HouseDTO houseDTO41b = new HouseDTO(171, "Siri Nivas", 2, "Duplex", detailsDTO41);
        List<HouseDTO> houseDTO41 = new ArrayList<>();
        houseDTO41.add(houseDTO41a);
        houseDTO41.add(houseDTO41b);

        HouseDTO houseDTO42a = new HouseDTO(172, "Divya Villa", 4, "FarmHouse", detailsDTO42);
        HouseDTO houseDTO42b = new HouseDTO(173, "Grace Gardens", 3, "Bungalow", detailsDTO42);
        List<HouseDTO> houseDTO42 = new ArrayList<>();
        houseDTO42.add(houseDTO42a);
        houseDTO42.add(houseDTO42b);

        HouseDTO houseDTO43a = new HouseDTO(174, "Sky Heights", 5, "Villa", detailsDTO43);
        HouseDTO houseDTO43b = new HouseDTO(175, "Shanti Cottage", 2, "Cottage", detailsDTO43);
        List<HouseDTO> houseDTO43 = new ArrayList<>();
        houseDTO43.add(houseDTO43a);
        houseDTO43.add(houseDTO43b);

        HouseDTO houseDTO44a = new HouseDTO(176, "Heritage Home", 3, "Bungalow", detailsDTO44);
        HouseDTO houseDTO44b = new HouseDTO(177, "Ocean View", 4, "Villa", detailsDTO44);
        List<HouseDTO> houseDTO44 = new ArrayList<>();
        houseDTO44.add(houseDTO44a);
        houseDTO44.add(houseDTO44b);

        HouseDTO houseDTO45a = new HouseDTO(178, "RiverFront", 2, "FarmHouse", detailsDTO45);
        HouseDTO houseDTO45b = new HouseDTO(179, "Golden Blossom", 5, "Cottage", detailsDTO45);
        List<HouseDTO> houseDTO45 = new ArrayList<>();
        houseDTO45.add(houseDTO45a);
        houseDTO45.add(houseDTO45b);

        HouseDTO houseDTO46a = new HouseDTO(180, "Lavanya Villa", 3, "Duplex", detailsDTO46);
        HouseDTO houseDTO46b = new HouseDTO(181, "Maple Heights", 4, "Bungalow", detailsDTO46);
        List<HouseDTO> houseDTO46 = new ArrayList<>();
        houseDTO46.add(houseDTO46a);
        houseDTO46.add(houseDTO46b);

        HouseDTO houseDTO47a = new HouseDTO(182, "Mountain Ridge", 2, "FarmHouse", detailsDTO47);
        HouseDTO houseDTO47b = new HouseDTO(183, "Sunflower Villa", 5, "Villa", detailsDTO47);
        List<HouseDTO> houseDTO47 = new ArrayList<>();
        houseDTO47.add(houseDTO47a);
        houseDTO47.add(houseDTO47b);

        HouseDTO houseDTO48a = new HouseDTO(184, "Sree Residency", 3, "Cottage", detailsDTO48);
        HouseDTO houseDTO48b = new HouseDTO(185, "Twilight Meadows", 4, "Duplex", detailsDTO48);
        List<HouseDTO> houseDTO48 = new ArrayList<>();
        houseDTO48.add(houseDTO48a);
        houseDTO48.add(houseDTO48b);

        HouseDTO houseDTO49a = new HouseDTO(186, "Green Palace", 2, "Bungalow", detailsDTO49);
        HouseDTO houseDTO49b = new HouseDTO(187, "Celestial Home", 5, "Villa", detailsDTO49);
        List<HouseDTO> houseDTO49 = new ArrayList<>();
        houseDTO49.add(houseDTO49a);
        houseDTO49.add(houseDTO49b);

        HouseDTO houseDTO50a = new HouseDTO(188, "Harmony Residency", 3, "FarmHouse", detailsDTO50);
        HouseDTO houseDTO50b = new HouseDTO(189, "Rainbow Cottage", 2, "Cottage", detailsDTO50);
        List<HouseDTO> houseDTO50 = new ArrayList<>();
        houseDTO50.add(houseDTO50a);
        houseDTO50.add(houseDTO50b);

        HouseDTO houseDTO51a = new HouseDTO(190, "Opal Villa", 4, "Bungalow", detailsDTO51);
        HouseDTO houseDTO51b = new HouseDTO(191, "Sapphire Stay", 3, "Duplex", detailsDTO51);
        List<HouseDTO> houseDTO51 = new ArrayList<>();
        houseDTO51.add(houseDTO51a);
        houseDTO51.add(houseDTO51b);

        HouseDTO houseDTO52a = new HouseDTO(192, "Pebble Homes", 2, "Cottage", detailsDTO52);
        HouseDTO houseDTO52b = new HouseDTO(193, "Palm Residency", 5, "Villa", detailsDTO52);
        List<HouseDTO> houseDTO52 = new ArrayList<>();
        houseDTO52.add(houseDTO52a);
        houseDTO52.add(houseDTO52b);

        HouseDTO houseDTO53a = new HouseDTO(194, "Emerald Estate", 4, "FarmHouse", detailsDTO53);
        HouseDTO houseDTO53b = new HouseDTO(195, "Rose Garden", 3, "Bungalow", detailsDTO53);
        List<HouseDTO> houseDTO53 = new ArrayList<>();
        houseDTO53.add(houseDTO53a);
        houseDTO53.add(houseDTO53b);

        HouseDTO houseDTO54a = new HouseDTO(196, "Snowdrop Villa", 2, "Duplex", detailsDTO54);
        HouseDTO houseDTO54b = new HouseDTO(197, "Ivy Cottage", 4, "Cottage", detailsDTO54);
        List<HouseDTO> houseDTO54 = new ArrayList<>();
        houseDTO54.add(houseDTO54a);
        houseDTO54.add(houseDTO54b);

        HouseDTO houseDTO55a = new HouseDTO(198, "Sunrise Estate", 3, "Villa", detailsDTO55);
        HouseDTO houseDTO55b = new HouseDTO(199, "Golden Acres", 5, "FarmHouse", detailsDTO55);
        List<HouseDTO> houseDTO55 = new ArrayList<>();
        houseDTO55.add(houseDTO55a);
        houseDTO55.add(houseDTO55b);

        HouseDTO houseDTO56a = new HouseDTO(200, "Shanthi Villa", 2, "Bungalow", detailsDTO56);
        HouseDTO houseDTO56b = new HouseDTO(201, "Peace Valley", 4, "Duplex", detailsDTO56);
        List<HouseDTO> houseDTO56 = new ArrayList<>();
        houseDTO56.add(houseDTO56a);
        houseDTO56.add(houseDTO56b);

        HouseDTO houseDTO57a = new HouseDTO(202, "Breeze Heights", 3, "Cottage", detailsDTO57);
        HouseDTO houseDTO57b = new HouseDTO(203, "Tranquil Woods", 2, "FarmHouse", detailsDTO57);
        List<HouseDTO> houseDTO57 = new ArrayList<>();
        houseDTO57.add(houseDTO57a);
        houseDTO57.add(houseDTO57b);

        HouseDTO houseDTO58a = new HouseDTO(204, "Glory Nest", 5, "Villa", detailsDTO58);
        HouseDTO houseDTO58b = new HouseDTO(205, "Heritage Residency", 3, "Bungalow", detailsDTO58);
        List<HouseDTO> houseDTO58 = new ArrayList<>();
        houseDTO58.add(houseDTO58a);
        houseDTO58.add(houseDTO58b);

        HouseDTO houseDTO59a = new HouseDTO(206, "Amber Cottage", 2, "Cottage", detailsDTO59);
        HouseDTO houseDTO59b = new HouseDTO(207, "Lotus Enclave", 4, "Duplex", detailsDTO59);
        List<HouseDTO> houseDTO59 = new ArrayList<>();
        houseDTO59.add(houseDTO59a);
        houseDTO59.add(houseDTO59b);

        HouseDTO houseDTO60a = new HouseDTO(208, "Dream Meadows", 3, "FarmHouse", detailsDTO60);
        HouseDTO houseDTO60b = new HouseDTO(209, "Heaven Hills", 2, "Villa", detailsDTO60);
        List<HouseDTO> houseDTO60 = new ArrayList<>();
        houseDTO60.add(houseDTO60a);
        houseDTO60.add(houseDTO60b);

        HouseDTO houseDTO61a = new HouseDTO(210, "Silken Stay", 5, "Bungalow", detailsDTO61);
        HouseDTO houseDTO61b = new HouseDTO(211, "Siri Homes", 3, "Cottage", detailsDTO61);
        List<HouseDTO> houseDTO61 = new ArrayList<>();
        houseDTO61.add(houseDTO61a);
        houseDTO61.add(houseDTO61b);

        HouseDTO houseDTO62a = new HouseDTO(212, "Tulip Terraces", 2, "Villa", detailsDTO62);
        HouseDTO houseDTO62b = new HouseDTO(213, "Riverwalk", 4, "Duplex", detailsDTO62);
        List<HouseDTO> houseDTO62 = new ArrayList<>();
        houseDTO62.add(houseDTO62a);
        houseDTO62.add(houseDTO62b);

        HouseDTO houseDTO63a = new HouseDTO(214, "Rainbow Ridge", 3, "FarmHouse", detailsDTO63);
        HouseDTO houseDTO63b = new HouseDTO(215, "Pearl Gardens", 5, "Bungalow", detailsDTO63);
        List<HouseDTO> houseDTO63 = new ArrayList<>();
        houseDTO63.add(houseDTO63a);
        houseDTO63.add(houseDTO63b);

        HouseDTO houseDTO64a = new HouseDTO(216, "Misty Mountains", 4, "Cottage", detailsDTO64);
        HouseDTO houseDTO64b = new HouseDTO(217, "Blue Lagoon", 3, "Duplex", detailsDTO64);
        List<HouseDTO> houseDTO64 = new ArrayList<>();
        houseDTO64.add(houseDTO64a);
        houseDTO64.add(houseDTO64b);

        HouseDTO houseDTO65a = new HouseDTO(218, "Divine Heights", 2, "Villa", detailsDTO65);
        HouseDTO houseDTO65b = new HouseDTO(219, "Bliss Mansion", 5, "Bungalow", detailsDTO65);
        List<HouseDTO> houseDTO65 = new ArrayList<>();
        houseDTO65.add(houseDTO65a);
        houseDTO65.add(houseDTO65b);

        HouseDTO houseDTO66a = new HouseDTO(220, "Crescent Garden", 3, "FarmHouse", detailsDTO66);
        HouseDTO houseDTO66b = new HouseDTO(221, "Sparkle Stay", 4, "Cottage", detailsDTO66);
        List<HouseDTO> houseDTO66 = new ArrayList<>();
        houseDTO66.add(houseDTO66a);
        houseDTO66.add(houseDTO66b);

        HouseDTO houseDTO67a = new HouseDTO(222, "Prakruthi Villa", 2, "Duplex", detailsDTO67);
        HouseDTO houseDTO67b = new HouseDTO(223, "Nature Nest", 3, "Bungalow", detailsDTO67);
        List<HouseDTO> houseDTO67 = new ArrayList<>();
        houseDTO67.add(houseDTO67a);
        houseDTO67.add(houseDTO67b);


        OwnerDTO ownerDTO1a = new OwnerDTO("Ritika Sharma", 38, "Female", 9845012345L, houseDTO1);
        OwnerDTO ownerDTO1b = new OwnerDTO("Dinesh Rao", 41, "Male", 9900887766L, houseDTO1);
        List<OwnerDTO> ownerDTO1 = new ArrayList<>();
        ownerDTO1.add(ownerDTO1a);
        ownerDTO1.add(ownerDTO1b);

        OwnerDTO ownerDTO2a = new OwnerDTO("Neha Patil", 35, "Female", 9731456789L, houseDTO2);
        OwnerDTO ownerDTO2b = new OwnerDTO("Suresh Nayak", 42, "Male", 9988776655L, houseDTO2);
        List<OwnerDTO> ownerDTO2 = new ArrayList<>();
        ownerDTO2.add(ownerDTO2a);
        ownerDTO2.add(ownerDTO2b);

        OwnerDTO ownerDTO3a = new OwnerDTO("Divya Shetty", 36, "Female", 9845123456L, houseDTO3);
        OwnerDTO ownerDTO3b = new OwnerDTO("Vinay Kulkarni", 39, "Male", 9977665544L, houseDTO3);
        List<OwnerDTO> ownerDTO3 = new ArrayList<>();
        ownerDTO3.add(ownerDTO3a);
        ownerDTO3.add(ownerDTO3b);

        OwnerDTO ownerDTO4a = new OwnerDTO("Sneha Reddy", 33, "Female", 9811122233L, houseDTO4);
        OwnerDTO ownerDTO4b = new OwnerDTO("Ravi Shankar", 45, "Male", 9955667788L, houseDTO4);
        List<OwnerDTO> ownerDTO4 = new ArrayList<>();
        ownerDTO4.add(ownerDTO4a);
        ownerDTO4.add(ownerDTO4b);

        OwnerDTO ownerDTO5a = new OwnerDTO("Kavya Hegde", 37, "Female", 9833445566L, houseDTO5);
        OwnerDTO ownerDTO5b = new OwnerDTO("Harsha Pai", 40, "Male", 9922334455L, houseDTO5);
        List<OwnerDTO> ownerDTO5 = new ArrayList<>();
        ownerDTO5.add(ownerDTO5a);
        ownerDTO5.add(ownerDTO5b);

        OwnerDTO ownerDTO6a = new OwnerDTO("Pooja Nair", 34, "Female", 9845123123L, houseDTO6);
        OwnerDTO ownerDTO6b = new OwnerDTO("Rajiv Bhat", 43, "Male", 9966554433L, houseDTO6);
        List<OwnerDTO> ownerDTO6 = new ArrayList<>();
        ownerDTO6.add(ownerDTO6a);
        ownerDTO6.add(ownerDTO6b);

        OwnerDTO ownerDTO7a = new OwnerDTO("Meena Joshi", 36, "Female", 9887766554L, houseDTO7);
        OwnerDTO ownerDTO7b = new OwnerDTO("Pradeep Rao", 44, "Male", 9876543210L, houseDTO7);
        List<OwnerDTO> ownerDTO7 = new ArrayList<>();
        ownerDTO7.add(ownerDTO7a);
        ownerDTO7.add(ownerDTO7b);

        OwnerDTO ownerDTO8a = new OwnerDTO("Latha Desai", 38, "Female", 9845098765L, houseDTO8);
        OwnerDTO ownerDTO8b = new OwnerDTO("Sunil Hegde", 46, "Male", 9933445566L, houseDTO8);
        List<OwnerDTO> ownerDTO8 = new ArrayList<>();
        ownerDTO8.add(ownerDTO8a);
        ownerDTO8.add(ownerDTO8b);

        OwnerDTO ownerDTO9a = new OwnerDTO("Anita Shekar", 35, "Female", 9822113344L, houseDTO9);
        OwnerDTO ownerDTO9b = new OwnerDTO("Manjunath Gowda", 42, "Male", 9911223344L, houseDTO9);
        List<OwnerDTO> ownerDTO9 = new ArrayList<>();
        ownerDTO9.add(ownerDTO9a);
        ownerDTO9.add(ownerDTO9b);

        OwnerDTO ownerDTO10a = new OwnerDTO("Bhavana Kini", 37, "Female", 9855112233L, houseDTO10);
        OwnerDTO ownerDTO10b = new OwnerDTO("Srinivas Nayak", 41, "Male", 9900990011L, houseDTO10);
        List<OwnerDTO> ownerDTO10 = new ArrayList<>();
        ownerDTO10.add(ownerDTO10a);
        ownerDTO10.add(ownerDTO10b);

        OwnerDTO ownerDTO11a = new OwnerDTO("Deepa Shenoy", 36, "Female", 9845332211L, houseDTO11);
        OwnerDTO ownerDTO11b = new OwnerDTO("Ajay Naik", 40, "Male", 9877898765L, houseDTO11);
        List<OwnerDTO> ownerDTO11 = new ArrayList<>();
        ownerDTO11.add(ownerDTO11a);
        ownerDTO11.add(ownerDTO11b);

        OwnerDTO ownerDTO12a = new OwnerDTO("Trisha Pai", 34, "Female", 9866332211L, houseDTO12);
        OwnerDTO ownerDTO12b = new OwnerDTO("Ramesh Shetty", 43, "Male", 9898998877L, houseDTO12);
        List<OwnerDTO> ownerDTO12 = new ArrayList<>();
        ownerDTO12.add(ownerDTO12a);
        ownerDTO12.add(ownerDTO12b);

        OwnerDTO ownerDTO13a = new OwnerDTO("Sahana Kulkarni", 38, "Female", 9833557766L, houseDTO13);
        OwnerDTO ownerDTO13b = new OwnerDTO("Naveen Murthy", 45, "Male", 9922113344L, houseDTO13);
        List<OwnerDTO> ownerDTO13 = new ArrayList<>();
        ownerDTO13.add(ownerDTO13a);
        ownerDTO13.add(ownerDTO13b);

        OwnerDTO ownerDTO14a = new OwnerDTO("Nikita Reddy", 37, "Female", 9800221133L, houseDTO14);
        OwnerDTO ownerDTO14b = new OwnerDTO("Mahesh Rao", 42, "Male", 9988775544L, houseDTO14);
        List<OwnerDTO> ownerDTO14 = new ArrayList<>();
        ownerDTO14.add(ownerDTO14a);
        ownerDTO14.add(ownerDTO14b);

        OwnerDTO ownerDTO15a = new OwnerDTO("Harini Deshpande", 39, "Female", 9845099001L, houseDTO15);
        OwnerDTO ownerDTO15b = new OwnerDTO("Chandan N", 44, "Male", 9900776655L, houseDTO15);
        List<OwnerDTO> ownerDTO15 = new ArrayList<>();
        ownerDTO15.add(ownerDTO15a);
        ownerDTO15.add(ownerDTO15b);

        OwnerDTO ownerDTO16a = new OwnerDTO("Ashwini Nair", 36, "Female", 9833123456L, houseDTO16);
        OwnerDTO ownerDTO16b = new OwnerDTO("Karthik Iyer", 43, "Male", 9955778899L, houseDTO16);
        List<OwnerDTO> ownerDTO16 = new ArrayList<>();
        ownerDTO16.add(ownerDTO16a);
        ownerDTO16.add(ownerDTO16b);

        OwnerDTO ownerDTO17a = new OwnerDTO("Shalini Rao", 34, "Female", 9845234567L, houseDTO17);
        OwnerDTO ownerDTO17b = new OwnerDTO("Rajesh N", 40, "Male", 9988771122L, houseDTO17);
        List<OwnerDTO> ownerDTO17 = new ArrayList<>();
        ownerDTO17.add(ownerDTO17a);
        ownerDTO17.add(ownerDTO17b);

        OwnerDTO ownerDTO18a = new OwnerDTO("Meghna Bhat", 35, "Female", 9833665544L, houseDTO18);
        OwnerDTO ownerDTO18b = new OwnerDTO("Manoj Reddy", 42, "Male", 9944887766L, houseDTO18);
        List<OwnerDTO> ownerDTO18 = new ArrayList<>();
        ownerDTO18.add(ownerDTO18a);
        ownerDTO18.add(ownerDTO18b);

        OwnerDTO ownerDTO19a = new OwnerDTO("Vidya Shetty", 33, "Female", 9811223344L, houseDTO19);
        OwnerDTO ownerDTO19b = new OwnerDTO("Sanjay Kulkarni", 44, "Male", 9977558899L, houseDTO19);
        List<OwnerDTO> ownerDTO19 = new ArrayList<>();
        ownerDTO19.add(ownerDTO19a);
        ownerDTO19.add(ownerDTO19b);

        OwnerDTO ownerDTO20a = new OwnerDTO("Rashmi Desai", 37, "Female", 9855667788L, houseDTO20);
        OwnerDTO ownerDTO20b = new OwnerDTO("Kiran M", 41, "Male", 9933442211L, houseDTO20);
        List<OwnerDTO> ownerDTO20 = new ArrayList<>();
        ownerDTO20.add(ownerDTO20a);
        ownerDTO20.add(ownerDTO20b);

        OwnerDTO ownerDTO21a = new OwnerDTO("Nisha Pai", 36, "Female", 9844332211L, houseDTO21);
        OwnerDTO ownerDTO21b = new OwnerDTO("Rohit Hegde", 43, "Male", 9988007766L, houseDTO21);
        List<OwnerDTO> ownerDTO21 = new ArrayList<>();
        ownerDTO21.add(ownerDTO21a);
        ownerDTO21.add(ownerDTO21b);

        OwnerDTO ownerDTO22a = new OwnerDTO("Arpita N", 38, "Female", 9898989898L, houseDTO22);
        OwnerDTO ownerDTO22b = new OwnerDTO("Sharath K", 45, "Male", 9844001122L, houseDTO22);
        List<OwnerDTO> ownerDTO22 = new ArrayList<>();
        ownerDTO22.add(ownerDTO22a);
        ownerDTO22.add(ownerDTO22b);

        OwnerDTO ownerDTO23a = new OwnerDTO("Tanya Iyer", 35, "Female", 9800112233L, houseDTO23);
        OwnerDTO ownerDTO23b = new OwnerDTO("Girish Rao", 39, "Male", 9966005544L, houseDTO23);
        List<OwnerDTO> ownerDTO23 = new ArrayList<>();
        ownerDTO23.add(ownerDTO23a);
        ownerDTO23.add(ownerDTO23b);

        OwnerDTO ownerDTO24a = new OwnerDTO("Sheetal R", 34, "Female", 9822334455L, houseDTO24);
        OwnerDTO ownerDTO24b = new OwnerDTO("Vikram Shetty", 42, "Male", 9933221100L, houseDTO24);
        List<OwnerDTO> ownerDTO24 = new ArrayList<>();
        ownerDTO24.add(ownerDTO24a);
        ownerDTO24.add(ownerDTO24b);

        OwnerDTO ownerDTO25a = new OwnerDTO("Anjali H", 33, "Female", 9811992233L, houseDTO25);
        OwnerDTO ownerDTO25b = new OwnerDTO("Uday Nayak", 44, "Male", 9900883322L, houseDTO25);
        List<OwnerDTO> ownerDTO25 = new ArrayList<>();
        ownerDTO25.add(ownerDTO25a);
        ownerDTO25.add(ownerDTO25b);

        OwnerDTO ownerDTO26a = new OwnerDTO("Nandini M", 37, "Female", 9866554433L, houseDTO26);
        OwnerDTO ownerDTO26b = new OwnerDTO("Sameer Deshpande", 41, "Male", 9944556677L, houseDTO26);
        List<OwnerDTO> ownerDTO26 = new ArrayList<>();
        ownerDTO26.add(ownerDTO26a);
        ownerDTO26.add(ownerDTO26b);

        OwnerDTO ownerDTO27a = new OwnerDTO("Gayathri S", 36, "Female", 9899223344L, houseDTO27);
        OwnerDTO ownerDTO27b = new OwnerDTO("Raghavendra R", 40, "Male", 9955112244L, houseDTO27);
        List<OwnerDTO> ownerDTO27 = new ArrayList<>();
        ownerDTO27.add(ownerDTO27a);
        ownerDTO27.add(ownerDTO27b);

        OwnerDTO ownerDTO28a = new OwnerDTO("Pallavi Kulkarni", 34, "Female", 9811778899L, houseDTO28);
        OwnerDTO ownerDTO28b = new OwnerDTO("Arun Patil", 42, "Male", 9977885566L, houseDTO28);
        List<OwnerDTO> ownerDTO28 = new ArrayList<>();
        ownerDTO28.add(ownerDTO28a);
        ownerDTO28.add(ownerDTO28b);

        OwnerDTO ownerDTO29a = new OwnerDTO("Lavanya I", 35, "Female", 9844553322L, houseDTO29);
        OwnerDTO ownerDTO29b = new OwnerDTO("Siddharth Rao", 43, "Male", 9911227788L, houseDTO29);
        List<OwnerDTO> ownerDTO29 = new ArrayList<>();
        ownerDTO29.add(ownerDTO29a);
        ownerDTO29.add(ownerDTO29b);

        OwnerDTO ownerDTO30a = new OwnerDTO("Bhavya Shetty", 38, "Female", 9800554433L, houseDTO30);
        OwnerDTO ownerDTO30b = new OwnerDTO("Yogesh Hegde", 45, "Male", 9922334455L, houseDTO30);
        List<OwnerDTO> ownerDTO30 = new ArrayList<>();
        ownerDTO30.add(ownerDTO30a);
        ownerDTO30.add(ownerDTO30b);


        OwnerDTO ownerDTO31a = new OwnerDTO("Divya Patil", 34, "Female", 9845223344L, houseDTO31);
        OwnerDTO ownerDTO31b = new OwnerDTO("Mahesh Rao", 42, "Male", 9900112233L, houseDTO31);
        List<OwnerDTO> ownerDTO31 = new ArrayList<>();
        ownerDTO31.add(ownerDTO31a);
        ownerDTO31.add(ownerDTO31b);

        OwnerDTO ownerDTO32a = new OwnerDTO("Sowmya Iyer", 36, "Female", 9811002233L, houseDTO32);
        OwnerDTO ownerDTO32b = new OwnerDTO("Sunil Desai", 41, "Male", 9944776655L, houseDTO32);
        List<OwnerDTO> ownerDTO32 = new ArrayList<>();
        ownerDTO32.add(ownerDTO32a);
        ownerDTO32.add(ownerDTO32b);

        OwnerDTO ownerDTO33a = new OwnerDTO("Kriti Nair", 35, "Female", 9833445566L, houseDTO33);
        OwnerDTO ownerDTO33b = new OwnerDTO("Naveen Kumar", 43, "Male", 9922001122L, houseDTO33);
        List<OwnerDTO> ownerDTO33 = new ArrayList<>();
        ownerDTO33.add(ownerDTO33a);
        ownerDTO33.add(ownerDTO33b);

        OwnerDTO ownerDTO34a = new OwnerDTO("Anusha R", 33, "Female", 9877665544L, houseDTO34);
        OwnerDTO ownerDTO34b = new OwnerDTO("Rakesh Nayak", 40, "Male", 9966002233L, houseDTO34);
        List<OwnerDTO> ownerDTO34 = new ArrayList<>();
        ownerDTO34.add(ownerDTO34a);
        ownerDTO34.add(ownerDTO34b);

        OwnerDTO ownerDTO35a = new OwnerDTO("Preeti Shetty", 37, "Female", 9822110099L, houseDTO35);
        OwnerDTO ownerDTO35b = new OwnerDTO("Harish Reddy", 44, "Male", 9988776655L, houseDTO35);
        List<OwnerDTO> ownerDTO35 = new ArrayList<>();
        ownerDTO35.add(ownerDTO35a);
        ownerDTO35.add(ownerDTO35b);

        OwnerDTO ownerDTO36a = new OwnerDTO("Madhuri Kulkarni", 34, "Female", 9800123456L, houseDTO36);
        OwnerDTO ownerDTO36b = new OwnerDTO("Vishal Hegde", 42, "Male", 9911332244L, houseDTO36);
        List<OwnerDTO> ownerDTO36 = new ArrayList<>();
        ownerDTO36.add(ownerDTO36a);
        ownerDTO36.add(ownerDTO36b);

        OwnerDTO ownerDTO37a = new OwnerDTO("Sneha Desai", 36, "Female", 9866554433L, houseDTO37);
        OwnerDTO ownerDTO37b = new OwnerDTO("Abhishek Rao", 43, "Male", 9955884411L, houseDTO37);
        List<OwnerDTO> ownerDTO37 = new ArrayList<>();
        ownerDTO37.add(ownerDTO37a);
        ownerDTO37.add(ownerDTO37b);

        OwnerDTO ownerDTO38a = new OwnerDTO("Pooja N", 33, "Female", 9844112233L, houseDTO38);
        OwnerDTO ownerDTO38b = new OwnerDTO("Deepak Patil", 41, "Male", 9977554411L, houseDTO38);
        List<OwnerDTO> ownerDTO38 = new ArrayList<>();
        ownerDTO38.add(ownerDTO38a);
        ownerDTO38.add(ownerDTO38b);

        OwnerDTO ownerDTO39a = new OwnerDTO("Aparna Reddy", 35, "Female", 9855221133L, houseDTO39);
        OwnerDTO ownerDTO39b = new OwnerDTO("Kiran Shetty", 44, "Male", 9933221100L, houseDTO39);
        List<OwnerDTO> ownerDTO39 = new ArrayList<>();
        ownerDTO39.add(ownerDTO39a);
        ownerDTO39.add(ownerDTO39b);

        OwnerDTO ownerDTO40a = new OwnerDTO("Nikita Pai", 38, "Female", 9800119988L, houseDTO40);
        OwnerDTO ownerDTO40b = new OwnerDTO("Suraj H", 45, "Male", 9900998877L, houseDTO40);
        List<OwnerDTO> ownerDTO40 = new ArrayList<>();
        ownerDTO40.add(ownerDTO40a);
        ownerDTO40.add(ownerDTO40b);

        OwnerDTO ownerDTO41a = new OwnerDTO("Chaitra B", 37, "Female", 9822003344L, houseDTO41);
        OwnerDTO ownerDTO41b = new OwnerDTO("Pradeep Nayak", 43, "Male", 9988337766L, houseDTO41);
        List<OwnerDTO> ownerDTO41 = new ArrayList<>();
        ownerDTO41.add(ownerDTO41a);
        ownerDTO41.add(ownerDTO41b);

        OwnerDTO ownerDTO42a = new OwnerDTO("Trisha R", 36, "Female", 9844005566L, houseDTO42);
        OwnerDTO ownerDTO42b = new OwnerDTO("Ajay K", 42, "Male", 9944667788L, houseDTO42);
        List<OwnerDTO> ownerDTO42 = new ArrayList<>();
        ownerDTO42.add(ownerDTO42a);
        ownerDTO42.add(ownerDTO42b);

        OwnerDTO ownerDTO43a = new OwnerDTO("Lakshmi N", 35, "Female", 9833221155L, houseDTO43);
        OwnerDTO ownerDTO43b = new OwnerDTO("Rohan P", 41, "Male", 9966778899L, houseDTO43);
        List<OwnerDTO> ownerDTO43 = new ArrayList<>();
        ownerDTO43.add(ownerDTO43a);
        ownerDTO43.add(ownerDTO43b);

        OwnerDTO ownerDTO44a = new OwnerDTO("Bhavana R", 34, "Female", 9822556699L, houseDTO44);
        OwnerDTO ownerDTO44b = new OwnerDTO("Nitin Kumar", 40, "Male", 9911223344L, houseDTO44);
        List<OwnerDTO> ownerDTO44 = new ArrayList<>();
        ownerDTO44.add(ownerDTO44a);
        ownerDTO44.add(ownerDTO44b);

        OwnerDTO ownerDTO45a = new OwnerDTO("Deeksha M", 36, "Female", 9855667788L, houseDTO45);
        OwnerDTO ownerDTO45b = new OwnerDTO("Sandeep G", 43, "Male", 9977005544L, houseDTO45);
        List<OwnerDTO> ownerDTO45 = new ArrayList<>();
        ownerDTO45.add(ownerDTO45a);
        ownerDTO45.add(ownerDTO45b);

        OwnerDTO ownerDTO46a = new OwnerDTO("Harini S", 33, "Female", 9844332211L, houseDTO46);
        OwnerDTO ownerDTO46b = new OwnerDTO("Ashwin N", 42, "Male", 9922113344L, houseDTO46);
        List<OwnerDTO> ownerDTO46 = new ArrayList<>();
        ownerDTO46.add(ownerDTO46a);
        ownerDTO46.add(ownerDTO46b);

        OwnerDTO ownerDTO47a = new OwnerDTO("Vidya T", 34, "Female", 9833778899L, houseDTO47);
        OwnerDTO ownerDTO47b = new OwnerDTO("Rajiv Shetty", 44, "Male", 9966554433L, houseDTO47);
        List<OwnerDTO> ownerDTO47 = new ArrayList<>();
        ownerDTO47.add(ownerDTO47a);
        ownerDTO47.add(ownerDTO47b);

        OwnerDTO ownerDTO48a = new OwnerDTO("Sandhya U", 35, "Female", 9811442233L, houseDTO48);
        OwnerDTO ownerDTO48b = new OwnerDTO("Yogesh Rao", 45, "Male", 9900223344L, houseDTO48);
        List<OwnerDTO> ownerDTO48 = new ArrayList<>();
        ownerDTO48.add(ownerDTO48a);
        ownerDTO48.add(ownerDTO48b);

        OwnerDTO ownerDTO49a = new OwnerDTO("Rekha P", 37, "Female", 9822994411L, houseDTO49);
        OwnerDTO ownerDTO49b = new OwnerDTO("Vikram Desai", 41, "Male", 9977553311L, houseDTO49);
        List<OwnerDTO> ownerDTO49 = new ArrayList<>();
        ownerDTO49.add(ownerDTO49a);
        ownerDTO49.add(ownerDTO49b);

        OwnerDTO ownerDTO50a = new OwnerDTO("Tanvi K", 38, "Female", 9844006677L, houseDTO50);
        OwnerDTO ownerDTO50b = new OwnerDTO("Ravi N", 43, "Male", 9944332200L, houseDTO50);
        List<OwnerDTO> ownerDTO50 = new ArrayList<>();
        ownerDTO50.add(ownerDTO50a);
        ownerDTO50.add(ownerDTO50b);

        OwnerDTO ownerDTO51a = new OwnerDTO("Meghana Rao", 36, "Female", 9811776655L, houseDTO51);
        OwnerDTO ownerDTO51b = new OwnerDTO("Sujith Shetty", 42, "Male", 9955882233L, houseDTO51);
        List<OwnerDTO> ownerDTO51 = new ArrayList<>();
        ownerDTO51.add(ownerDTO51a);
        ownerDTO51.add(ownerDTO51b);

        OwnerDTO ownerDTO52a = new OwnerDTO("Bhavya R", 34, "Female", 9833442288L, houseDTO52);
        OwnerDTO ownerDTO52b = new OwnerDTO("Girish Nayak", 43, "Male", 9944772288L, houseDTO52);
        List<OwnerDTO> ownerDTO52 = new ArrayList<>();
        ownerDTO52.add(ownerDTO52a);
        ownerDTO52.add(ownerDTO52b);

        OwnerDTO ownerDTO53a = new OwnerDTO("Anita N", 33, "Female", 9800123499L, houseDTO53);
        OwnerDTO ownerDTO53b = new OwnerDTO("Shankar H", 40, "Male", 9922446677L, houseDTO53);
        List<OwnerDTO> ownerDTO53 = new ArrayList<>();
        ownerDTO53.add(ownerDTO53a);
        ownerDTO53.add(ownerDTO53b);

        OwnerDTO ownerDTO54a = new OwnerDTO("Savitha Iyer", 35, "Female", 9845111166L, houseDTO54);
        OwnerDTO ownerDTO54b = new OwnerDTO("Arvind P", 44, "Male", 9966778899L, houseDTO54);
        List<OwnerDTO> ownerDTO54 = new ArrayList<>();
        ownerDTO54.add(ownerDTO54a);
        ownerDTO54.add(ownerDTO54b);

        OwnerDTO ownerDTO55a = new OwnerDTO("Namratha Shetty", 38, "Female", 9855667722L, houseDTO55);
        OwnerDTO ownerDTO55b = new OwnerDTO("Ganesh K", 45, "Male", 9988445522L, houseDTO55);
        List<OwnerDTO> ownerDTO55 = new ArrayList<>();
        ownerDTO55.add(ownerDTO55a);
        ownerDTO55.add(ownerDTO55b);

        OwnerDTO ownerDTO56a = new OwnerDTO("Ramya N", 36, "Female", 9844776655L, houseDTO56);
        OwnerDTO ownerDTO56b = new OwnerDTO("Manoj R", 42, "Male", 9933442211L, houseDTO56);
        List<OwnerDTO> ownerDTO56 = new ArrayList<>();
        ownerDTO56.add(ownerDTO56a);
        ownerDTO56.add(ownerDTO56b);

        OwnerDTO ownerDTO57a = new OwnerDTO("Kavitha Rao", 37, "Female", 9866553322L, houseDTO57);
        OwnerDTO ownerDTO57b = new OwnerDTO("Suresh Nayak", 41, "Male", 9977110099L, houseDTO57);
        List<OwnerDTO> ownerDTO57 = new ArrayList<>();
        ownerDTO57.add(ownerDTO57a);
        ownerDTO57.add(ownerDTO57b);

        OwnerDTO ownerDTO58a = new OwnerDTO("Anusha G", 35, "Female", 9822885544L, houseDTO58);
        OwnerDTO ownerDTO58b = new OwnerDTO("Rajesh M", 43, "Male", 9900556677L, houseDTO58);
        List<OwnerDTO> ownerDTO58 = new ArrayList<>();
        ownerDTO58.add(ownerDTO58a);
        ownerDTO58.add(ownerDTO58b);

        OwnerDTO ownerDTO59a = new OwnerDTO("Deepa H", 34, "Female", 9811003322L, houseDTO59);
        OwnerDTO ownerDTO59b = new OwnerDTO("Prakash Rao", 44, "Male", 9944331199L, houseDTO59);
        List<OwnerDTO> ownerDTO59 = new ArrayList<>();
        ownerDTO59.add(ownerDTO59a);
        ownerDTO59.add(ownerDTO59b);

        OwnerDTO ownerDTO60a = new OwnerDTO("Shruthi N", 33, "Female", 9844112233L, houseDTO60);
        OwnerDTO ownerDTO60b = new OwnerDTO("Vinay Kumar", 40, "Male", 9900111222L, houseDTO60);
        List<OwnerDTO> ownerDTO60 = new ArrayList<>();
        ownerDTO60.add(ownerDTO60a);
        ownerDTO60.add(ownerDTO60b);

        OwnerDTO ownerDTO61a = new OwnerDTO("Pavitra R", 36, "Female", 9855332200L, houseDTO61);
        OwnerDTO ownerDTO61b = new OwnerDTO("Vikas Shetty", 42, "Male", 9966334455L, houseDTO61);
        List<OwnerDTO> ownerDTO61 = new ArrayList<>();
        ownerDTO61.add(ownerDTO61a);
        ownerDTO61.add(ownerDTO61b);

        OwnerDTO ownerDTO62a = new OwnerDTO("Sneha B", 37, "Female", 9833224477L, houseDTO62);
        OwnerDTO ownerDTO62b = new OwnerDTO("Harsha N", 43, "Male", 9977996655L, houseDTO62);
        List<OwnerDTO> ownerDTO62 = new ArrayList<>();
        ownerDTO62.add(ownerDTO62a);
        ownerDTO62.add(ownerDTO62b);

        OwnerDTO ownerDTO63a = new OwnerDTO("Radha S", 34, "Female", 9811662288L, houseDTO63);
        OwnerDTO ownerDTO63b = new OwnerDTO("Mohan R", 41, "Male", 9900332211L, houseDTO63);
        List<OwnerDTO> ownerDTO63 = new ArrayList<>();
        ownerDTO63.add(ownerDTO63a);
        ownerDTO63.add(ownerDTO63b);

        OwnerDTO ownerDTO64a = new OwnerDTO("Neha K", 35, "Female", 9822334455L, houseDTO64);
        OwnerDTO ownerDTO64b = new OwnerDTO("Ravi V", 42, "Male", 9944776655L, houseDTO64);
        List<OwnerDTO> ownerDTO64 = new ArrayList<>();
        ownerDTO64.add(ownerDTO64a);
        ownerDTO64.add(ownerDTO64b);

        OwnerDTO ownerDTO65a = new OwnerDTO("Keerthi J", 36, "Female", 9844009988L, houseDTO65);
        OwnerDTO ownerDTO65b = new OwnerDTO("Rajeev K", 44, "Male", 9922001133L, houseDTO65);
        List<OwnerDTO> ownerDTO65 = new ArrayList<>();
        ownerDTO65.add(ownerDTO65a);
        ownerDTO65.add(ownerDTO65b);

        OwnerDTO ownerDTO66a = new OwnerDTO("Aishwarya D", 33, "Female", 9800552211L, houseDTO66);
        OwnerDTO ownerDTO66b = new OwnerDTO("Satish P", 40, "Male", 9988001122L, houseDTO66);
        List<OwnerDTO> ownerDTO66 = new ArrayList<>();
        ownerDTO66.add(ownerDTO66a);
        ownerDTO66.add(ownerDTO66b);

        OwnerDTO ownerDTO67a = new OwnerDTO("Jhanavi R", 35, "Female", 9866001122L, houseDTO67);
        OwnerDTO ownerDTO67b = new OwnerDTO("Rohit B", 42, "Male", 9911002233L, houseDTO67);
        List<OwnerDTO> ownerDTO67 = new ArrayList<>();
        ownerDTO67.add(ownerDTO67a);
        ownerDTO67.add(ownerDTO67b);


        CompanyDTO companyDTO1 = new CompanyDTO("Google", "Tech company", 1998, "California", ownerDTO1);
        CompanyDTO companyDTO2 = new CompanyDTO("Microsoft", "Software giant", 1975, "Washington", ownerDTO2);
        CompanyDTO companyDTO3 = new CompanyDTO("Amazon", "E-commerce leader", 1994, "Seattle", ownerDTO3);
        CompanyDTO companyDTO4 = new CompanyDTO("Apple", "Consumer electronics", 1976, "Cupertino", ownerDTO4);
        CompanyDTO companyDTO5 = new CompanyDTO("Meta", "Social media", 2004, "Menlo Park", ownerDTO5);
        CompanyDTO companyDTO6 = new CompanyDTO("Tesla", "Electric vehicles", 2003, "Palo Alto", ownerDTO6);
        CompanyDTO companyDTO7 = new CompanyDTO("Netflix", "Streaming service", 1997, "Los Gatos", ownerDTO7);
        CompanyDTO companyDTO8 = new CompanyDTO("Adobe", "Creative software", 1982, "San Jose", ownerDTO8);
        CompanyDTO companyDTO9 = new CompanyDTO("Intel", "Semiconductors", 1968, "Santa Clara", ownerDTO9);
        CompanyDTO companyDTO10 = new CompanyDTO("IBM", "Enterprise IT", 1911, "New York", ownerDTO10);
        CompanyDTO companyDTO11 = new CompanyDTO("Salesforce", "CRM solutions", 1999, "San Francisco", ownerDTO11);
        CompanyDTO companyDTO12 = new CompanyDTO("Oracle", "Database solutions", 1977, "Austin", ownerDTO12);
        CompanyDTO companyDTO13 = new CompanyDTO("Zoom", "Video conferencing", 2011, "San Jose", ownerDTO13);
        CompanyDTO companyDTO14 = new CompanyDTO("Spotify", "Music streaming", 2006, "Stockholm", ownerDTO14);
        CompanyDTO companyDTO15 = new CompanyDTO("Airbnb", "Hospitality", 2008, "San Francisco", ownerDTO15);
        CompanyDTO companyDTO16 = new CompanyDTO("Snapchat", "Social media", 2011, "Santa Monica", ownerDTO16);
        CompanyDTO companyDTO17 = new CompanyDTO("Twitter", "Microblogging", 2006, "San Francisco", ownerDTO17);
        CompanyDTO companyDTO18 = new CompanyDTO("LinkedIn", "Professional networking", 2002, "Sunnyvale", ownerDTO18);
        CompanyDTO companyDTO19 = new CompanyDTO("Uber", "Ride-sharing", 2009, "San Francisco", ownerDTO19);
        CompanyDTO companyDTO20 = new CompanyDTO("eBay", "E-commerce", 1995, "San Jose", ownerDTO20);
        CompanyDTO companyDTO21 = new CompanyDTO("PayPal", "Online payments", 1998, "San Jose", ownerDTO21);
        CompanyDTO companyDTO22 = new CompanyDTO("Nvidia", "Graphics processing", 1993, "Santa Clara", ownerDTO22);
        CompanyDTO companyDTO23 = new CompanyDTO("Dropbox", "Cloud storage", 2007, "San Francisco", ownerDTO23);
        CompanyDTO companyDTO24 = new CompanyDTO("Slack", "Team communication", 2009, "San Francisco", ownerDTO24);
        CompanyDTO companyDTO25 = new CompanyDTO("Pinterest", "Visual discovery", 2010, "San Francisco", ownerDTO25);
        CompanyDTO companyDTO26 = new CompanyDTO("Shopify", "E-commerce platform", 2006, "Ottawa", ownerDTO26);
        CompanyDTO companyDTO27 = new CompanyDTO("ZoomInfo", "Business data", 2007, "Vancouver", ownerDTO27);
        CompanyDTO companyDTO28 = new CompanyDTO("Quora", "Knowledge sharing", 2009, "Mountain View", ownerDTO28);
        CompanyDTO companyDTO29 = new CompanyDTO("Reddit", "Online communities", 2005, "San Francisco", ownerDTO29);
        CompanyDTO companyDTO30 = new CompanyDTO("GitHub", "Code hosting", 2008, "San Francisco", ownerDTO30);
        CompanyDTO companyDTO31 = new CompanyDTO("Dell", "Computer technology", 1984, "Texas", ownerDTO31);
        CompanyDTO companyDTO32 = new CompanyDTO("HP", "Hardware & software", 1939, "California", ownerDTO32);
        CompanyDTO companyDTO33 = new CompanyDTO("Accenture", "IT services", 1989, "Dublin", ownerDTO33);
        CompanyDTO companyDTO34 = new CompanyDTO("Capgemini", "Consulting", 1967, "Paris", ownerDTO34);
        CompanyDTO companyDTO35 = new CompanyDTO("Infosys", "IT services", 1981, "Bangalore", ownerDTO35);
        CompanyDTO companyDTO36 = new CompanyDTO("Wipro", "Technology", 1945, "Bangalore", ownerDTO36);
        CompanyDTO companyDTO37 = new CompanyDTO("TCS", "Consulting", 1968, "Mumbai", ownerDTO37);
        CompanyDTO companyDTO38 = new CompanyDTO("Cognizant", "IT services", 1994, "New Jersey", ownerDTO38);
        CompanyDTO companyDTO39 = new CompanyDTO("Mindtree", "Digital transformation", 1999, "Bangalore", ownerDTO39);
        CompanyDTO companyDTO40 = new CompanyDTO("HCL", "IT services", 1976, "Noida", ownerDTO40);
        CompanyDTO companyDTO41 = new CompanyDTO("Zomato", "Food delivery", 2008, "Gurugram", ownerDTO41);
        CompanyDTO companyDTO42 = new CompanyDTO("Swiggy", "Food delivery", 2014, "Bangalore", ownerDTO42);
        CompanyDTO companyDTO43 = new CompanyDTO("Ola", "Ride-sharing", 2010, "Bangalore", ownerDTO43);
        CompanyDTO companyDTO44 = new CompanyDTO("Byju's", "EdTech", 2011, "Bangalore", ownerDTO44);
        CompanyDTO companyDTO45 = new CompanyDTO("Flipkart", "E-commerce", 2007, "Bangalore", ownerDTO45);
        CompanyDTO companyDTO46 = new CompanyDTO("Paytm", "Fintech", 2010, "Noida", ownerDTO46);
        CompanyDTO companyDTO47 = new CompanyDTO("Freshworks", "Business software", 2010, "Chennai", ownerDTO47);
        CompanyDTO companyDTO48 = new CompanyDTO("PhonePe", "Digital payments", 2015, "Bangalore", ownerDTO48);
        CompanyDTO companyDTO49 = new CompanyDTO("Zoho", "Enterprise software", 1996, "Chennai", ownerDTO49);
        CompanyDTO companyDTO50 = new CompanyDTO("CRED", "Credit payments", 2018, "Bangalore", ownerDTO50);
        CompanyDTO companyDTO51 = new CompanyDTO("Dream11", "Fantasy sports", 2008, "Mumbai", ownerDTO51);
        CompanyDTO companyDTO52 = new CompanyDTO("InMobi", "Mobile advertising", 2007, "Bangalore", ownerDTO52);
        CompanyDTO companyDTO53 = new CompanyDTO("Razorpay", "Payments gateway", 2014, "Bangalore", ownerDTO53);
        CompanyDTO companyDTO54 = new CompanyDTO("Bounce", "Bike rental", 2014, "Bangalore", ownerDTO54);
        CompanyDTO companyDTO55 = new CompanyDTO("Dunzo", "Hyperlocal delivery", 2014, "Bangalore", ownerDTO55);
        CompanyDTO companyDTO56 = new CompanyDTO("BigBasket", "Online grocery", 2011, "Bangalore", ownerDTO56);
        CompanyDTO companyDTO57 = new CompanyDTO("Nykaa", "Beauty products", 2012, "Mumbai", ownerDTO57);
        CompanyDTO companyDTO58 = new CompanyDTO("Meesho", "Social commerce", 2015, "Bangalore", ownerDTO58);
        CompanyDTO companyDTO59 = new CompanyDTO("Lenskart", "Eyewear", 2010, "Faridabad", ownerDTO59);
        CompanyDTO companyDTO60 = new CompanyDTO("UrbanClap", "Home services", 2014, "Gurugram", ownerDTO60);
        CompanyDTO companyDTO61 = new CompanyDTO("1mg", "Pharmacy", 2015, "Gurugram", ownerDTO61);
        CompanyDTO companyDTO62 = new CompanyDTO("Groww", "Investment platform", 2016, "Bangalore", ownerDTO62);
        CompanyDTO companyDTO63 = new CompanyDTO("PolicyBazaar", "Insurance aggregator", 2008, "Gurugram", ownerDTO63);
        CompanyDTO companyDTO64 = new CompanyDTO("RentoMojo", "Rental platform", 2014, "Bangalore", ownerDTO64);
        CompanyDTO companyDTO65 = new CompanyDTO("Udaan", "B2B marketplace", 2016, "Bangalore", ownerDTO65);
        CompanyDTO companyDTO66 = new CompanyDTO("ShareChat", "Social media", 2015, "Bangalore", ownerDTO66);
        CompanyDTO companyDTO67 = new CompanyDTO("Chingari", "Video sharing", 2018, "Bangalore", ownerDTO67);


        ProductDTO productDTO1 = new ProductDTO("Mobile", "Electronics", 25000, "Samsung", companyDTO1);
        ProductDTO productDTO2 = new ProductDTO("Laptop", "Electronics", 60000, "Microsoft Surface", companyDTO2);
        ProductDTO productDTO3 = new ProductDTO("Echo Dot", "Smart Home", 4499, "Amazon", companyDTO3);
        ProductDTO productDTO4 = new ProductDTO("iPhone", "Electronics", 85000, "Apple", companyDTO4);
        ProductDTO productDTO5 = new ProductDTO("Oculus Quest", "VR", 30000, "Meta", companyDTO5);
        ProductDTO productDTO6 = new ProductDTO("Model 3", "Electric Car", 3500000, "Tesla", companyDTO6);
        ProductDTO productDTO7 = new ProductDTO("Smart TV", "Entertainment", 40000, "Netflix", companyDTO7);
        ProductDTO productDTO8 = new ProductDTO("Photoshop", "Software", 20000, "Adobe", companyDTO8);
        ProductDTO productDTO9 = new ProductDTO("Core i9", "Processor", 45000, "Intel", companyDTO9);
        ProductDTO productDTO10 = new ProductDTO("Server Rack", "Hardware", 150000, "IBM", companyDTO10);
        ProductDTO productDTO11 = new ProductDTO("CRM Suite", "Software", 70000, "Salesforce", companyDTO11);
        ProductDTO productDTO12 = new ProductDTO("Oracle DB", "Database", 80000, "Oracle", companyDTO12);
        ProductDTO productDTO13 = new ProductDTO("Zoom Pro", "Subscription", 12000, "Zoom", companyDTO13);
        ProductDTO productDTO14 = new ProductDTO("Premium Plan", "Music", 149, "Spotify", companyDTO14);
        ProductDTO productDTO15 = new ProductDTO("Travel Kit", "Accessories", 2000, "Airbnb", companyDTO15);
        ProductDTO productDTO16 = new ProductDTO("AR Glasses", "Tech", 60000, "Snapchat", companyDTO16);
        ProductDTO productDTO17 = new ProductDTO("Ad Service", "Marketing", 10000, "Twitter", companyDTO17);
        ProductDTO productDTO18 = new ProductDTO("Job Ad", "Hiring", 4999, "LinkedIn", companyDTO18);
        ProductDTO productDTO19 = new ProductDTO("Uber Pass", "Subscription", 399, "Uber", companyDTO19);
        ProductDTO productDTO20 = new ProductDTO("Auction Tool", "E-commerce", 2999, "eBay", companyDTO20);
        ProductDTO productDTO21 = new ProductDTO("Wallet", "Fintech", 0, "PayPal", companyDTO21);
        ProductDTO productDTO22 = new ProductDTO("RTX 4080", "GPU", 120000, "Nvidia", companyDTO22);
        ProductDTO productDTO23 = new ProductDTO("Business Cloud", "Storage", 9999, "Dropbox", companyDTO23);
        ProductDTO productDTO24 = new ProductDTO("Slack Pro", "Subscription", 6500, "Slack", companyDTO24);
        ProductDTO productDTO25 = new ProductDTO("Ad Pins", "Marketing", 3000, "Pinterest", companyDTO25);
        ProductDTO productDTO26 = new ProductDTO("POS Terminal", "Retail", 15000, "Shopify", companyDTO26);
        ProductDTO productDTO27 = new ProductDTO("Data Platform", "B2B", 20000, "ZoomInfo", companyDTO27);
        ProductDTO productDTO28 = new ProductDTO("Quora Plus", "Subscription", 499, "Quora", companyDTO28);
        ProductDTO productDTO29 = new ProductDTO("Ad Credits", "Online Ads", 500, "Reddit", companyDTO29);
        ProductDTO productDTO30 = new ProductDTO("Pro Plan", "Dev Tools", 8000, "GitHub", companyDTO30);
        ProductDTO productDTO31 = new ProductDTO("XPS 15", "Laptop", 95000, "Dell", companyDTO31);
        ProductDTO productDTO32 = new ProductDTO("OMEN", "Gaming Laptop", 85000, "HP", companyDTO32);
        ProductDTO productDTO33 = new ProductDTO("Cloud Support", "Consulting", 30000, "Accenture", companyDTO33);
        ProductDTO productDTO34 = new ProductDTO("Data Analytics", "Services", 27000, "Capgemini", companyDTO34);
        ProductDTO productDTO35 = new ProductDTO("Consulting Pack", "IT", 25000, "Infosys", companyDTO35);
        ProductDTO productDTO36 = new ProductDTO("Wipro Services", "IT", 24000, "Wipro", companyDTO36);
        ProductDTO productDTO37 = new ProductDTO("IT Bundle", "Enterprise", 26000, "TCS", companyDTO37);
        ProductDTO productDTO38 = new ProductDTO("Tech Pack", "Consulting", 23000, "Cognizant", companyDTO38);
        ProductDTO productDTO39 = new ProductDTO("AI Tools", "Digital", 35000, "Mindtree", companyDTO39);
        ProductDTO productDTO40 = new ProductDTO("Support Pack", "IT", 22000, "HCL", companyDTO40);
        ProductDTO productDTO41 = new ProductDTO("Zomato Pro", "Membership", 999, "Zomato", companyDTO41);
        ProductDTO productDTO42 = new ProductDTO("Super Subscription", "Food Delivery", 899, "Swiggy", companyDTO42);
        ProductDTO productDTO43 = new ProductDTO("Prime Rides", "Transport", 499, "Ola", companyDTO43);
        ProductDTO productDTO44 = new ProductDTO("Learning App", "Education", 15000, "Byju's", companyDTO44);
        ProductDTO productDTO45 = new ProductDTO("Axis Flipkart Card", "Fintech", 0, "Flipkart", companyDTO45);
        ProductDTO productDTO46 = new ProductDTO("Fastag", "Payments", 300, "Paytm", companyDTO46);
        ProductDTO productDTO47 = new ProductDTO("Support Suite", "CRM", 12000, "Freshworks", companyDTO47);
        ProductDTO productDTO48 = new ProductDTO("PhonePe Switch", "Payments", 0, "PhonePe", companyDTO48);
        ProductDTO productDTO49 = new ProductDTO("Zoho One", "Business Suite", 2999, "Zoho", companyDTO49);
        ProductDTO productDTO50 = new ProductDTO("CRED Coins", "Loyalty", 0, "CRED", companyDTO50);
        ProductDTO productDTO51 = new ProductDTO("Fantasy League", "Gaming", 299, "Dream11", companyDTO51);
        ProductDTO productDTO52 = new ProductDTO("InMobi Ads", "Advertising", 4999, "InMobi", companyDTO52);
        ProductDTO productDTO53 = new ProductDTO("Razorpay POS", "Payments", 7000, "Razorpay", companyDTO53);
        ProductDTO productDTO54 = new ProductDTO("Electric Scooter", "Mobility", 65000, "Bounce", companyDTO54);
        ProductDTO productDTO55 = new ProductDTO("Dunzo Store", "Quick Delivery", 599, "Dunzo", companyDTO55);
        ProductDTO productDTO56 = new ProductDTO("Monthly Grocery Pack", "Essentials", 2999, "BigBasket", companyDTO56);
        ProductDTO productDTO57 = new ProductDTO("Beauty Box", "Cosmetics", 999, "Nykaa", companyDTO57);
        ProductDTO productDTO58 = new ProductDTO("Meesho Kit", "Reselling", 499, "Meesho", companyDTO58);
        ProductDTO productDTO59 = new ProductDTO("Spectacles", "Eyewear", 1500, "Lenskart", companyDTO59);
        ProductDTO productDTO60 = new ProductDTO("Salon at Home", "Services", 899, "UrbanClap", companyDTO60);
        ProductDTO productDTO61 = new ProductDTO("Medicines Pack", "Pharmacy", 750, "1mg", companyDTO61);
        ProductDTO productDTO62 = new ProductDTO("Mutual Fund Plan", "Investment", 0, "Groww", companyDTO62);
        ProductDTO productDTO63 = new ProductDTO("Insurance Term Plan", "Insurance", 5000, "PolicyBazaar", companyDTO63);
        ProductDTO productDTO64 = new ProductDTO("Furniture Rental", "Home", 999, "RentoMojo", companyDTO64);
        ProductDTO productDTO65 = new ProductDTO("Wholesale Kit", "B2B", 1999, "Udaan", companyDTO65);
        ProductDTO productDTO66 = new ProductDTO("ShareChat Pro", "Social Media", 0, "ShareChat", companyDTO66);
        ProductDTO productDTO67 = new ProductDTO("Chingari Coins", "Digital Currency", 0, "Chingari", companyDTO67);


        List<ProductDTO> productDTOList = new ArrayList<>(Arrays.asList(
                productDTO1, productDTO2, productDTO3, productDTO4, productDTO5, productDTO6, productDTO7,
                productDTO8, productDTO9, productDTO10, productDTO11, productDTO12, productDTO13, productDTO14,
                productDTO15, productDTO16, productDTO17, productDTO18, productDTO19, productDTO20, productDTO21,
                productDTO22, productDTO23, productDTO24, productDTO25, productDTO26, productDTO27, productDTO28,
                productDTO29, productDTO30, productDTO31, productDTO32, productDTO33, productDTO34, productDTO35,
                productDTO36, productDTO37, productDTO38, productDTO39, productDTO40, productDTO41, productDTO42,
                productDTO43, productDTO44, productDTO45, productDTO46, productDTO47, productDTO48, productDTO49,
                productDTO50, productDTO51, productDTO52, productDTO53, productDTO54, productDTO55, productDTO56,
                productDTO57, productDTO58, productDTO59, productDTO60, productDTO61, productDTO62, productDTO63,
                productDTO64, productDTO65, productDTO66, productDTO67
        ));

        System.out.println("1");
        // productDTOList.stream().filter(ele->{
        // ele.getCompanyDTO().getOwnerDTO().get(1).getHouseDTO().get(1)});

    }
}
