  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    std::vector<std::vector<double>> p4;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3, std::vector<std::vector<double>> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const std::vector<std::vector<double>> v8 = v0.p0;
    const std::vector<double> v14 = v8[0];
    const double v10 = v1 * v1;
    std::vector<double> v16 = v14;
    v16[0] = v1;
    const double v17 = v16[0];
    const double v38 = v14[0];
    v16[0] = v38;
    const double v122 = v10 * v17;
    const double v91 = v1 + v122;
    return v91;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { 3.0, 4.0 }, { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } }, { { 10.0 } } });
    double v1(11.0);
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
