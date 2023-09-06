public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T"; // M / T / B

        if(plano == "B") {
            System.out.println("100 minutos de ligação");
        }
        else if(plano == "M") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whatsapp e Instagram gratis");
        }
        else if(plano == "T"){
            System.out.println("100 minutos de ligação");
            System.out.println("Whatsapp e Instagram gratis");
            System.out.println("5gb de YouTube");
        }

        //SwitchCase

        switch(plano){
            case "T": {
                System.out.println("5gb de YouTube");
            }
            case "M": {
                System.out.println("Whatsapp e Instagram gratis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
