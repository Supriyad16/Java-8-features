package com.xworkz.nation.runner;

import com.xworkz.nation.dto.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Runner {

    public static void main(String[] args) {


        ChancellorDTO chancellor1 = new ChancellorDTO("Meera", 58, "Ph.D", 15);
        ChancellorDTO chancellor2 = new ChancellorDTO("Raghav", 62, "M.A", 18);
        ChancellorDTO chancellor3 = new ChancellorDTO("Aravind", 55, "M.Sc", 12);
        ChancellorDTO chancellor4 = new ChancellorDTO("Suresh", 59, "LL.M", 20);
        ChancellorDTO chancellor5 = new ChancellorDTO("Lakshmi", 61, "Ph.D", 17);

        UniversityDTO university1 = new UniversityDTO("Stanford", "America", 1960, "A", chancellor1);
        UniversityDTO university2 = new UniversityDTO("Oxford", "UK", 1850, "A+", chancellor2);
        UniversityDTO university3 = new UniversityDTO("IIT Bombay", "India", 1958, "A", chancellor3);
        UniversityDTO university4 = new UniversityDTO("MIT", "USA", 1861, "A+", chancellor4);
        UniversityDTO university5 = new UniversityDTO("Heidelberg", "Germany", 1386, "A", chancellor5);

        EducationDTO education1 = new EducationDTO("B.E", "PES", 2025, 89, university1);
        EducationDTO education2 = new EducationDTO("M.Sc", "Christ University", 2023, 85, university2);
        EducationDTO education3 = new EducationDTO("B.Tech", "IIT Delhi", 2024, 91, university3);
        EducationDTO education4 = new EducationDTO("M.Tech", "MIT Academy", 2022, 87, university4);
        EducationDTO education5 = new EducationDTO("B.A", "JNU", 2021, 82, university5);

        DetailDTO detail1 = new DetailDTO(1, "Wings of Fire", "Completed", "Biography", education1);
        DetailDTO detail2 = new DetailDTO(2, "Brief History", "Ongoing", "History", education2);
        DetailDTO detail3 = new DetailDTO(3, "Quantum Mechanics", "Completed", "Science", education3);
        DetailDTO detail4 = new DetailDTO(4, "Modern Art", "Pending", "Art", education4);
        DetailDTO detail5 = new DetailDTO(5, "Political Theories", "Completed", "Political Science", education5);

        StaffDTO staffDTO1 = new StaffDTO("Asha","HR",20000,"May",detail1);
        StaffDTO staffDTO2 = new StaffDTO("Usha","Tech Support",25000,"Jan",detail1);
        StaffDTO staffDTO3 = new StaffDTO("Ravi","Office Staff",10000,"Aug",detail1);
        StaffDTO staffDTO4 = new StaffDTO("Meera","Developer",50000,"July",detail1);
        List<StaffDTO> staffDTOa = new ArrayList<>();
        staffDTOa.add(staffDTO1);
        staffDTOa.add(staffDTO2);
        staffDTOa.add(staffDTO3);
        staffDTOa.add(staffDTO4);


        StaffDTO staffDTO5 = new StaffDTO("Kiran", "Librarian", 18000, "March", detail2);
        StaffDTO staffDTO6 = new StaffDTO("Sneha", "Developer", 52000, "April", detail2);
        StaffDTO staffDTO7 = new StaffDTO("Harsha", "Admin", 22000, "May", detail2);
        StaffDTO staffDTO8 = new StaffDTO("Divya", "HR", 24000, "June", detail2);
        List<StaffDTO> staffDTOb = new ArrayList<>();
        staffDTOb.add(staffDTO5);
        staffDTOb.add(staffDTO6);
        staffDTOb.add(staffDTO7);
        staffDTOb.add(staffDTO8);


        StaffDTO staffDTO9 = new StaffDTO("Sanjay", "Security", 15000, "Feb", detail3);
        StaffDTO staffDTO10 = new StaffDTO("Priya", "Tech Lead", 60000, "Jan", detail3);
        StaffDTO staffDTO11 = new StaffDTO("Naveen", "Analyst", 45000, "Nov", detail3);
        StaffDTO staffDTO12 = new StaffDTO("Geeta", "Receptionist", 17000, "Dec", detail3);
        List<StaffDTO> staffDTOc = new ArrayList<>();
        staffDTOc.add(staffDTO9);
        staffDTOc.add(staffDTO10);
        staffDTOc.add(staffDTO11);
        staffDTOc.add(staffDTO12);


        StaffDTO staffDTO13 = new StaffDTO("Ajay", "Developer", 49000, "March", detail4);
        StaffDTO staffDTO14 = new StaffDTO("Reshma", "Office Staff", 12000, "June", detail4);
        StaffDTO staffDTO15 = new StaffDTO("Deepak", "Clerk", 16000, "July", detail4);
        StaffDTO staffDTO16 = new StaffDTO("Komal", "HR", 23000, "Sep", detail4);
        List<StaffDTO> staffDTOd = new ArrayList<>();
        staffDTOd.add(staffDTO13);
        staffDTOd.add(staffDTO14);
        staffDTOd.add(staffDTO15);
        staffDTOd.add(staffDTO16);

        StaffDTO staffDTO17 = new StaffDTO("Rahul", "Tester", 27000, "Oct", detail4);
        StaffDTO staffDTO18 = new StaffDTO("Anita", "Support Engineer", 30000, "Nov", detail4);
        StaffDTO staffDTO19 = new StaffDTO("Karthik", "Designer", 35000, "Dec", detail4);
        StaffDTO staffDTO20 = new StaffDTO("Sneha", "Project Manager", 60000, "Jan", detail4);

        List<StaffDTO> staffDTOe = new ArrayList<>();
        staffDTOe.add(staffDTO17);
        staffDTOe.add(staffDTO18);
        staffDTOe.add(staffDTO19);
        staffDTOe.add(staffDTO20);


        HeadOfDepartmentDTO headOfDepartmentDTO1 = new HeadOfDepartmentDTO("Kumar", "PhD", 1995, "ISE", staffDTOa);
        HeadOfDepartmentDTO headOfDepartmentDTO2 = new HeadOfDepartmentDTO("Sahana", "M.Tech", 2000, "CSE", staffDTOb);
        HeadOfDepartmentDTO headOfDepartmentDTO3 = new HeadOfDepartmentDTO("Ramesh", "PhD", 1992, "ECE", staffDTOc);
        HeadOfDepartmentDTO headOfDepartmentDTO4 = new HeadOfDepartmentDTO("Anita", "M.E", 1998, "EEE", staffDTOd);
        HeadOfDepartmentDTO headOfDepartmentDTO5 = new HeadOfDepartmentDTO("Manoj", "PhD", 1996, "Mechanical", staffDTOe);

        DepartmentDTO departmentDTO1 = new DepartmentDTO("Finance", "Yadav", 12, 27000, headOfDepartmentDTO1);
        DepartmentDTO departmentDTO2 = new DepartmentDTO("Computer Science", "Shetty", 18, 32000, headOfDepartmentDTO2);
        DepartmentDTO departmentDTO3 = new DepartmentDTO("Electronics", "Rao", 15, 29000, headOfDepartmentDTO3);
        DepartmentDTO departmentDTO4 = new DepartmentDTO("Electrical", "Patil", 10, 25000, headOfDepartmentDTO4);
        DepartmentDTO departmentDTO5 = new DepartmentDTO("Mechanical", "Verma", 14, 31000, headOfDepartmentDTO5);


        PortFolio portFolio1 = new PortFolio("Education Development", "Central", 1500000.0, 5, departmentDTO1);
        PortFolio portFolio2 = new PortFolio("Digital Transformation", "State", 1200000.0, 4, departmentDTO2);
        PortFolio portFolio3 = new PortFolio("Electronics Innovation", "Central", 1000000.0, 3, departmentDTO3);
        PortFolio portFolio4 = new PortFolio("Power & Energy", "State", 950000.0, 2, departmentDTO4);
        List<PortFolio> portFolioa = new ArrayList<>();
        portFolioa.add(portFolio1);
        portFolioa.add(portFolio2);
        portFolioa.add(portFolio3);
        portFolioa.add(portFolio4);

        PortFolio portFolio5 = new PortFolio("Mechanical Infrastructure", "Central", 1100000.0, 6, departmentDTO5);
        PortFolio portFolio6 = new PortFolio("Green Energy", "State", 980000.0, 3, departmentDTO1);
        PortFolio portFolio7 = new PortFolio("Cybersecurity Initiative", "Central", 1250000.0, 4, departmentDTO2);
        PortFolio portFolio8 = new PortFolio("Space Research", "Central", 2000000.0, 5, departmentDTO3);
        List<PortFolio> portFoliob = new ArrayList<>();
        portFoliob.add(portFolio5);
        portFoliob.add(portFolio6);
        portFoliob.add(portFolio7);
        portFoliob.add(portFolio8);

        PortFolio portFolio9 = new PortFolio("Healthcare Modernization", "State", 890000.0, 3, departmentDTO4);
        PortFolio portFolio10 = new PortFolio("Urban Development", "Central", 1150000.0, 7, departmentDTO5);
        PortFolio portFolio11 = new PortFolio("Agriculture Boost", "State", 950000.0, 4, departmentDTO1);
        PortFolio portFolio12 = new PortFolio("Transport Infrastructure", "Central", 1300000.0, 6, departmentDTO2);
        List<PortFolio> portFolioc = new ArrayList<>();
        portFolioc.add(portFolio9);
        portFolioc.add(portFolio10);
        portFolioc.add(portFolio11);
        portFolioc.add(portFolio12);


        MinisterDTO minister1 = new MinisterDTO("Rajeev Shukla", "Finance Minister", 58, 25, portFolioa);
        MinisterDTO minister2 = new MinisterDTO("Smita Reddy", "IT Minister", 52, 20, portFolioa);
        MinisterDTO minister3 = new MinisterDTO("Harsh Vardhan", "Energy Minister", 60, 30, portFolioa);
        MinisterDTO minister4 = new MinisterDTO("Neelam Sinha", "Health Minister", 48, 18,portFolioa);
        List<MinisterDTO> ministerDTOa = new ArrayList<>();
        ministerDTOa.add(minister1);
        ministerDTOa.add(minister2);
        ministerDTOa.add(minister3);
        ministerDTOa.add(minister4);

        MinisterDTO minister5 = new MinisterDTO("Amit Verma", "Transport Minister",  50, 22, portFoliob);
        MinisterDTO minister6 = new MinisterDTO("Deepika Shekar", "Education Minister", 45, 17, portFoliob);
        MinisterDTO minister7 = new MinisterDTO("Naveen Raju", "Science & Tech Minister", 50, 21, portFoliob);
        MinisterDTO minister8 = new MinisterDTO("Kavita Joshi", "Women & Child Welfare", 47, 19, portFoliob);
        List<MinisterDTO> ministerDTOb = new ArrayList<>();
        ministerDTOb.add(minister5);
        ministerDTOb.add(minister6);
        ministerDTOb.add(minister7);
        ministerDTOb.add(minister8);

        MinisterDTO minister9 = new MinisterDTO("Vikram Desai", "Rural Development Minister", 55, 24, portFolioc);
        MinisterDTO minister10 = new MinisterDTO("Anjali Menon", "Environment Minister", 49, 19, portFolioc);
        MinisterDTO minister11 = new MinisterDTO("Siddharth Rao", "Innovation Minister", 51, 20, portFolioc);
        MinisterDTO minister12 = new MinisterDTO("Priya Nair", "Tourism Minister", 46, 16,portFolioc);
        List<MinisterDTO> ministerDTOc = new ArrayList<>();
        ministerDTOc.add(minister9);
        ministerDTOc.add(minister10);
        ministerDTOc.add(minister11);
        ministerDTOc.add(minister12);

        StateDTO stateDTO1 = new StateDTO("Karnataka", "Basavaraj Bommai", "Bisi Bele Bath", "Bengaluru", ministerDTOa);
        StateDTO stateDTO2 = new StateDTO("Maharashtra", "Eknath Shinde", "Vada Pav", "Mumbai", ministerDTOa);
        StateDTO stateDTO3 = new StateDTO("Tamil Nadu", "M.K. Stalin", "Idli", "Chennai", ministerDTOa);
        StateDTO stateDTO4 = new StateDTO("Kerala", "Pinarayi Vijayan", "Appam", "Thiruvananthapuram", ministerDTOa);
        List<StateDTO> stateDTOa = new ArrayList<>();
        stateDTOa.add(stateDTO1);
        stateDTOa.add(stateDTO2);
        stateDTOa.add(stateDTO3);
        stateDTOa.add(stateDTO4);

        StateDTO stateDTO5 = new StateDTO("Uttar Pradesh", "Yogi Adityanath", "Bedmi Puri", "Lucknow", ministerDTOa);
        StateDTO stateDTO6 = new StateDTO("West Bengal", "Mamata Banerjee", "Rosogolla", "Kolkata", ministerDTOa);
        StateDTO stateDTO7 = new StateDTO("Rajasthan", "Ashok Gehlot", "Dal Baati Churma", "Jaipur", ministerDTOa);
        StateDTO stateDTO8 = new StateDTO("Gujarat", "Bhupendra Patel", "Dhokla", "Gandhinagar", ministerDTOa);
        List<StateDTO> stateDTOb = new ArrayList<>();
        stateDTOa.add(stateDTO5);
        stateDTOa.add(stateDTO6);
        stateDTOa.add(stateDTO7);
        stateDTOa.add(stateDTO8);


        StateDTO stateDTO9 = new StateDTO("Punjab", "Bhagwant Mann", "Sarson da Saag", "Chandigarh", ministerDTOa);
        StateDTO stateDTO10 = new StateDTO("Haryana", "Manohar Lal Khattar", "Bajra Khichdi", "Chandigarh", ministerDTOa);
        StateDTO stateDTO11 = new StateDTO("Odisha", "Naveen Patnaik", "Pakhala Bhata", "Bhubaneswar", ministerDTOa);
        StateDTO stateDTO12 = new StateDTO("Jharkhand", "Hemant Soren", "Litti Chokha", "Ranchi", ministerDTOa);
        List<StateDTO> stateDTOc = new ArrayList<>();
        stateDTOc.add(stateDTO9);
        stateDTOc.add(stateDTO10);
        stateDTOc.add(stateDTO11);
        stateDTOc.add(stateDTO12);


        StateDTO stateDTO13 = new StateDTO("Bihar", "Nitish Kumar", "Litti Chokha", "Patna", ministerDTOa);
        StateDTO stateDTO14 = new StateDTO("Chhattisgarh", "Bhupesh Baghel", "Chana Samosa", "Raipur", ministerDTOa);
        StateDTO stateDTO15 = new StateDTO("Assam", "Himanta Biswa Sarma", "Assam Laksa", "Dispur", ministerDTOa);
        StateDTO stateDTO16 = new StateDTO("Goa", "Pramod Sawant", "Fish Curry", "Panaji", ministerDTOa);
        List<StateDTO> stateDTOd = new ArrayList<>();
        stateDTOd.add(stateDTO13);
        stateDTOd.add(stateDTO14);
        stateDTOd.add(stateDTO15);
        stateDTOd.add(stateDTO16);


        StateDTO stateDTO17 = new StateDTO("Telangana", "K. Chandrashekar Rao", "Hyderabadi Biryani", "Hyderabad", ministerDTOa);
        StateDTO stateDTO18 = new StateDTO("Madhya Pradesh", "Shivraj Singh Chouhan", "Bhutte Ka Kees", "Bhopal", ministerDTOa);
        StateDTO stateDTO19 = new StateDTO("Himachal Pradesh", "Jai Ram Thakur", "Sidu", "Shimla", ministerDTOa);
        StateDTO stateDTO20 = new StateDTO("Nagaland", "Neiphiu Rio", "Smoked Pork", "Kohima", ministerDTOa);
        List<StateDTO> stateDTOe = new ArrayList<>();
        stateDTOe.add(stateDTO17);
        stateDTOe.add(stateDTO18);
        stateDTOe.add(stateDTO19);
        stateDTOe.add(stateDTO20);


        CountryDTO countryDTO1 = new CountryDTO("India", "Asia", "INR", "New Delhi", stateDTOa);
        CountryDTO countryDTO2 = new CountryDTO("United States", "North America", "USD", "Washington, D.C.", stateDTOa);
        CountryDTO countryDTO3 = new CountryDTO("Germany", "Europe", "Euro", "Berlin", stateDTOb);
        CountryDTO countryDTO4 = new CountryDTO("Australia", "Oceania", "AUD", "Canberra", stateDTOb);
        CountryDTO countryDTO5 = new CountryDTO("Brazil", "South America", "BRL", "Brasília", stateDTOc);
        CountryDTO countryDTO6 = new CountryDTO("Canada", "North America", "CAD", "Ottawa", stateDTOc);
        CountryDTO countryDTO7 = new CountryDTO("Japan", "Asia", "JPY", "Tokyo", stateDTOd);
        CountryDTO countryDTO8 = new CountryDTO("France", "Europe", "Euro", "Paris", stateDTOd);
        CountryDTO countryDTO9 = new CountryDTO("South Africa", "Africa", "ZAR", "Pretoria", stateDTOe);
        CountryDTO countryDTO10 = new CountryDTO("Russia", "Europe/Asia", "RUB", "Moscow", stateDTOe);

        List<CountryDTO> countryDTOList = new ArrayList<>(Arrays.asList(countryDTO1,countryDTO2,countryDTO3,countryDTO4,countryDTO5,countryDTO6,countryDTO7,countryDTO8,countryDTO9,countryDTO10));



    }
}
