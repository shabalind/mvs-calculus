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
    std::vector<s0> p1;
    s2(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    s0 p1;
    s3(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s0 p0;
    std::vector<s0> p1;
    s4(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s2 p0;
    s0 p1;
    s5(s2 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    std::vector<s5> p0;
    s0 p1;
    s9(std::vector<s5> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s11 {
    s9 p0;
    std::vector<s3> p1;
    s11(s9 v0, std::vector<s3> v1): p0(v0), p1(v1) { }
  };
  struct s14 {
    s11 p0;
    s5 p1;
    s14(s11 v0, s5 v1): p0(v0), p1(v1) { }
  };
  s0 f30(const s0 &v0) {
    s0 v7 = v0;
    const std::vector<std::vector<double>> v8 = v7.p1;
    s0 v1 = v7;
    v1.p0 = v8;
    s0 v4 = v1;
    v1.p0 = v8;
    v4.p0 = v8;
    s0 v16 = v4;
    return v16;
  }
  double f25(const s4 &v0, const double &v1) {
    const s0 v6 = v0.p0;
    const s0 v14 = f30(v6);
    s0 v9 = v14;
    const std::vector<std::vector<double>> v18 = v14.p0;
    const std::vector<std::vector<double>> v7 = v9.p1;
    const std::vector<std::vector<double>> v27 = v6.p1;
    std::vector<std::vector<double>> v17 = v7;
    const std::vector<double> v16 = v18[0];
    std::vector<std::vector<double>> v15 = v17;
    v17[0] = v16;
    v9.p1 = v17;
    v9.p0 = v27;
    v17[0] = v16;
    v17[0] = v16;
    const std::vector<double> v24 = v7[0];
    v15[0] = v24;
    const std::vector<double> v46 = v15[0];
    const std::vector<double> v31 = v17[0];
    v17[0] = v24;
    v15[0] = v31;
    const double v89 = v46[0];
    return v89;
  }
  __attribute__((noinline))
  double f0(const std::vector<s4> &v0, const std::vector<std::vector<s14>> &v1, const std::vector<s3> &v2, const double &v3) {
    double v5 = v3;
    const s4 v6 = v0[0];
    const s4 v7 = v0[0];
    const std::vector<double> v4 { v3, v3, v5, v3, v3, v3 };
    std::vector<double> v10 = v4;
    v10[2] = v5;
    const double v11 = f25(v6, v5);
    const double v15 = f25(v6, v5);
    const double v18 = v4[4];
    double v35 = v5;
    const double v25 = f25(v6, v18);
    const double v42 = f25(v6, v35);
    const s4 v57 = v0[0];
    std::vector<double> v103 = v10;
    std::vector<double> v102 = v10;
    double v96 = v11;
    v10[1] = v25;
    const double v98 = v42 - v96;
    v103[3] = v11;
    const double v152 = v102[5];
    v103 = v102;
    const double v97 = f25(v7, v152);
    v10[1] = v98;
    v103[2] = v3;
    const double v58 = v103[0];
    const double v190 = f25(v57, v96);
    v103[0] = v25;
    v10[5] = v190;
    v103[1] = v15;
    const double v166 = v58 / v97;
    return v166;
  }
  int main() {
    std::vector<s4> v0({ { { { { 0.0 } }, { { 1.0 } } }, { { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } }, { { { 6.0 } }, { { 7.0 } } } } } });
    std::vector<std::vector<s14>> v1({ { { { { { { { { { { 8.0 } }, { { 9.0 } } }, { { { { 10.0 } }, { { 11.0 } } }, { { { 12.0 } }, { { 13.0 } } } } }, { { { 14.0 } }, { { 15.0 } } } } }, { { { 16.0 } }, { { 17.0 } } } }, { { { { { 18.0 } }, { { 19.0 } } }, { { { 20.0 } }, { { 21.0 } } } } } }, { { { { { 22.0 } }, { { 23.0 } } }, { { { { 24.0 } }, { { 25.0 } } }, { { { 26.0 } }, { { 27.0 } } } } }, { { { 28.0 } }, { { 29.0 } } } } } } });
    std::vector<s3> v2({ { { { { 30.0 } }, { { 31.0 } } }, { { { 32.0 } }, { { 33.0 } } } } });
    double v3(34.0);
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
