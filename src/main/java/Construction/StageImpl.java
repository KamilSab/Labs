package Construction;

public class StageImpl implements Stage{
    private static class StageNode {
        StageNode prev;
        AbstractStage stage;
        StageNode next;

        public StageNode(AbstractStage stage) {
            this.stage = stage;
        }
    }

    StageNode curr;

    @Override
    public AbstractStage next() {
        if (curr == null) {
            return null;
        }
        if (curr.stage.status == StatusE.Rejected) {
        }
        return curr.next.stage;
    }

    @Override
    public AbstractStage prev() {
        if (curr == null) {
            return null;
        }
        return curr.prev.stage;
    }
}
