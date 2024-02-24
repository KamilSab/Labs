package Construction;

public interface Stage {
    AbstractStage next();
    AbstractStage prev();
}
