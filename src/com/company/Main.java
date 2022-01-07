package com.company;

public class Main {

    public static void main(String[] args) {
    double[] zxc ={3.4, -5.1, 4.8, -15.3, -4.2, 7.5, 8.3, 52.4, -7.6, 1.9, -3.6, 48.2, -31.7, 6.8, 44.1};
    double yey = 0;
    int cast = 0;
    boolean wej = false;
        for (double tt : zxc) {
            if (tt < 0){
                wej = true;
            } else{if (wej){
                yey += tt;
                cast += 1;
            }

            }


        }
        System.out.println(yey / cast);
        }
    }

