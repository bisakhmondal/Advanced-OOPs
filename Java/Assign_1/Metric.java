class Metric{
    static final double conv_rate=1.5;
    public static double mile2km(double  mile){
        return mile*conv_rate;
    }
    public static double km2mile(double km){
        return km/conv_rate;
    }
    public static void main(String[] args) {
        System.out.println("12 misle: "+mile2km(12));
        System.out.println("18 km: "+km2mile(18));

    }
}