public class NightlyCleanupScheduler implements Schedulable {
    
    public void execute(SchedulableContext sc) {
        // Just kicks off the batch — nothing else
        Database.executeBatch(new NightlyCleanupBatch(), 200);
    }
}