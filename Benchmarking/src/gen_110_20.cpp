  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<double> p1;
    s1(std::vector<s0> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s1>> p0;
    s0 p1;
    s2(std::vector<std::vector<s1>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f96(const double &v0) {
    double v1 = v0;
    double v6 = v0;
    double v3 = v6;
    double v4 = v0;
    v6 = v3;
    double v2 = v4;
    double v8 = v0;
    double v9 = v0;
    double v12 = v9;
    double v5 = v1;
    double v13 = v5;
    const std::vector<double> v11 { v0, v12, v3, v13, v12 };
    double v7 = v1;
    std::vector<double> v16 = v11;
    double v24 = v8;
    double v22 = v6;
    const double v35 = v11[1];
    const double v28 = v16[0];
    v16[4] = v2;
    double v14 = v22;
    v16[1] = v28;
    std::vector<double> v45 = v16;
    std::vector<double> v36 = v45;
    std::vector<double> v30 = v16;
    const std::vector<std::vector<double>> v50 { v11, v30, v45, v11 };
    v45[2] = v14;
    const double v51 = v11[1];
    std::vector<std::vector<double>> v32 = v50;
    std::vector<std::vector<double>> v102 = v50;
    v16[4] = v7;
    const std::vector<double> v39 = v32[2];
    std::vector<double> v73 = v36;
    v30[1] = v51;
    v16[1] = v35;
    const double v174 = v39[1];
    v73[4] = v2;
    v30[2] = v14;
    v32 = v102;
    v73[3] = v24;
    v102[1] = v73;
    return v174;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const s0 v7 = v0.p1;
    const std::vector<std::vector<double>> v4 = v7.p0;
    const double v3 = v1 * v1;
    const double v6 = f96(v3);
    const std::vector<double> v8 = v4[0];
    const double v9 = v8[0];
    const double v21 = f96(v9);
    const double v18 = v21 / v6;
    const double v27 = f96(v6);
    double v43 = v1;
    double v109 = v43;
    const double v136 = v27 * v109;
    const double v214 = v136 * v18;
    return v214;
  }
  int main() {
    s2 v0({ { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } }, { 8.0 } } }, { { { { { { 9.0 } }, { { 10.0 }, { 11.0 }, { 12.0 } } }, { { { 13.0 } }, { { 14.0 }, { 15.0 }, { 16.0 } } } }, { 17.0 } } } }, { { { 18.0 } }, { { 19.0 }, { 20.0 }, { 21.0 } } } });
    double v1(22.0);
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
