  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    double p0;
    s1(double v0): p0(v0) { }
  };
  struct s2 {
    std::vector<s1> p0;
    std::vector<s1> p1;
    std::vector<s1> p2;
    s2(std::vector<s1> v0, std::vector<s1> v1, std::vector<s1> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s3 {
    std::vector<s1> p0;
    s0 p1;
    s3(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<std::vector<s2>> p0;
    s4(std::vector<std::vector<s2>> v0): p0(v0) { }
  };
  struct s5 {
    std::vector<s3> p0;
    std::vector<s2> p1;
    s5(std::vector<s3> v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s5 p0;
    s1 p1;
    s6(s5 v0, s1 v1): p0(v0), p1(v1) { }
  };
  s2 f82(const s2 &v0) {
    const std::vector<s1> v7 = v0.p0;
    std::vector<s1> v4 = v7;
    const s1 v5 = v4[1];
    s1 v6 = v5;
    const double v9 = v6.p0;
    double v3 = v9;
    v6.p0 = v9;
    v4[1] = v5;
    const s1 v10 = v4[1];
    const s1 v2 = v7[0];
    s2 v18 = v0;
    double v1 = v3;
    v4[1] = v10;
    const s1 v13 = v7[1];
    std::vector<s1> v8 = v4;
    v18.p1 = v8;
    const std::vector<s1> v17 = v18.p2;
    v4[1] = v13;
    s1 v14 = v5;
    std::vector<s1> v11 = v17;
    v8[1] = v14;
    const std::vector<s1> v15 = v18.p2;
    v6.p0 = v3;
    s1 v20 = v13;
    double v26 = v9;
    v11[0] = v20;
    v4[0] = v13;
    s1 v16 = v14;
    const s1 v30 = v11[0];
    v4[0] = v16;
    v4[1] = v2;
    v16.p0 = v26;
    const std::vector<double> v21 { v1, v1 };
    const s1 v22 = v4[0];
    v11[0] = v20;
    v6.p0 = v26;
    v11[0] = v6;
    v11[1] = v30;
    s2 v44 = v18;
    v4[1] = v22;
    const std::vector<s1> v49 = v44.p2;
    v14.p0 = v26;
    const s2 v38(v11, v17, v4);
    v18.p1 = v8;
    std::vector<double> v39 = v21;
    v6.p0 = v3;
    s2 v32 = v38;
    v8[0] = v22;
    v39[1] = v3;
    v44.p2 = v49;
    s2 v59 = v32;
    v4[1] = v5;
    v11[0] = v13;
    const double v78 = v39[0];
    const std::vector<s1> v58 = v44.p2;
    v32.p1 = v15;
    const s1 v159 = v58[0];
    v8[0] = v159;
    v14.p0 = v78;
    return v59;
  }
  s2 f80(const s2 &v0) {
    const s2 v6 = f82(v0);
    const s2 v9 = f82(v0);
    const s2 v2 = f82(v6);
    const std::vector<s1> v5 = v2.p1;
    const s2 v12 = f82(v9);
    s2 v18 = v12;
    v18.p2 = v5;
    v18.p1 = v5;
    v18 = v12;
    const s2 v79 = f82(v18);
    return v79;
  }
  std::vector<s3> f78(const std::vector<s3> &v0) {
    std::vector<s3> v2 = v0;
    const s3 v8 = v2[0];
    s3 v10 = v8;
    v2[0] = v10;
    const s0 v23 = v10.p1;
    const s0 v18 = v10.p1;
    v10.p1 = v18;
    const s3 v39 = v0[1];
    v10.p1 = v23;
    v2[1] = v39;
    std::vector<s3> v53 = v2;
    std::vector<s3> v55 = v0;
    v2[2] = v10;
    v53 = v0;
    v2 = v55;
    return v53;
  }
  s1 f76(const s1 &v0) {
    const double v5 = v0.p0;
    const double v6 = v0.p0;
    const double v8 = v0.p0;
    double v7 = v6;
    s1 v16 = v0;
    s1 v13 = v0;
    v16 = v13;
    v16.p0 = v8;
    v16.p0 = v7;
    v16.p0 = v5;
    return v16;
  }
  s1 f71(const s1 &v0) {
    const s1 v3 = f76(v0);
    const s1 v4 = f76(v0);
    s1 v7 = v0;
    const s1 v1 = f76(v3);
    const double v12 = v0.p0;
    const s1 v5 = f76(v3);
    const s1 v8 = f76(v1);
    const std::vector<double> v6 { v12, v12, v12, v12, v12, v12, v12 };
    const double v9 = v6[3];
    const double v10 = v8.p0;
    v7.p0 = v10;
    v7.p0 = v10;
    v7.p0 = v10;
    v7 = v0;
    const double v16 = v4.p0;
    const s1 v11 = f76(v4);
    const double v15 = v6[1];
    v7.p0 = v15;
    v7.p0 = v9;
    const s1 v28 = f76(v11);
    const double v56 = v5.p0;
    v7.p0 = v56;
    const s1 v78 = f76(v28);
    v7.p0 = v12;
    v7.p0 = v16;
    const double v173 = v78.p0;
    v7.p0 = v173;
    return v7;
  }
  s2 f56(const s2 &v0) {
    s2 v6 = v0;
    const std::vector<s1> v5 = v0.p0;
    const s2 v7 = f80(v6);
    const s2 v8 = f80(v0);
    v6.p2 = v5;
    v6.p0 = v5;
    v6.p1 = v5;
    s2 v2 = v7;
    v6 = v8;
    const s2 v23 = f80(v2);
    const s2 v30 = f82(v23);
    return v30;
  }
  s5 f34(const s5 &v0) {
    return v0;
  }
  s6 f32(const s6 &v0) {
    return v0;
  }
  s5 f25(const s5 &v0) {
    s5 v3 = v0;
    const std::vector<s2> v7 = v3.p1;
    v3.p1 = v7;
    const std::vector<s3> v1 = v3.p0;
    const std::vector<s2> v2 = v0.p1;
    v3 = v0;
    const s5 v5 = f34(v3);
    s5 v8 = v5;
    s5 v9 = v3;
    const std::vector<s3> v11 = f78(v1);
    const std::vector<s2> v6 = v3.p1;
    const std::vector<s3> v4 = v5.p0;
    const s2 v13 = v6[0];
    const std::vector<s5> v15 { v8, v9, v9, v0 };
    v9.p0 = v4;
    const s2 v18 = f56(v13);
    const std::vector<s2> v21 = v3.p1;
    std::vector<s2> v69 = v21;
    v69[1] = v18;
    v69[0] = v13;
    v3.p1 = v69;
    const std::vector<s3> v51 = v8.p0;
    v8.p0 = v51;
    v9.p1 = v2;
    v8.p0 = v11;
    const s5 v65 = v15[2];
    v69 = v2;
    return v65;
  }
  s6 f12(const s6 &v0) {
    const s1 v3 = v0.p1;
    s6 v4 = v0;
    const s6 v10 = f32(v4);
    const s5 v6 = v10.p0;
    const s5 v8 = f25(v6);
    v4.p0 = v8;
    const s1 v15 = v10.p1;
    const s6 v16 = f32(v4);
    v4 = v16;
    const s6 v20 = f32(v4);
    v4.p0 = v6;
    const s5 v17 = v20.p0;
    const s5 v38 = v10.p0;
    v4.p0 = v8;
    v4.p0 = v17;
    const s1 v87 = f71(v15);
    v4.p1 = v3;
    s6 v112 = v0;
    v112.p1 = v87;
    v112.p0 = v38;
    const s5 v125 = f25(v38);
    v112.p1 = v87;
    const s5 v123 = f25(v125);
    v112.p0 = v123;
    const std::vector<s6> v209 { v112, v16, v112 };
    const s6 v76 = v209[2];
    return v76;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const s0 &v1, const std::vector<s4> &v2, const s6 &v3, const s0 &v4, const double &v5) {
    const std::vector<std::vector<double>> v21 = v1.p1;
    const s6 v14 = f12(v3);
    const s1 v25 = v14.p1;
    const std::vector<double> v27 = v21[2];
    const double v45 = v25.p0;
    std::vector<double> v37 = v27;
    const double v23 = v25.p0;
    v37[0] = v23;
    const double v39 = v37[0];
    const double v146 = v39 * v45;
    return v146;
  }
  int main() {
    s1 v0({ 0.0 });
    s0 v1({ { { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } });
    std::vector<s4> v2({ { { { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 } } } }, { { { { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 } } } }, { { { { 17.0 }, { 18.0 } }, { { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 } } } } } } });
    s6 v3({ { { { { { 23.0 }, { 24.0 } }, { { { 25.0 } }, { { 26.0 }, { 27.0 }, { 28.0 } } } }, { { { 29.0 }, { 30.0 } }, { { { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } } } }, { { { 35.0 }, { 36.0 } }, { { { 37.0 } }, { { 38.0 }, { 39.0 }, { 40.0 } } } } }, { { { { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } }, { { 45.0 }, { 46.0 } } }, { { { 47.0 }, { 48.0 } }, { { 49.0 }, { 50.0 } }, { { 51.0 }, { 52.0 } } } } }, { 53.0 } });
    s0 v4({ { { 54.0 } }, { { 55.0 }, { 56.0 }, { 57.0 } } });
    double v5(58.0);
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
