  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    double p0;
    std::vector<std::vector<double>> p1;
    s0(double v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s1(s0 v0): p0(v0) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<std::vector<s0>> p1;
    s2(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s1> p0;
    s0 p1;
    s4(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s2 p0;
    s2 p1;
    s5(s2 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    s4 p0;
    std::vector<std::vector<s4>> p1;
    s8(s4 v0, std::vector<std::vector<s4>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s8> &v0, const s5 &v1, const s5 &v2, const double &v3) {
    const s8 v11 = v0[0];
    const std::vector<std::vector<s4>> v14 = v11.p1;
    const std::vector<s4> v13 = v14[0];
    double v23 = v3;
    const s4 v26 = v13[0];
    s4 v19 = v26;
    const std::vector<s4> v36 = v14[0];
    v19 = v26;
    const double v37 = v3 / v23;
    const s0 v52 = v19.p1;
    s0 v41 = v52;
    const s4 v111 = v36[0];
    v41.p0 = v37;
    v19.p1 = v52;
    const std::vector<std::vector<double>> v200 = v41.p1;
    const s0 v80 = v111.p1;
    const std::vector<double> v58 = v200[0];
    v19.p1 = v80;
    const double v181 = v58[0];
    return v181;
  }
  int main() {
    std::vector<s8> v0({ { { { { { 0.0, { { 1.0 }, { 2.0 } } } }, { { 3.0, { { 4.0 }, { 5.0 } } } } }, { 6.0, { { 7.0 }, { 8.0 } } } }, { { { { { { 9.0, { { 10.0 }, { 11.0 } } } }, { { 12.0, { { 13.0 }, { 14.0 } } } } }, { 15.0, { { 16.0 }, { 17.0 } } } } } } } });
    s5 v1({ { { { 18.0, { { 19.0 }, { 20.0 } } }, { 21.0, { { 22.0 }, { 23.0 } } }, { 24.0, { { 25.0 }, { 26.0 } } } }, { { { 27.0, { { 28.0 }, { 29.0 } } } } } }, { { { 30.0, { { 31.0 }, { 32.0 } } }, { 33.0, { { 34.0 }, { 35.0 } } }, { 36.0, { { 37.0 }, { 38.0 } } } }, { { { 39.0, { { 40.0 }, { 41.0 } } } } } } });
    s5 v2({ { { { 42.0, { { 43.0 }, { 44.0 } } }, { 45.0, { { 46.0 }, { 47.0 } } }, { 48.0, { { 49.0 }, { 50.0 } } } }, { { { 51.0, { { 52.0 }, { 53.0 } } } } } }, { { { 54.0, { { 55.0 }, { 56.0 } } }, { 57.0, { { 58.0 }, { 59.0 } } }, { 60.0, { { 61.0 }, { 62.0 } } } }, { { { 63.0, { { 64.0 }, { 65.0 } } } } } } });
    double v3(66.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
