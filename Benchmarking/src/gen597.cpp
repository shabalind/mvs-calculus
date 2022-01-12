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
  s0 f15(const s0 &v0) {
    const std::vector<s0> v4 { v0, v0, v0, v0, v0 };
    const std::vector<s0> v1 { v0, v0, v0, v0, v0, v0, v0 };
    const s0 v6 = v4[1];
    std::vector<s0> v19 = v1;
    const s0 v23 = v19[0];
    v19[4] = v6;
    s0 v61 = v23;
    return v61;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const s1 &v1, const double &v2) {
    const s0 v9 = f15(v0);
    const std::vector<std::vector<double>> v13 = v9.p0;
    const std::vector<double> v57 = v13[1];
    const double v87 = v57[0];
    return v87;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } });
    s1 v1({ { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } }, { { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } }, { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } } } });
    double v2(20.0);
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
