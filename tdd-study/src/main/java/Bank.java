import java.util.Hashtable;

public class Bank {
    private Hashtable rates = new Hashtable();
    Money reduce(Expression source, String to) {
        return source.reduce(to); // 캐스팅, 클래스 검사 코드를 제거!
    }
    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), new Integer(rate));
    }
    int rates(String from, String to) {
        Integer rate = (Integer) rates.get(new Pair(from, to));
        return rate.intValue();
    }
}
