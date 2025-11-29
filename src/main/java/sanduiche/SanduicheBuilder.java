package sanduiche;

import java.util.Objects;

public class SanduicheBuilder {

    private Sanduiche sanduiche;

    public SanduicheBuilder() {
        sanduiche = new Sanduiche();
    }

    public Sanduiche build() {
        if (sanduiche.getPao().equals("")) {
            throw new IllegalArgumentException("O sanduíche precisa ter pão");
        }
        if (sanduiche.getCarnes().equals("")) {
            throw new IllegalArgumentException("O sanduíche precisa ter ao menos uma carne");
        }
        return sanduiche;
    }

    public SanduicheBuilder setPao(String pao) {
        sanduiche.setPao(pao);
        return this;
    }

    public SanduicheBuilder setQueijo(String queijo) {
        sanduiche.setQueijo(queijo);
        return this;
    }

    public SanduicheBuilder setCarnes(String carnes) {
        sanduiche.setCarnes(carnes);
        return this;
    }

    public SanduicheBuilder setBacon(boolean bacon) {
        sanduiche.setBacon(bacon);
        return this;
    }

    public SanduicheBuilder setOvo(boolean ovo) {
        sanduiche.setOvo(ovo);
        return this;
    }

    public SanduicheBuilder setAlface(boolean alface) {
        sanduiche.setAlface(alface);
        return this;
    }

    public SanduicheBuilder setTomate(boolean tomate) {
        sanduiche.setTomate(tomate);
        return this;
    }

    public SanduicheBuilder setMaionese(boolean maionese) {
        sanduiche.setMaionese(maionese);
        return this;
    }

    public SanduicheBuilder setCatchup(boolean catchup) {
        sanduiche.setCatchup(catchup);
        return this;
    }

    public SanduicheBuilder setMostarda(boolean mostarda) {
        sanduiche.setMostarda(mostarda);
        return this;
    }

    public SanduicheBuilder setBarbecue(boolean barbecue) {
        sanduiche.setBarbecue(barbecue);
        return this;
    }

    public SanduicheBuilder setBillyJack(boolean billyJack) {
        sanduiche.setBillyJack(billyJack);
        return this;
    }

    public SanduicheBuilder setBatataPalha(boolean batataPalha) {
        sanduiche.setBatataPalha(batataPalha);
        return this;
    }

    public SanduicheBuilder setFrangoDesfiado(boolean frangoDesfiado) {
        sanduiche.setFrangoDesfiado(frangoDesfiado);
        return this;
    }

    public SanduicheBuilder setPresunto(boolean presunto) {
        sanduiche.setPresunto(presunto);
        return this;
    }

    public SanduicheBuilder setCalabresa(boolean calabresa) {
        sanduiche.setCalabresa(calabresa);
        return this;
    }

    public SanduicheBuilder setCatupiry(boolean catupiry) {
        sanduiche.setCatupiry(catupiry);
        return this;
    }

    public SanduicheBuilder setCheddar(boolean cheddar) {
        sanduiche.setCheddar(cheddar);
        return this;
    }

    public SanduicheBuilder setCebola(boolean cebola) {
        sanduiche.setCebola(cebola);
        return this;
    }

    public SanduicheBuilder setPicles(boolean picles) {
        sanduiche.setPicles(picles);
        return this;
    }

}
