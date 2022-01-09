package practice.task5;

public class Pair <K, V>{

    private K variableOne;
    private V variableTwo;

    public Pair(K variableOne, V variableTwo) {
        this.variableOne = variableOne;
        this.variableTwo = variableTwo;
    }

    public K getVariableOne() {
        return variableOne;
    }

    public void setVariableOne(K variableOne) {
        this.variableOne = variableOne;
    }

    public V getVariableTwo() {
        return variableTwo;
    }

    public void setVariableTwo(V variableTwo) {
        this.variableTwo = variableTwo;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "variableOne=" + variableOne +
                ", variableTwo=" + variableTwo +
                '}';
    }
}
