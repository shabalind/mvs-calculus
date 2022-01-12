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
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s1 f72(const s1 &v0) {
    return v0;
  }
  s0 f71(const s0 &v0) {
    s0 v5 = v0;
    const std::vector<std::vector<double>> v3 = v5.p1;
    std::vector<std::vector<double>> v4 = v3;
    v5.p1 = v4;
    const std::vector<std::vector<double>> v2 = v0.p1;
    const std::vector<double> v1 = v2[2];
    const std::vector<std::vector<double>> v9 = v0.p0;
    s0 v8 = v0;
    v4[1] = v1;
    std::vector<std::vector<double>> v6 = v9;
    const std::vector<std::vector<double>> v7 = v8.p1;
    v8.p1 = v4;
    v8.p1 = v4;
    std::vector<std::vector<double>> v16 = v6;
    std::vector<std::vector<double>> v13 = v16;
    const std::vector<std::vector<double>> v25 = v8.p0;
    v8.p1 = v2;
    const std::vector<std::vector<double>> v24 = v0.p1;
    const std::vector<double> v18 = v7[2];
    v5.p0 = v25;
    v8.p1 = v3;
    v8.p0 = v13;
    const std::vector<std::vector<std::vector<double>>> v14 { v3, v2, v4, v7, v3, v24, v24 };
    const std::vector<std::vector<double>> v36 = v14[3];
    v5.p0 = v13;
    v16[0] = v18;
    s0 v90 = v0;
    v90.p1 = v36;
    return v90;
  }
  s0 f69(const s0 &v0) {
    const s0 v2 = f71(v0);
    const std::vector<std::vector<double>> v4 = v0.p1;
    const s0 v5 = f71(v0);
    s0 v1 = v2;
    const s0 v9 = f71(v5);
    const std::vector<std::vector<double>> v7 = v1.p0;
    v1.p1 = v4;
    std::vector<std::vector<double>> v19 = v7;
    v1.p0 = v19;
    const std::vector<std::vector<double>> v22 = v9.p0;
    const std::vector<double> v14 = v7[0];
    const std::vector<double> v10 = v7[0];
    std::vector<double> v11 = v14;
    std::vector<double> v17 = v10;
    v19[0] = v14;
    const s0 v29 = f71(v1);
    std::vector<std::vector<double>> v20 = v4;
    const std::vector<double> v16 = v20[1];
    v1.p0 = v22;
    const s0 v25(v19, v20);
    std::vector<std::vector<double>> v21 = v7;
    const std::vector<std::vector<double>> v18 = v25.p0;
    const std::vector<double> v36 = v19[0];
    const std::vector<std::vector<double>> v66 = v5.p1;
    const std::vector<std::vector<double>> v33 = v29.p1;
    v20[2] = v14;
    v1.p0 = v21;
    v19[0] = v17;
    const s0 v31 = f71(v29);
    v1.p1 = v33;
    v21[0] = v11;
    const double v24 = v10[0];
    const double v39 = v24 * v24;
    double v46 = v24;
    const double v72 = v46 / v39;
    const double v61 = v11[0];
    v20[2] = v16;
    const double v32 = v14[0];
    const std::vector<double> v50 = v66[1];
    v17[0] = v61;
    v17[0] = v72;
    const double v91 = v36[0];
    std::vector<std::vector<double>> v90 = v20;
    v17[0] = v24;
    v17 = v10;
    v1 = v31;
    v21[0] = v50;
    const std::vector<double> v142 { v91, v72, v72, v46, v32 };
    const s0 v77(v18, v90);
    v1.p1 = v20;
    v1.p1 = v90;
    v19[0] = v14;
    const double v171 = v142[0];
    v17[0] = v171;
    return v77;
  }
  s1 f67(const s1 &v0) {
    const s1 v1 = f72(v0);
    const std::vector<s0> v7 = v1.p0;
    const s1 v3 = f72(v0);
    const s0 v5 = v7[0];
    const std::vector<s0> v6 = v3.p0;
    const s0 v2 = v6[0];
    s1 v8 = v3;
    v8 = v0;
    std::vector<s0> v12 = v7;
    const s0 v10 = v0.p1;
    v12[1] = v5;
    const s0 v15 = f71(v2);
    const std::vector<s0> v13 = v1.p0;
    v8.p1 = v15;
    v8.p0 = v12;
    v8.p0 = v6;
    const s0 v14 = f69(v10);
    v12[1] = v2;
    v8.p0 = v13;
    v8.p1 = v14;
    return v8;
  }
  s1 f30(const s1 &v0) {
    const s1 v10 = f72(v0);
    const s1 v2 = f67(v10);
    const std::vector<s0> v72 = v2.p0;
    s1 v71 = v0;
    v71.p0 = v72;
    return v71;
  }
  std::vector<s0> f22(const s0 &v0, const std::vector<s0> &v1, const s1 &v2) {
    const s0 v5 = v1[1];
    const s0 v9 = f71(v5);
    std::vector<s0> v18 = v1;
    v18[0] = v9;
    const s0 v17 = v2.p1;
    v18[0] = v9;
    v18[0] = v17;
    return v18;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const std::vector<s0> v4 = v0.p0;
    s1 v6 = v0;
    s1 v7 = v6;
    std::vector<s0> v11 = v4;
    v7.p0 = v11;
    const s1 v2 = f30(v6);
    const s0 v8 = v2.p1;
    const std::vector<std::vector<double>> v18 = v8.p0;
    const std::vector<s0> v21 = f22(v8, v11, v7);
    const s0 v30 = v4[0];
    v11[1] = v30;
    const std::vector<double> v31 = v18[0];
    std::vector<double> v52 = v31;
    v6.p0 = v21;
    const double v84 = v52[0];
    return v84;
  }
  int main() {
    s1 v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } }, { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } });
    double v1(12.0);
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
