  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const std::vector<std::vector<double>> v5 = v0.p1;
    const std::vector<std::vector<double>> v6 = v0.p1;
    const s0 v4(v6, v5);
    s0 v3 = v4;
    v3.p1 = v5;
    v3.p1 = v5;
    const std::vector<std::vector<double>> v11 = v4.p0;
    v3.p1 = v11;
    const std::vector<std::vector<double>> v21 = v0.p0;
    v3.p1 = v21;
    v3.p0 = v11;
    const std::vector<std::vector<double>> v30 = v3.p0;
    const std::vector<double> v22 = v30[0];
    const double v17 = v22[0];
    return v17;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 } } });
    double v1(2.0);
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
