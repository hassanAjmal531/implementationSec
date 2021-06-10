package com.example.secimplementation;

import android.database.Cursor;

public class system {



    public static String[] getData(dbHelper db,String answer1, String answer2,String name){
       return assesDataAndCompileResult(db,answer1,answer2,name);

    }
    public static String[] assesDataAndCompileResult(dbHelper db,String answer1, String answer2, String name){
        int a = Integer.valueOf(answer1);
        int b = Integer.valueOf(answer2);
        String sum = Integer.toString(a+b);
        boolean flag =db.updateResultsData(name,sum );
        Cursor c = db.getdata(name);

        if(flag)
           if(c != null){
               c.moveToFirst();

               String result = c.getString(1);
              return choosevideos(result);
           }
        return null;




    }
    public static String[] choosevideos(String result){
        String [] vidNames = new String[3];
        int r = Integer.valueOf(result);
        if(r > 4 && r <=8){
            vidNames[1] = "iwlP4MZz6qs";
            vidNames[2] = "Gi46yco8OJg";
            vidNames[3] = "uMqgf17mx_U";

            return vidNames;


        }

        return null;


    }
}
