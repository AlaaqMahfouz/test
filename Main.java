public class Main {
    

    public static void main(String[] args)
    {   
        temperature temp = new temperatureInCelsius(100);

        temperature temp2 = new temperatureInFahrenheit(50);

        System.out.println(temp.convert(scaleType.Fahrenheit));
        System.out.println(temp.convert(scaleType.Kelvin));

        System.out.println(temp2.convert(scaleType.Fahrenheit));
        System.out.println(temp2.convert(scaleType.Celsius));
        System.out.println(temp2.convert(scaleType.Kelvin));

        
    }
}
