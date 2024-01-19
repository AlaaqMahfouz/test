public abstract class temperature {

    scaleType tempScale;

    float value;

    temperature(int value)
    {
        this.value=value;
    }

    public abstract String convert(scaleType scale);

}
