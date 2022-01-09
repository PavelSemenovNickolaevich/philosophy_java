package practice.task5;

public final class PairUtil {

    public static<K, V> Pair<V, K> swap(Pair<K, V> pair) {
        V second = pair.getVariableTwo();
        K first = pair.getVariableOne();
        return new Pair<>(second, first);
    }
}
