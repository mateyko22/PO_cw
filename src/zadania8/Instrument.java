package zadania8;
import java.time.LocalDate;
import java.util.Objects;

public abstract class Instrument {
    public String producent;
    public java.time.LocalDate rokProdukcji;

    public Instrument() {}

    public Instrument(String producent, java.time.LocalDate rokProdukcji)
    {
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    public String getProducent() {
        return producent;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

    abstract void dzwiek();

    @Override
    public String toString() {
        return "Instrument{" +
                "producent='" + producent + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                '}';
    }

    public boolean equals(Instrument o)
    {
        if (producent.equals(o.producent) && rokProdukcji.equals(o.rokProdukcji))
            return true;
        else
            return false;
    }
}
