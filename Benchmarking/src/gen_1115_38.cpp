  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f101(const s0 &v0) {
    s0 v2 = v0;
    return v2;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const std::vector<double> &v1, const s0 &v2, const s0 &v3, const double &v4) {
    const s0 v7 = v0[0];
    const double v8 = v4 / v4;
    const s0 v11 = f101(v2);
    const double v12 = v8 * v4;
    const std::vector<std::vector<double>> v20 = v11.p1;
    const std::vector<std::vector<double>> v21 = v7.p0;
    const double v41 = v1[1];
    std::vector<std::vector<double>> v30 = v20;
    const std::vector<double> v27 = v30[0];
    const std::vector<double> v25 = v30[0];
    const double v26 = v27[0];
    const std::vector<double> v47 = v21[1];
    const double v53 = v47[0];
    const double v115 = v12 * v41;
    v30[0] = v25;
    std::vector<double> v78 = v1;
    v30[0] = v27;
    const double v79 = v78[1];
    const std::vector<double> v90 { v26, v53, v53, v115, v41, v115, v79 };
    const double v127 = v90[2];
    return v127;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 } } } });
    std::vector<double> v1({ 3.0, 4.0 });
    s0 v2({ { { 5.0 }, { 6.0 } }, { { 7.0 } } });
    s0 v3({ { { 8.0 }, { 9.0 } }, { { 10.0 } } });
    double v4(11.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
