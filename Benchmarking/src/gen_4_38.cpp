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
    const std::vector<std::vector<double>> v2 = v0.p1;
    const std::vector<double> v5 = v2[0];
    const std::vector<std::vector<double>> v8 = v0.p0;
    const s0 v4(v8, v2);
    const double v15 = v5[0];
    const std::vector<std::vector<double>> v16 = v4.p1;
    std::vector<std::vector<double>> v38 = v16;
    const std::vector<double> v88 = v38[0];
    const double v52 = v88[0];
    const double v163 = v52 / v1;
    const double v105 = v15 * v163;
    return v105;
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
