package utilities;

public class ReusableMethods {
    public static void bekle (int saniye)  {


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Bekleyemedim");
        }

    }
}
