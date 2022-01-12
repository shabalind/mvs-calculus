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
    std::vector<s0> p0;
    s1 p1;
    s2(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const std::vector<s0> v3 = v0.p0;
    const s0 v21 = v3[0];
    const std::vector<std::vector<double>> v13 = v21.p1;
    const std::vector<double> v17 = v13[0];
    double v30 = v1;
    const double v51 = v17[0];
    const std::vector<double> v96 = v13[0];
    std::vector<double> v75 = v96;
    v75[0] = v30;
    const double v116 = v75[0];
    v75[0] = v51;
    double v162 = v116;
    return v162;
  }
  int main() {
    s2 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } }, { { { { 3.0 }, { 4.0 } }, { { 5.0 } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } } } } });
    double v1(9.0);
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
