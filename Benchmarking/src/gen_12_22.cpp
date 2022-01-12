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
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  std::vector<s1> f29(const std::vector<s1> &v0) {
    std::vector<s1> v7 = v0;
    return v7;
  }
  std::vector<s1> f23(const std::vector<s1> &v0) {
    const std::vector<s1> v7 = f29(v0);
    const s1 v1 = v7[0];
    std::vector<s1> v15 = v7;
    v15[0] = v1;
    std::vector<s1> v50 = v15;
    v15 = v50;
    return v15;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    const std::vector<s1> v7 = f23(v0);
    const s1 v2 = v7[0];
    const std::vector<s0> v8 = v2.p0;
    const s0 v5 = v8[1];
    const double v9 = v1 / v1;
    const std::vector<std::vector<double>> v10 = v5.p1;
    const std::vector<double> v18 = v10[2];
    const double v27 = v18[0];
    const double v146 = v9 + v27;
    return v146;
  }
  int main() {
    std::vector<s1> v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } } });
    double v1(16.0);
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
