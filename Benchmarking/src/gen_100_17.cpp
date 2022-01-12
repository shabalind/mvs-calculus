  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  double f16(const double &v0) {
    double v5 = v0;
    double v4 = v0;
    double v2 = v0;
    double v3 = v0;
    v2 = v3;
    double v7 = v5;
    double v8 = v4;
    double v13 = v3;
    const double v1 = v13 * v7;
    v5 = v3;
    double v14 = v4;
    double v30 = v2;
    double v16 = v8;
    const std::vector<double> v43 { v14, v8, v8 };
    std::vector<double> v39 = v43;
    const std::vector<double> v25 { v7 };
    v39[0] = v1;
    const double v19 = v25[0];
    v39[1] = v16;
    v39[1] = v19;
    v39[0] = v30;
    v39[2] = v3;
    const double v81 = v39[1];
    return v81;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const std::vector<std::vector<double>> v6 = v0.p0;
    const std::vector<double> v18 = v6[2];
    const double v14 = v18[0];
    const double v24 = f16(v14);
    const double v47 = v18[0];
    const std::vector<double> v42 = v6[1];
    const double v95 = f16(v1);
    const std::vector<double> v60 = v6[1];
    std::vector<double> v57 = v60;
    v57[0] = v95;
    const double v74 = f16(v47);
    const double v121 = v57[0];
    std::vector<double> v116 = v42;
    const double v92 = v47 + v121;
    std::vector<double> v112 = v116;
    v57[0] = v92;
    const double v101 = v112[0];
    v112[0] = v74;
    v57[0] = v24;
    const double v232 = v92 + v101;
    return v232;
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
