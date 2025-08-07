public class CmdLineArgumentPrint2 {

    public static void main(String[] args) {
        int i=0;
        for (String str : args) {
            System.out.println(i+"th argument = "+ str);
            i++;
        }
    }

}
