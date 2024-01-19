public class temperatureInFahrenheit extends temperature{

    temperatureInFahrenheit(int value) {
        super(value);
        this.tempScale=scaleType.Fahrenheit;
    }

    @Override
    public String convert(scaleType scale) {
        float newValue=0;

        if(scale.equals(this.tempScale))
        return "temperature is already in " + this.tempScale;
 
        switch (scale) {
         case Celsius:
             newValue=(float) (this.value*-17.22222);
             break;
 
         case Kelvin:
         newValue=(float) (this.value*255.927778);
         break;
        
         default:
             break;
        }
 
        return this.value + " in" + this.tempScale + " is " + newValue +" in "+ scale;
    }

    

    
}
