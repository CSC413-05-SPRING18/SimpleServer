package Processor;

public class UserProcessor extends Processor {

  public UserProcessor(String args) {
    super(args);
  }

  @Override
  public String process() {
    return "{\"User\": " + this.args + "}";
  }
}
