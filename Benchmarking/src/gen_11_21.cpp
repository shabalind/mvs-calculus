  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const s0 &v1, const double &v2) {
    const std::vector<std::vector<double>> v4 = v0.p1;
    const std::vector<double> v14 = v4[0];
    std::vector<double> v6 = v14;
    std::vector<double> v20 = v6;
    const double v23 = v6[0];
    const std::vector<double> v18 = v4[0];
    v20[0] = v23;
    std::vector<double> v29 = v18;
    const double v22 = v20[0];
    const double v30 = v29[0];
    v20[0] = v30;
    return v22;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 } } });
    s0 v1({ { { 2.0 } }, { { 3.0 } } });
    double v2(4.0);
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
