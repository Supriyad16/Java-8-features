package com.xworkz.lombok.repository;

import com.xworkz.lombok.dto.CountryDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CountryRepositoryImp implements CountryRepository{
    @Override
    public Collection<CountryDTO> countryFetch() {
        CountryDTO count1 = new CountryDTO("Afghanistan", 1001, 43.25, 34, 652230.0, "Hasan Akhund", "Pashto", "Dari", "0.017 tn USD");
        CountryDTO count2 = new CountryDTO("Albania", 1002, 2.76, 12, 28748.0, "Edi Rama", "Albanian", "Greek", "0.026 tn USD");
        CountryDTO count3 = new CountryDTO("Algeria", 1003, 44.0, 58, 2381741.0, "Aymen Benabderrahmane", "Arabic", "Tamazight", "0.167 tn USD");
        CountryDTO count4 = new CountryDTO("Andorra", 1004, 0.086, 7, 468.0, "Xavier Espot Zamora", "Catalan", "—", "0.003 tn USD");
        CountryDTO count5 = new CountryDTO("Angola", 1005, 36.5, 18, 1246700.0, "João Lourenço", "Portuguese", "—", "0.059 tn USD");
        CountryDTO count6 = new CountryDTO("Antigua and Barbuda", 1006, 0.098, 6, 442.6, "Gaston Browne", "English", "—", "0.001 tn USD");
        CountryDTO count7 = new CountryDTO("Argentina", 1007, 45.8, 23, 2780400.0, "Javier Milei", "Spanish", "—", "0.615 tn USD");
        CountryDTO count8 = new CountryDTO("Armenia", 1008, 3.03, 11, 29743.0, "Nikol Pashinyan", "Armenian", "—", "0.025 tn USD");
        CountryDTO count9 = new CountryDTO("Australia", 1009, 25.9, 6, 7692024.0, "Anthony Albanese", "English", "—", "1.7 tn USD");
        CountryDTO count10 = new CountryDTO("Austria", 1010, 9.0, 9, 83879.0, "Karl Nehammer", "German", "—", "0.505 tn USD");
        CountryDTO count11 = new CountryDTO("Azerbaijan", 1011, 10.1, 66, 86600.0, "Ali Asadov", "Azerbaijani", "—", "0.078 tn USD");
        CountryDTO count12 = new CountryDTO("Bahamas", 1012, 0.4, 31, 13943.0, "Philip Davis", "English", "—", "0.014 tn USD");
        CountryDTO count13 = new CountryDTO("Bahrain", 1013, 1.8, 4, 760.0, "Salman bin Hamad Al Khalifa", "Arabic", "English", "0.044 tn USD");
        CountryDTO count14 = new CountryDTO("Bangladesh", 1014, 172.9, 8, 147570.0, "Sheikh Hasina", "Bengali", "English", "0.476 tn USD");
        CountryDTO count15 = new CountryDTO("Barbados", 1015, 0.28, 11, 430.0, "Mia Mottley", "English", "—", "0.006 tn USD");
        CountryDTO count16 = new CountryDTO("Belarus", 1016, 9.2, 6, 207600.0, "Roman Golovchenko", "Belarusian", "Russian", "0.079 tn USD");
        CountryDTO count17 = new CountryDTO("Belgium", 1017, 11.6, 3, 30528.0, "Alexander De Croo", "Dutch", "French", "0.615 tn USD");
        CountryDTO count18 = new CountryDTO("Belize", 1018, 0.42, 6, 22966.0, "Johnny Briceño", "English", "Spanish", "0.002 tn USD");
        CountryDTO count19 = new CountryDTO("Benin", 1019, 13.7, 12, 112622.0, "Patrice Talon", "French", "—", "0.02 tn USD");
        CountryDTO count20 = new CountryDTO("Bhutan", 1020, 0.78, 20, 38394.0, "Tshering Tobgay", "Dzongkha", "English", "0.003 tn USD");
        CountryDTO count21 = new CountryDTO("Bolivia", 1021, 12.1, 9, 1098581.0, "Luis Arce", "Spanish", "Quechua", "0.044 tn USD");
        CountryDTO count22 = new CountryDTO("Bosnia and Herzegovina", 1022, 3.2, 2, 51129.0, "Borjana Krišto", "Bosnian", "Serbian", "0.021 tn USD");
        CountryDTO count23 = new CountryDTO("Botswana", 1023, 2.6, 10, 581730.0, "Mokgweetsi Masisi", "English", "Tswana", "0.02 tn USD");
        CountryDTO count24 = new CountryDTO("Brazil", 1024, 214.3, 26, 8515767.0, "Luiz Inácio Lula da Silva", "Portuguese", "—", "2.08 tn USD");
        CountryDTO count25 = new CountryDTO("Brunei", 1025, 0.45, 4, 5765.0, "Hassanal Bolkiah", "Malay", "English", "0.016 tn USD");
        CountryDTO count26 = new CountryDTO("Bulgaria", 1026, 6.5, 28, 110879.0, "Nikolai Denkov", "Bulgarian", "—", "0.089 tn USD");
        CountryDTO count27 = new CountryDTO("Burkina Faso", 1027, 23.2, 13, 272967.0, "Apollinaire Kyélem de Tambèla", "French", "Mossi", "0.02 tn USD");
        CountryDTO count28 = new CountryDTO("Burundi", 1028, 13.2, 18, 27834.0, "Gervais Ndirakobuca", "Kirundi", "French", "0.003 tn USD");
        CountryDTO count29 = new CountryDTO("Cabo Verde", 1029, 0.6, 22, 4033.0, "Ulisses Correia e Silva", "Portuguese", "Cape Verdean Creole", "0.002 tn USD");
        CountryDTO count30 = new CountryDTO("Cambodia", 1030, 17.1, 25, 181035.0, "Hun Manet", "Khmer", "—", "0.03 tn USD");
        CountryDTO count31 = new CountryDTO("Cameroon", 1031, 28.6, 10, 475442.0, "Joseph Ngute", "French", "English", "0.045 tn USD");
        CountryDTO count32 = new CountryDTO("Canada", 1032, 38.9, 10, 9984670.0, "Justin Trudeau", "English", "French", "2.13 tn USD");
        CountryDTO count33 = new CountryDTO("Central African Republic", 1033, 5.7, 16, 622984.0, "Félix Moloua", "French", "Sango", "0.002 tn USD");
        CountryDTO count34 = new CountryDTO("Chad", 1034, 18.3, 23, 1284000.0, "Succès Masra", "French", "Arabic", "0.014 tn USD");
        CountryDTO count35 = new CountryDTO("Chile", 1035, 19.5, 16, 756102.0, "Gabriel Boric", "Spanish", "Mapudungun", "0.31 tn USD");
        CountryDTO count36 = new CountryDTO("China", 1036, 1412.0, 23, 9596961.0, "Li Qiang", "Mandarin", "—", "17.7 tn USD");
        CountryDTO count37 = new CountryDTO("Colombia", 1037, 52.2, 32, 1141748.0, "Gustavo Petro", "Spanish", "—", "0.32 tn USD");
        CountryDTO count38 = new CountryDTO("Comoros", 1038, 0.84, 3, 2235.0, "Azali Assoumani", "Arabic", "French", "0.001 tn USD");
        CountryDTO count39 = new CountryDTO("Congo (Brazzaville)", 1039, 6.1, 12, 342000.0, "Anatole Collinet Makosso", "French", "Kikongo", "0.014 tn USD");
        CountryDTO count40 = new CountryDTO("Croatia", 1040, 3.8, 20, 56594.0, "Andrej Plenković", "Croatian", "—", "0.078 tn USD");
        CountryDTO count41 = new CountryDTO("Cuba", 1041, 11.2, 15, 109884.0, "Manuel Marrero Cruz", "Spanish", "—", "0.121 tn USD");
        CountryDTO count42 = new CountryDTO("Cyprus", 1042, 1.25, 6, 9251.0, "Nikos Christodoulides", "Greek", "Turkish", "0.031 tn USD");
        CountryDTO count43 = new CountryDTO("Czech Republic", 1043, 10.5, 14, 78866.0, "Petr Fiala", "Czech", "—", "0.352 tn USD");
        CountryDTO count44 = new CountryDTO("Democratic Republic of the Congo", 1044, 102.3, 26, 2344858.0, "Jean-Michel Sama Lukonde", "French", "Lingala", "0.064 tn USD");
        CountryDTO count45 = new CountryDTO("Denmark", 1045, 5.9, 5, 42933.0, "Mette Frederiksen", "Danish", "—", "0.447 tn USD");
        CountryDTO count46 = new CountryDTO("Djibouti", 1046, 1.1, 5, 23200.0, "Abdoulkader Kamil Mohamed", "French", "Arabic", "0.004 tn USD");
        CountryDTO count47 = new CountryDTO("Dominica", 1047, 0.07, 10, 751.0, "Roosevelt Skerrit", "English", "—", "0.0006 tn USD");
        CountryDTO count48 = new CountryDTO("Dominican Republic", 1048, 11.3, 31, 48671.0, "Luis Abinader", "Spanish", "—", "0.115 tn USD");
        CountryDTO count49 = new CountryDTO("East Timor", 1049, 1.4, 13, 14874.0, "Xanana Gusmão", "Tetum", "Portuguese", "0.002 tn USD");
        CountryDTO count50 = new CountryDTO("Ecuador", 1050, 18.0, 24, 283561.0, "Daniel Noboa", "Spanish", "Kichwa", "0.118 tn USD");
        CountryDTO count51 = new CountryDTO("Egypt", 1051, 113.0, 27, 1002450.0, "Mostafa Madbouly", "Arabic", "—", "0.387 tn USD");
        CountryDTO count52 = new CountryDTO("El Salvador", 1052, 6.5, 14, 21041.0, "Nayib Bukele", "Spanish", "—", "0.032 tn USD");
        CountryDTO count53 = new CountryDTO("Equatorial Guinea", 1053, 1.7, 8, 28051.0, "Manuela Roka Botey", "Spanish", "French", "0.013 tn USD");
        CountryDTO count54 = new CountryDTO("Eritrea", 1054, 3.7, 6, 117600.0, "Abiy Ahmed (in transition)", "Tigrinya", "Arabic", "0.002 tn USD");
        CountryDTO count55 = new CountryDTO("Estonia", 1055, 1.3, 15, 45228.0, "Kaja Kallas", "Estonian", "—", "0.040 tn USD");
        CountryDTO count56 = new CountryDTO("Eswatini", 1056, 1.2, 4, 17364.0, "Cleopas Dlamini", "Swati", "English", "0.005 tn USD");
        CountryDTO count57 = new CountryDTO("Ethiopia", 1057, 126.5, 11, 1104300.0, "Abiy Ahmed", "Amharic", "Oromo", "0.156 tn USD");
        CountryDTO count58 = new CountryDTO("Fiji", 1058, 0.9, 14, 18333.0, "Sitiveni Rabuka", "English", "Fijian", "0.005 tn USD");
        CountryDTO count59 = new CountryDTO("Finland", 1059, 5.6, 19, 338455.0, "Petteri Orpo", "Finnish", "Swedish", "0.314 tn USD");
        CountryDTO count60 = new CountryDTO("France", 1060, 67.8, 18, 551695.0, "Gabriel Attal", "French", "—", "3.1 tn USD");
        CountryDTO count61 = new CountryDTO("Gabon", 1061, 2.4, 9, 267667.0, "Raymond Ndong Sima", "French", "Fang", "0.021 tn USD");
        CountryDTO count62 = new CountryDTO("Gambia", 1062, 2.7, 5, 11295.0, "Adama Barrow", "English", "Mandinka", "0.002 tn USD");
        CountryDTO count63 = new CountryDTO("Georgia", 1063, 3.7, 9, 69700.0, "Irakli Kobakhidze", "Georgian", "—", "0.026 tn USD");
        CountryDTO count64 = new CountryDTO("Germany", 1064, 83.3, 16, 357022.0, "Olaf Scholz", "German", "—", "4.4 tn USD");
        CountryDTO count65 = new CountryDTO("Ghana", 1065, 34.1, 16, 238533.0, "Nana Akufo-Addo", "English", "Akan", "0.077 tn USD");
        CountryDTO count66 = new CountryDTO("Greece", 1066, 10.3, 13, 131957.0, "Kyriakos Mitsotakis", "Greek", "—", "0.303 tn USD");
        CountryDTO count67 = new CountryDTO("Grenada", 1067, 0.1, 6, 344.0, "Dickon Mitchell", "English", "—", "0.0012 tn USD");
        CountryDTO count68 = new CountryDTO("Guatemala", 1068, 18.1, 22, 108889.0, "Bernardo Arévalo", "Spanish", "K'iche'", "0.098 tn USD");
        CountryDTO count69 = new CountryDTO("Guinea", 1069, 14.2, 8, 245857.0, "Bernard Goumou", "French", "Pular", "0.02 tn USD");
        CountryDTO count70 = new CountryDTO("Guinea-Bissau", 1070, 2.2, 8, 36125.0, "Geraldo Martins", "Portuguese", "Crioulo", "0.0017 tn USD");
        CountryDTO count71 = new CountryDTO("Guyana", 1071, 0.8, 10, 214969.0, "Irfaan Ali", "English", "Guyanese Creole", "0.019 tn USD");
        CountryDTO count72 = new CountryDTO("Haiti", 1072, 11.7, 10, 27750.0, "Garry Conille", "French", "Haitian Creole", "0.02 tn USD");
        CountryDTO count73 = new CountryDTO("Honduras", 1073, 10.7, 18, 112492.0, "Xiomara Castro", "Spanish", "—", "0.031 tn USD");
        CountryDTO count74 = new CountryDTO("Hungary", 1074, 9.6, 19, 93028.0, "Viktor Orbán", "Hungarian", "—", "0.216 tn USD");
        CountryDTO count75 = new CountryDTO("Iceland", 1075, 0.38, 8, 103000.0, "Bjarni Benediktsson", "Icelandic", "—", "0.030 tn USD");
        CountryDTO count76 = new CountryDTO("India", 1076, 1428.6, 28, 3287263.0, "Narendra Modi", "Hindi", "English", "3.7 tn USD");
        CountryDTO count77 = new CountryDTO("Indonesia", 1077, 277.5, 38, 1904569.0, "Prabowo Subianto", "Indonesian", "Javanese", "1.5 tn USD");
        CountryDTO count78 = new CountryDTO("Iran", 1078, 89.0, 31, 1648195.0, "Mohammad Mokhber (Acting)", "Persian", "—", "0.4 tn USD");
        CountryDTO count79 = new CountryDTO("Iraq", 1079, 44.5, 18, 438317.0, "Mohammed Shia' Al Sudani", "Arabic", "Kurdish", "0.267 tn USD");
        CountryDTO count80 = new CountryDTO("Ireland", 1080, 5.1, 26, 70273.0, "Simon Harris", "Irish", "English", "0.55 tn USD");
        CountryDTO count81 = new CountryDTO("Israel", 1081, 9.8, 6, 22072.0, "Benjamin Netanyahu", "Hebrew", "Arabic", "0.525 tn USD");
        CountryDTO count82 = new CountryDTO("Italy", 1082, 59.0, 20, 301340.0, "Giorgia Meloni", "Italian", "—", "2.2 tn USD");
        CountryDTO count83 = new CountryDTO("Jamaica", 1083, 2.8, 14, 10991.0, "Andrew Holness", "English", "Jamaican Patois", "0.017 tn USD");
        CountryDTO count84 = new CountryDTO("Japan", 1084, 124.6, 47, 377975.0, "Fumio Kishida", "Japanese", "—", "4.2 tn USD");
        CountryDTO count85 = new CountryDTO("Jordan", 1085, 11.3, 12, 89342.0, "Bisher Al-Khasawneh", "Arabic", "—", "0.049 tn USD");
        CountryDTO count86 = new CountryDTO("Kazakhstan", 1086, 19.6, 17, 2724900.0, "Alikhan Smailov", "Kazakh", "Russian", "0.265 tn USD");
        CountryDTO count87 = new CountryDTO("Kenya", 1087, 55.1, 47, 580367.0, "William Ruto", "Swahili", "English", "0.113 tn USD");
        CountryDTO count88 = new CountryDTO("Kiribati", 1088, 0.13, 3, 811.0, "Taneti Maamau", "English", "Gilbertese", "0.0002 tn USD");
        CountryDTO count89 = new CountryDTO("Kuwait", 1089, 4.4, 6, 17818.0, "Ahmad Nawaf Al-Ahmad Al-Sabah", "Arabic", "English", "0.158 tn USD");
        CountryDTO count90 = new CountryDTO("Kyrgyzstan", 1090, 7.1, 7, 199951.0, "Akylbek Japarov", "Kyrgyz", "Russian", "0.011 tn USD");
        CountryDTO count91 = new CountryDTO("Laos", 1091, 7.5, 17, 236800.0, "Sonexay Siphandone", "Lao", "—", "0.018 tn USD");
        CountryDTO count92 = new CountryDTO("Latvia", 1092, 1.9, 26, 64589.0, "Evika Siliņa", "Latvian", "Russian", "0.045 tn USD");
        CountryDTO count93 = new CountryDTO("Lebanon", 1093, 5.3, 8, 10452.0, "Najib Mikati", "Arabic", "French", "0.023 tn USD");
        CountryDTO count94 = new CountryDTO("Lesotho", 1094, 2.3, 10, 30355.0, "Sam Matekane", "Sesotho", "English", "0.002 tn USD");
        CountryDTO count95 = new CountryDTO("Liberia", 1095, 5.5, 15, 111369.0, "Joseph Boakai", "English", "Kpelle", "0.004 tn USD");
        CountryDTO count96 = new CountryDTO("Libya", 1096, 6.8, 22, 1759540.0, "Abdul Hamid Dbeibeh", "Arabic", "—", "0.041 tn USD");
        CountryDTO count97 = new CountryDTO("Liechtenstein", 1097, 0.04, 11, 160.0, "Daniel Risch", "German", "—", "0.007 tn USD");
        CountryDTO count98 = new CountryDTO("Lithuania", 1098, 2.8, 10, 65300.0, "Ingrida Šimonytė", "Lithuanian", "Russian", "0.077 tn USD");
        CountryDTO count99 = new CountryDTO("Luxembourg", 1099, 0.67, 12, 2586.0, "Luc Frieden", "Luxembourgish", "French", "0.089 tn USD");
        CountryDTO count100 = new CountryDTO("Madagascar", 1100, 30.3, 23, 587041.0, "Christian Ntsay", "Malagasy", "French", "0.016 tn USD");
        CountryDTO count101 = new CountryDTO("Malawi", 1101, 21.6, 28, 118484.0, "Lazarus Chakwera", "English", "Chichewa", "0.013 tn USD");
        CountryDTO count102 = new CountryDTO("Malaysia", 1102, 34.3, 13, 330803.0, "Anwar Ibrahim", "Malay", "English", "0.434 tn USD");
        CountryDTO count103 = new CountryDTO("Maldives", 1103, 0.52, 21, 300.0, "Mohamed Muizzu", "Dhivehi", "English", "0.006 tn USD");
        CountryDTO count104 = new CountryDTO("Mali", 1104, 23.3, 10, 1240192.0, "Choguel Kokalla Maïga", "French", "Bambara", "0.02 tn USD");
        CountryDTO count105 = new CountryDTO("Malta", 1105, 0.52, 6, 316.0, "Robert Abela", "Maltese", "English", "0.017 tn USD");
        CountryDTO count106 = new CountryDTO("Marshall Islands", 1106, 0.06, 24, 181.0, "David Kabua", "Marshallese", "English", "0.0003 tn USD");
        CountryDTO count107 = new CountryDTO("Mauritania", 1107, 5.1, 15, 1030700.0, "Mohamed Ould Bilal", "Arabic", "French", "0.011 tn USD");
        CountryDTO count108 = new CountryDTO("Mauritius", 1108, 1.3, 9, 2040.0, "Pravind Jugnauth", "English", "French", "0.014 tn USD");
        CountryDTO count109 = new CountryDTO("Mexico", 1109, 130.4, 32, 1964375.0, "Andrés Manuel López Obrador", "Spanish", "—", "1.79 tn USD");
        CountryDTO count110 = new CountryDTO("Myanmar", 1110, 55.2, 14, 676578.0, "Min Aung Hlaing", "Burmese", "—", "0.059 tn USD");
        CountryDTO count111 = new CountryDTO("Namibia", 1111, 2.6, 14, 825615.0, "Nangolo Mbumba", "English", "Afrikaans", "0.013 tn USD");
        CountryDTO count112 = new CountryDTO("Nauru", 1112, 0.011, 14, 21.0, "David Adeang", "Nauruan", "English", "0.0001 tn USD");
        CountryDTO count113 = new CountryDTO("Nepal", 1113, 30.7, 7, 147516.0, "Pushpa Kamal Dahal", "Nepali", "Maithili", "0.040 tn USD");
        CountryDTO count114 = new CountryDTO("Netherlands", 1114, 17.9, 12, 41543.0, "Dick Schoof", "Dutch", "Frisian", "1.04 tn USD");
        CountryDTO count115 = new CountryDTO("New Zealand", 1115, 5.3, 16, 268838.0, "Christopher Luxon", "English", "Māori", "0.251 tn USD");
        CountryDTO count116 = new CountryDTO("Nicaragua", 1116, 7.1, 15, 130373.0, "Daniel Ortega", "Spanish", "Miskito", "0.015 tn USD");
        CountryDTO count117 = new CountryDTO("Niger", 1117, 27.2, 8, 1267000.0, "Ali Lamine Zeine", "French", "Hausa", "0.016 tn USD");
        CountryDTO count118 = new CountryDTO("Nigeria", 1118, 223.8, 36, 923769.0, "Bola Tinubu", "English", "Yoruba", "0.477 tn USD");
        CountryDTO count119 = new CountryDTO("North Korea", 1119, 26.0, 9, 120540.0, "Kim Tok-hun", "Korean", "—", "0.028 tn USD");
        CountryDTO count120 = new CountryDTO("North Macedonia", 1120, 2.1, 8, 25713.0, "Hristijan Mickoski", "Macedonian", "Albanian", "0.014 tn USD");
        CountryDTO count121 = new CountryDTO("Norway", 1121, 5.5, 11, 385207.0, "Jonas Gahr Støre", "Norwegian", "Sami", "0.579 tn USD");
        CountryDTO count122 = new CountryDTO("Oman", 1122, 4.5, 11, 309500.0, "Sultan Haitham bin Tariq", "Arabic", "—", "0.108 tn USD");
        CountryDTO count123 = new CountryDTO("Pakistan", 1123, 241.5, 4, 881913.0, "Shehbaz Sharif", "Urdu", "Punjabi", "0.375 tn USD");
        CountryDTO count124 = new CountryDTO("Palau", 1124, 0.018, 16, 459.0, "Surangel Whipps Jr.", "Palauan", "English", "0.0002 tn USD");
        CountryDTO count125 = new CountryDTO("Panama", 1125, 4.5, 10, 75417.0, "José Raúl Mulino", "Spanish", "Ngäbere", "0.078 tn USD");
        CountryDTO count126 = new CountryDTO("Papua New Guinea", 1126, 10.3, 22, 462840.0, "James Marape", "English", "Tok Pisin", "0.033 tn USD");
        CountryDTO count127 = new CountryDTO("Paraguay", 1127, 7.5, 17, 406752.0, "Santiago Peña", "Spanish", "Guarani", "0.041 tn USD");
        CountryDTO count128 = new CountryDTO("Peru", 1128, 34.6, 25, 1285216.0, "Dina Boluarte", "Spanish", "Quechua", "0.268 tn USD");
        CountryDTO count129 = new CountryDTO("Philippines", 1129, 117.3, 17, 300000.0, "Ferdinand Marcos Jr.", "Filipino", "English", "0.45 tn USD");
        CountryDTO count130 = new CountryDTO("Palestine", 1130, 5.3, 2, 6020.0, "Mohammad Shtayyeh", "Arabic", "—", "0.017 tn USD");
        CountryDTO count131 = new CountryDTO("Poland", 1131, 37.7, 16, 312679.0, "Donald Tusk", "Polish", "—", "0.85 tn USD");
        CountryDTO count132 = new CountryDTO("Portugal", 1132, 10.2, 18, 92090.0, "Luís Montenegro", "Portuguese", "Mirandese", "0.296 tn USD");
        CountryDTO count133 = new CountryDTO("Qatar", 1133, 2.7, 8, 11586.0, "Mohammed bin Abdulrahman Al Thani", "Arabic", "English", "0.241 tn USD");
        CountryDTO count134 = new CountryDTO("Republic of the Congo", 1134, 6.1, 12, 342000.0, "Anatole Collinet Makosso", "French", "Kituba", "0.014 tn USD");
        CountryDTO count135 = new CountryDTO("Romania", 1135, 19.8, 41, 238397.0, "Marcel Ciolacu", "Romanian", "Hungarian", "0.357 tn USD");
        CountryDTO count136 = new CountryDTO("Russia", 1136, 143.4, 85, 17098242.0, "Mikhail Mishustin", "Russian", "Tatar", "2.2 tn USD");
        CountryDTO count137 = new CountryDTO("Rwanda", 1137, 14.1, 30, 26338.0, "Édouard Ngirente", "Kinyarwanda", "English", "0.013 tn USD");
        CountryDTO count138 = new CountryDTO("Saint Kitts and Nevis", 1138, 0.053, 14, 261.0, "Terrance Drew", "English", "—", "0.001 tn USD");
        CountryDTO count139 = new CountryDTO("Saint Lucia", 1139, 0.18, 11, 617.0, "Philip J. Pierre", "English", "Saint Lucian Creole", "0.002 tn USD");
        CountryDTO count140 = new CountryDTO("Saint Vincent and the Grenadines", 1140, 0.1, 6, 389.0, "Ralph Gonsalves", "English", "Vincentian Creole", "0.0012 tn USD");
        CountryDTO count141 = new CountryDTO("Samoa", 1141, 0.2, 11, 2842.0, "Fiamē Naomi Mataʻafa", "Samoan", "English", "0.0011 tn USD");
        CountryDTO count142 = new CountryDTO("San Marino", 1142, 0.03, 9, 61.0, "Alessandro Scarano", "Italian", "—", "0.002 tn USD");
        CountryDTO count143 = new CountryDTO("Sao Tome and Principe", 1143, 0.23, 7, 964.0, "Patrice Trovoada", "Portuguese", "Forro", "0.0006 tn USD");
        CountryDTO count144 = new CountryDTO("Saudi Arabia", 1144, 36.9, 13, 2149690.0, "Mohammed bin Salman", "Arabic", "—", "1.1 tn USD");
        CountryDTO count145 = new CountryDTO("Senegal", 1145, 18.0, 14, 196722.0, "Ousmane Sonko", "French", "Wolof", "0.031 tn USD");
        CountryDTO count146 = new CountryDTO("Serbia", 1146, 6.6, 29, 77474.0, "Miloš Vučević", "Serbian", "Hungarian", "0.077 tn USD");
        CountryDTO count147 = new CountryDTO("Seychelles", 1147, 0.1, 8, 455.0, "Wavel Ramkalawan", "Seychellois Creole", "English", "0.002 tn USD");
        CountryDTO count148 = new CountryDTO("Sierra Leone", 1148, 8.8, 16, 71740.0, "Julius Maada Bio", "English", "Krio", "0.004 tn USD");
        CountryDTO count149 = new CountryDTO("Singapore", 1149, 5.9, 1, 728.0, "Lawrence Wong", "Malay", "English", "0.500 tn USD");
        CountryDTO count150 = new CountryDTO("Slovakia", 1150, 5.4, 8, 49035.0, "Robert Fico", "Slovak", "Hungarian", "0.128 tn USD");
        CountryDTO count151 = new CountryDTO("Slovenia", 1151, 2.1, 12, 20273.0, "Robert Golob", "Slovene", "Hungarian", "0.071 tn USD");
        CountryDTO count152 = new CountryDTO("Solomon Islands", 1152, 0.73, 9, 28896.0, "Jeremiah Manele", "English", "Pijin", "0.002 tn USD");
        CountryDTO count153 = new CountryDTO("Somalia", 1153, 18.1, 18, 637657.0, "Hamza Abdi Barre", "Somali", "Arabic", "0.01 tn USD");
        CountryDTO count154 = new CountryDTO("South Africa", 1154, 60.4, 9, 1221037.0, "Cyril Ramaphosa", "Zulu", "English", "0.399 tn USD");
        CountryDTO count155 = new CountryDTO("South Korea", 1155, 51.7, 17, 100210.0, "Han Duck-soo", "Korean", "—", "1.7 tn USD");
        CountryDTO count156 = new CountryDTO("South Sudan", 1156, 11.0, 10, 619745.0, "Abdelbagi Akol", "English", "Arabic", "0.005 tn USD");
        CountryDTO count157 = new CountryDTO("Spain", 1157, 47.6, 17, 505990.0, "Pedro Sánchez", "Spanish", "Catalan", "1.6 tn USD");
        CountryDTO count158 = new CountryDTO("Sri Lanka", 1158, 21.9, 9, 65610.0, "Dinesh Gunawardena", "Sinhala", "Tamil", "0.074 tn USD");
        CountryDTO count159 = new CountryDTO("Sudan", 1159, 48.1, 18, 1861484.0, "Osman Hussein", "Arabic", "English", "0.035 tn USD");
        CountryDTO count160 = new CountryDTO("Suriname", 1160, 0.6, 10, 163820.0, "Chandrikapersad Santokhi", "Dutch", "Sranan Tongo", "0.0035 tn USD");
        CountryDTO count161 = new CountryDTO("Sweden", 1161, 10.5, 21, 450295.0, "Ulf Kristersson", "Swedish", "Sami", "0.635 tn USD");
        CountryDTO count162 = new CountryDTO("Switzerland", 1162, 8.8, 26, 41285.0, "Viola Amherd", "German", "French", "0.892 tn USD");
        CountryDTO count163 = new CountryDTO("Syria", 1163, 22.0, 14, 185180.0, "Hussein Arnous", "Arabic", "Kurdish", "0.060 tn USD");
        CountryDTO count164 = new CountryDTO("Tajikistan", 1164, 10.1, 4, 143100.0, "Kokhir Rasulzoda", "Tajik", "Russian", "0.011 tn USD");
        CountryDTO count165 = new CountryDTO("Tanzania", 1165, 67.4, 31, 945087.0, "Kassim Majaliwa", "Swahili", "English", "0.077 tn USD");
        CountryDTO count166 = new CountryDTO("Thailand", 1166, 71.7, 76, 513120.0, "Srettha Thavisin", "Thai", "English", "0.5 tn USD");
        CountryDTO count167 = new CountryDTO("Timor-Leste", 1167, 1.4, 13, 14874.0, "Xanana Gusmão", "Tetum", "Portuguese", "0.002 tn USD");
        CountryDTO count168 = new CountryDTO("Togo", 1168, 8.8, 5, 56785.0, "Victoire Tomegah Dogbé", "French", "Ewe", "0.008 tn USD");
        CountryDTO count169 = new CountryDTO("Tonga", 1169, 0.1, 5, 747.0, "Siaosi Sovaleni", "Tongan", "English", "0.0005 tn USD");
        CountryDTO count170 = new CountryDTO("Trinidad and Tobago", 1170, 1.5, 9, 5130.0, "Keith Rowley", "English", "Trinidadian Creole", "0.031 tn USD");
        CountryDTO count171 = new CountryDTO("Tunisia", 1171, 12.4, 24, 163610.0, "Najla Bouden", "Arabic", "French", "0.048 tn USD");
        CountryDTO count172 = new CountryDTO("Turkey", 1172, 85.3, 81, 783562.0, "Recep Tayyip Erdoğan", "Turkish", "Kurdish", "1.1 tn USD");
        CountryDTO count173 = new CountryDTO("Turkmenistan", 1173, 6.5, 5, 488100.0, "Serdar Berdimuhamedow", "Turkmen", "Russian", "0.059 tn USD");
        CountryDTO count174 = new CountryDTO("Tuvalu", 1174, 0.011, 1, 26.0, "Kausea Natano", "Tuvaluan", "English", "0.00005 tn USD");
        CountryDTO count175 = new CountryDTO("Uganda", 1175, 48.6, 135, 241038.0, "Robinah Nabbanja", "English", "Swahili", "0.050 tn USD");
        CountryDTO count176 = new CountryDTO("Ukraine", 1176, 36.7, 24, 603550.0, "Denys Shmyhal", "Ukrainian", "Russian", "0.161 tn USD");
        CountryDTO count177 = new CountryDTO("United Arab Emirates", 1177, 9.5, 7, 83600.0, "Mohammed bin Rashid Al Maktoum", "Arabic", "English", "0.536 tn USD");
        CountryDTO count178 = new CountryDTO("United Kingdom", 1178, 67.7, 4, 243610.0, "Rishi Sunak", "English", "Welsh", "3.5 tn USD");
        CountryDTO count179 = new CountryDTO("United States", 1179, 339.9, 50, 9833520.0, "Joe Biden", "English", "Spanish", "28.4 tn USD");
        CountryDTO count180 = new CountryDTO("Uruguay", 1180, 3.4, 19, 176215.0, "Luis Lacalle Pou", "Spanish", "Portuguese", "0.074 tn USD");



        Collection<CountryDTO> countryDTOCollection = new ArrayList<>(Arrays.asList(count1,count2,count3,count4,count5,count6,count7,count8,count9,count10,
        count11,count12,count13,count14,count15,count16,count17,count18,count19,count20,
                count21,count22,count23,count24,count25,count26,count27,count28,count29,count30,
                count31,count32,count33,count34,count35,count36,count37,count38,count39,count40,
                count41,count42,count43,count44,count45,count46,count47,count48,count49,count50,
                count51,count52,count53,count54,count55,count56,count57,count58,count59,count60,
                count61,count62,count63,count64,count65,count66,count67,count68,count69,count70,
                count71,count72,count73,count74,count75,count76,count77,count78,count79,count80,
                count81,count82,count83,count84,count85,count86,count87,count88,count89,count90,
                count91,count92,count93,count94,count95,count96,count97,count98,count99,count100,
                count101,count102,count103,count104,count105,count106,count107,count108,count109,count110,
                count111,count12,count113,count114,count115,count116,count117,count118,count119,count120,
                count121,count122,count123,count124,count125,count126,count127,count128,count129,count130,
                count131,count132,count133,count134,count135,count136,count137,count138,count139,count140,
                count141,count142,count43,count44,count45,count46,count47,count48,count49,count50,
                count151,count152,count153,count154,count155,count156,count157,count158,count159,count160,
                count161,count162,count163,count164,count165,count166,count167,count168,count169,count170,
                count171,count172,count173,count174,count175,count176,count177,count178,count179,count180));



        return countryDTOCollection ;
    }
}
