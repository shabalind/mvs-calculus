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
  double f65(const double &v0) {
    double v3 = v0;
    double v2 = v3;
    double v1 = v2;
    double v4 = v1;
    double v8 = v4;
    double v9 = v1;
    double v6 = v2;
    const double v21 = v9 / v8;
    v9 = v6;
    return v21;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    const double v3 = v1 / v1;
    double v4 = v1;
    const double v2 = v1 + v4;
    const double v13 = f65(v2);
    double v86 = v2;
    const std::vector<double> v108 { v13, v86, v3, v3, v3, v4, v2 };
    const double v134 = v108[1];
    return v134;
  }
  int main() {
    std::vector<s1> v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { 3.0 } }, { { 4.0 }, { 5.0 } } } }, { { { { 6.0 } }, { { 7.0 }, { 8.0 } } }, { { { 9.0 } }, { { 10.0 }, { 11.0 } } } } } });
    double v1(12.0);
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
