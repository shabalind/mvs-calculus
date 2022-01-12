  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    std::vector<std::vector<double>> p4;
    std::vector<std::vector<double>> p5;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3, std::vector<std::vector<double>> v4, std::vector<std::vector<double>> v5): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5) { }
  };
  struct s1 {
    double p0;
    s1(double v0): p0(v0) { }
  };
  struct s2 {
    s1 p0;
    s0 p1;
    s2(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<std::vector<s1>> p0;
    s2 p1;
    s3(std::vector<std::vector<s1>> v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s1 p0;
    std::vector<s3> p1;
    s4(s1 v0, std::vector<s3> v1): p0(v0), p1(v1) { }
  };
  s1 f108(const s1 &v0) {
    s1 v6 = v0;
    const double v5 = v6.p0;
    const double v2 = v0.p0;
    const double v18 = v6.p0;
    const s1 v19(v2);
    v6 = v0;
    v6.p0 = v18;
    const double v26 = v19.p0;
    v6.p0 = v2;
    v6.p0 = v5;
    v6.p0 = v26;
    return v6;
  }
  s2 f95(const s2 &v0) {
    return v0;
  }
  s3 f71(const s1 &v0, const s3 &v1) {
    s3 v131 = v1;
    return v131;
  }
  s3 f65(const s3 &v0) {
    const std::vector<s3> v4 { v0, v0, v0, v0, v0, v0, v0 };
    const s3 v1 = v4[2];
    const s3 v5 = v4[1];
    s3 v8 = v5;
    const s3 v3 = v4[6];
    const std::vector<std::vector<s1>> v2 = v5.p0;
    const std::vector<std::vector<s1>> v7 = v3.p0;
    const std::vector<s1> v10 = v2[0];
    const std::vector<std::vector<s1>> v13 = v0.p0;
    v8.p0 = v7;
    const s3 v6 = v4[1];
    const s1 v11 = v10[0];
    v8.p0 = v7;
    const double v12 = v11.p0;
    std::vector<s3> v24 = v4;
    s1 v22 = v11;
    const s3 v16 = v24[6];
    const s1 v19 = v10[0];
    const s3 v18 = f71(v22, v8);
    const double v34 = v19.p0;
    const s3 v20 = f71(v19, v18);
    const s2 v17 = v5.p1;
    const s2 v49 = f95(v17);
    const s1 v53 = v10[0];
    s3 v70 = v8;
    const double v45 = v53.p0;
    const s3 v23 = f71(v22, v70);
    v70.p1 = v49;
    const s2 v56 = f95(v49);
    v22.p0 = v34;
    v8.p1 = v49;
    v22.p0 = v12;
    v70 = v20;
    const std::vector<s3> v44 { v23, v18, v6, v6, v1, v16 };
    v22.p0 = v45;
    v70.p0 = v13;
    const s2 v210 = f95(v56);
    v8.p1 = v210;
    std::vector<s3> v213 = v44;
    v213[0] = v3;
    const s3 v150 = v213[4];
    v8.p0 = v13;
    return v150;
  }
  s3 f56(const s3 &v0) {
    const s2 v3 = v0.p1;
    s3 v5 = v0;
    const std::vector<std::vector<s1>> v2 = v0.p0;
    v5.p0 = v2;
    s2 v7 = v3;
    std::vector<std::vector<s1>> v8 = v2;
    std::vector<std::vector<s1>> v4 = v2;
    v5.p0 = v4;
    const s2 v1 = f95(v3);
    const s2 v14 = f95(v7);
    const s1 v20 = v1.p0;
    const std::vector<s1> v27 = v8[0];
    v5.p1 = v1;
    const s1 v48 = f108(v20);
    const std::vector<std::vector<s1>> v28 = v5.p0;
    v5.p0 = v28;
    v5.p1 = v7;
    v4[0] = v27;
    v5.p1 = v3;
    s1 v75 = v20;
    const s3 v67(v28, v14);
    const s3 v87 = f71(v75, v67);
    v7.p0 = v48;
    v5.p1 = v7;
    return v87;
  }
  s2 f54(const s2 &v0) {
    const s2 v2 = f95(v0);
    const s2 v1 = f95(v2);
    s2 v4 = v1;
    s2 v6 = v4;
    const s1 v8 = v1.p0;
    const s1 v7 = v0.p0;
    v6.p0 = v7;
    const std::vector<s1> v11 { v8, v8, v7, v8, v8 };
    const s1 v14 = v11[1];
    std::vector<s1> v19 = v11;
    v6.p0 = v7;
    const std::vector<s1> v12 { v7, v14, v7, v7 };
    const s1 v23 = v19[2];
    const s1 v21 = v12[0];
    v6.p0 = v23;
    v6.p0 = v21;
    v19[1] = v7;
    const std::vector<std::vector<s1>> v34 { v19, v19, v19, v19, v19 };
    const s1 v25 = v11[2];
    const std::vector<s1> v26 = v34[1];
    v19[3] = v25;
    v19 = v26;
    return v6;
  }
  s4 f41(const s2 &v0, const s4 &v1) {
    s4 v5 = v1;
    s4 v4 = v1;
    const std::vector<s3> v10 = v5.p1;
    const std::vector<s3> v11 = v4.p1;
    v5.p1 = v11;
    v4.p1 = v11;
    const std::vector<s4> v14 { v4, v1, v4, v5, v4, v4 };
    const s4 v12 = v14[2];
    v4.p1 = v10;
    std::vector<s4> v23 = v14;
    v5.p1 = v10;
    const s4 v38 = v23[4];
    v23[5] = v12;
    v23 = v14;
    std::vector<s4> v51 = v23;
    const s4 v108 = v51[5];
    v51[4] = v38;
    const s4 v81 = v51[0];
    v51 = v23;
    v51[5] = v108;
    s4 v132 = v5;
    v5 = v1;
    v23[2] = v132;
    return v81;
  }
  s4 f29(const s4 &v0) {
    const std::vector<s3> v4 = v0.p1;
    const std::vector<s3> v1 = v0.p1;
    s4 v2 = v0;
    v2.p1 = v4;
    v2.p1 = v4;
    const s3 v7 = v4[0];
    const std::vector<s3> v6 = v2.p1;
    const s3 v3 = f65(v7);
    s4 v15 = v2;
    const s3 v10 = v1[1];
    std::vector<s3> v8 = v6;
    const s3 v12 = f65(v3);
    v2.p1 = v6;
    v8[0] = v3;
    v8[1] = v7;
    s4 v28 = v15;
    v2.p1 = v8;
    const s3 v13 = f56(v12);
    const s3 v19 = v6[0];
    const s3 v16 = f56(v13);
    v8[0] = v16;
    const std::vector<std::vector<s1>> v37 = v19.p0;
    v8[0] = v10;
    v15.p1 = v1;
    const std::vector<s1> v35 = v37[0];
    const s3 v48 = v8[1];
    const s1 v26 = v35[0];
    v15.p0 = v26;
    v28 = v0;
    v8[1] = v48;
    const s3 v23 = f71(v26, v10);
    const s1 v51 = f108(v26);
    const s1 v39 = f108(v51);
    v2.p0 = v39;
    v8[1] = v23;
    return v28;
  }
  s4 f27(const s4 &v0) {
    s4 v8 = v0;
    return v8;
  }
  __attribute__((noinline))
  double f0(const std::vector<s4> &v0, const double &v1) {
    const double v2 = v1 + v1;
    const std::vector<std::vector<s4>> v7 { v0, v0, v0, v0, v0, v0 };
    std::vector<s4> v5 = v0;
    std::vector<std::vector<s4>> v9 = v7;
    std::vector<s4> v4 = v5;
    v9[1] = v0;
    const std::vector<s4> v14 = v9[0];
    const s4 v6 = v14[2];
    const std::vector<s3> v8 = v6.p1;
    const s4 v13 = f27(v6);
    v9[3] = v5;
    const s4 v3 = f29(v13);
    v5 = v0;
    const s3 v17 = v8[1];
    const s2 v28 = v17.p1;
    v4[0] = v13;
    const s3 v21 = v8[1];
    const s2 v19 = f54(v28);
    const s4 v25 = v0[0];
    const std::vector<s4> v42 = v9[0];
    const s1 v40 = v13.p0;
    const s3 v27 = f71(v40, v21);
    s4 v22 = v13;
    v9[3] = v5;
    const s4 v24 = f41(v19, v25);
    v5[2] = v3;
    const s4 v18 = v4[0];
    std::vector<std::vector<s4>> v33 = v9;
    std::vector<std::vector<s4>> v39 = v33;
    const s2 v41 = v27.p1;
    const s1 v31(v2);
    v5[2] = v24;
    const s0 v45 = v41.p1;
    std::vector<std::vector<s4>> v48 = v39;
    const s2 v53(v31, v45);
    const std::vector<s4> v57 = v48[1];
    const std::vector<s4> v69 = v33[0];
    v9[4] = v69;
    v33[5] = v0;
    const s1 v104 = v53.p0;
    v22.p0 = v40;
    v5[2] = v22;
    v33[4] = v42;
    v22.p0 = v104;
    const double v93 = v104.p0;
    v33[4] = v57;
    std::vector<std::vector<s4>> v75 = v39;
    const std::vector<s4> v61 = v33[0];
    v5[1] = v18;
    v33[5] = v61;
    v5[1] = v6;
    v33[3] = v4;
    v9 = v75;
    return v93;
  }
  int main() {
    std::vector<s4> v0({ { { 0.0 }, { { { { { 1.0 } } }, { { 2.0 }, { { { 3.0 }, { 4.0 }, { 5.0 } }, { 6.0 }, { { 7.0 } }, { { 8.0 } }, { { 9.0 } }, { { 10.0 }, { 11.0 }, { 12.0 } } } } }, { { { { 13.0 } } }, { { 14.0 }, { { { 15.0 }, { 16.0 }, { 17.0 } }, { 18.0 }, { { 19.0 } }, { { 20.0 } }, { { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } } } } } }, { { 25.0 }, { { { { { 26.0 } } }, { { 27.0 }, { { { 28.0 }, { 29.0 }, { 30.0 } }, { 31.0 }, { { 32.0 } }, { { 33.0 } }, { { 34.0 } }, { { 35.0 }, { 36.0 }, { 37.0 } } } } }, { { { { 38.0 } } }, { { 39.0 }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { 43.0 }, { { 44.0 } }, { { 45.0 } }, { { 46.0 } }, { { 47.0 }, { 48.0 }, { 49.0 } } } } } } }, { { 50.0 }, { { { { { 51.0 } } }, { { 52.0 }, { { { 53.0 }, { 54.0 }, { 55.0 } }, { 56.0 }, { { 57.0 } }, { { 58.0 } }, { { 59.0 } }, { { 60.0 }, { 61.0 }, { 62.0 } } } } }, { { { { 63.0 } } }, { { 64.0 }, { { { 65.0 }, { 66.0 }, { 67.0 } }, { 68.0 }, { { 69.0 } }, { { 70.0 } }, { { 71.0 } }, { { 72.0 }, { 73.0 }, { 74.0 } } } } } } } });
    double v1(75.0);
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
