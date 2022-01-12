  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s2(s0 v0): p0(v0) { }
  };
  struct s5 {
    s2 p0;
    s2 p1;
    s5(s2 v0, s2 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s5 &v0, const double &v1) {
    const s2 v2 = v0.p1;
    const s0 v3 = v2.p0;
    s0 v4 = v3;
    s0 v6 = v4;
    const s0 v8 = v2.p0;
    const std::vector<std::vector<double>> v27 = v3.p0;
    const s0 v16 = v2.p0;
    const s2 v20(v4);
    const std::vector<double> v22 = v27[0];
    const std::vector<std::vector<double>> v23 = v16.p0;
    const s0 v26 = v2.p0;
    s2 v24 = v20;
    s0 v40 = v16;
    const std::vector<double> v21 = v23[0];
    const std::vector<std::vector<double>> v71 = v6.p0;
    const std::vector<double> v37 = v71[0];
    const std::vector<std::vector<double>> v43 { v21, v37, v22 };
    const std::vector<std::vector<double>> v72 = v16.p1;
    const std::vector<std::vector<double>> v45 = v40.p0;
    v6.p1 = v72;
    std::vector<std::vector<double>> v55 = v72;
    v4.p0 = v27;
    const s0 v50 = v24.p0;
    const std::vector<std::vector<double>> v78 = v8.p0;
    v6 = v50;
    v4.p0 = v45;
    const std::vector<double> v34 = v43[2];
    s0 v97 = v26;
    std::vector<std::vector<double>> v112 = v72;
    v97.p0 = v78;
    s0 v53 = v97;
    v4.p1 = v112;
    v24.p0 = v53;
    v24.p0 = v16;
    const double v107 = v34[0];
    v4.p1 = v55;
    v6.p1 = v55;
    return v107;
  }
  int main() {
    s5 v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 } } } }, { { { { 3.0 } }, { { 4.0 }, { 5.0 } } } } });
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
