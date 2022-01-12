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
    s0 v2 = v0;
    const double v5 = v1 - v1;
    const std::vector<std::vector<double>> v4 = v2.p1;
    v2.p1 = v4;
    const std::vector<double> v7 = v4[0];
    double v6 = v1;
    double v12 = v1;
    double v13 = v6;
    double v25 = v6;
    double v32 = v5;
    double v19 = v32;
    const std::vector<double> v47 { v32, v25, v19, v25, v12, v13 };
    const double v56 = v7[0];
    const double v28 = v47[4];
    v13 = v56;
    return v28;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } });
    double v1(4.0);
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
