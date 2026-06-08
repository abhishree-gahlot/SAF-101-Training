public class CommissionCalculator {

    public static Decimal calculate(String region, Decimal revenue, Decimal quota) {

        System.debug(LoggingLevel.INFO, '--- Commission Calculation Started ---');
        System.debug(LoggingLevel.DEBUG, 'Region: ' + region);
        System.debug(LoggingLevel.DEBUG, 'Revenue: ' + revenue);
        System.debug(LoggingLevel.DEBUG, 'Quota: '   + quota);

        if (revenue == null || quota == null || quota == 0) {
            System.debug(LoggingLevel.ERROR, 'Invalid input — revenue or quota is null/zero');
            return 0;
        }

        Decimal attainment = (revenue / quota) * 100;
        System.debug(LoggingLevel.DEBUG, 'Attainment %: ' + attainment);

        Decimal rate;
        if (attainment >= 120) {
            rate = 0.12;
            System.debug(LoggingLevel.INFO, 'Tier: ACCELERATOR (120%+) → rate 12%');
        } else if (attainment >= 100) {
            rate = 0.10;
            System.debug(LoggingLevel.INFO, 'Tier: ON TARGET (100-119%) → rate 10%');
        } else if (attainment >= 80) {
            rate = 0.07;
            System.debug(LoggingLevel.WARN, 'Tier: BELOW TARGET (80-99%) → rate 7%');
        } else {
            rate = 0.05;
            System.debug(LoggingLevel.WARN, 'Tier: UNDERPERFORMING (<80%) → rate 5%');
        }

        // Regional bonus
        if (region == 'North America') {
            rate += 0.01;
            System.debug(LoggingLevel.DEBUG, 'NA regional bonus applied → +1%');
        }

        Decimal commission = revenue * rate;
        System.debug(LoggingLevel.INFO, 'Final Commission: ' + commission);
        System.debug(LoggingLevel.INFO, '--- Calculation Complete ---');

        return commission;
    }
}