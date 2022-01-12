  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s0 &v1, const double &v2) {
    const s0 v8 = v0[0];
    const double v21 = v2 * v2;
    const std::vector<std::vector<double>> v10 = v8.p1;
    const double v14 = v21 / v21;
    const std::vector<double> v15 = v10[0];
    const double v18 = v15[0];
    std::vector<double> v54 = v15;
    const double v30 = v54[0];
    double v40 = v30;
    const double v66 = v30 / v2;
    v54[0] = v40;
    const double v32 = v66 + v14;
    v54[0] = v18;
    return v32;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 } } } });
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
