  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s0 p0;
    s0 p1;
    s6(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    s0 p0;
    s8(s0 v0): p0(v0) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const s8 &v1, const std::vector<s6> &v2, const double &v3) {
    double v16 = v3;
    const std::vector<s0> v15 = v0[1];
    const s0 v35 = v15[0];
    const std::vector<std::vector<double>> v17 = v35.p1;
    const std::vector<double> v20 = v17[0];
    const double v39 = v16 * v3;
    std::vector<double> v63 = v20;
    const double v100 = v20[0];
    const double v71 = v63[0];
    const double v94 = v39 - v71;
    const double v98 = v100 * v94;
    const double v146 = v98 / v39;
    return v146;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } } }, { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } } });
    s8 v1({ { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } });
    std::vector<s6> v2({ { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } }, { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } });
    double v3(30.0);
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
