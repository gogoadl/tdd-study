import java.util.Hashtable;
import java.util.Objects;

public class Bank {
    private Hashtable rates = new Hashtable();
    Money reduce(Expression source, String to) {
        return source.reduce(this, to); // 캐스팅, 클래스 검사 코드를 제거!
    }
    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), new Integer(rate));
    }
    int rate(String from, String to) {
        if (from.equals(to)) return 1; // 동일한 화폐는 환율이 같음
        Integer rate = (Integer) rates.get(new Pair(from, to));
        return rate.intValue();
    }

    private class Pair {
        private String from;
        private String to;
        Pair(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return Objects.equals(from, pair.from) && Objects.equals(to, pair.to);
        }

        @Override
        public int hashCode() {
            return Objects.hash(from, to);
        }
    }

}

