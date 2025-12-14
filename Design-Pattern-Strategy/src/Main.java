import design_pattern_Strategy.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Choisir une strategy:");
            String strategyClass = scanner.nextLine();
            Strategy strategy =(Strategy) Class.forName("design_pattern_Strategy.StrategyImpl"+strategyClass).getConstructor().newInstance();
            context.setStrategy(strategy);
            context.effectuerStrategy();
        }

    }
}
