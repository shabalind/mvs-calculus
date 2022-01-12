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
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s1> p0;
    s3(std::vector<s1> v0): p0(v0) { }
  };
  std::vector<s0> f85(const std::vector<s0> &v0) {
    std::vector<s0> v5 = v0;
    std::vector<s0> v4 = v5;
    const s0 v1 = v4[0];
    v4[0] = v1;
    s0 v3 = v1;
    const std::vector<std::vector<double>> v9 = v3.p1;
    std::vector<s0> v17 = v4;
    const std::vector<std::vector<double>> v15 = v3.p0;
    v17[0] = v1;
    std::vector<std::vector<double>> v23 = v9;
    v5 = v17;
    v3.p1 = v15;
    v3.p0 = v23;
    v4[0] = v3;
    return v17;
  }
  s0 f77(const s0 &v0) {
    const std::vector<std::vector<double>> v5 = v0.p0;
    std::vector<std::vector<double>> v7 = v5;
    s0 v1 = v0;
    v1.p0 = v5;
    std::vector<std::vector<double>> v3 = v5;
    const s0 v4(v5, v3);
    v1.p1 = v3;
    const std::vector<std::vector<double>> v6 = v1.p0;
    const std::vector<std::vector<double>> v12 = v0.p0;
    v7 = v6;
    v1.p0 = v7;
    v1.p0 = v12;
    const std::vector<std::vector<double>> v33 = v4.p0;
    v1.p0 = v3;
    std::vector<std::vector<double>> v29 = v12;
    v1.p1 = v33;
    const std::vector<std::vector<double>> v41 = v0.p1;
    const std::vector<std::vector<double>> v70 = v1.p0;
    v1.p0 = v29;
    v1.p1 = v41;
    const s0 v58(v70, v33);
    v1.p0 = v70;
    v1.p0 = v41;
    return v58;
  }
  std::vector<s0> f40(const std::vector<s0> &v0) {
    std::vector<s0> v3 = v0;
    const std::vector<s0> v2 = f85(v0);
    const s0 v5 = v3[0];
    const std::vector<std::vector<double>> v1 = v5.p1;
    std::vector<std::vector<double>> v6 = v1;
    const std::vector<double> v4 = v6[1];
    const std::vector<std::vector<double>> v13 = v5.p0;
    const s0 v8 = f77(v5);
    const s0 v10 = v3[0];
    const std::vector<std::vector<double>> v11 = v8.p1;
    s0 v12 = v8;
    const std::vector<std::vector<double>> v14 = v10.p1;
    v12.p0 = v14;
    const std::vector<std::vector<double>> v22 = v8.p1;
    const std::vector<s0> v19 = f85(v2);
    v12.p0 = v11;
    v12.p1 = v13;
    v6[0] = v4;
    v12.p1 = v22;
    const std::vector<std::vector<double>> v30 = v10.p0;
    v12.p1 = v1;
    v3[0] = v10;
    v12.p0 = v6;
    s0 v29 = v8;
    v6[1] = v4;
    const s0 v39(v6, v30);
    const s0 v38 = f77(v29);
    const std::vector<std::vector<double>> v51 = v12.p1;
    const std::vector<s0> v34 = f85(v19);
    const std::vector<double> v59 = v51[1];
    v3[0] = v5;
    v6[2] = v59;
    v29.p0 = v14;
    v29.p1 = v1;
    v29.p1 = v30;
    const std::vector<std::vector<double>> v109 = v38.p0;
    const s0 v105(v6, v6);
    const std::vector<s0> v150 = f85(v34);
    v12.p1 = v11;
    v12.p1 = v14;
    v12 = v39;
    std::vector<s0> v89 = v150;
    v29.p1 = v109;
    v89[0] = v105;
    v3[0] = v29;
    v12.p1 = v1;
    v29.p0 = v13;
    return v89;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const std::vector<s0> &v1, const double &v2) {
    const std::vector<s0> v3 = f40(v1);
    const s0 v4 = v3[0];
    const std::vector<std::vector<double>> v10 = v4.p0;
    const std::vector<double> v23 = v10[0];
    const double v105 = v23[0];
    return v105;
  }
  int main() {
    s3 v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } }, { { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } }, { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } } } });
    std::vector<s0> v1({ { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } });
    double v2(30.0);
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
