  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f85(const s0 &v0) {
    const std::vector<std::vector<double>> v3 = v0.p1;
    const std::vector<std::vector<double>> v12 = v0.p0;
    const s0 v8(v12, v3);
    return v8;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const s0 v7 = f85(v0);
    const std::vector<std::vector<double>> v8 = v7.p1;
    const std::vector<double> v6 = v8[1];
    const std::vector<std::vector<double>> v4 = v0.p0;
    std::vector<std::vector<double>> v11 = v4;
    v11[0] = v6;
    const std::vector<double> v20 = v11[0];
    const double v47 = v20[0];
    double v34 = v47;
    return v34;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } });
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
