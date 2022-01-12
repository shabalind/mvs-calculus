  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    double p0;
    std::vector<s0> p1;
    s1(double v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s1 p1;
    s2(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    s3(s1 v0): p0(v0) { }
  };
  s1 f61(const s1 &v0) {
    const std::vector<s0> v7 = v0.p1;
    const s0 v2 = v7[0];
    const std::vector<std::vector<double>> v6 = v2.p0;
    const std::vector<double> v22 = v6[1];
    const std::vector<s0> v10 = v0.p1;
    std::vector<double> v29 = v22;
    const double v19 = v0.p0;
    const double v17 = v29[0];
    s1 v24 = v0;
    const double v26 = v19 / v17;
    v24.p0 = v26;
    v24.p1 = v10;
    return v24;
  }
  s0 f60(const s0 &v0) {
    s0 v4 = v0;
    s0 v6 = v0;
    const std::vector<std::vector<double>> v3 = v4.p0;
    const std::vector<double> v11 = v4.p1;
    const std::vector<double> v19 = v3[1];
    const double v2 = v11[1];
    const double v22 = v11[0];
    const std::vector<std::vector<double>> v14 = v0.p0;
    const std::vector<std::vector<double>> v24 = v6.p0;
    v4.p1 = v11;
    const s0 v15(v24, v11);
    const std::vector<double> v23 = v6.p1;
    const s0 v16(v14, v23);
    std::vector<std::vector<double>> v29 = v24;
    const std::vector<double> v17 = v6.p1;
    const std::vector<std::vector<double>> v28 = v6.p0;
    const std::vector<double> v36 = v28[1];
    s0 v25 = v16;
    v6.p1 = v23;
    const std::vector<double> v61 = v29[1];
    const double v31 = v61[0];
    s0 v45 = v25;
    std::vector<double> v87 = v11;
    v45.p1 = v17;
    v29[1] = v36;
    const double v122 = v19[0];
    const double v92 = v122 * v22;
    v87[1] = v92;
    const std::vector<std::vector<double>> v125 = v4.p0;
    v45.p1 = v87;
    v6.p0 = v125;
    const std::vector<double> v255 { v2, v31 };
    const std::vector<s0> v186 { v45, v4, v6 };
    v25 = v15;
    v25.p1 = v255;
    const s0 v98 = v186[0];
    return v98;
  }
  s1 f52(const s1 &v0, const s1 &v1, const s1 &v2) {
    const s3 v3(v0);
    const s1 v5 = v3.p0;
    const double v8 = v1.p0;
    double v15 = v8;
    s1 v4 = v5;
    v4.p0 = v15;
    const s1 v13 = v3.p0;
    const s1 v9 = f61(v13);
    v4 = v9;
    v4.p0 = v8;
    return v4;
  }
  s1 f48(const s1 &v0) {
    s1 v3 = v0;
    s1 v1 = v3;
    s1 v5 = v3;
    s1 v4 = v0;
    s1 v10 = v3;
    const s1 v7 = f61(v1);
    s1 v8 = v7;
    const double v11 = v5.p0;
    const double v13 = v1.p0;
    s1 v9 = v10;
    double v2 = v13;
    const std::vector<s0> v23 = v7.p1;
    const s1 v18 = f52(v9, v10, v10);
    const s0 v22 = v23[0];
    std::vector<s0> v16 = v23;
    s1 v29 = v18;
    v16[0] = v22;
    v3.p0 = v11;
    const std::vector<s0> v21 = v29.p1;
    const s1 v31 = f61(v4);
    double v73 = v2;
    const s0 v25 = v23[0];
    v16[0] = v22;
    const s0 v20 = v23[0];
    const std::vector<double> v24 = v20.p1;
    const std::vector<double> v33 = v22.p1;
    const s0 v71 = f60(v22);
    const std::vector<std::vector<double>> v61 = v25.p0;
    v9.p1 = v16;
    const s0 v32 = v23[0];
    v5.p0 = v13;
    const s0 v45(v61, v24);
    const s1 v50(v73, v16);
    v16[0] = v32;
    const double v38 = v33[0];
    v1.p1 = v21;
    const std::vector<s0> v169 = v8.p1;
    v16[0] = v45;
    v16[0] = v45;
    v5.p1 = v23;
    v16[0] = v32;
    const double v117 = v31.p0;
    v3.p1 = v169;
    v9.p0 = v117;
    const double v48 = v31.p0;
    v3.p1 = v16;
    v29.p1 = v23;
    v16[0] = v71;
    v29.p0 = v38;
    v2 = v48;
    v10.p0 = v38;
    return v50;
  }
  s1 f46(const s1 &v0) {
    s1 v1 = v0;
    s1 v3 = v1;
    s1 v6 = v1;
    const std::vector<s0> v7 = v1.p1;
    std::vector<s0> v5 = v7;
    const s0 v2 = v7[0];
    s0 v12 = v2;
    s0 v10 = v12;
    const std::vector<double> v9 = v12.p1;
    const s3 v13(v0);
    std::vector<s0> v17 = v7;
    s1 v4 = v0;
    v1.p1 = v5;
    s0 v16 = v10;
    v16.p1 = v9;
    const std::vector<std::vector<double>> v14 = v12.p0;
    const s3 v18(v6);
    const s1 v15 = f52(v0, v3, v4);
    v3.p1 = v17;
    v5[0] = v10;
    const std::vector<std::vector<double>> v29 = v16.p0;
    const s1 v32 = f52(v15, v0, v4);
    v5[0] = v16;
    const s1 v25 = v18.p0;
    v17[0] = v16;
    v5[0] = v12;
    v12.p0 = v29;
    v1.p1 = v5;
    v16.p0 = v14;
    const std::vector<double> v22 = v2.p1;
    const s1 v72 = f52(v0, v3, v6);
    v3.p1 = v17;
    v17[0] = v10;
    const s1 v36 = v13.p0;
    const s1 v62 = f52(v36, v3, v1);
    const s3 v93(v0);
    const s1 v56 = v93.p0;
    const s0 v79 = f60(v16);
    v17[0] = v79;
    const s1 v77 = f48(v62);
    const s0 v44 = v5[0];
    v12.p1 = v22;
    const std::vector<s1> v50 { v25, v32, v0, v77 };
    v4 = v56;
    const s0 v159(v29, v9);
    const std::vector<s0> v91 = v62.p1;
    v16.p0 = v29;
    v17[0] = v44;
    const s1 v84 = v50[0];
    v1.p1 = v91;
    const s1 v297 = f52(v72, v84, v77);
    s0 v95 = v159;
    v12 = v95;
    const s1 v123 = f61(v297);
    return v123;
  }
  s1 f43(const s1 &v0) {
    s1 v3 = v0;
    const std::vector<s0> v2 = v3.p1;
    const std::vector<s0> v6 = v0.p1;
    const s1 v8 = f61(v3);
    const s0 v1 = v2[0];
    const s1 v7 = f61(v0);
    s1 v5 = v0;
    const s1 v17 = f46(v8);
    v3.p1 = v6;
    std::vector<s0> v9 = v2;
    v5.p1 = v9;
    const s1 v15 = f52(v7, v3, v0);
    v9[0] = v1;
    const double v10 = v7.p0;
    const double v11 = v5.p0;
    const s1 v19 = f52(v17, v15, v8);
    s1 v24 = v19;
    const s1 v16 = f46(v3);
    s1 v33 = v16;
    v5 = v17;
    v5 = v7;
    const s1 v23 = f61(v17);
    const std::vector<s0> v26 = v3.p1;
    const s0 v21 = v6[0];
    v9[0] = v21;
    const std::vector<double> v49 = v1.p1;
    const s2 v40(v17, v17);
    s2 v54 = v40;
    v3.p0 = v10;
    std::vector<double> v42 = v49;
    const double v45 = v15.p0;
    double v69 = v11;
    double v80 = v10;
    const s1 v139 = f52(v8, v24, v23);
    const double v41 = v8.p0;
    double v72 = v45;
    const s1 v147 = v54.p0;
    v3.p1 = v6;
    const double v51 = v42[1];
    v42[0] = v69;
    v72 = v69;
    const s1 v73 = f52(v33, v24, v139);
    v54.p0 = v8;
    v3.p0 = v72;
    v42[1] = v80;
    double v44 = v80;
    v69 = v44;
    const s1 v90 = f52(v8, v147, v73);
    v9 = v26;
    s1 v105 = v90;
    v33.p0 = v51;
    const s1 v103 = f46(v105);
    v24.p0 = v41;
    return v103;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const s1 &v1, const std::vector<s3> &v2, const std::vector<std::vector<s2>> &v3, const double &v4) {
    const s1 v18 = f43(v1);
    const double v5 = v18.p0;
    double v21 = v5;
    const std::vector<double> v20 { v4, v21, v4, v5, v5, v21 };
    const double v31 = v20[0];
    return v31;
  }
  int main() {
    std::vector<s2> v0({ { { 0.0, { { { { 1.0 }, { 2.0 } }, { 3.0, 4.0 } } } }, { 5.0, { { { { 6.0 }, { 7.0 } }, { 8.0, 9.0 } } } } }, { { 10.0, { { { { 11.0 }, { 12.0 } }, { 13.0, 14.0 } } } }, { 15.0, { { { { 16.0 }, { 17.0 } }, { 18.0, 19.0 } } } } }, { { 20.0, { { { { 21.0 }, { 22.0 } }, { 23.0, 24.0 } } } }, { 25.0, { { { { 26.0 }, { 27.0 } }, { 28.0, 29.0 } } } } } });
    s1 v1({ 30.0, { { { { 31.0 }, { 32.0 } }, { 33.0, 34.0 } } } });
    std::vector<s3> v2({ { { 35.0, { { { { 36.0 }, { 37.0 } }, { 38.0, 39.0 } } } } } });
    std::vector<std::vector<s2>> v3({ { { { 40.0, { { { { 41.0 }, { 42.0 } }, { 43.0, 44.0 } } } }, { 45.0, { { { { 46.0 }, { 47.0 } }, { 48.0, 49.0 } } } } } }, { { { 50.0, { { { { 51.0 }, { 52.0 } }, { 53.0, 54.0 } } } }, { 55.0, { { { { 56.0 }, { 57.0 } }, { 58.0, 59.0 } } } } } } });
    double v4(60.0);
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
