package zadania8;

public abstract class Flet extends Instrument{
    public Flet(String producent, java.time.LocalDate rokProdukcji)
    {
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    abstract void dzwiek();
}
