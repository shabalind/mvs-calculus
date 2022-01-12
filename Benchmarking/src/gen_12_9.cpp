  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s0 p1;
    s2(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    std::vector<s2> p1;
    s3(s0 v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  double f94(const double &v0) {
    const std::vector<double> v7 { v0, v0, v0, v0 };
    const double v2 = v7[2];
    double v6 = v2;
    v6 = v2;
    const double v5 = v7[2];
    double v4 = v5;
    double v8 = v6;
    double v11 = v8;
    double v15 = v8;
    const double v20 = v7[2];
    const double v23 = v7[1];
    std::vector<double> v25 = v7;
    v6 = v15;
    v25[3] = v11;
    v25[2] = v11;
    v25[1] = v15;
    const double v24 = v25[1];
    std::vector<double> v32 = v7;
    v25[0] = v24;
    v25[1] = v23;
    std::vector<double> v31 = v7;
    double v43 = v23;
    v31[3] = v43;
    std::vector<double> v22 = v25;
    std::vector<double> v38 = v25;
    const std::vector<std::vector<double>> v54 { v22, v25, v31, v31, v25, v32 };
    v32[0] = v15;
    std::vector<std::vector<double>> v40 = v54;
    const double v41 = v38[1];
    v38[2] = v6;
    v40[1] = v31;
    const double v55 = v20 / v41;
    const std::vector<double> v145 = v54[1];
    v38[0] = v15;
    v38[2] = v4;
    v31[1] = v55;
    const double v139 = v145[0];
    v38[1] = v139;
    const std::vector<double> v99 = v40[1];
    const double v152 = v99[3];
    v31[0] = v5;
    return v152;
  }
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const double &v1) {
    double v3 = v1;
    const double v5 = v3 / v3;
    const double v2 = f94(v5);
    double v4 = v2;
    const double v13 = f94(v1);
    const double v20 = v1 * v2;
    double v170 = v4;
    double v101 = v1;
    const std::vector<double> v65 { v13, v5, v170, v20, v101, v4, v4 };
    const double v157 = v65[1];
    return v157;
  }
  int main() {
    std::vector<s3> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { { { { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } } } } });
    double v1(16.0);
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
