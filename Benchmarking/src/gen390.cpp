  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    double p0;
    s0 p1;
    s7(double v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s7 &v0, const double &v1) {
    const double v6 = v1 + v1;
    const std::vector<double> v3 { v1, v6, v6 };
    const double v5 = v0.p0;
    std::vector<double> v10 = v3;
    const double v7 = v10[2];
    const double v28 = v3[2];
    v10[1] = v28;
    v10[2] = v1;
    const double v31 = v10[2];
    const double v21 = v28 * v31;
    const std::vector<double> v25 { v7, v5, v5, v5 };
    const double v53 = v25[0];
    v10[2] = v21;
    return v53;
  }
  int main() {
    s7 v0({ 0.0, { { { 1.0 }, { 2.0 }, { 3.0 } }, { { 4.0 }, { 5.0 } } } });
    double v1(6.0);
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
