  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    s3(s0 v0): p0(v0) { }
  };
  __attribute__((noinline))
  double f0(const s3 &v0, const s3 &v1, const double &v2) {
    const s0 v12 = v1.p0;
    const std::vector<std::vector<double>> v3 = v12.p0;
    const s0 v15 = v1.p0;
    const std::vector<std::vector<double>> v35 = v15.p0;
    const std::vector<double> v17 = v35[0];
    const double v21 = v17[0];
    const double v72 = v17[0];
    const double v32 = v21 / v72;
    const std::vector<double> v54 = v3[1];
    const double v71 = v54[0];
    const double v177 = v71 - v32;
    return v177;
  }
  int main() {
    s3 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } } });
    s3 v1({ { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } });
    double v2(10.0);
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
