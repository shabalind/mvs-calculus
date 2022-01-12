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
  struct s3 {
    s1 p0;
    std::vector<s0> p1;
    s3(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s0 f38(const s0 &v0) {
    s0 v4 = v0;
    s0 v1 = v0;
    s0 v8 = v4;
    const std::vector<std::vector<double>> v9 = v8.p1;
    v4.p1 = v9;
    const std::vector<std::vector<double>> v2 = v0.p1;
    const std::vector<std::vector<double>> v3 = v0.p0;
    const std::vector<std::vector<double>> v12 = v0.p0;
    v8.p1 = v2;
    s0 v7 = v8;
    v7.p1 = v9;
    const std::vector<std::vector<double>> v15 = v4.p0;
    v7 = v1;
    v4.p0 = v3;
    const std::vector<std::vector<double>> v19 = v7.p0;
    const std::vector<std::vector<double>> v11 = v8.p1;
    s0 v47 = v1;
    v47.p0 = v15;
    const std::vector<std::vector<double>> v32 = v47.p1;
    v7.p1 = v11;
    v1.p1 = v32;
    const std::vector<std::vector<double>> v72 = v1.p0;
    const std::vector<std::vector<double>> v29 = v7.p0;
    v7.p0 = v19;
    v4.p1 = v11;
    v47.p0 = v29;
    s0 v106 = v47;
    const std::vector<std::vector<double>> v63 = v47.p0;
    const std::vector<std::vector<double>> v91 = v8.p1;
    v47.p0 = v12;
    v47.p0 = v63;
    v1.p1 = v91;
    v106.p1 = v11;
    v47.p1 = v91;
    v106.p0 = v72;
    return v106;
  }
  s3 f33(const std::vector<s0> &v0, const s3 &v1) {
    std::vector<s0> v2 = v0;
    const s0 v3 = v2[1];
    const s0 v6 = f38(v3);
    const std::vector<s0> v13 = v1.p1;
    v2[0] = v6;
    const std::vector<s0> v12 = v1.p1;
    s3 v16 = v1;
    const s0 v20 = v12[1];
    s3 v44 = v16;
    v16.p1 = v13;
    v2[1] = v20;
    v44.p1 = v12;
    const s1 v35 = v44.p0;
    const s3 v46(v35, v13);
    const std::vector<s0> v80 = v1.p1;
    const s0 v41 = f38(v6);
    v44.p1 = v13;
    const s0 v48 = f38(v41);
    const s3 v51(v35, v80);
    v2[0] = v41;
    std::vector<s0> v49 = v13;
    v16.p1 = v12;
    const s0 v52 = f38(v48);
    const s1 v139 = v51.p0;
    v44.p0 = v139;
    const s0 v64 = f38(v48);
    std::vector<s0> v57 = v49;
    v2[0] = v52;
    v16.p1 = v57;
    v49[2] = v64;
    return v46;
  }
  s3 f29(const s3 &v0) {
    const s1 v1 = v0.p0;
    const std::vector<s0> v7 = v0.p1;
    const std::vector<s1> v4 { v1 };
    const s0 v5 = v7[1];
    const s1 v3 = v4[0];
    std::vector<s1> v12 = v4;
    v12 = v4;
    const s1 v30 = v4[0];
    s1 v18 = v3;
    const s1 v13 = v12[0];
    const s0 v20 = v7[0];
    const s1 v27 = v12[0];
    v12[0] = v3;
    v18.p1 = v5;
    const s0 v39 = f38(v20);
    v12[0] = v13;
    const s0 v77 = v7[0];
    v12[0] = v30;
    const s0 v66 = f38(v39);
    v12[0] = v18;
    const std::vector<s0> v81 = v30.p0;
    v18.p1 = v66;
    v18.p1 = v77;
    std::vector<s1> v61 = v12;
    v12 = v61;
    const std::vector<s0> v162 = v27.p0;
    v61[0] = v1;
    v18.p0 = v162;
    const s1 v184 = v12[0];
    s3 v95 = v0;
    v18.p0 = v81;
    v95.p0 = v184;
    return v95;
  }
  double f23(const s3 &v0, const double &v1) {
    const s3 v5 = f29(v0);
    double v4 = v1;
    const std::vector<s0> v3 = v5.p1;
    const s0 v2 = v3[0];
    v4 = v1;
    const double v19 = v1 + v4;
    const std::vector<std::vector<double>> v22 = v2.p1;
    const std::vector<double> v26 = v22[2];
    const double v15 = v26[0];
    v4 = v19;
    const double v36 = v19 * v15;
    const double v72 = v26[0];
    double v70 = v36;
    double v62 = v70;
    v4 = v72;
    return v62;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s1 &v1, const s1 &v2, const s0 &v3, const std::vector<std::vector<s3>> &v4, const double &v5) {
    const std::vector<s3> v10 = v4[0];
    const s3 v13 = v10[0];
    double v14 = v5;
    const double v22 = v5 / v14;
    std::vector<s0> v103 = v0;
    const s3 v35 = f29(v13);
    const s3 v68 = f33(v103, v35);
    const double v73 = v14 / v22;
    const double v55 = f23(v68, v73);
    return v55;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } });
    s1 v1({ { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } });
    s1 v2({ { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } });
    s0 v3({ { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } });
    std::vector<std::vector<s3>> v4({ { { { { { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } } }, { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } }, { { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } }, { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } }, { { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } } } }, { { { { { { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } } } }, { { { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } } } }, { { { { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } }, { { { 60.0 } }, { { 61.0 }, { 62.0 }, { 63.0 } } }, { { { 64.0 } }, { { 65.0 }, { 66.0 }, { 67.0 } } } } } } });
    double v5(68.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4, v5);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
