  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s2(s1 v0): p0(v0) { }
  };
  __attribute__((noinline))
  double f0(const s2 &v0, const s0 &v1, const std::vector<std::vector<s0>> &v2, const double &v3) {
    const std::vector<std::vector<double>> v7 = v1.p1;
    const std::vector<std::vector<double>> v10 = v1.p0;
    const double v20 = v3 / v3;
    const std::vector<double> v11 = v10[0];
    const std::vector<double> v18 = v7[0];
    const double v37 = v18[0];
    std::vector<double> v55 = v11;
    std::vector<double> v40 = v55;
    v55[0] = v3;
    const double v81 = v40[0];
    const double v56 = v81 * v37;
    v55[0] = v81;
    v40[0] = v20;
    v55 = v40;
    return v56;
  }
  int main() {
    s2 v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } } });
    s0 v1({ { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } });
    std::vector<std::vector<s0>> v2({ { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } }, { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } });
    double v3(24.0);
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
