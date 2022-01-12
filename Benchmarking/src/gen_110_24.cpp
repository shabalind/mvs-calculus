  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f103(const s0 &v0) {
    s0 v7 = v0;
    const std::vector<std::vector<double>> v3 = v7.p1;
    const std::vector<std::vector<double>> v4 = v0.p0;
    v7.p0 = v4;
    const std::vector<std::vector<double>> v11 = v0.p0;
    const std::vector<std::vector<double>> v1 = v7.p1;
    v7.p1 = v3;
    v7.p0 = v11;
    const s0 v6(v4, v1);
    v7 = v6;
    return v6;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const s0 v3 = f103(v0);
    const std::vector<std::vector<double>> v6 = v3.p0;
    const std::vector<std::vector<double>> v11 = v0.p1;
    const s0 v31(v6, v11);
    const std::vector<std::vector<double>> v13 = v31.p1;
    const std::vector<double> v12 = v13[0];
    const double v40 = v12[0];
    return v40;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 }, { 2.0 } } });
    double v1(3.0);
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
