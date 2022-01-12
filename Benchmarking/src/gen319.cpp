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
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s0> p0;
    s1 p1;
    s3(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    std::vector<s3> p0;
    std::vector<std::vector<s1>> p1;
    s7(std::vector<s3> v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  double f39(const s0 &v0, const double &v1) {
    double v3 = v1;
    const std::vector<std::vector<double>> v8 = v0.p1;
    const std::vector<std::vector<double>> v2 = v0.p1;
    const std::vector<double> v5 = v8[1];
    s0 v10 = v0;
    v10.p0 = v2;
    s0 v7 = v10;
    s0 v6 = v7;
    s0 v4 = v10;
    const s0 v9(v2, v8);
    const double v13 = v1 + v1;
    const std::vector<std::vector<double>> v11 = v0.p0;
    v10.p0 = v11;
    const std::vector<double> v22 = v2[0];
    const double v21 = v5[0];
    std::vector<double> v18 = v22;
    double v55 = v21;
    s0 v23 = v6;
    const s0 v14(v8, v11);
    const std::vector<std::vector<double>> v24 = v14.p1;
    const double v35 = v13 + v13;
    const std::vector<std::vector<double>> v44 = v23.p0;
    double v26 = v1;
    v18[0] = v3;
    const double v17 = v18[0];
    const std::vector<std::vector<double>> v27 = v9.p1;
    const std::vector<std::vector<double>> v33 = v4.p1;
    const double v34 = v26 + v35;
    v18[0] = v26;
    const std::vector<std::vector<double>> v32 = v10.p0;
    v18[0] = v26;
    const std::vector<double> v31 = v32[1];
    const std::vector<std::vector<double>> v25 = v23.p0;
    v18[0] = v55;
    std::vector<double> v80 = v5;
    v23.p1 = v27;
    v18[0] = v55;
    const std::vector<double> v50 = v24[1];
    v18[0] = v34;
    v26 = v55;
    double v100 = v17;
    std::vector<std::vector<double>> v49 = v33;
    v7.p1 = v25;
    std::vector<std::vector<double>> v58 = v2;
    const std::vector<std::vector<double>> v61 = v7.p0;
    const std::vector<double> v56 = v61[1];
    v58[1] = v18;
    const std::vector<std::vector<double>> v29 = v4.p1;
    v58[0] = v31;
    v18[0] = v3;
    const double v121 = v18[0];
    double v107 = v121;
    v49[1] = v80;
    const double v81 = v13 / v100;
    v23.p1 = v44;
    v10.p1 = v29;
    const std::vector<std::vector<double>> v75 = v7.p0;
    v26 = v107;
    const std::vector<std::vector<double>> v148 = v9.p0;
    const double v86 = v56[0];
    double v130 = v86;
    v7.p1 = v58;
    const std::vector<std::vector<double>> v122 = v7.p1;
    v6.p1 = v75;
    v58[0] = v80;
    v18[0] = v130;
    v49[1] = v31;
    v7.p0 = v122;
    v58[1] = v50;
    v49[1] = v31;
    v80[0] = v55;
    v49[0] = v18;
    v23.p1 = v49;
    v7.p1 = v49;
    v4.p0 = v148;
    return v81;
  }
  double f27(const double &v0) {
    double v6 = v0;
    double v7 = v6;
    const std::vector<double> v2 { v7, v6, v7, v7, v6, v0, v7 };
    const double v4 = v2[2];
    const std::vector<std::vector<double>> v32 { v2 };
    std::vector<std::vector<double>> v16 = v32;
    std::vector<std::vector<double>> v14 = v16;
    const std::vector<double> v15 = v14[0];
    std::vector<double> v22 = v15;
    std::vector<std::vector<double>> v21 = v16;
    v21[0] = v22;
    std::vector<double> v20 = v22;
    const double v26 = v20[3];
    const std::vector<double> v78 = v32[0];
    v22[6] = v4;
    const double v24 = v22[2];
    v6 = v26;
    v14[0] = v78;
    v16[0] = v2;
    v20[5] = v24;
    v16[0] = v78;
    const std::vector<double> v35 = v21[0];
    v16[0] = v22;
    v14[0] = v78;
    v14[0] = v2;
    const double v220 = v35[4];
    return v220;
  }
  __attribute__((noinline))
  double f0(const s7 &v0, const s0 &v1, const double &v2) {
    const double v3 = f39(v1, v2);
    const double v19 = f27(v3);
    return v19;
  }
  int main() {
    s7 v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } }, { { { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } }, { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } }, { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } } } } } }, { { { { { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } }, { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } } }, { { { { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } } } } }, { { { { { { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } }, { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 } } } }, { { { { 44.0 }, { 45.0 } }, { { 46.0 }, { 47.0 } } } } } }, { { { { { { 48.0 }, { 49.0 } }, { { 50.0 }, { 51.0 } } }, { { { 52.0 }, { 53.0 } }, { { 54.0 }, { 55.0 } } } }, { { { { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } } } } } } });
    s0 v1({ { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 } } });
    double v2(64.0);
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
