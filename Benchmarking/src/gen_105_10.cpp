  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    s0 p1;
    s2(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s2 p0;
    s1 p1;
    s4(s2 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s4 p0;
    s0 p1;
    s6(s4 v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f12(const s0 &v0) {
    const std::vector<std::vector<double>> v2 = v0.p1;
    s0 v5 = v0;
    std::vector<std::vector<double>> v16 = v2;
    v5.p1 = v16;
    return v5;
  }
  __attribute__((noinline))
  double f0(const std::vector<s6> &v0, const double &v1) {
    const s6 v6 = v0[0];
    const s0 v2 = v6.p1;
    const s0 v3 = f12(v2);
    const std::vector<std::vector<double>> v7 = v3.p1;
    const std::vector<double> v14 = v7[1];
    const double v35 = v14[0];
    return v35;
  }
  int main() {
    std::vector<s6> v0({ { { { { { { { 0.0 }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { { 4.0 }, { { 5.0 }, { 6.0 }, { 7.0 } } } } } } }, { { 8.0 }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { 12.0 }, { { 13.0 }, { 14.0 }, { 15.0 } } }, { { { { 16.0 }, { { 17.0 }, { 18.0 }, { 19.0 } } } } } } }, { { 20.0 }, { { 21.0 }, { 22.0 }, { 23.0 } } } } });
    double v1(24.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
