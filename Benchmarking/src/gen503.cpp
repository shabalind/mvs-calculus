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
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    s0 p1;
    s2(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s2> p0;
    std::vector<s2> p1;
    s3(std::vector<s2> v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s3 p0;
    s2 p1;
    s6(s3 v0, s2 v1): p0(v0), p1(v1) { }
  };
  s2 f71(const s2 &v0) {
    s2 v6 = v0;
    const std::vector<s2> v5 { v0 };
    const std::vector<s1> v4 = v0.p0;
    const std::vector<s1> v3 = v6.p0;
    const s3 v9(v5, v5);
    const s1 v1 = v4[0];
    const std::vector<s2> v2 = v9.p0;
    const s0 v11 = v1.p0;
    const s2 v19(v4, v11);
    s0 v8 = v11;
    s2 v23 = v6;
    s3 v25 = v9;
    v23.p0 = v3;
    const std::vector<s1> v16 = v23.p0;
    const std::vector<std::vector<double>> v10 = v11.p1;
    v8.p1 = v10;
    const std::vector<s2> v21 = v25.p1;
    v23.p0 = v3;
    v6.p1 = v8;
    std::vector<s2> v41 = v21;
    v25.p0 = v41;
    v6 = v23;
    v41[0] = v6;
    v23.p0 = v3;
    const s2 v48 = v2[0];
    v41[0] = v19;
    v25.p1 = v2;
    v41[0] = v0;
    v41[0] = v23;
    v25.p1 = v41;
    v41[0] = v48;
    s2 v30 = v6;
    v30.p1 = v11;
    v41[0] = v23;
    v41[0] = v30;
    v41[0] = v6;
    v30.p0 = v16;
    const s2 v93 = v41[0];
    return v93;
  }
  std::vector<s1> f56(const std::vector<s1> &v0) {
    std::vector<s1> v7 = v0;
    std::vector<s1> v3 = v7;
    std::vector<s1> v4 = v0;
    std::vector<s1> v1 = v3;
    const s1 v5 = v7[0];
    s1 v2 = v5;
    s1 v9 = v5;
    const s0 v8 = v5.p0;
    const s1 v6 = v7[0];
    const s1 v15 = v4[0];
    s1 v10 = v6;
    const std::vector<std::vector<double>> v13 = v8.p1;
    const s0 v14 = v6.p0;
    const s1 v12 = v0[0];
    const std::vector<s0> v19 { v8, v8 };
    const s0 v31 = v19[1];
    std::vector<s0> v27 = v19;
    const s0 v25 = v12.p0;
    v9.p0 = v25;
    const s0 v16 = v2.p0;
    std::vector<s1> v28 = v4;
    const s0 v21 = v15.p0;
    v9.p1 = v21;
    s1 v35 = v2;
    const s0 v23 = v27[1];
    const s1 v46 = v28[0];
    s1 v32 = v12;
    v9.p0 = v25;
    const std::vector<std::vector<double>> v33 = v31.p1;
    std::vector<s0> v30 = v27;
    const s0 v52(v33, v33);
    v28[0] = v2;
    v10.p1 = v23;
    std::vector<s1> v76 = v1;
    const s0 v51 = v30[0];
    const s0 v54 = v10.p1;
    v7[0] = v10;
    std::vector<s0> v37 = v27;
    s1 v26 = v35;
    v76[0] = v46;
    const s0 v122 = v9.p1;
    const std::vector<std::vector<double>> v60 = v16.p1;
    v28[0] = v32;
    s0 v65 = v54;
    v35.p1 = v31;
    v10.p1 = v65;
    const s0 v100 = v5.p0;
    v2.p0 = v25;
    s1 v49 = v9;
    const s1 v58 = v3[0];
    std::vector<s0> v73 = v27;
    std::vector<s1> v41 = v3;
    v30 = v73;
    const s2 v90(v4, v100);
    std::vector<s0> v75 = v37;
    const s2 v113 = f71(v90);
    v30[0] = v16;
    v41[0] = v49;
    const s2 v96 = f71(v113);
    v7[0] = v49;
    v3[0] = v58;
    const s0 v173 = v26.p0;
    v1[0] = v46;
    v41 = v4;
    v3[0] = v10;
    const s2 v253 = f71(v96);
    v32.p1 = v14;
    v2.p0 = v14;
    const std::vector<std::vector<double>> v69 = v173.p0;
    const s0 v125(v13, v69);
    v32.p0 = v122;
    v41 = v76;
    v1[0] = v35;
    v26.p1 = v54;
    v65.p0 = v60;
    v3[0] = v12;
    v30 = v75;
    v32.p1 = v125;
    v10.p1 = v51;
    const s0 v206 = v253.p1;
    const s0 v189 = v75[1];
    s0 v163 = v31;
    v37[1] = v52;
    v10.p1 = v163;
    v26.p1 = v189;
    v10.p0 = v122;
    v26.p0 = v206;
    v75 = v73;
    return v41;
  }
  s2 f44(const s2 &v0) {
    const s0 v1 = v0.p1;
    const std::vector<std::vector<double>> v7 = v1.p1;
    const std::vector<std::vector<double>> v3 = v1.p1;
    std::vector<std::vector<double>> v8 = v3;
    const std::vector<double> v2 = v3[0];
    const std::vector<double> v6 = v8[0];
    const std::vector<double> v10 = v7[0];
    v8[0] = v10;
    const std::vector<s1> v9 = v0.p0;
    v8[0] = v6;
    const s2 v17 = f71(v0);
    const s2 v25 = f71(v17);
    std::vector<s1> v13 = v9;
    s2 v19 = v0;
    v19.p0 = v9;
    v8[0] = v6;
    const std::vector<s1> v16 = v17.p0;
    const std::vector<double> v20 = v3[0];
    v8[0] = v6;
    v8[0] = v2;
    const std::vector<s1> v45 = f56(v16);
    v8[0] = v20;
    const s1 v32 = v45[0];
    v19.p0 = v9;
    v19.p0 = v9;
    const std::vector<s1> v42 = v25.p0;
    const s0 v59 = v32.p0;
    s0 v56 = v59;
    v56.p1 = v8;
    v19.p0 = v42;
    v56.p0 = v8;
    v19.p0 = v13;
    v19.p1 = v1;
    std::vector<double> v140 = v2;
    s2 v86 = v19;
    v86.p1 = v56;
    v8[0] = v140;
    v56.p0 = v3;
    return v86;
  }
  s6 f27(const s6 &v0) {
    s6 v4 = v0;
    const s3 v6 = v0.p0;
    const std::vector<s6> v3 { v4, v4, v4, v0, v0 };
    const s6 v5 = v3[3];
    const std::vector<s2> v1 = v6.p1;
    const s2 v2 = v1[0];
    s3 v9 = v6;
    const s2 v12 = f44(v2);
    const s2 v37 = f71(v2);
    std::vector<s2> v20 = v1;
    v9.p1 = v20;
    const s2 v14 = v20[0];
    const s2 v26 = f44(v2);
    const s2 v28 = f44(v26);
    const s2 v73 = v20[0];
    v20[0] = v14;
    v4.p1 = v73;
    const s2 v32 = v20[0];
    const s2 v23 = f44(v28);
    s6 v25 = v5;
    v20[0] = v37;
    std::vector<s2> v18 = v1;
    const s2 v41 = f71(v32);
    v9.p1 = v18;
    v18[0] = v41;
    v4.p1 = v23;
    v20[0] = v14;
    std::vector<s6> v48 = v3;
    v18[0] = v14;
    v18[0] = v12;
    std::vector<s2> v49 = v1;
    v9.p0 = v49;
    v20[0] = v23;
    v20[0] = v23;
    v9.p1 = v49;
    const s6 v129 = v48[1];
    const s2 v130 = v18[0];
    v20[0] = v130;
    v48[0] = v25;
    v25.p0 = v9;
    return v129;
  }
  s6 f16(const s6 &v0, const s0 &v1) {
    s6 v3 = v0;
    const s6 v4 = f27(v3);
    const s2 v8 = v4.p1;
    v3.p1 = v8;
    const s2 v2 = v4.p1;
    const s2 v5 = v3.p1;
    v3.p1 = v8;
    v3.p1 = v5;
    v3.p1 = v2;
    v3.p1 = v2;
    return v3;
  }
  double f11(const s6 &v0, const double &v1, const s2 &v2) {
    const s0 v6 = v2.p1;
    s0 v4 = v6;
    double v8 = v1;
    const double v12 = v8 / v8;
    double v26 = v12;
    const double v61 = v26 * v1;
    const std::vector<std::vector<double>> v36 = v4.p0;
    const std::vector<double> v47 = v36[0];
    const std::vector<std::vector<double>> v95 = v6.p0;
    const double v109 = v47[0];
    v4.p1 = v95;
    const double v78 = v109 * v61;
    return v78;
  }
  __attribute__((noinline))
  double f0(const std::vector<s6> &v0, const double &v1) {
    const s6 v6 = v0[0];
    const s6 v5 = v0[0];
    const s2 v7 = v6.p1;
    const s2 v3 = f71(v7);
    const s3 v10 = v6.p0;
    s3 v19 = v10;
    const std::vector<s2> v4 = v19.p1;
    const std::vector<s2> v16 = v10.p0;
    std::vector<s6> v23 = v0;
    const s3 v12(v4, v16);
    std::vector<s2> v15 = v16;
    const s2 v18 = v15[0];
    const s2 v27 = v6.p1;
    double v46 = v1;
    const s3 v24(v4, v4);
    const s2 v33 = f71(v27);
    v23[0] = v5;
    const std::vector<s2> v34 = v10.p0;
    s6 v58 = v5;
    v15[0] = v7;
    const s6 v60(v24, v33);
    const s0 v42 = v3.p1;
    s0 v44 = v42;
    std::vector<s6> v41 = v23;
    v58.p0 = v19;
    v19 = v12;
    v19.p1 = v16;
    v19.p1 = v34;
    const s6 v89 = v41[0];
    v23[0] = v58;
    const s6 v80 = f16(v89, v44);
    const double v76 = f11(v80, v46, v27);
    const double v109 = f11(v60, v76, v18);
    const std::vector<std::vector<double>> v98 = v44.p0;
    v44.p0 = v98;
    return v109;
  }
  int main() {
    std::vector<s6> v0({ { { { { { { { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } } } }, { { { 4.0 } }, { { 5.0 } } } } }, { { { { { { { 6.0 } }, { { 7.0 } } }, { { { 8.0 } }, { { 9.0 } } } } }, { { { 10.0 } }, { { 11.0 } } } } } }, { { { { { { 12.0 } }, { { 13.0 } } }, { { { 14.0 } }, { { 15.0 } } } } }, { { { 16.0 } }, { { 17.0 } } } } }, { { { { { { { { { 18.0 } }, { { 19.0 } } }, { { { 20.0 } }, { { 21.0 } } } } }, { { { 22.0 } }, { { 23.0 } } } } }, { { { { { { { 24.0 } }, { { 25.0 } } }, { { { 26.0 } }, { { 27.0 } } } } }, { { { 28.0 } }, { { 29.0 } } } } } }, { { { { { { 30.0 } }, { { 31.0 } } }, { { { 32.0 } }, { { 33.0 } } } } }, { { { 34.0 } }, { { 35.0 } } } } } });
    double v1(36.0);
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
