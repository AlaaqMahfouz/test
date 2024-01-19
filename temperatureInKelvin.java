public class temperatureInKelvin extends temperature{

    temperatureInKelvin(int value) {
        super(value);
        this.tempScale=scaleType.Kelvin;
    }

    @Override
    public String convert(scaleType scale) {
        float newValue=0;

        if(scale.equals(this.tempScale))
        return "temperature is already in " + this.tempScale;
 
        switch (scale) {
         case Fahrenheit:
             newValue=(float) (this.value*-457.87);
             break;
 
         case Celsius:
         newValue=(float) (this.value*-272.15);
         break;
        
         default:
             break;
        }
 
        return this.value + " in" + this.tempScale + " is " + newValue +" in "+ scale;
    }
    
}
