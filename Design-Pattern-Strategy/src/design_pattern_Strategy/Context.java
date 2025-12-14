package design_pattern_Strategy;

public class Context {

    private Strategy strategy = null;
    public Context() {};

    public void effectuerStrategy() {
        System.out.println("Operation Context");
        strategy.operationStrategy();


    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }



}
