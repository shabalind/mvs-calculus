  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s0 &v1, const double &v2) {
    const s0 v4 = v0[0];
    const std::vector<std::vector<double>> v3 = v4.p0;
    const s0 v8 = v0[1];
    const std::vector<double> v18 = v3[1];
    const std::vector<std::vector<double>> v15 = v8.p0;
    const double v49 = v18[0];
    const std::vector<double> v56 { v2, v2, v49, v2, v2 };
    const std::vector<double> v63 = v15[1];
    const double v66 = v63[0];
    const double v84 = v56[3];
    const double v217 = v66 - v84;
    return v217;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 } } }, { { { 2.0 }, { 3.0 } } } });
    s0 v1({ { { 4.0 }, { 5.0 } } });
    double v2(6.0);
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
