package LayoutText;


public  class MethodOperation {


    public static double add(double a, double b){
        return a+b;
    }

    public static double subs(double a, double b){
        return a-b;
    }

    public static long multi(double a, double b){
        return (long) (a*b);
    }

    public static double divi(double a, double b){
        return a/b;
    }

    public static double module(double a, double b){
        return  a % b;
    }

    public static double sqr(double a, double b){
        return Math.pow(a,b);
    }

    public static double sqrt(double a, double b){
        return Math.pow(a, 1.0/b);
    }

     public static double log10(double a){
        return Math.log10(a);
    }



}
