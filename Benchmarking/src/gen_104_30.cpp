  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  double f67(const double &v0) {
    const double v2 = v0 * v0;
    const std::vector<double> v3 { v2, v2, v2, v2, v2 };
    const double v19 = v3[0];
    return v19;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const std::vector<s0> &v1, const double &v2) {
    const double v4 = f67(v2);
    const s0 v7 = v1[0];
    const double v12 = f67(v4);
    const std::vector<std::vector<double>> v9 = v7.p0;
    const std::vector<double> v11 { v12, v12, v12, v2, v4 };
    const std::vector<double> v13 = v9[0];
    const double v14 = v13[0];
    const double v34 = v11[2];
    const double v64 = v34 * v34;
    const double v57 = v14 - v64;
    return v57;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 } } });
    std::vector<s0> v1({ { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } }, { { { 6.0 } }, { { 7.0 } } } });
    double v2(8.0);
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
