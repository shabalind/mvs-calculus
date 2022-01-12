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
    const std::vector<std::vector<double>> v5 = v0.p0;
    const std::vector<double> v7 = v5[0];
    double v18 = v1;
    const double v12 = v7[0];
    const std::vector<std::vector<double>> v4 = v0.p1;
    const std::vector<double> v30 = v4[1];
    const double v20 = v30[0];
    const std::vector<double> v24 { v18, v18, v20 };
    std::vector<double> v31 = v24;
    const double v45 = v7[0];
    const double v56 = v31[1];
    const double v108 = v45 * v56;
    v18 = v12;
    double v140 = v108;
    return v140;
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
