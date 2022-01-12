  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const s0 &v1, const double &v2) {
    const std::vector<std::vector<double>> v10 = v1.p1;
    const std::vector<double> v21 = v10[1];
    const double v42 = v21[0];
    std::vector<double> v18 = v21;
    const double v41 = v18[0];
    const double v48 = v41 - v42;
    std::vector<double> v103 = v21;
    double v64 = v48;
    const double v100 = v103[0];
    v103[0] = v41;
    const double v133 = v100 - v64;
    return v133;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 }, { 2.0 } } });
    s0 v1({ { { 3.0 } }, { { 4.0 }, { 5.0 } } });
    double v2(6.0);
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
