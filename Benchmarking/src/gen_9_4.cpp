  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    double v5 = v1;
    const std::vector<std::vector<double>> v6 = v0.p0;
    const std::vector<double> v8 = v0.p1;
    const std::vector<double> v7 = v0.p1;
    const std::vector<double> v30 = v6[0];
    const double v13 = v30[0];
    const double v17 = v8[2];
    const double v31 = v7[2];
    const std::vector<double> v16 { v5, v17, v31, v17, v13 };
    std::vector<double> v33 = v16;
    const std::vector<std::vector<double>> v58 { v33, v16 };
    std::vector<std::vector<double>> v44 = v58;
    const std::vector<double> v170 = v44[0];
    const double v158 = v170[3];
    return v158;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { 2.0, 3.0, 4.0 } });
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
