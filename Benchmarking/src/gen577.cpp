  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<s0> p1;
    s2(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s0 p0;
    std::vector<s0> p1;
    s4(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s4 p0;
    s0 p1;
    s5(s4 v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f106(const s0 &v0) {
    s0 v1 = v0;
    s0 v4 = v1;
    const std::vector<std::vector<double>> v3 = v0.p1;
    const std::vector<double> v2 = v3[0];
    const std::vector<std::vector<double>> v9 = v4.p0;
    v1.p1 = v3;
    v4.p0 = v9;
    const std::vector<std::vector<double>> v24 = v0.p0;
    v4.p1 = v3;
    const std::vector<double> v8 = v24[0];
    const std::vector<std::vector<double>> v11 = v1.p0;
    std::vector<std::vector<double>> v20 = v11;
    const std::vector<std::vector<double>> v29 = v4.p0;
    const std::vector<std::vector<double>> v19 = v4.p1;
    const std::vector<std::vector<double>> v58 = v0.p1;
    v1.p0 = v9;
    v4.p1 = v58;
    const std::vector<std::vector<double>> v37 = v1.p0;
    std::vector<std::vector<double>> v35 = v24;
    const std::vector<double> v65 = v9[0];
    v35[0] = v65;
    v35[0] = v2;
    v4.p0 = v24;
    v4.p0 = v29;
    const std::vector<double> v49 = v20[0];
    const std::vector<std::vector<double>> v39 = v0.p1;
    v4.p0 = v37;
    v4.p1 = v39;
    v35[0] = v49;
    v35[0] = v8;
    const s0 v86(v35, v19);
    return v86;
  }
  s2 f99(const s2 &v0) {
    s2 v4 = v0;
    s2 v5 = v4;
    const std::vector<s0> v3 = v4.p1;
    const std::vector<s0> v1 = v0.p1;
    std::vector<s0> v7 = v1;
    const s0 v2 = v0.p0;
    v7[0] = v2;
    v5.p0 = v2;
    const std::vector<s0> v8 = v0.p1;
    const s0 v9 = f106(v2);
    s0 v6 = v2;
    s0 v11 = v6;
    s0 v13 = v2;
    v5.p1 = v7;
    const s0 v30 = v3[0];
    const std::vector<s0> v15 = v4.p1;
    s2 v16 = v4;
    v7[0] = v13;
    const std::vector<std::vector<double>> v19 = v6.p1;
    const s0 v25 = f106(v13);
    const std::vector<s0> v47 = v16.p1;
    v13.p1 = v19;
    const s0 v12 = v47[0];
    v7[0] = v30;
    v6 = v11;
    v7[0] = v2;
    const std::vector<double> v20 = v19[1];
    std::vector<std::vector<double>> v34 = v19;
    const s0 v18 = v15[0];
    std::vector<s0> v23 = v15;
    std::vector<std::vector<double>> v22 = v19;
    const std::vector<double> v27 = v34[0];
    v11.p1 = v22;
    v13.p1 = v19;
    const s0 v28 = f106(v30);
    v23[0] = v30;
    const std::vector<s0> v45 = v4.p1;
    const std::vector<std::vector<double>> v29 = v12.p0;
    const std::vector<s0> v32 = v0.p1;
    const std::vector<std::vector<double>> v36 = v25.p0;
    std::vector<s0> v42 = v47;
    s0 v26 = v11;
    std::vector<std::vector<double>> v53 = v36;
    v16.p1 = v8;
    const s0 v58 = f106(v9);
    const s0 v38 = f106(v18);
    const std::vector<std::vector<double>> v49 = v58.p1;
    const s0 v68 = v45[0];
    v5.p1 = v23;
    const s2 v54(v13, v45);
    std::vector<std::vector<double>> v48 = v49;
    const std::vector<std::vector<double>> v70 = v68.p0;
    v7[0] = v25;
    const std::vector<std::vector<double>> v143 = v38.p0;
    const std::vector<std::vector<double>> v73 = v68.p0;
    v7[0] = v2;
    v53 = v73;
    const std::vector<std::vector<double>> v62 = v26.p1;
    std::vector<std::vector<double>> v89 = v143;
    v23[0] = v68;
    v11.p1 = v48;
    const s0 v60(v53, v62);
    const s0 v69 = f106(v18);
    const std::vector<std::vector<double>> v82 = v18.p1;
    const s2 v75(v60, v15);
    const std::vector<double> v55 = v36[0];
    const s0 v101 = v5.p0;
    std::vector<std::vector<double>> v74 = v19;
    v11.p0 = v29;
    v4.p1 = v32;
    v13.p1 = v48;
    v11.p0 = v89;
    std::vector<s0> v104 = v47;
    v11.p0 = v70;
    v11.p0 = v29;
    const s0 v83 = f106(v11);
    v23[0] = v69;
    v16.p1 = v104;
    std::vector<std::vector<double>> v59 = v53;
    v16.p0 = v83;
    v48[0] = v27;
    v11.p1 = v74;
    v11.p1 = v34;
    const std::vector<std::vector<double>> v137 = v101.p0;
    v89[0] = v20;
    v13.p0 = v59;
    v4.p0 = v68;
    v26.p0 = v137;
    v34[0] = v27;
    const std::vector<std::vector<double>> v253 = v28.p1;
    v4.p1 = v32;
    v4.p1 = v42;
    const std::vector<std::vector<std::vector<double>>> v87 { v49, v19, v253, v253, v253 };
    v23[0] = v11;
    const s0 v140 = v54.p0;
    const std::vector<std::vector<double>> v109 = v87[0];
    v26.p1 = v109;
    v5.p0 = v140;
    v11.p1 = v82;
    v6.p1 = v62;
    v22[1] = v55;
    v16.p0 = v28;
    return v75;
  }
  s2 f90(const s2 &v0) {
    const s2 v2 = f99(v0);
    const std::vector<s0> v1 = v0.p1;
    const s2 v5 = f99(v0);
    std::vector<s0> v6 = v1;
    const s0 v8 = v2.p0;
    const s0 v9 = f106(v8);
    const s2 v19 = f99(v5);
    const s0 v16 = f106(v8);
    const s2 v13 = f99(v19);
    v6[0] = v9;
    const s0 v17 = v13.p0;
    const s0 v36 = f106(v16);
    const s2 v28(v36, v6);
    const s0 v53 = v13.p0;
    v6[0] = v17;
    v6[0] = v53;
    return v28;
  }
  double f73(const double &v0) {
    double v7 = v0;
    double v3 = v0;
    const std::vector<double> v5 { v3, v7, v3, v7, v7, v7 };
    const double v11 = v5[4];
    const double v13 = v11 + v11;
    return v13;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const s5 &v1, const s0 &v2, const double &v3) {
    const s2 v7 = f90(v0);
    const std::vector<s0> v4 = v7.p1;
    const s0 v12 = v4[0];
    const std::vector<std::vector<double>> v25 = v12.p1;
    const std::vector<double> v16 = v25[0];
    std::vector<double> v24 = v16;
    const double v43 = v16[0];
    const double v39 = f73(v3);
    const double v37 = v3 + v39;
    v24[0] = v39;
    const double v61 = v43 / v43;
    const double v72 = v24[0];
    const std::vector<double> v77 { v43, v37, v61, v72, v43, v37 };
    const double v116 = v77[3];
    return v116;
  }
  int main() {
    s2 v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { { 3.0 } }, { { 4.0 }, { 5.0 } } } } });
    s5 v1({ { { { { 6.0 } }, { { 7.0 }, { 8.0 } } }, { { { { 9.0 } }, { { 10.0 }, { 11.0 } } } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 } } } });
    s0 v2({ { { 15.0 } }, { { 16.0 }, { 17.0 } } });
    double v3(18.0);
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
