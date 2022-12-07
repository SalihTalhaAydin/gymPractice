public abstract class Member {

    // 1.

    public String name;
    public String id; // 20 char id -> Standard starts with "SD", Premium starts with "PR" rest is 18 random digits
    public String membershipType;
    public double height;
    public double weight;


    public abstract void liftingWeights();
    public abstract void scan();

}
