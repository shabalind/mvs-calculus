  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  double f80(const double &v0) {
    double v2 = v0;
    double v1 = v0;
    double v4 = v0;
    const double v5 = v4 - v2;
    double v7 = v1;
    double v13 = v2;
    double v8 = v7;
    v13 = v5;
    double v52 = v2;
    const double v34 = v8 - v13;
    v2 = v52;
    return v34;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const double v7 = f80(v1);
    double v3 = v7;
    v3 = v1;
    v3 = v1;
    const double v179 = f80(v3);
    return v179;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } });
    double v1(5.0);
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
