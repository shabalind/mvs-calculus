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
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s1> p0;
    s0 p1;
    s3(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  std::vector<double> f37(const std::vector<double> &v0) {
    std::vector<double> v6 = v0;
    const double v4 = v6[0];
    v6[0] = v4;
    double v1 = v4;
    v6[0] = v1;
    double v3 = v1;
    const std::vector<double> v8 { v4, v3, v1, v4, v4, v3, v4 };
    std::vector<double> v7 = v0;
    const double v12 = v8[4];
    const double v5 = v0[0];
    v6[0] = v12;
    double v9 = v12;
    v7[0] = v1;
    v6[0] = v9;
    const std::vector<std::vector<double>> v53 { v0, v0, v7, v7, v6, v7, v6 };
    const std::vector<double> v67 = v53[3];
    const double v34 = v8[4];
    const std::vector<double> v68 = v53[5];
    const double v72 = v68[0];
    std::vector<double> v52 = v67;
    v7[0] = v34;
    v6[0] = v5;
    v52[0] = v72;
    return v52;
  }
  s2 f32(const s2 &v0, const s0 &v1) {
    const s0 v7 = v0.p0;
    s2 v3 = v0;
    v3.p1 = v7;
    const std::vector<s2> v4 { v0, v3, v3 };
    v3.p1 = v7;
    v3.p1 = v1;
    const s0 v8 = v3.p1;
    const s2 v2 = v4[0];
    const std::vector<s2> v13 { v2 };
    std::vector<s2> v22 = v13;
    v3.p1 = v8;
    const s0 v23 = v0.p1;
    v3.p0 = v7;
    v3.p1 = v23;
    const s2 v45 = v22[0];
    std::vector<s2> v89 = v13;
    const s2 v53 = v89[0];
    v89[0] = v2;
    v89[0] = v45;
    v89[0] = v3;
    v22 = v13;
    v22 = v89;
    return v53;
  }
  s0 f28(const s0 &v0) {
    s0 v6 = v0;
    s0 v3 = v6;
    s0 v5 = v3;
    const std::vector<std::vector<double>> v7 = v3.p0;
    std::vector<std::vector<double>> v8 = v7;
    const std::vector<std::vector<double>> v1 = v0.p0;
    const std::vector<double> v12 = v7[1];
    std::vector<double> v2 = v12;
    const std::vector<std::vector<double>> v18 = v6.p1;
    const std::vector<double> v9 = v8[0];
    const std::vector<double> v21 = f37(v2);
    v8[1] = v9;
    const std::vector<double> v25 = v18[0];
    v3.p1 = v18;
    v8[0] = v21;
    std::vector<double> v10 = v25;
    const s2 v20(v5, v6);
    const s2 v19 = f32(v20, v6);
    v5.p0 = v1;
    std::vector<std::vector<double>> v22 = v1;
    v22[0] = v21;
    const std::vector<std::vector<double>> v55 = v5.p1;
    s2 v44 = v20;
    v3.p1 = v18;
    v22 = v8;
    v3.p0 = v1;
    const std::vector<double> v62 = v55[2];
    v8[0] = v62;
    v8[0] = v10;
    const double v69 = v62[0];
    const s2 v80 = f32(v19, v3);
    s2 v72 = v44;
    const s0 v42 = v72.p0;
    v8[0] = v25;
    v3.p0 = v22;
    const s2 v52 = f32(v80, v42);
    v44.p1 = v0;
    v6.p0 = v8;
    const s2 v81 = f32(v52, v3);
    v2[0] = v69;
    const s0 v154 = v81.p0;
    v8[1] = v62;
    return v154;
  }
  s0 f15(const s0 &v0) {
    s0 v2 = v0;
    const std::vector<std::vector<double>> v6 = v0.p1;
    v2.p1 = v6;
    return v2;
  }
  s0 f8(const s0 &v0) {
    s0 v1 = v0;
    s0 v7 = v1;
    const s0 v8 = f15(v7);
    const std::vector<std::vector<double>> v2 = v0.p1;
    const std::vector<std::vector<double>> v5 = v7.p1;
    const std::vector<std::vector<double>> v9 = v1.p1;
    const std::vector<double> v10 = v5[2];
    const std::vector<std::vector<double>> v4 = v7.p0;
    v7.p0 = v4;
    const std::vector<double> v3 = v9[0];
    std::vector<std::vector<double>> v6 = v4;
    const s0 v23 = f28(v0);
    const std::vector<double> v24 = v2[2];
    const std::vector<double> v16 = f37(v3);
    const s0 v17 = f15(v0);
    v6[1] = v16;
    const s0 v15 = f28(v1);
    const double v43 = v16[0];
    v7.p1 = v9;
    const std::vector<double> v18 = f37(v3);
    const std::vector<double> v22 = v9[0];
    const std::vector<std::vector<double>> v29 = v8.p0;
    const std::vector<double> v27 = f37(v10);
    const std::vector<double> v45 = f37(v18);
    const s0 v26 = f15(v15);
    const std::vector<std::vector<double>> v50 = v17.p1;
    const std::vector<std::vector<double>> v25 = v26.p0;
    const double v66 = v43 - v43;
    const double v30 = v27[0];
    const std::vector<std::vector<double>> v48 = v17.p1;
    double v41 = v30;
    const double v58 = v24[0];
    std::vector<double> v34 = v22;
    const std::vector<std::vector<double>> v67 = v15.p1;
    v34[0] = v30;
    const std::vector<double> v83 = f37(v10);
    const std::vector<std::vector<double>> v51 = v23.p0;
    v1.p1 = v50;
    v6[0] = v34;
    const double v126 = v58 * v66;
    v34[0] = v126;
    v34[0] = v41;
    v1.p0 = v51;
    const double v76 = v10[0];
    std::vector<std::vector<double>> v131 = v48;
    const s0 v138(v25, v131);
    v131[2] = v45;
    v34[0] = v76;
    v7.p0 = v6;
    v131[2] = v83;
    v7.p1 = v2;
    v7.p0 = v29;
    const s0 v120 = f28(v138);
    v7.p1 = v67;
    return v120;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const s3 &v1, const double &v2) {
    const s0 v4 = v1.p1;
    const double v9 = v2 + v2;
    const std::vector<std::vector<double>> v15 = v4.p0;
    const double v12 = v9 + v2;
    s0 v13 = v4;
    v13.p0 = v15;
    const s0 v10 = f15(v13);
    const s0 v27 = f8(v10);
    double v21 = v12;
    v13.p0 = v15;
    const std::vector<std::vector<double>> v42 = v27.p0;
    const std::vector<double> v55 = v42[1];
    v13 = v4;
    const double v53 = v55[0];
    const double v50 = v21 * v53;
    v13.p0 = v42;
    return v50;
  }
  int main() {
    std::vector<s2> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } } });
    s3 v1({ { { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } }, { { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } }, { { { { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } } }, { { { { 35.0 }, { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } } } }, { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 }, { 44.0 } } } });
    double v2(45.0);
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
