package design_pattern_Strategy;

public class DefaultStrategy implements Strategy{

    @Override
    public void operationStrategy() {
        System.out.println("#############################");
        System.out.println("Strategy par defaut");
        System.out.println("############################");
    }
}
