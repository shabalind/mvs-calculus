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
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<s0> p1;
    s2(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  double f29(const double &v0) {
    double v5 = v0;
    double v3 = v0;
    double v8 = v3;
    double v2 = v3;
    const std::vector<double> v7 { v5, v5, v5 };
    const double v4 = v7[0];
    const double v6 = v7[1];
    double v12 = v8;
    const double v10 = v7[2];
    const double v13 = v7[2];
    std::vector<double> v18 = v7;
    v2 = v4;
    v18[2] = v13;
    std::vector<double> v15 = v7;
    std::vector<double> v28 = v15;
    v8 = v13;
    std::vector<double> v16 = v28;
    v15[1] = v6;
    std::vector<double> v20 = v28;
    v18[0] = v12;
    const double v67 = v15[2];
    const std::vector<std::vector<double>> v23 { v28, v16, v28, v18, v18, v28, v15 };
    v28[0] = v0;
    v15[1] = v67;
    double v40 = v2;
    v18[0] = v2;
    double v29 = v0;
    const double v55 = v20[2];
    const std::vector<double> v33 = v23[6];
    v28[1] = v40;
    std::vector<std::vector<double>> v26 = v23;
    v15[1] = v4;
    const double v25 = v13 * v29;
    v18[1] = v25;
    std::vector<std::vector<double>> v86 = v26;
    v28[0] = v55;
    v20[2] = v10;
    v86[1] = v33;
    const std::vector<double> v101 = v26[4];
    const double v99 = v101[1];
    const double v80 = v7[1];
    std::vector<double> v92 = v20;
    double v47 = v80;
    double v93 = v99;
    const std::vector<double> v144 = v86[0];
    std::vector<double> v74 = v144;
    v74[2] = v10;
    const double v168 = v16[0];
    const double v88 = v74[1];
    const std::vector<double> v191 { v47, v80 };
    v18[2] = v168;
    v86[1] = v92;
    v20[0] = v93;
    std::vector<double> v272 = v191;
    const double v94 = v272[0];
    v74[0] = v94;
    return v88;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const s2 &v1, const std::vector<s1> &v2, const double &v3) {
    double v7 = v3;
    const double v14 = f29(v7);
    v7 = v3;
    const double v29 = v7 - v14;
    return v29;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } }, { { 4.0 }, { 5.0 } } });
    s2 v1({ { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } }, { { 16.0 }, { 17.0 } } } } });
    std::vector<s1> v2({ { { { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 } }, { { 22.0 }, { 23.0 } } } }, { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } }, { { 28.0 }, { 29.0 } } } } });
    double v3(30.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
