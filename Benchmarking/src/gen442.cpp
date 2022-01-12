  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const std::vector<s0> &v1, const double &v2) {
    const s0 v8 = v0[1];
    s0 v6 = v8;
    const std::vector<double> v5 = v6.p1;
    const std::vector<double> v11 = v6.p1;
    const double v3 = v5[1];
    const std::vector<double> v12 = v8.p1;
    const std::vector<double> v9 = v6.p1;
    v6.p1 = v9;
    const s0 v19 = v0[2];
    const double v20 = v3 * v3;
    const s0 v16 = v1[1];
    v6.p1 = v12;
    v6.p1 = v11;
    const std::vector<double> v42 = v16.p1;
    v6.p1 = v42;
    const std::vector<std::vector<double>> v35 = v19.p0;
    v6.p0 = v35;
    return v20;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { 3.0, 4.0 } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { 8.0, 9.0 } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { 13.0, 14.0 } } });
    std::vector<s0> v1({ { { { 15.0 }, { 16.0 }, { 17.0 } }, { 18.0, 19.0 } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { 23.0, 24.0 } }, { { { 25.0 }, { 26.0 }, { 27.0 } }, { 28.0, 29.0 } } });
    double v2(30.0);
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
