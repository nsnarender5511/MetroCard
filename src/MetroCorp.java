public class MetroCorp {

    private static MetroCorp INSTANCE;

    private Trips day = new Trips();
    private MetroCorp() {
    }

    public static MetroCorp getMetroCorp(){
        if(INSTANCE == null){
            INSTANCE = new MetroCorp();
        }
        return INSTANCE;
    }

    void processRequest(String[] request){

        if(request[0].equals("BALANCE")){
            String cardNo = request[1];
            int balance = Integer.parseInt(request[2]);
            day.addUser(cardNo, balance);

        }
        else if(request[0].equals("CHECK_IN")){
            //day1.addTrip("MC01", PasangerType.ADULT, Station.CENTRAL);
            String cardNo = request[1];
            PasangerType pasangerType = PasangerType.valueOf(request[2]);
            Station station = Station.valueOf(request[3]);

            day.addTrip(cardNo, pasangerType, station);


        }
        else if(request[0].equals("PRINT_SUMMARY")){
            System.out.println(Station.CENTRAL);
            System.out.println(Station.AIRPORT);

        }

    }
}
