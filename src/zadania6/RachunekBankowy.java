package zadania6;

class RachunekBankowy {

    public RachunekBankowy(double saldo){
        this.saldo = saldo;
    }

    public void obliczMiesieczneOdsetki()
    {
        double odsetki = (this.saldo * rocznaStopaProcentowa) / 12;
        this.saldo += odsetki;
    }
    public static void setRocznaStopaProcentowa(double wartosc)
    {
        rocznaStopaProcentowa = wartosc;
    }

    public String toString() {
        return "RachunekBankowy{" + "saldo=" + saldo + '}';
    }

    public static double rocznaStopaProcentowa;
    private double saldo;
}
