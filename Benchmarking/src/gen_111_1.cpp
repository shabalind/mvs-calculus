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
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s1 &v1, const double &v2) {
    const std::vector<s0> v5 = v1.p1;
    const s0 v4 = v5[0];
    double v8 = v2;
    const std::vector<std::vector<double>> v10 = v4.p1;
    double v23 = v8;
    double v16 = v23;
    const std::vector<double> v28 = v10[0];
    const double v18 = v28[0];
    double v25 = v2;
    v25 = v23;
    const double v93 = v16 / v25;
    const double v144 = v93 + v18;
    return v144;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } } });
    s1 v1({ { { { 4.0 } }, { { 5.0 } } }, { { { { 6.0 } }, { { 7.0 } } }, { { { 8.0 } }, { { 9.0 } } } } });
    double v2(10.0);
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
