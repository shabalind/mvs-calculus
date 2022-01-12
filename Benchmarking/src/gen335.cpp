  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f12(const s0 &v0, const s0 &v1) {
    const std::vector<std::vector<double>> v6 = v0.p1;
    s0 v9 = v0;
    std::vector<std::vector<double>> v3 = v6;
    s0 v8 = v0;
    const std::vector<double> v4 = v3[0];
    const std::vector<double> v12 = v6[0];
    std::vector<std::vector<double>> v11 = v3;
    const std::vector<std::vector<double>> v13 = v0.p1;
    const std::vector<std::vector<double>> v19 = v0.p0;
    const double v29 = v4[0];
    s0 v18 = v8;
    std::vector<double> v23 = v12;
    const std::vector<std::vector<double>> v35 = v9.p1;
    v23[0] = v29;
    v18.p1 = v11;
    v18.p1 = v13;
    v18.p1 = v35;
    const std::vector<std::vector<double>> v26 = v1.p0;
    const std::vector<std::vector<double>> v20 = v0.p1;
    v18.p0 = v26;
    v8.p1 = v20;
    v8.p1 = v6;
    v8.p1 = v13;
    v11[0] = v23;
    v23[0] = v29;
    const std::vector<std::vector<double>> v71 = v18.p1;
    std::vector<std::vector<double>> v78 = v20;
    v9.p1 = v78;
    v8.p1 = v71;
    v9.p0 = v19;
    return v18;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    double v3 = v1;
    const s0 v8 = f12(v0, v0);
    const std::vector<std::vector<double>> v6 = v8.p0;
    const std::vector<double> v20 { v3, v3, v1, v1 };
    const double v29 = v20[0];
    std::vector<double> v18 = v20;
    std::vector<double> v21 = v18;
    v18 = v21;
    const std::vector<double> v26 = v6[1];
    const double v52 = v26[0];
    v18 = v21;
    v18[3] = v29;
    const double v27 = v18[0];
    v18[2] = v52;
    double v90 = v1;
    std::vector<double> v66 = v21;
    const double v88 = v18[1];
    const double v59 = v90 / v1;
    v3 = v88;
    v66[1] = v27;
    v66[1] = v59;
    v21[2] = v3;
    v21[0] = v52;
    v66 = v21;
    const double v332 = v66[2];
    return v332;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } });
    double v1(4.0);
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
