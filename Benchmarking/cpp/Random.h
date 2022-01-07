struct Random {
  public:
    Random() {
      seed = 74755;
    }
    int next() {
      seed = ((seed * 1309) + 13849) & 65535;
      return seed;
    }
    int seed;
};
