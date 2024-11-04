package lotto;

import java.util.List;

public class Lottos {

    private final List<Lotto> lottos;

    public Lottos(List<Lotto> lottos) {
        this.lottos = lottos;
    }

    public List<Lotto> getLottos() {
        return lottos;
    }

    public int getCount() {
        return lottos.size();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Lotto lotto : lottos) {
            result.append(lotto.toString())
                    .append("\n");
        }

        return result.toString();
    }
}
