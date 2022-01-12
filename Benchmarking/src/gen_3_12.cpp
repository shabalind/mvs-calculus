  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    double p1;
    s0(std::vector<std::vector<double>> v0, double v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s0 p1;
    s0 p2;
    s2(s1 v0, s0 v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s3 {
    s0 p0;
    s0 p1;
    s3(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  s3 f34(const s3 &v0) {
    s3 v6 = v0;
    s3 v7 = v0;
    s3 v3 = v0;
    s3 v2 = v6;
    const s0 v4 = v7.p0;
    const std::vector<s3> v1 { v3, v6, v0, v2, v0, v3 };
    v2.p1 = v4;
    v2.p1 = v4;
    v7.p0 = v4;
    const s0 v9 = v6.p1;
    const s0 v18 = v7.p1;
    const s0 v17 = v2.p0;
    v6.p1 = v17;
    s3 v33 = v6;
    s3 v12 = v33;
    v2.p1 = v17;
    const s3 v20 = v1[4];
    v7.p1 = v4;
    v2.p0 = v17;
    v3.p0 = v18;
    v2.p0 = v9;
    const s0 v22 = v12.p0;
    s3 v45 = v20;
    v6.p1 = v4;
    v7.p0 = v4;
    v33.p0 = v18;
    v45.p1 = v22;
    return v45;
  }
  s1 f33(const s1 &v0) {
    const std::vector<s0> v5 = v0.p0;
    s1 v7 = v0;
    const std::vector<s0> v3 = v7.p0;
    std::vector<s0> v2 = v5;
    const s0 v8 = v5[1];
    const s0 v10 = v3[2];
    s0 v1 = v8;
    const std::vector<s0> v4 = v0.p0;
    v7.p1 = v1;
    const std::vector<std::vector<double>> v12 = v1.p0;
    v2[0] = v10;
    s1 v17 = v7;
    const s0 v9 = v4[2];
    v2[2] = v10;
    v17.p0 = v2;
    std::vector<std::vector<double>> v6 = v12;
    v17.p1 = v1;
    v1.p0 = v6;
    const s2 v14(v17, v10, v8);
    const std::vector<std::vector<double>> v16 = v1.p0;
    const s0 v25 = v4[1];
    v2[1] = v8;
    v1.p0 = v16;
    v17.p1 = v25;
    const s0 v26 = v14.p2;
    v7.p1 = v9;
    v17 = v7;
    v7.p0 = v3;
    v2[0] = v26;
    v17.p1 = v8;
    v7.p1 = v1;
    s1 v29 = v17;
    return v29;
  }
  double f24(const double &v0) {
    double v2 = v0;
    double v4 = v0;
    double v3 = v4;
    double v7 = v4;
    double v6 = v2;
    const std::vector<double> v8 { v0, v4, v2, v4, v7 };
    std::vector<double> v11 = v8;
    double v10 = v6;
    const double v9 = v11[1];
    std::vector<double> v12 = v8;
    const double v22 = v12[4];
    v4 = v22;
    const std::vector<std::vector<double>> v13 { v8, v12, v11, v8, v8, v11, v11 };
    v12[3] = v7;
    v11[3] = v2;
    const double v17 = v12[3];
    v11[2] = v7;
    const double v35 = v12[1];
    v11[2] = v10;
    std::vector<std::vector<double>> v20 = v13;
    v12[0] = v17;
    v7 = v17;
    v4 = v3;
    v12[2] = v35;
    v20 = v13;
    std::vector<std::vector<double>> v14 = v20;
    const std::vector<double> v27 = v14[0];
    const double v56 = v27[2];
    v4 = v0;
    v12[3] = v9;
    return v56;
  }
  s0 f22(const s0 &v0) {
    const std::vector<std::vector<double>> v5 = v0.p0;
    std::vector<std::vector<double>> v3 = v5;
    const std::vector<std::vector<double>> v7 = v0.p0;
    const std::vector<double> v1 = v7[0];
    const double v9 = v1[0];
    const s0 v10(v3, v9);
    std::vector<double> v11 = v1;
    v3 = v7;
    const double v14 = v1[0];
    const std::vector<double> v17 = v7[0];
    s0 v8 = v0;
    double v25 = v14;
    const double v18 = v1[0];
    v25 = v18;
    const std::vector<std::vector<double>> v13 = v0.p0;
    const double v19 = v17[0];
    v8.p1 = v25;
    v8 = v10;
    const double v23 = v1[0];
    v8.p1 = v23;
    s0 v28 = v0;
    v8 = v10;
    std::vector<std::vector<double>> v48 = v13;
    v48[0] = v17;
    const double v30 = v11[0];
    v28.p1 = v19;
    s0 v33 = v10;
    v8.p1 = v30;
    v33.p1 = v23;
    v33.p0 = v7;
    v8.p0 = v5;
    v48[0] = v17;
    s0 v50 = v33;
    s0 v43 = v50;
    const double v60 = v28.p1;
    const s3 v74(v0, v43);
    s3 v37 = v74;
    s3 v71 = v37;
    v50.p0 = v48;
    const s3 v81 = f34(v74);
    v8.p0 = v3;
    v8.p1 = v60;
    const s0 v59 = v81.p1;
    const s3 v132 = f34(v74);
    const s0 v85 = v74.p1;
    const s0 v96 = v71.p0;
    const std::vector<std::vector<double>> v148 = v8.p0;
    v37.p1 = v59;
    v33 = v8;
    const std::vector<std::vector<double>> v94 = v85.p0;
    v71 = v132;
    v37.p1 = v33;
    v43.p0 = v148;
    v8.p0 = v94;
    v8.p0 = v148;
    return v96;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const std::vector<s2> &v1, const std::vector<s1> &v2, const double &v3) {
    std::vector<s2> v8 = v0;
    const s2 v4 = v8[0];
    const s0 v9 = v4.p2;
    v8[0] = v4;
    s2 v14 = v4;
    const std::vector<std::vector<double>> v7 = v9.p0;
    v14.p2 = v9;
    const s0 v5 = f22(v9);
    v8[1] = v4;
    v14.p2 = v5;
    const s0 v13 = v14.p1;
    v8[0] = v14;
    const double v10 = f24(v3);
    const double v6 = v13.p1;
    const s1 v16 = v2[0];
    const s1 v11 = f33(v16);
    const s2 v28 = v1[0];
    v14.p0 = v11;
    v8[1] = v28;
    s0 v37 = v9;
    double v70 = v10;
    v37.p0 = v7;
    const double v42 = v70 * v6;
    const double v45 = v37.p1;
    v70 = v45;
    return v42;
  }
  int main() {
    std::vector<s2> v0({ { { { { { { 0.0 } }, 1.0 }, { { { 2.0 } }, 3.0 }, { { { 4.0 } }, 5.0 } }, { { { 6.0 } }, 7.0 } }, { { { 8.0 } }, 9.0 }, { { { 10.0 } }, 11.0 } }, { { { { { { 12.0 } }, 13.0 }, { { { 14.0 } }, 15.0 }, { { { 16.0 } }, 17.0 } }, { { { 18.0 } }, 19.0 } }, { { { 20.0 } }, 21.0 }, { { { 22.0 } }, 23.0 } } });
    std::vector<s2> v1({ { { { { { { 24.0 } }, 25.0 }, { { { 26.0 } }, 27.0 }, { { { 28.0 } }, 29.0 } }, { { { 30.0 } }, 31.0 } }, { { { 32.0 } }, 33.0 }, { { { 34.0 } }, 35.0 } } });
    std::vector<s1> v2({ { { { { { 36.0 } }, 37.0 }, { { { 38.0 } }, 39.0 }, { { { 40.0 } }, 41.0 } }, { { { 42.0 } }, 43.0 } }, { { { { { 44.0 } }, 45.0 }, { { { 46.0 } }, 47.0 }, { { { 48.0 } }, 49.0 } }, { { { 50.0 } }, 51.0 } }, { { { { { 52.0 } }, 53.0 }, { { { 54.0 } }, 55.0 }, { { { 56.0 } }, 57.0 } }, { { { 58.0 } }, 59.0 } } });
    double v3(60.0);
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
