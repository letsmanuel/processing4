package processing.mode.java;

public class LogicProblem extends JavaProblem {

  private final int tabIndex;
  private final int lineNumber;
  private final String message;
  private final int lineStartOffset;
  private final int lineStopOffset;

  public LogicProblem(int newTabIndex, int newLineNumber, String newMessage, int newStartOffset,
                      int newStopOffset) {
    super(newMessage, JavaProblem.ERROR, newLineNumber, newLineNumber);
    tabIndex = newTabIndex;
    lineNumber = newLineNumber;
    message = newMessage;
    lineStartOffset = newStartOffset;
    lineStopOffset = newStopOffset;
  }

  @Override
  public boolean isError() {
    return true;
  }

  @Override
  public boolean isWarning() {
    return false;
  }

  @Override
  public int getTabIndex() {
    return tabIndex;
  }

  @Override
  public int getLineNumber() {
    return lineNumber;
  }

  @Override
  public String getMessage() {
    return message;
  }

  @Override
  public int getStartOffset() {
    return lineStartOffset;
  }

  @Override
  public int getStopOffset() {
    return lineStopOffset;
  }
}
