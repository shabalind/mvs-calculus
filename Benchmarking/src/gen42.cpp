  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f92(const s0 &v0) {
    const std::vector<s0> v1 { v0, v0, v0, v0 };
    const s0 v7 = v1[1];
    const s0 v6 = v1[0];
    const s0 v4 = v1[3];
    const s0 v9 = v1[3];
    const std::vector<double> v14 = v9.p0;
    const double v13 = v14[1];
    double v18 = v13;
    std::vector<s0> v25 = v1;
    const s0 v22 = v25[2];
    v25[1] = v4;
    const std::vector<double> v35 = v4.p0;
    v25[2] = v22;
    v25[3] = v6;
    const s0 v34 = v1[2];
    const s0 v36 = v25[3];
    std::vector<double> v98 = v35;
    v25[2] = v34;
    const std::vector<std::vector<double>> v83 = v6.p1;
    s0 v57 = v0;
    const std::vector<double> v84 = v57.p0;
    const std::vector<double> v55 = v7.p0;
    s0 v71 = v6;
    const s0 v117 = v1[1];
    const std::vector<double> v86 = v22.p0;
    v25[3] = v71;
    v71.p0 = v55;
    std::vector<double> v67 = v35;
    v67[1] = v18;
    v71.p0 = v84;
    s0 v113 = v36;
    v57.p0 = v67;
    v113.p0 = v86;
    v57.p0 = v98;
    v57 = v117;
    v71.p1 = v83;
    return v113;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const s0 &v1, const double &v2) {
    s0 v6 = v1;
    const std::vector<std::vector<double>> v3 = v1.p1;
    const s0 v5 = f92(v6);
    const std::vector<double> v16 = v1.p0;
    const std::vector<double> v12 = v3[2];
    v6.p0 = v16;
    const std::vector<double> v35 = v3[0];
    std::vector<std::vector<double>> v29 = v3;
    const std::vector<double> v30 = v3[1];
    const std::vector<std::vector<double>> v23 = v5.p1;
    std::vector<std::vector<double>> v47 = v29;
    v47[2] = v12;
    v47[1] = v35;
    v6.p1 = v47;
    v6.p1 = v3;
    const std::vector<double> v70 = v23[0];
    v29[1] = v30;
    v6.p1 = v23;
    const std::vector<double> v87 = v29[1];
    const double v51 = v70[0];
    v47[2] = v87;
    v29[0] = v35;
    v47[0] = v87;
    return v51;
  }
  int main() {
    s0 v0({ { 0.0, 1.0 }, { { 2.0 }, { 3.0 }, { 4.0 } } });
    s0 v1({ { 5.0, 6.0 }, { { 7.0 }, { 8.0 }, { 9.0 } } });
    double v2(10.0);
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
