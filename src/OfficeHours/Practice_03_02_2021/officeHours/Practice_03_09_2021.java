package OfficeHours.Practice_03_02_2021.officeHours;
import com.sun.org.apache.xalan.internal.xsltc.dom.ArrayNodeListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Practice_03_09_2021 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.addAll(Arrays.asList(2,97,2,56,46,73,6,2,3,7));
        String str ="";

        for( int i = 0; i<num.size(); i++){
            if(num.get(i)>5){
                continue;
            }
            if(num.get(i) % 2==0){
                str+="1";
            }else{
                str+="0";
            }
        }
        System.out.println(str);
        }

            }



















