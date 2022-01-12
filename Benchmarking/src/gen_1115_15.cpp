  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f13(const s0 &v0) {
    s0 v6 = v0;
    const std::vector<std::vector<double>> v1 = v6.p0;
    s0 v2 = v6;
    v2.p1 = v1;
    const std::vector<double> v9 = v1[0];
    const std::vector<std::vector<double>> v8 = v6.p1;
    const std::vector<double> v7 = v8[0];
    const std::vector<std::vector<double>> v13 = v0.p1;
    s0 v4 = v2;
    const std::vector<std::vector<double>> v12 = v2.p1;
    const std::vector<std::vector<double>> v16 = v0.p0;
    v4.p0 = v8;
    std::vector<double> v21 = v9;
    std::vector<std::vector<double>> v10 = v13;
    v2.p0 = v16;
    const double v23 = v7[0];
    v10[0] = v21;
    v21[0] = v23;
    v2 = v4;
    const std::vector<double> v24 = v1[0];
    const std::vector<std::vector<double>> v54 = v2.p0;
    const s0 v55(v8, v54);
    v4.p1 = v16;
    v6 = v55;
    const s0 v34(v12, v10);
    v2.p0 = v10;
    v10[0] = v24;
    return v34;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const std::vector<s0> &v1, const double &v2) {
    const s0 v7 = v1[0];
    const s0 v4 = f13(v7);
    const std::vector<std::vector<double>> v6 = v4.p0;
    const std::vector<double> v12 = v6[0];
    const double v40 = v12[0];
    return v40;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 } } });
    std::vector<s0> v1({ { { { 2.0 } }, { { 3.0 } } } });
    double v2(4.0);
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
