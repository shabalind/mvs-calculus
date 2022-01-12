  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s0 p2;
    s1(s0 v0, std::vector<std::vector<s0>> v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  s0 f39(const s1 &v0, const s0 &v1) {
    s0 v3 = v1;
    const std::vector<std::vector<double>> v6 = v3.p0;
    const std::vector<std::vector<double>> v4 = v3.p1;
    v3.p0 = v6;
    v3 = v1;
    const std::vector<std::vector<double>> v30 = v1.p1;
    v3.p0 = v4;
    const std::vector<std::vector<s0>> v11 = v0.p1;
    const std::vector<s0> v22 = v11[0];
    const s0 v21 = v22[0];
    const std::vector<std::vector<double>> v23 = v21.p0;
    v3.p0 = v30;
    const std::vector<std::vector<double>> v20 = v3.p1;
    s0 v60 = v21;
    v60.p1 = v23;
    v60.p0 = v20;
    return v60;
  }
  s1 f27(const s1 &v0, const s1 &v1) {
    const std::vector<std::vector<s0>> v7 = v1.p1;
    const std::vector<s0> v2 = v7[0];
    std::vector<std::vector<s0>> v18 = v7;
    std::vector<std::vector<s0>> v12 = v18;
    v18[0] = v2;
    const std::vector<s0> v13 = v18[0];
    s1 v30 = v1;
    const s0 v22 = v13[0];
    v30.p2 = v22;
    v30.p1 = v12;
    return v30;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const s1 v7 = f27(v0, v0);
    const std::vector<std::vector<s0>> v2 = v7.p1;
    const std::vector<s0> v5 = v2[0];
    const double v9 = v1 - v1;
    double v10 = v1;
    const std::vector<double> v18 { v10, v10, v10, v1, v9 };
    const s0 v20 = v0.p2;
    const s0 v19 = v5[0];
    const std::vector<std::vector<double>> v25 = v19.p0;
    const s0 v22 = f39(v7, v20);
    const std::vector<std::vector<double>> v53 = v22.p0;
    const double v73 = v18[3];
    std::vector<std::vector<double>> v83 = v25;
    const std::vector<double> v52 = v83[2];
    const double v150 = v73 + v1;
    const double v147 = v52[0];
    v83[2] = v52;
    v83[0] = v52;
    const std::vector<double> v141 = v53[1];
    const double v151 = v141[0];
    const double v131 = v151 * v9;
    const std::vector<double> v164 { v131, v150, v131, v147, v9, v131, v10 };
    const double v145 = v164[1];
    return v145;
  }
  int main() {
    s1 v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } }, { { { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } } });
    double v1(18.0);
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
