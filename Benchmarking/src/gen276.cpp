  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<std::vector<s1>> p1;
    s2(s0 v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    s1 p1;
    s3(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s2 p0;
    std::vector<s3> p1;
    s5(s2 v0, std::vector<s3> v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<s2> p0;
    s6(std::vector<s2> v0): p0(v0) { }
  };
  double f56(const double &v0) {
    double v3 = v0;
    double v5 = v0;
    double v4 = v0;
    v4 = v3;
    double v7 = v3;
    double v9 = v4;
    const std::vector<double> v2 { v5, v5, v4, v0, v3, v9, v9 };
    std::vector<double> v20 = v2;
    std::vector<double> v8 = v2;
    const double v21 = v2[4];
    const double v22 = v20[3];
    std::vector<double> v12 = v8;
    v12[4] = v7;
    std::vector<double> v18 = v2;
    const double v30 = v21 / v3;
    const double v27 = v2[6];
    const double v33 = v18[4];
    const double v44 = v30 * v22;
    double v35 = v33;
    double v24 = v4;
    std::vector<double> v19 = v12;
    const double v58 = v19[2];
    v12[1] = v44;
    v8[2] = v35;
    v12[4] = v24;
    v7 = v33;
    std::vector<double> v51 = v19;
    v12[4] = v35;
    v20[5] = v58;
    v19[2] = v33;
    const double v63 = v51[1];
    v8[3] = v63;
    v7 = v27;
    return v63;
  }
  s0 f39(const s0 &v0) {
    const std::vector<double> v4 = v0.p0;
    const std::vector<std::vector<double>> v6 = v0.p1;
    const std::vector<double> v7 = v6[0];
    s0 v20 = v0;
    s0 v45 = v20;
    v45.p0 = v4;
    s0 v19 = v45;
    s0 v31 = v19;
    const std::vector<double> v21 = v31.p0;
    v45.p0 = v7;
    const std::vector<double> v68 = v19.p0;
    v45.p0 = v68;
    const std::vector<std::vector<double>> v32 = v19.p1;
    v45.p0 = v4;
    const std::vector<std::vector<double>> v89 = v19.p1;
    const s0 v158(v21, v32);
    const std::vector<double> v163 = v89[0];
    v20.p0 = v163;
    return v158;
  }
  s0 f38(const s0 &v0) {
    const std::vector<std::vector<double>> v1 = v0.p1;
    s0 v5 = v0;
    s0 v13 = v5;
    v5.p1 = v1;
    v5.p1 = v1;
    return v13;
  }
  std::vector<double> f17(const std::vector<double> &v0) {
    std::vector<double> v4 = v0;
    const double v2 = v4[0];
    v4[0] = v2;
    const double v5 = f56(v2);
    std::vector<double> v7 = v0;
    v7[0] = v2;
    const double v3 = f56(v2);
    double v6 = v5;
    const double v8 = f56(v3);
    const double v11 = f56(v3);
    std::vector<double> v14 = v4;
    const double v16 = v7[0];
    std::vector<double> v9 = v4;
    v9[0] = v8;
    v4[0] = v11;
    double v1 = v6;
    const double v10 = v4[0];
    const double v29 = v9[0];
    std::vector<double> v34 = v0;
    double v33 = v3;
    double v37 = v10;
    const double v17 = f56(v37);
    std::vector<double> v12 = v34;
    double v19 = v16;
    v19 = v11;
    std::vector<double> v27 = v7;
    const double v28 = v12[0];
    const double v25 = v14[0];
    const double v40 = v34[0];
    v4[0] = v40;
    v12[0] = v33;
    v12[0] = v40;
    double v23 = v25;
    const std::vector<std::vector<double>> v35 { v14, v14, v12, v27, v0, v0 };
    const std::vector<double> v57 = v35[2];
    v27[0] = v17;
    v12[0] = v11;
    v4[0] = v3;
    const double v43 = f56(v1);
    const double v47 = f56(v25);
    v9[0] = v16;
    v27[0] = v10;
    v12[0] = v28;
    v12[0] = v43;
    const double v31 = f56(v47);
    std::vector<double> v54 = v57;
    v54[0] = v29;
    v12[0] = v23;
    v14[0] = v11;
    v14[0] = v16;
    double v71 = v40;
    v34[0] = v19;
    v54[0] = v31;
    v9[0] = v71;
    v23 = v1;
    v4[0] = v47;
    std::vector<double> v143 = v54;
    return v143;
  }
  double f14(const double &v0, const s0 &v1) {
    const std::vector<std::vector<double>> v4 = v1.p1;
    const std::vector<double> v2 = v4[0];
    std::vector<std::vector<double>> v6 = v4;
    const std::vector<double> v7 = f17(v2);
    s0 v3 = v1;
    std::vector<std::vector<double>> v10 = v6;
    const s0 v16(v7, v4);
    const std::vector<double> v20 = f17(v7);
    const s0 v9 = f38(v16);
    v10[0] = v7;
    std::vector<double> v12 = v20;
    const std::vector<std::vector<double>> v11 = v1.p1;
    const s0 v26 = f39(v3);
    v3.p0 = v20;
    const std::vector<std::vector<double>> v21 = v9.p1;
    const std::vector<double> v15 = v11[0];
    v10[0] = v15;
    v6[0] = v15;
    const std::vector<std::vector<double>> v17 = v1.p1;
    const s0 v25 = f39(v9);
    const std::vector<double> v30 = v26.p0;
    v3.p0 = v30;
    const std::vector<double> v47 = v25.p0;
    v3.p1 = v21;
    v3.p1 = v10;
    v3.p0 = v12;
    v3.p1 = v21;
    const double v34 = v30[0];
    const double v53 = f56(v34);
    const double v24 = v47[0];
    const double v59 = f56(v24);
    const std::vector<double> v44 = v17[0];
    v3.p0 = v44;
    const double v77 = v53 / v59;
    return v77;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const std::vector<s6> &v1, const std::vector<std::vector<s5>> &v2, const s2 &v3, const double &v4) {
    const std::vector<double> v10 = v0.p0;
    std::vector<double> v7 = v10;
    s0 v8 = v0;
    v7[0] = v4;
    const double v17 = v4 * v4;
    const double v14 = v10[0];
    v8.p0 = v10;
    v7[0] = v4;
    v8.p0 = v7;
    v8.p0 = v7;
    std::vector<double> v35 = v10;
    v8.p0 = v35;
    v8.p0 = v7;
    const double v60 = v7[0];
    const double v29 = v4 + v17;
    const double v33 = v60 + v60;
    v35 = v7;
    const double v31 = v14 * v33;
    const std::vector<double> v43 = f17(v35);
    const double v68 = v43[0];
    const double v54 = v17 / v31;
    double v51 = v29;
    const std::vector<double> v39 = f17(v7);
    const double v52 = v54 * v51;
    const double v56 = v39[0];
    v8.p0 = v35;
    v35[0] = v56;
    const double v87 = v43[0];
    v35[0] = v68;
    v7[0] = v60;
    v35[0] = v87;
    const double v122 = v54 * v52;
    const double v221 = f14(v68, v8);
    v7[0] = v221;
    return v122;
  }
  int main() {
    s0 v0({ { 0.0 }, { { 1.0 } } });
    std::vector<s6> v1({ { { { { { 2.0 }, { { 3.0 } } }, { { { { { { 4.0 }, { { 5.0 } } } }, { { 6.0 }, { { 7.0 } } } } }, { { { { { 8.0 }, { { 9.0 } } } }, { { 10.0 }, { { 11.0 } } } } } } }, { { { 12.0 }, { { 13.0 } } }, { { { { { { 14.0 }, { { 15.0 } } } }, { { 16.0 }, { { 17.0 } } } } }, { { { { { 18.0 }, { { 19.0 } } } }, { { 20.0 }, { { 21.0 } } } } } } } } } });
    std::vector<std::vector<s5>> v2({ { { { { { 22.0 }, { { 23.0 } } }, { { { { { { 24.0 }, { { 25.0 } } } }, { { 26.0 }, { { 27.0 } } } } }, { { { { { 28.0 }, { { 29.0 } } } }, { { 30.0 }, { { 31.0 } } } } } } }, { { { { { { 32.0 }, { { 33.0 } } } }, { { 34.0 }, { { 35.0 } } } }, { { { { 36.0 }, { { 37.0 } } } }, { { 38.0 }, { { 39.0 } } } } }, { { { { { 40.0 }, { { 41.0 } } } }, { { 42.0 }, { { 43.0 } } } }, { { { { 44.0 }, { { 45.0 } } } }, { { 46.0 }, { { 47.0 } } } } }, { { { { { 48.0 }, { { 49.0 } } } }, { { 50.0 }, { { 51.0 } } } }, { { { { 52.0 }, { { 53.0 } } } }, { { 54.0 }, { { 55.0 } } } } } } } } });
    s2 v3({ { { 56.0 }, { { 57.0 } } }, { { { { { { 58.0 }, { { 59.0 } } } }, { { 60.0 }, { { 61.0 } } } } }, { { { { { 62.0 }, { { 63.0 } } } }, { { 64.0 }, { { 65.0 } } } } } } });
    double v4(66.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
