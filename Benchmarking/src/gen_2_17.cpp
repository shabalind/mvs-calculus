  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  s0 f82(const s0 &v0) {
    return v0;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const std::vector<std::vector<double>> v9 = v0.p1;
    const std::vector<double> v7 = v9[2];
    std::vector<std::vector<double>> v10 = v9;
    const s0 v18 = f82(v0);
    const std::vector<std::vector<double>> v15 = v18.p2;
    const std::vector<double> v27 = v10[0];
    const std::vector<double> v37 = v15[0];
    v10[1] = v7;
    std::vector<double> v75 = v37;
    const double v74 = v27[0];
    const double v86 = v75[0];
    double v77 = v74;
    const double v82 = v77 - v86;
    return v82;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } }, { { 4.0 } } });
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
