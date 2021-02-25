package top;

import lombok.Data;

@Data
public class Container {
  private Thing things = Thing.of();
}
