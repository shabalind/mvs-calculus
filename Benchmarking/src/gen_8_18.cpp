  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  std::vector<s0> f55(const s1 &v0, const std::vector<s0> &v1) {
    const std::vector<s0> v10 = v0.p0;
    const s1 v15(v10, v1);
    const std::vector<s0> v57 = v15.p0;
    return v57;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const std::vector<s1> &v1, const std::vector<s1> &v2, const double &v3) {
    const std::vector<s0> v5 = v0.p0;
    const std::vector<s0> v9 = f55(v0, v5);
    const s0 v4 = v9[0];
    const std::vector<std::vector<double>> v22 = v4.p1;
    const std::vector<double> v30 = v22[0];
    const double v45 = v30[0];
    return v45;
  }
  int main() {
    s1 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } } }, { { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } } });
    std::vector<s1> v1({ { { { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } } } });
    std::vector<s1> v2({ { { { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } }, { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } } } }, { { { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } } }, { { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } } } } });
    double v3(32.0);
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
