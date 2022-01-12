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
  double f0(const s1 &v0, const double &v1) {
    const s0 v4 = v0.p0;
    const std::vector<std::vector<double>> v3 = v4.p1;
    const std::vector<std::vector<double>> v11 = v4.p0;
    std::vector<std::vector<double>> v10 = v3;
    const std::vector<double> v22 = v10[0];
    std::vector<std::vector<double>> v27 = v10;
    const std::vector<double> v18 = v11[0];
    const std::vector<double> v14 = v10[0];
    const std::vector<double> v36 = v27[0];
    const std::vector<double> v28 = v10[0];
    const double v40 = v14[0];
    v10[0] = v28;
    v10[0] = v22;
    const double v42 = v1 * v40;
    const double v55 = v36[0];
    v27[0] = v18;
    const double v99 = v42 - v42;
    const double v88 = v99 + v55;
    return v88;
  }
  int main() {
    s1 v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } } });
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
