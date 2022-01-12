  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f57(const s0 &v0, const s0 &v1, const double &v2) {
    const std::vector<std::vector<double>> v4 = v1.p1;
    s0 v5 = v0;
    std::vector<std::vector<double>> v13 = v4;
    const std::vector<std::vector<double>> v30 = v1.p1;
    const std::vector<std::vector<double>> v19 = v0.p0;
    std::vector<std::vector<double>> v33 = v30;
    const std::vector<double> v21 = v13[0];
    v5.p0 = v19;
    v5.p1 = v33;
    const std::vector<std::vector<double>> v50 = v1.p1;
    s0 v53 = v5;
    v33[0] = v21;
    v5.p1 = v50;
    return v53;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const double &v1) {
    const std::vector<s0> v13 = v0[1];
    const s0 v21 = v13[0];
    const s0 v19 = v13[0];
    const s0 v16 = f57(v19, v21, v1);
    const std::vector<std::vector<double>> v26 = v16.p0;
    std::vector<std::vector<double>> v57 = v26;
    const std::vector<double> v40 = v57[1];
    const double v108 = v40[0];
    return v108;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } }, { { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 }, { 7.0 } }, { { 8.0 } } } } });
    double v1(9.0);
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
