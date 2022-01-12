  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<std::vector<s0>> p1;
    s1(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<std::vector<s1>> p1;
    s2(s0 v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s2 p0;
    s0 p1;
    s4(s2 v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f39(const double &v0) {
    double v1 = v0;
    const double v7 = v0 + v1;
    double v8 = v1;
    double v5 = v1;
    double v3 = v1;
    const double v13 = v1 * v5;
    double v9 = v0;
    v5 = v8;
    v3 = v8;
    const std::vector<double> v10 { v7 };
    std::vector<double> v11 = v10;
    v11[0] = v13;
    const double v17 = v11[0];
    const double v30 = v11[0];
    v11[0] = v30;
    v11[0] = v3;
    double v14 = v8;
    std::vector<double> v16 = v10;
    v16[0] = v7;
    const double v36 = v10[0];
    double v34 = v7;
    double v24 = v9;
    v16[0] = v14;
    v16[0] = v17;
    double v21 = v24;
    const double v70 = v16[0];
    std::vector<double> v46 = v16;
    const std::vector<double> v59 { v21, v30, v70, v1 };
    const double v37 = v46[0];
    v46[0] = v36;
    std::vector<double> v71 = v59;
    v16[0] = v36;
    std::vector<double> v31 = v59;
    double v55 = v24;
    const double v52 = v59[3];
    v11[0] = v37;
    const double v26 = v71[3];
    v16[0] = v34;
    const std::vector<std::vector<double>> v100 { v31, v59, v31 };
    v46[0] = v52;
    v31[3] = v3;
    v71[3] = v3;
    v11[0] = v55;
    v16[0] = v13;
    const std::vector<double> v128 = v100[2];
    v46[0] = v26;
    const double v136 = v128[0];
    v5 = v52;
    return v136;
  }
  __attribute__((noinline))
  double f0(const std::vector<s4> &v0, const double &v1) {
    const double v13 = v1 / v1;
    const double v4 = f39(v13);
    double v76 = v4;
    double v60 = v76;
    return v60;
  }
  int main() {
    std::vector<s4> v0({ { { { { { 0.0 } }, { { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { { { { { 4.0 } }, { { 5.0 } }, { { 6.0 }, { 7.0 } } } }, { { { { { 8.0 } }, { { 9.0 } }, { { 10.0 }, { 11.0 } } } } } } }, { { { { { { 12.0 } }, { { 13.0 } }, { { 14.0 }, { 15.0 } } } }, { { { { { 16.0 } }, { { 17.0 } }, { { 18.0 }, { 19.0 } } } } } } }, { { { { { { 20.0 } }, { { 21.0 } }, { { 22.0 }, { 23.0 } } } }, { { { { { 24.0 } }, { { 25.0 } }, { { 26.0 }, { 27.0 } } } } } } } } }, { { { 28.0 } }, { { 29.0 } }, { { 30.0 }, { 31.0 } } } } });
    double v1(32.0);
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
