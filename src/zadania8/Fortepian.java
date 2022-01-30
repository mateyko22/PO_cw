package zadania8;

public abstract class Fortepian extends Instrument{
    public Fortepian(String producent, java.time.LocalDate rokProdukcji)
    {
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    abstract void dzwiek();
}
