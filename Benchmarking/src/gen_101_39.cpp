  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const std::vector<std::vector<double>> v6 = v0.p2;
    const std::vector<double> v4 = v6[1];
    const double v11 = v4[0];
    const double v13 = v4[0];
    const std::vector<double> v18 { v11, v1 };
    const std::vector<double> v23 = v6[0];
    const double v10 = v18[1];
    const double v35 = v23[0];
    const double v74 = v13 + v10;
    const double v67 = v74 - v35;
    return v67;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } }, { { 4.0 }, { 5.0 } } });
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
