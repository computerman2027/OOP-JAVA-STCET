public class CmdLineArgumentPrint {

    public static void main(String[] args) {
        int l = args.length;
        for (int i = 0; i < l; i++) {
            System.out.println(i+"th argument = "+ args[i]);
        }
    }

}
