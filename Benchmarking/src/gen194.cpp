  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    double p0;
    std::vector<std::vector<double>> p1;
    s0(double v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  double f81(const double &v0) {
    double v6 = v0;
    double v1 = v6;
    double v5 = v6;
    double v3 = v5;
    double v9 = v3;
    double v13 = v0;
    double v4 = v6;
    const std::vector<double> v2 { v5, v0, v13, v4, v1, v5 };
    const double v10 = v2[3];
    const double v14 = v2[2];
    std::vector<double> v19 = v2;
    const double v12 = v2[4];
    const double v17 = v2[3];
    v19[5] = v6;
    const double v16 = v19[5];
    const std::vector<double> v43 { v17, v9, v14, v16, v10, v14, v9 };
    v19[0] = v9;
    const std::vector<std::vector<double>> v20 { v43, v43, v43, v43, v43, v43 };
    v19[1] = v12;
    v6 = v4;
    std::vector<double> v32 = v2;
    std::vector<std::vector<double>> v25 = v20;
    const std::vector<double> v23 = v20[4];
    v1 = v12;
    std::vector<std::vector<double>> v33 = v25;
    v32 = v19;
    const std::vector<double> v41 = v33[0];
    const double v71 = v32[2];
    v9 = v71;
    const double v121 = v41[5];
    v33[4] = v23;
    return v121;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const std::vector<s0> v6 = v0.p1;
    const s0 v4 = v6[2];
    const std::vector<std::vector<double>> v18 = v4.p1;
    const std::vector<double> v14 = v18[0];
    const double v39 = v14[0];
    const double v24 = f81(v39);
    return v24;
  }
  int main() {
    s1 v0({ { 0.0, { { 1.0 }, { 2.0 } } }, { { 3.0, { { 4.0 }, { 5.0 } } }, { 6.0, { { 7.0 }, { 8.0 } } }, { 9.0, { { 10.0 }, { 11.0 } } } } });
    double v1(12.0);
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
