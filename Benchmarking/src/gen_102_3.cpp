  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    double p1;
    s2(std::vector<s0> v0, double v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const double &v1) {
    double v7 = v1;
    const std::vector<double> v5 { v1, v7, v1, v1 };
    double v8 = v1;
    const double v11 = v5[0];
    const s2 v45 = v0[0];
    const std::vector<std::vector<double>> v40 { v5, v5, v5 };
    const double v48 = v45.p1;
    v7 = v11;
    const double v81 = v48 / v8;
    v7 = v81;
    const std::vector<double> v114 = v40[2];
    const double v124 = v114[0];
    return v124;
  }
  int main() {
    std::vector<s2> v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } }, 15.0 } });
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
