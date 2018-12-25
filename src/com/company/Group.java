package com.company;

public class Group {

    public enum Characters {
        _STUPID_, _ACTIVE_, _SPORTSMAN_, _SMART_, _STRANGE_, _NERD_, _RESPONSIBLE_, _STRONG_MAN_;
    }

    public enum Accommodation {
        _DORMITORY_, _CITY_;
    }

    public static String Criteria = Characters._SMART_.name() + Characters._ACTIVE_.name() + Characters._STRONG_MAN_.name();
    public static String Criteria2 = Accommodation._DORMITORY_.name();


    public static Students Vova = new Students("Vova", 17, "Bachelor", Characters._SMART_.name() + Characters._ACTIVE_.name() + Characters._STRONG_MAN_.name(), 1, 3.54f, Accommodation._CITY_.name(), "Present");
    public static Students Max = new Students("Max", 18, "Bachelor", Characters._SMART_.name() + Characters._ACTIVE_.name() + Characters._STRONG_MAN_.name(), 1, 4.85f, Accommodation._DORMITORY_.name(), "Present");
    public static Students Vlad = new Students("Vlad", 18, "Bachelor", Characters._STRANGE_.name()+Characters._RESPONSIBLE_.name()+Characters._SMART_.name(), 1, 4.1f, Accommodation._DORMITORY_.name(), "Absent");
    public static Students Artem = new Students("Artem", 20, "Bachelor", Characters._STUPID_.name()+Characters._NERD_.name()+Characters._SPORTSMAN_.name(), 1, 3.05f, Accommodation._DORMITORY_.name(), "Present");
    public static Students Andrei = new Students("Andrei", 19, "Bachelor", Characters._SMART_.name() + Characters._ACTIVE_.name() + Characters._STRONG_MAN_.name(), 1, 4.35f, Accommodation._CITY_.name(), "Present");


    public static void Starosta(String[] args) {

        String [][] arr = new String [][] {{Group.Vova.character, Group.Max.character, Group.Vlad.character, Group.Artem.character, Group.Andrei.character},
                                          {Group.Vova.Accommodation, Group.Max.Accommodation, Group.Vlad.Accommodation, Group.Artem.Accommodation, Group.Andrei.Accommodation},
                                          {Group.Vova.present, Group.Max.present, Group.Vlad.present, Group.Artem.present, Group.Andrei.present}
        };
            float [] arr1 = new float [] {Group.Vova.average_rating, Group.Max.average_rating, Group.Vlad.average_rating, Group.Artem.average_rating, Group.Andrei.average_rating
            };
                String [] arr2 = new String [] {Group.Vova.Name, Group.Max.Name, Group.Vlad.Name,Group.Artem.Name, Group.Andrei.Name
                };

                    for (int i=0; i<=4; i++ ){
                        if ((arr[0][i].equals(Group.Criteria)) && (arr[1][i].equals(Group.Criteria2)) && (arr[2][i].equals("Present")) && (arr1[i] >= 4)) {
                        System.out.print("Everyone voted for " +arr2[i]+". Agreed! "+arr2[i]+" will be our headman.");

                        }
                    }





    }

}







