public class temperatureInCelsius extends temperature{

    temperatureInCelsius(int value) {
        super(value);
        this.tempScale=scaleType.Celsius;
    }

    @Override
    public String convert(scaleType scale) {

        float newValue=0;

       if(scale.equals(this.tempScale))
       return "temperature is already in " + this.tempScale;

       switch (scale) {
        case Fahrenheit:
            newValue=(float) ((this.value*1.8)+32);
            break;

        case Kelvin:
        newValue=(float) (this.value+273.15);
        break;
       
        default:
            break;
       }

       return this.value + " in" + this.tempScale + " is " + newValue +" in "+ scale;
    }

}
