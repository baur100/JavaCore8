package homework18;

public interface Bacteria extends Life{


    void ill();

    @Override
    void breath();

    @Override
    void reproduction();

    @Override
    void nutrition();

    @Override
    void responsivness();
}
