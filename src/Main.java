public class Main {
    public static void main(String[] args) {
        BasicStructure audi=new BasicStructure();
        audi.color="Black";
        audi.model="A3";
        audi.power="5000cc";

        Engine x=new Engine();
        x.cylinders="8";
        x.size="1234cc";
        x.weight="6453k";

        Color color=new Color();
        color.colorLights="True";
        color.colorType="False";
        color.colorWindows="True";
    }
}