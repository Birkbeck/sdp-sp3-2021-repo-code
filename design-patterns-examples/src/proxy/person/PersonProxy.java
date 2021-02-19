package proxy.person;

public class PersonProxy implements PersonInterface {

  private Person mPerson;
  private String mCachedName;

  public PersonProxy(Person p) {
    mPerson = p;
    mCachedName = mPerson.getName();
  }

  @Override
  public String getName() {
    // return the cached (local) version
    return mCachedName;
  }

  @Override
  public float getWeight() {
    // Pass through the request to the real object
    return mPerson.getWeight();
  }
}
