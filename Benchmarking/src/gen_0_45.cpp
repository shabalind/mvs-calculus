  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    double p1;
    s0(std::vector<std::vector<double>> v0, double v1): p0(v0), p1(v1) { }
  };
  s0 f61(const s0 &v0) {
    s0 v2 = v0;
    s0 v1 = v2;
    s0 v5 = v1;
    s0 v15 = v0;
    const std::vector<std::vector<double>> v13 = v1.p0;
    const double v10 = v5.p1;
    v5.p1 = v10;
    v15.p0 = v13;
    double v29 = v10;
    std::vector<std::vector<double>> v24 = v13;
    v1.p0 = v24;
    const double v20 = v29 / v29;
    const std::vector<std::vector<double>> v35 = v15.p0;
    const s0 v39(v35, v20);
    v15.p1 = v10;
    return v39;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    const s0 v7 = v0[0];
    std::vector<s0> v3 = v0;
    v3[0] = v7;
    const s0 v5 = v3[0];
    v3[0] = v7;
    v3[0] = v5;
    const s0 v11 = f61(v5);
    const s0 v9 = f61(v11);
    v3[0] = v9;
    const s0 v42 = f61(v9);
    const double v58 = v42.p1;
    return v58;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, 1.0 } });
    double v1(2.0);
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
