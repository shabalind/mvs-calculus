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
  double f96(const double &v0) {
    const double v3 = v0 - v0;
    double v4 = v0;
    double v7 = v3;
    double v2 = v0;
    double v8 = v0;
    double v5 = v7;
    double v21 = v4;
    const std::vector<double> v12 { v2, v21, v8, v5 };
    std::vector<double> v17 = v12;
    v4 = v8;
    const double v23 = v17[3];
    v17[2] = v8;
    return v23;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const double &v1) {
    const double v3 = f96(v1);
    double v4 = v3;
    double v10 = v4;
    const double v42 = v3 + v4;
    const std::vector<double> v22 { v1, v42, v10 };
    const double v59 = v22[2];
    return v59;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } } }, { { { 4.0 } }, { { 5.0 } } } } }, { { { { { { 6.0 } }, { { 7.0 } } }, { { { 8.0 } }, { { 9.0 } } } }, { { { 10.0 } }, { { 11.0 } } } } }, { { { { { { 12.0 } }, { { 13.0 } } }, { { { 14.0 } }, { { 15.0 } } } }, { { { 16.0 } }, { { 17.0 } } } } } });
    double v1(18.0);
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
