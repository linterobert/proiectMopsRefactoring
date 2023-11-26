package RefactoredFiles.ParameterizeMethod;

public class Thermometer {
    public int temperature;

    public int raiseTemperature(int temp)
    {
        return temperature += temp;
    }
}
