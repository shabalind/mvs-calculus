  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    double p1;
    s1(std::vector<std::vector<s0>> v0, double v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<std::vector<s0>> p1;
    s2(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s0 p0;
    std::vector<s1> p1;
    s4(s0 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s2> p0;
    s4 p1;
    s5(std::vector<s2> v0, s4 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s4 &v0, const s5 &v1, const double &v2) {
    const std::vector<s1> v5 = v0.p1;
    const s0 v6 = v0.p0;
    const s1 v10 = v5[1];
    s1 v16 = v10;
    const std::vector<std::vector<double>> v9 = v6.p0;
    const double v28 = v16.p1;
    double v31 = v28;
    const std::vector<double> v41 = v9[0];
    const std::vector<double> v80 = v9[0];
    v16.p1 = v31;
    const double v69 = v80[0];
    const double v214 = v41[0];
    const double v91 = v28 - v69;
    const double v94 = v214 / v91;
    return v94;
  }
  int main() {
    s4 v0({ { { { 0.0 } }, { { 1.0 } } }, { { { { { { { 2.0 } }, { { 3.0 } } } } }, 4.0 }, { { { { { { 5.0 } }, { { 6.0 } } } } }, 7.0 } } });
    s5 v1({ { { { { { { 8.0 } }, { { 9.0 } } }, { { { 10.0 } }, { { 11.0 } } } }, { { { { { 12.0 } }, { { 13.0 } } } } } } }, { { { { 14.0 } }, { { 15.0 } } }, { { { { { { { 16.0 } }, { { 17.0 } } } } }, 18.0 }, { { { { { { 19.0 } }, { { 20.0 } } } } }, 21.0 } } } });
    double v2(22.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
