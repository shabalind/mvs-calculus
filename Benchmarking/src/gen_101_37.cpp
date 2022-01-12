  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s1>> p0;
    std::vector<s0> p1;
    s2(std::vector<std::vector<s1>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<std::vector<s0>> p0;
    std::vector<std::vector<s0>> p1;
    s4(std::vector<std::vector<s0>> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    std::vector<std::vector<s4>> p0;
    s1 p1;
    s7(std::vector<std::vector<s4>> v0, s1 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const s7 &v1, const double &v2) {
    const s2 v4 = v0[0];
    const std::vector<s0> v13 = v4.p1;
    const s0 v5 = v13[0];
    const std::vector<double> v11 = v5.p0;
    const double v24 = v11[0];
    const std::vector<double> v23 = v5.p0;
    const double v36 = v24 - v2;
    const double v71 = v36 / v24;
    const double v35 = v23[0];
    const double v45 = v35 - v71;
    const double v380 = v45 + v71;
    return v380;
  }
  int main() {
    std::vector<s2> v0({ { { { { { { { 0.0 }, { { 1.0 } } }, { { 2.0 }, { { 3.0 } } } }, { { { 4.0 }, { { 5.0 } } }, { { 6.0 }, { { 7.0 } } } } } } }, { { { 8.0 }, { { 9.0 } } }, { { 10.0 }, { { 11.0 } } }, { { 12.0 }, { { 13.0 } } } } } });
    s7 v1({ { { { { { { { 14.0 }, { { 15.0 } } } } }, { { { { 16.0 }, { { 17.0 } } } } } } }, { { { { { { 18.0 }, { { 19.0 } } } } }, { { { { 20.0 }, { { 21.0 } } } } } } }, { { { { { { 22.0 }, { { 23.0 } } } } }, { { { { 24.0 }, { { 25.0 } } } } } } } }, { { { { 26.0 }, { { 27.0 } } }, { { 28.0 }, { { 29.0 } } } }, { { { 30.0 }, { { 31.0 } } }, { { 32.0 }, { { 33.0 } } } } } });
    double v2(34.0);
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
