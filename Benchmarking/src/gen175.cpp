  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  double f12(const double &v0) {
    double v2 = v0;
    double v1 = v0;
    double v23 = v2;
    double v15 = v1;
    double v17 = v15;
    double v16 = v0;
    double v22 = v17;
    double v19 = v16;
    v19 = v22;
    double v24 = v23;
    v15 = v24;
    double v51 = v19;
    double v40 = v51;
    return v40;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const double &v1) {
    const double v4 = v1 + v1;
    const double v3 = f12(v1);
    const double v2 = f12(v4);
    const double v12 = v2 / v3;
    double v14 = v3;
    double v16 = v4;
    double v23 = v14;
    const double v29 = v2 - v16;
    v14 = v12;
    double v261 = v29;
    const double v253 = v261 * v23;
    return v253;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 } } } }, { { { { 3.0 } }, { { 4.0 }, { 5.0 } } } }, { { { { 6.0 } }, { { 7.0 }, { 8.0 } } } } });
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
