  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    const s0 v2 = v0[0];
    const s0 v14 = v0[0];
    const std::vector<std::vector<double>> v12 = v14.p0;
    const std::vector<double> v24 = v12[0];
    const std::vector<double> v19 = v12[0];
    const std::vector<std::vector<double>> v26 = v2.p0;
    const std::vector<double> v22 = v26[0];
    const std::vector<double> v200 = v12[0];
    std::vector<double> v108 = v22;
    const std::vector<std::vector<double>> v257 { v200, v108, v19 };
    std::vector<std::vector<double>> v148 = v257;
    std::vector<std::vector<double>> v58 = v148;
    std::vector<std::vector<double>> v204 = v58;
    const std::vector<double> v265 = v204[2];
    const double v216 = v265[0];
    v204[0] = v108;
    v204[0] = v24;
    return v216;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } } } });
    double v1(1.0);
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
